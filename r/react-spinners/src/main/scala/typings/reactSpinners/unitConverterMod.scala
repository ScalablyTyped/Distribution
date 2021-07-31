package typings.reactSpinners

import typings.reactSpinners.interfacesMod.LengthObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unitConverterMod {
  
  @JSImport("react-spinners/helpers/unitConverter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def cssValue(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cssValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def cssValue(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cssValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def parseLengthAndUnit(size: String): LengthObject = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLengthAndUnit")(size.asInstanceOf[js.Any]).asInstanceOf[LengthObject]
  @scala.inline
  def parseLengthAndUnit(size: Double): LengthObject = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLengthAndUnit")(size.asInstanceOf[js.Any]).asInstanceOf[LengthObject]
}
