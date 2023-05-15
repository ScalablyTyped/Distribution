package typings.rcComponentColorPicker

import typings.ctrlTinycolor.distMod.ColorInput
import typings.rcComponentColorPicker.anon.ContainerRef
import typings.rcComponentColorPicker.esColorMod.Color
import typings.rcComponentColorPicker.esInterfaceMod.ColorGenInput
import typings.rcComponentColorPicker.esInterfaceMod.HsbaColorType
import typings.rcComponentColorPicker.esInterfaceMod.TransformOffset
import typings.react.mod.RefObject
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilMod {
  
  @JSImport("@rc-component/color-picker/es/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@rc-component/color-picker/es/util", "ColorPickerPrefixCls")
  @js.native
  val ColorPickerPrefixCls: /* "rc-color-picker" */ String = js.native
  
  inline def calculateColor(props: ContainerRef): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateColor")(props.asInstanceOf[js.Any]).asInstanceOf[Color]
  
  inline def calculateOffset(containerRef: RefObject[HTMLDivElement], targetRef: RefObject[HTMLDivElement]): TransformOffset = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateOffset")(containerRef.asInstanceOf[js.Any], targetRef.asInstanceOf[js.Any])).asInstanceOf[TransformOffset]
  inline def calculateOffset(
    containerRef: RefObject[HTMLDivElement],
    targetRef: RefObject[HTMLDivElement],
    color: Unit,
    `type`: HsbaColorType
  ): TransformOffset = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateOffset")(containerRef.asInstanceOf[js.Any], targetRef.asInstanceOf[js.Any], color.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[TransformOffset]
  inline def calculateOffset(containerRef: RefObject[HTMLDivElement], targetRef: RefObject[HTMLDivElement], color: Color): TransformOffset = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateOffset")(containerRef.asInstanceOf[js.Any], targetRef.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[TransformOffset]
  inline def calculateOffset(
    containerRef: RefObject[HTMLDivElement],
    targetRef: RefObject[HTMLDivElement],
    color: Color,
    `type`: HsbaColorType
  ): TransformOffset = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateOffset")(containerRef.asInstanceOf[js.Any], targetRef.asInstanceOf[js.Any], color.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[TransformOffset]
  
  inline def convertHsb2Hsv(color: ColorGenInput[Color]): ColorInput = ^.asInstanceOf[js.Dynamic].applyDynamic("convertHsb2Hsv")(color.asInstanceOf[js.Any]).asInstanceOf[ColorInput]
  
  @JSImport("@rc-component/color-picker/es/util", "defaultColor")
  @js.native
  val defaultColor: Color = js.native
  
  inline def generateColor(color: ColorGenInput[Color]): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("generateColor")(color.asInstanceOf[js.Any]).asInstanceOf[Color]
  
  inline def getRoundNumber(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getRoundNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
}
