package typings
package spectedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object spectedMod {
  type Result[INPUT, SPEC] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in keyof INPUT ]: true | std.Array<any> | object}
    */ spectedLib.spectedLibStrings.Result with js.Any
  type Spec[INPUT, ROOTINPUT] = js.Tuple2[spectedLib.Predicate[INPUT, ROOTINPUT], spectedLib.ErrorMsg[INPUT]]
  type SpecArray[INPUT, ROOTINPUT] = js.Array[Spec[INPUT, ROOTINPUT]]
  type SpecFunction[INPUT, ROOTINPUT] = (js.Function1[/* value */ INPUT, SpecArray[INPUT, ROOTINPUT]]) | (js.Function1[/* value */ INPUT, SpecObject[INPUT, ROOTINPUT]]) | (js.Function1[/* value */ INPUT, js.Array[SpecArray[js.Any, ROOTINPUT]]])
  type SpecObject[INPUT, ROOTINPUT] = stdLib.Partial[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in keyof INPUT ]: spected.spected.SpecValue<INPUT[key], ROOTINPUT>}
    */ spectedLib.spectedLibStrings.SpecObject with INPUT
  ]
  type SpecValue[INPUT, ROOTINPUT] = (SpecArray[INPUT, ROOTINPUT]) | (SpecFunction[INPUT, ROOTINPUT]) | (SpecObject[INPUT, ROOTINPUT])
}
