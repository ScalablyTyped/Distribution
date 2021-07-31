package typings.reactNativeGestureHandler.mod

import typings.react.mod.Component
import typings.reactNative.mod.FlatListProperties
import typings.reactNativeGestureHandler.anon.Index
import typings.reactNativeGestureHandler.anon.Item
import typings.reactNativeGestureHandler.anon.Offset
import typings.reactNativeGestureHandler.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-gesture-handler", "FlatList")
@js.native
class FlatList[ItemT] protected ()
  extends Component[NativeViewGestureHandlerProperties & FlatListProperties[ItemT], js.Object, js.Any] {
  def this(props: NativeViewGestureHandlerProperties & FlatListProperties[ItemT]) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: NativeViewGestureHandlerProperties & FlatListProperties[ItemT], context: js.Any) = this()
  
  def scrollToEnd(): Unit = js.native
  def scrollToEnd(params: `0`): Unit = js.native
  
  def scrollToIndex(params: Index): Unit = js.native
  
  def scrollToItem(params: Item[ItemT]): Unit = js.native
  
  def scrollToOffset(params: Offset): Unit = js.native
}
