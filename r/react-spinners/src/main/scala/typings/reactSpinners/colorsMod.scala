package typings.reactSpinners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-spinners/helpers/colors", JSImport.Namespace)
@js.native
object colorsMod extends js.Object {
  
  val calculateRgba: RgbaFunction = js.native
  
  type RgbaFunction = js.Function2[/* color */ String, /* opacity */ Double, String]
}
