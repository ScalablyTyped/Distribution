package typings.semanticUiReactEventStack

import typings.semanticUiReactEventStack.typesMod.EventListeners
import typings.semanticUiReactEventStack.typesMod.GenericMap
import typings.semanticUiReactEventStack.typesMod.InputEventListener
import typings.semanticUiReactEventStack.typesMod.InputTargetElement
import typings.semanticUiReactEventStack.typesMod.TargetElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@semantic-ui-react/event-stack/lib/types/lib/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def cloneMap[T](map: GenericMap[T]): GenericMap[T] = js.native
  def isRefObject[T](ref: js.Any): /* is react.react.RefObject<T> */ Boolean = js.native
  def normalizeHandlers(handlers: InputEventListener): EventListeners = js.native
  def normalizeTarget(target: InputTargetElement): TargetElement = js.native
}

