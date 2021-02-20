package typings.semanticUiReactEventStack

import typings.semanticUiReactEventStack.typesMod.EventListeners
import typings.semanticUiReactEventStack.typesMod.GenericMap
import typings.semanticUiReactEventStack.typesMod.InputEventListener
import typings.semanticUiReactEventStack.typesMod.InputTargetElement
import typings.semanticUiReactEventStack.typesMod.TargetElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@semantic-ui-react/event-stack/lib/types/lib/utils", "cloneMap")
  @js.native
  def cloneMap[T](map: GenericMap[T]): GenericMap[T] = js.native
  
  @JSImport("@semantic-ui-react/event-stack/lib/types/lib/utils", "isRefObject")
  @js.native
  def isRefObject[T](ref: js.Any): /* is react.react.RefObject<T> */ Boolean = js.native
  
  @JSImport("@semantic-ui-react/event-stack/lib/types/lib/utils", "normalizeHandlers")
  @js.native
  def normalizeHandlers(handlers: InputEventListener): EventListeners = js.native
  
  @JSImport("@semantic-ui-react/event-stack/lib/types/lib/utils", "normalizeTarget")
  @js.native
  def normalizeTarget(target: InputTargetElement): TargetElement = js.native
}
