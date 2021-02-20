package typings.reactSpinners

import typings.reactSpinners.interfacesMod.LengthObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unitConverterMod {
  
  @JSImport("react-spinners/helpers/unitConverter", "cssValue")
  @js.native
  def cssValue(value: String): String = js.native
  @JSImport("react-spinners/helpers/unitConverter", "cssValue")
  @js.native
  def cssValue(value: Double): String = js.native
  
  @JSImport("react-spinners/helpers/unitConverter", "parseLengthAndUnit")
  @js.native
  def parseLengthAndUnit(size: String): LengthObject = js.native
  @JSImport("react-spinners/helpers/unitConverter", "parseLengthAndUnit")
  @js.native
  def parseLengthAndUnit(size: Double): LengthObject = js.native
}
