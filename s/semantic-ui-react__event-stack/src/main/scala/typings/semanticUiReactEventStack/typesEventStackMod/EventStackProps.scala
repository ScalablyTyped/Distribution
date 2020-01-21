package typings.semanticUiReactEventStack.typesEventStackMod

import typings.semanticUiReactEventStack.typesMod.InputEventListener
import typings.semanticUiReactEventStack.typesMod.InputTargetElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventStackProps extends js.Object {
  /** An event name on which we will subscribe. */
  var name: String
  /** An event handler or array of event handlers. */
  var on: InputEventListener
  /** A name of pool. */
  var pool: js.UndefOr[String] = js.undefined
  /** A DOM element on which we will subscribe. */
  var target: js.UndefOr[InputTargetElement] = js.undefined
}

object EventStackProps {
  @scala.inline
  def apply(name: String, on: InputEventListener, pool: String = null, target: InputTargetElement = null): EventStackProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any])
    if (pool != null) __obj.updateDynamic("pool")(pool.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventStackProps]
  }
}

