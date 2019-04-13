package typings
package reactDashSelectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libBuiltinsMod {
  type formatGroupLabel[OptionType] = js.Function1[
    /* group */ reactDashSelectLib.libTypesMod.GroupType[OptionType], 
    reactLib.reactMod.ReactNode
  ]
  type getOptionLabel[OptionType] = js.Function1[/* option */ OptionType, java.lang.String]
  type getOptionValue[OptionType] = js.Function1[/* option */ OptionType, java.lang.String]
  type isOptionDisabled[OptionType] = js.Function1[/* option */ OptionType, scala.Boolean]
}
