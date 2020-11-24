package typings.reactNative.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.reactNative.anon.Screen
import typings.reactNative.reactNativeStrings.change
import typings.reactNative.reactNativeStrings.screen
import typings.reactNative.reactNativeStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dimensions extends js.Object {
  
  /**
    * Add an event listener for dimension changes
    *
    * @param type the type of event to listen to
    * @param handler the event handler
    */
  @JSName("addEventListener")
  def addEventListener_change(`type`: change, handler: js.Function1[/* hasWindowScreen */ Screen, Unit]): Unit = js.native
  
  @JSName("get")
  def get_screen(dim: screen): ScaledSize = js.native
  /**
    * Initial dimensions are set before runApplication is called so they
    * should be available before any other require's are run, but may be
    * updated later.
    * Note: Although dimensions are available immediately, they may
    * change (e.g due to device rotation) so any rendering logic or
    * styles that depend on these constants should try to call this
    * function on every render, rather than caching the value (for
    * example, using inline styles rather than setting a value in a
    * StyleSheet).
    * Example: const {height, width} = Dimensions.get('window');
    @param dim Name of dimension as defined when calling set.
    @returns Value for the dimension.
    */
  @JSName("get")
  def get_window(dim: window): ScaledSize = js.native
  
  /**
    * Remove an event listener
    *
    * @param type the type of event
    * @param handler the event handler
    */
  @JSName("removeEventListener")
  def removeEventListener_change(`type`: change, handler: js.Function1[/* hasWindowScreen */ Screen, Unit]): Unit = js.native
  
  /**
    * This should only be called from native code by sending the didUpdateDimensions event.
    * @param dims Simple string-keyed object of dimensions to set
    */
  def set(dims: StringDictionary[js.Any]): Unit = js.native
}
@JSImport("react-native", "Dimensions")
@js.native
object Dimensions extends TopLevel[Dimensions]
