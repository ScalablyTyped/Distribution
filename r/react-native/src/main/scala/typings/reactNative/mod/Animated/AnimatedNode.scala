package typings.reactNative.mod.Animated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native", "Animated.AnimatedNode")
@js.native
open class AnimatedNode () extends StObject {
  
  /**
    * Adds an asynchronous listener to the value so you can observe updates from
    * animations.  This is useful because there is no way to
    * synchronously read the value because it might be driven natively.
    *
    * See https://reactnative.dev/docs/animatedvalue.html#addlistener
    */
  def addListener(callback: js.Function1[/* value */ Any, Any]): String = js.native
  
  def hasListeners(): Boolean = js.native
  
  /**
    * Remove all registered listeners.
    *
    * See https://reactnative.dev/docs/animatedvalue.html#removealllisteners
    */
  def removeAllListeners(): Unit = js.native
  
  /**
    * Unregister a listener. The `id` param shall match the identifier
    * previously returned by `addListener()`.
    *
    * See https://reactnative.dev/docs/animatedvalue.html#removelistener
    */
  def removeListener(id: String): Unit = js.native
}
