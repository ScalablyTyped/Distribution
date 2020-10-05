package typings.reactNativeGestureHandler.mod

import typings.react.mod.Component
import typings.reactNative.mod.FlatListProperties
import typings.reactNativeGestureHandler.anon.Index
import typings.reactNativeGestureHandler.anon.Item
import typings.reactNativeGestureHandler.anon.Offset
import typings.reactNativeGestureHandler.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-gesture-handler", "FlatList")
@js.native
class FlatList[ItemT] ()
  extends Component[NativeViewGestureHandlerProperties with FlatListProperties[ItemT], js.Object, js.Any] {
  def scrollToEnd(): Unit = js.native
  def scrollToEnd(params: `0`): Unit = js.native
  def scrollToIndex(params: Index): Unit = js.native
  def scrollToItem(params: Item[ItemT]): Unit = js.native
  def scrollToOffset(params: Offset): Unit = js.native
}

