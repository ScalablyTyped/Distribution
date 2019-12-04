package typings.atSemanticDashUiDashReactEventDashStack

import typings.atSemanticDashUiDashReactEventDashStack.libTypesTypesMod.EventListeners
import typings.atSemanticDashUiDashReactEventDashStack.libTypesTypesMod.GenericMap
import typings.atSemanticDashUiDashReactEventDashStack.libTypesTypesMod.InputEventListener
import typings.atSemanticDashUiDashReactEventDashStack.libTypesTypesMod.InputTargetElement
import typings.atSemanticDashUiDashReactEventDashStack.libTypesTypesMod.TargetElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@semantic-ui-react/event-stack/lib/types/lib/utils", JSImport.Namespace)
@js.native
object libTypesLibUtilsMod extends js.Object {
  def cloneMap[T](map: GenericMap[T]): GenericMap[T] = js.native
  def isRefObject[T](ref: js.Any): /* is react.react.RefObject<T> */ Boolean = js.native
  def normalizeHandlers(handlers: InputEventListener): EventListeners = js.native
  def normalizeTarget(target: InputTargetElement): TargetElement = js.native
}

