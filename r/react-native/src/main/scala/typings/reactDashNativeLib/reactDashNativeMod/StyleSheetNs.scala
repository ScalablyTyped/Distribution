package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native", "StyleSheet")
@js.native
object StyleSheetNs extends js.Object {
  
  trait AbsoluteFillStyle extends js.Object {
    var bottom: reactDashNativeLib.reactDashNativeLibNumbers.`0`
    var left: reactDashNativeLib.reactDashNativeLibNumbers.`0`
    var position: reactDashNativeLib.reactDashNativeLibStrings.absolute
    var right: reactDashNativeLib.reactDashNativeLibNumbers.`0`
    var top: reactDashNativeLib.reactDashNativeLibNumbers.`0`
  }
  
  val absoluteFill: reactDashNativeLib.RegisteredStyle[AbsoluteFillStyle] = js.native
  val absoluteFillObject: AbsoluteFillStyle = js.native
  val hairlineWidth: scala.Double = js.native
  def create[T /* <: NamedStyles[T] */](styles: T): reactDashNativeLib.reactDashNativeLibStrings.create with T = js.native
  def flatten(): reactDashNativeLib.reactDashNativeMod.ImageStyle = js.native
  def flatten(
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ImageStyle]
  ): reactDashNativeLib.reactDashNativeMod.ImageStyle = js.native
  def flatten[T](style: reactDashNativeLib.RegisteredStyle[T]): T = js.native
  @JSName("flatten")
  def flatten_TT[T](): T = js.native
  @JSName("flatten")
  def flatten_TextStyle(): reactDashNativeLib.reactDashNativeMod.TextStyle = js.native
  @JSName("flatten")
  def flatten_TextStyle(
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ): reactDashNativeLib.reactDashNativeMod.TextStyle = js.native
  @JSName("flatten")
  def flatten_ViewStyle(): reactDashNativeLib.reactDashNativeMod.ViewStyle = js.native
  @JSName("flatten")
  def flatten_ViewStyle(
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ): reactDashNativeLib.reactDashNativeMod.ViewStyle = js.native
  def setStyleAttributePreprocessor(property: java.lang.String, process: js.Function1[/* nextProp */ js.Any, _]): scala.Unit = js.native
  type NamedStyles[T] = reactDashNativeLib.reactDashNativeLibStrings.NamedStyles with js.Any
}

