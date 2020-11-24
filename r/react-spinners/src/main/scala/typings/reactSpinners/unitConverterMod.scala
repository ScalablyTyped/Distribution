package typings.reactSpinners

import typings.reactSpinners.interfacesMod.LengthObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-spinners/helpers/unitConverter", JSImport.Namespace)
@js.native
object unitConverterMod extends js.Object {
  
  def cssValue(value: String): String = js.native
  def cssValue(value: Double): String = js.native
  
  def parseLengthAndUnit(size: String): LengthObject = js.native
  def parseLengthAndUnit(size: Double): LengthObject = js.native
}
