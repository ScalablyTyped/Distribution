package typings.spected

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object spectedMod {
  import typings.std.Partial

  type ErrorMsg[INPUT] = js.UndefOr[
    String | Double | Boolean | js.Symbol | Null | js.Object | (js.Function2[/* value */ INPUT, /* field */ String, js.Any])
  ]
  type Predicate[INPUT, ROOTINPUT] = js.Function2[/* value */ INPUT, /* inputs */ ROOTINPUT, Boolean]
  type Result[INPUT, SPEC] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in keyof INPUT ]: true | std.Array<any> | / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias spected.spected.Result<INPUT[key], any> * / object}
    */ typings.spected.spectedStrings.Result with js.Any
  type Spec[INPUT, ROOTINPUT] = js.Tuple2[Predicate[INPUT, ROOTINPUT], ErrorMsg[INPUT]]
  type SpecArray[INPUT, ROOTINPUT] = js.Array[Spec[INPUT, ROOTINPUT]]
  type SpecFunction[INPUT, ROOTINPUT] = js.Function1[
    /* value */ INPUT, 
    (js.Array[SpecArray[js.Any, ROOTINPUT]]) | (SpecArray[INPUT, ROOTINPUT]) | (SpecObject[INPUT, ROOTINPUT])
  ]
  type SpecObject[INPUT, ROOTINPUT] = Partial[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in keyof INPUT ]: spected.spected.SpecValue<INPUT[key], ROOTINPUT>}
    */ typings.spected.spectedStrings.SpecObject with INPUT
  ]
  type SpecValue[INPUT, ROOTINPUT] = (SpecArray[INPUT, ROOTINPUT]) | (SpecFunction[INPUT, ROOTINPUT]) | (SpecObject[INPUT, ROOTINPUT])
}
