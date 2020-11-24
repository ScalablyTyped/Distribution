package typings.screeps.global

import org.scalablytyped.runtime.TopLevel
import typings.screeps.ColorConstant
import typings.screeps.FlagConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Flag")
@js.native
class Flag protected ()
  extends typings.screeps.Flag {
  def this(
    name: String,
    color: ColorConstant,
    secondaryColor: ColorConstant,
    roomName: String,
    x: Double,
    y: Double
  ) = this()
}
@JSGlobal("Flag")
@js.native
object Flag extends TopLevel[FlagConstructor]
