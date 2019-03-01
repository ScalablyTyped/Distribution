package typings
package reDashBaseLib.reDashBaseMod

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
  var onFailure: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * A callback that will be called when the listener is set, use for
    * loading indicators.
    */
  var `then`: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object listenToDocOptions {
  @scala.inline
  def apply(
    context: js.Object,
    onFailure: js.Function0[scala.Unit] = null,
    `then`: js.Function0[scala.Unit] = null
  ): listenToDocOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("context")(context)
    if (onFailure != null) __obj.updateDynamic("onFailure")(onFailure)
    if (`then` != null) __obj.updateDynamic("then")(`then`)
    __obj.asInstanceOf[listenToDocOptions]
  }
}

