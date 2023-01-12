package typings.reactNative.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.anon.Screen
import typings.reactNative.reactNativeStrings.change
import typings.reactNative.reactNativeStrings.screen
import typings.reactNative.reactNativeStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dimensions extends StObject {
  
  /**
    * Add an event listener for dimension changes
    *
    * @param type the type of event to listen to
    * @param handler the event handler
    */
  @JSName("addEventListener")
  def addEventListener_change(`type`: change, handler: js.Function1[/* param0 */ Screen, Unit]): EmitterSubscription
  
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
  def get(dim: window | screen): ScaledSize
  
  /**
    * This should only be called from native code by sending the didUpdateDimensions event.
    * @param dims Simple string-keyed object of dimensions to set
    */
  def set(dims: StringDictionary[Any]): Unit
}
object Dimensions {
  
  @JSImport("react-native", "Dimensions")
  @js.native
  val ^ : Dimensions = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dimensions] (val x: Self) extends AnyVal {
    
    inline def setAddEventListener(value: (change, js.Function1[/* param0 */ Screen, Unit]) => EmitterSubscription): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
    
    inline def setGet(value: window | screen => ScaledSize): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setSet(value: StringDictionary[Any] => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
  }
}
