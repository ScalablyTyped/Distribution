package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanResponderStatic extends js.Object {
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
  def create(config: PanResponderCallbacks): PanResponderInstance = js.native
}

object PanResponderStatic {
  @scala.inline
  def apply(create: PanResponderCallbacks => PanResponderInstance): PanResponderStatic = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[PanResponderStatic]
  }
  @scala.inline
  implicit class PanResponderStaticOps[Self <: PanResponderStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreate(value: PanResponderCallbacks => PanResponderInstance): Self = this.set("create", js.Any.fromFunction1(value))
  }
  
}

