package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dimensions extends js.Object {
  /**
    * Add an event listener for dimension changes
    *
    * @param type the type of event to listen to
    * @param handler the event handler
    */
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: reactDashNativeLib.reactDashNativeLibStrings.change,
    handler: js.Function1[/* hasWindowScreen */ reactDashNativeLib.Anon_Screen, scala.Unit]
  ): scala.Unit = js.native
  @JSName("get")
  def get_screen(dim: reactDashNativeLib.reactDashNativeLibStrings.screen): ScaledSize = js.native
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
  def get_window(dim: reactDashNativeLib.reactDashNativeLibStrings.window): ScaledSize = js.native
  /**
    * Remove an event listener
    *
    * @param type the type of event
    * @param handler the event handler
    */
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: reactDashNativeLib.reactDashNativeLibStrings.change,
    handler: js.Function1[/* hasWindowScreen */ reactDashNativeLib.Anon_Screen, scala.Unit]
  ): scala.Unit = js.native
  /**
    * This should only be called from native code by sending the didUpdateDimensions event.
    * @param dims Simple string-keyed object of dimensions to set
    */
  def set(dims: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
}

