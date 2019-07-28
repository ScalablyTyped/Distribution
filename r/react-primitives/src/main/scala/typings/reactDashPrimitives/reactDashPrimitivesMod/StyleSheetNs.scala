package typings.reactDashPrimitives.reactDashPrimitivesMod

import typings.reactDashNative.reactDashNativeMod.ImageStyle
import typings.reactDashNative.reactDashNativeMod.RegisteredStyle
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.StyleSheetNs.AbsoluteFillStyle
import typings.reactDashNative.reactDashNativeMod.StyleSheetNs.NamedStyles
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-primitives", "StyleSheet")
@js.native
object StyleSheetNs extends js.Object {
  val absoluteFill: RegisteredStyle[AbsoluteFillStyle] = js.native
  val absoluteFillObject: AbsoluteFillStyle = js.native
  val hairlineWidth: Double = js.native
  def create[T /* <: NamedStyles[_ | T] */](styles: T): T = js.native
  def create[T /* <: NamedStyles[_ | T] */](styles: NamedStyles[T]): T = js.native
  def flatten(): ImageStyle = js.native
  def flatten(style: StyleProp[ImageStyle]): ImageStyle = js.native
  def flatten[T](style: RegisteredStyle[T]): T = js.native
  @JSName("flatten")
  def flatten_T_T[T](): T = js.native
  @JSName("flatten")
  def flatten_TextStyle(): TextStyle = js.native
  @JSName("flatten")
  def flatten_TextStyle(style: StyleProp[TextStyle]): TextStyle = js.native
  @JSName("flatten")
  def flatten_ViewStyle(): ViewStyle = js.native
  @JSName("flatten")
  def flatten_ViewStyle(style: StyleProp[ViewStyle]): ViewStyle = js.native
  def setStyleAttributePreprocessor(property: String, process: js.Function1[/* nextProp */ js.Any, _]): Unit = js.native
}

