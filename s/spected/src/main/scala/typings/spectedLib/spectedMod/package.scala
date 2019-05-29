package typings
package spectedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object spectedMod {
  type ErrorMsg[INPUT] = js.UndefOr[
    java.lang.String | scala.Double | scala.Boolean | js.Symbol | scala.Null | js.Object | (js.Function2[/* value */ INPUT, /* field */ java.lang.String, js.Any])
  ]
  type Predicate[INPUT, ROOTINPUT] = js.Function2[/* value */ INPUT, /* inputs */ ROOTINPUT, scala.Boolean]
  type Result[INPUT, SPEC] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in keyof INPUT ]: true | std.Array<any> | object}
    */ spectedLib.spectedLibStrings.Result with js.Any
  type Spec[INPUT, ROOTINPUT] = js.Tuple2[Predicate[INPUT, ROOTINPUT], ErrorMsg[INPUT]]
  type SpecArray[INPUT, ROOTINPUT] = js.Array[Spec[INPUT, ROOTINPUT]]
  type SpecFunction[INPUT, ROOTINPUT] = js.Function1[
    /* value */ INPUT, 
    (js.Array[SpecArray[js.Any, ROOTINPUT]]) | (SpecArray[INPUT, ROOTINPUT]) | (SpecObject[INPUT, ROOTINPUT])
  ]
  type SpecObject[INPUT, ROOTINPUT] = stdLib.Partial[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in keyof INPUT ]: spected.spected.SpecValue<INPUT[key], ROOTINPUT>}
    */ spectedLib.spectedLibStrings.SpecObject with INPUT
  ]
  type SpecValue[INPUT, ROOTINPUT] = (SpecArray[INPUT, ROOTINPUT]) | (SpecFunction[INPUT, ROOTINPUT]) | (SpecObject[INPUT, ROOTINPUT])
}
