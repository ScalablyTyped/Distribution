package typings.reactNative.mod.StyleSheet

import typings.reactNative.mod.StyleProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native", "StyleSheet.compose")
@js.native
object compose extends js.Object {
  def apply[T](style1: js.Array[StyleProp[T]], style2: js.Array[StyleProp[T]]): StyleProp[T] = js.native
  def apply[T](style1: js.Array[StyleProp[T]], style2: StyleProp[T]): StyleProp[T] = js.native
  def apply[T](style1: StyleProp[T], style2: js.Array[StyleProp[T]]): StyleProp[T] = js.native
  def apply[T](style1: StyleProp[T], style2: StyleProp[T]): StyleProp[T] = js.native
}

