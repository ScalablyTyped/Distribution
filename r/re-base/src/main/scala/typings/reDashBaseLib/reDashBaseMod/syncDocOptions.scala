package typings
package reDashBaseLib.reDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait syncDocOptions extends js.Object {
  /**
    * The context of your component.
    */
  var context: js.Object
  /**
    * A callback that will be called with any errors such as permissions
    * errors.
    */
  var onFailure: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * The state property to sync.
    */
  var state: java.lang.String
  /**
    * A callback that will be called when the listener is set, use for
    * loading indicators.
    */
  var `then`: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object syncDocOptions {
  @scala.inline
  def apply(
    context: js.Object,
    state: java.lang.String,
    onFailure: () => scala.Unit = null,
    `then`: () => scala.Unit = null
  ): syncDocOptions = {
    val __obj = js.Dynamic.literal(context = context, state = state)
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction0(onFailure))
    if (`then` != null) __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[syncDocOptions]
  }
}

