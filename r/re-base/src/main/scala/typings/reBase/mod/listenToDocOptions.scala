package typings.reBase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait listenToDocOptions extends js.Object {
  /**
    * The context of your component.
    */
  var context: js.Object
  /**
    * A callback that will be called with any errors such as permissions
    * errors.
    */
  var onFailure: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * A callback that will be called when the listener is set, use for
    * loading indicators.
    */
  var `then`: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object listenToDocOptions {
  @scala.inline
  def apply(context: js.Object, onFailure: () => Unit = null, `then`: () => Unit = null): listenToDocOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction0(onFailure))
    if (`then` != null) __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[listenToDocOptions]
  }
}

