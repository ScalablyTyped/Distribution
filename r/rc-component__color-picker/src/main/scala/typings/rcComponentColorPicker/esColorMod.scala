package typings.rcComponentColorPicker

import typings.ctrlTinycolor.mod.TinyColor_
import typings.rcComponentColorPicker.anon.NumberifyHSBA
import typings.rcComponentColorPicker.esInterfaceMod.ColorGenInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esColorMod {
  
  @JSImport("@rc-component/color-picker/es/color", "Color")
  @js.native
  open class Color protected () extends TinyColor_ {
    def this(color: ColorGenInput[Color]) = this()
    
    def toHsb(): NumberifyHSBA = js.native
    
    def toHsbString(): String = js.native
  }
}
