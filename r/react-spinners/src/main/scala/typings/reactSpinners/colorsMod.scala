package typings.reactSpinners

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorsMod {
  
  @JSImport("react-spinners/helpers/colors", "calculateRgba")
  @js.native
  val calculateRgba: RgbaFunction = js.native
  
  type RgbaFunction = js.Function2[/* color */ String, /* opacity */ Double, String]
}
