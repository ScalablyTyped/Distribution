package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PanResponderStatic extends StObject {
  
  /**
    * @param config Enhanced versions of all of the responder callbacks
    * that provide not only the typical `ResponderSyntheticEvent`, but also the
    * `PanResponder` gesture state.  Simply replace the word `Responder` with
    * `PanResponder` in each of the typical `onResponder*` callbacks. For
    * example, the `config` object would look like:
    *
    *  - `onMoveShouldSetPanResponder: (e, gestureState) => {...}`
    *  - `onMoveShouldSetPanResponderCapture: (e, gestureState) => {...}`
    *  - `onStartShouldSetPanResponder: (e, gestureState) => {...}`
    *  - `onStartShouldSetPanResponderCapture: (e, gestureState) => {...}`
    *  - `onPanResponderReject: (e, gestureState) => {...}`
    *  - `onPanResponderGrant: (e, gestureState) => {...}`
    *  - `onPanResponderStart: (e, gestureState) => {...}`
    *  - `onPanResponderEnd: (e, gestureState) => {...}`
    *  - `onPanResponderRelease: (e, gestureState) => {...}`
    *  - `onPanResponderMove: (e, gestureState) => {...}`
    *  - `onPanResponderTerminate: (e, gestureState) => {...}`
    *  - `onPanResponderTerminationRequest: (e, gestureState) => {...}`
    *  - `onShouldBlockNativeResponder: (e, gestureState) => {...}`
    *
    *  In general, for events that have capture equivalents, we update the
    *  gestureState once in the capture phase and can use it in the bubble phase
    *  as well.
    *
    *  Be careful with onStartShould* callbacks. They only reflect updated
    *  `gestureState` for start/end events that bubble/capture to the Node.
    *  Once the node is the responder, you can rely on every start/end event
    *  being processed by the gesture and `gestureState` being updated
    *  accordingly. (numberActiveTouches) may not be totally accurate unless you
    *  are the responder.
    */
  def create(config: PanResponderCallbacks): PanResponderInstance
}
object PanResponderStatic {
  
  inline def apply(create: PanResponderCallbacks => PanResponderInstance): PanResponderStatic = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[PanResponderStatic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PanResponderStatic] (val x: Self) extends AnyVal {
    
    inline def setCreate(value: PanResponderCallbacks => PanResponderInstance): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
  }
}
