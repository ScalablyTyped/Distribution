package typings.semanticUiReactEventStack.eventSetMod

import typings.semanticUiReactEventStack.typesMod.EventListeners
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@semantic-ui-react/event-stack/lib/types/lib/EventSet", JSImport.Default)
@js.native
class default protected () extends EventSet {
  /**
    * @see https://jsperf.com/suir-eventset-constructor
    */
  def this(eventHandlers: EventListeners) = this()
}

