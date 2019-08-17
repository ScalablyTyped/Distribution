package typings.reactDashNative.reactDashNativeMod

import typings.reactDashNative.reactDashNativeMod.StyleSheetNs.AbsoluteFillStyle
import typings.reactDashNative.reactDashNativeMod.StyleSheetNs.NamedStyles
import typings.reactDashNative.reactDashNativeNumbers.`0`
import typings.reactDashNative.reactDashNativeStrings.absolute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native", "StyleSheet")
@js.native
object StyleSheetNs extends js.Object {
  trait AbsoluteFillStyle extends js.Object {
    var bottom: `0`
    var left: `0`
    var position: absolute
    var right: `0`
    var top: `0`
  }
  
  val absoluteFill: RegisteredStyle[AbsoluteFillStyle] = js.native
  val absoluteFillObject: AbsoluteFillStyle = js.native
  val hairlineWidth: Double = js.native
  def create[T /* <: NamedStyles[_ | T] */](styles: T): T = js.native
  def create[T /* <: NamedStyles[_ | T] */](styles: NamedStyles[T]): T = js.native
  def flatten[T](): T = js.native
  def flatten[T](style: StyleProp[T]): T = js.native
  def setStyleAttributePreprocessor(property: String, process: js.Function1[/* nextProp */ js.Any, _]): Unit = js.native
  type NamedStyles[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: react-native.react-native.ViewStyle | react-native.react-native.TextStyle | react-native.react-native.ImageStyle}
    */ typings.reactDashNative.reactDashNativeStrings.NamedStyles with js.Any
}

