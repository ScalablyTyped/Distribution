package typings.semanticUiReactEventStack.anon

import typings.semanticUiReactEventStack.typesMod.InputEventListener
import typings.semanticUiReactEventStack.typesMod.InputTargetElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@semantic-ui-react/event-stack.@semantic-ui-react/event-stack/lib/types/EventStack.EventStackProps> */
trait ReadonlyEventStackProps extends js.Object {
  val name: String
  val on: InputEventListener
  val pool: js.UndefOr[String] = js.undefined
  val target: js.UndefOr[InputTargetElement] = js.undefined
}

object ReadonlyEventStackProps {
  @scala.inline
  def apply(name: String, on: InputEventListener, pool: String = null, target: InputTargetElement = null): ReadonlyEventStackProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any])
    if (pool != null) __obj.updateDynamic("pool")(pool.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyEventStackProps]
  }
}

