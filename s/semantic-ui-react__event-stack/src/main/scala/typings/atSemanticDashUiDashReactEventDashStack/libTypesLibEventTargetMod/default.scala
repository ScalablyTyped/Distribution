package typings.atSemanticDashUiDashReactEventDashStack.libTypesLibEventTargetMod

import typings.atSemanticDashUiDashReactEventDashStack.libTypesTypesMod.EventListeners
import typings.atSemanticDashUiDashReactEventDashStack.libTypesTypesMod.TargetElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@semantic-ui-react/event-stack/lib/types/lib/EventTarget", JSImport.Default)
@js.native
class default protected () extends EventTarget {
  def this(target: TargetElement) = this()
  /* CompleteClass */
  override var addTargetHandler: js.Any = js.native
  /* CompleteClass */
  override var createEmitter: js.Any = js.native
  /* CompleteClass */
  override val handlers: js.Any = js.native
  /* CompleteClass */
  override val pools: js.Any = js.native
  /* CompleteClass */
  override var removeTargetHandler: js.Any = js.native
  /* CompleteClass */
  override val target: js.Any = js.native
  /* CompleteClass */
  override def addHandlers(poolName: String, eventType: String, eventHandlers: EventListeners): Unit = js.native
  /* CompleteClass */
  override def hasHandlers(): Boolean = js.native
  /* CompleteClass */
  override def removeHandlers(poolName: String, eventType: String, eventHandlers: EventListeners): Unit = js.native
}

