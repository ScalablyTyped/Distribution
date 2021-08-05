package typings.semanticUiReactEventStack

import typings.semanticUiReactEventStack.typesMod.EventListeners
import typings.semanticUiReactEventStack.typesMod.GenericMap
import typings.semanticUiReactEventStack.typesMod.InputEventListener
import typings.semanticUiReactEventStack.typesMod.InputTargetElement
import typings.semanticUiReactEventStack.typesMod.TargetElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@semantic-ui-react/event-stack/lib/types/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cloneMap[T](map: GenericMap[T]): GenericMap[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneMap")(map.asInstanceOf[js.Any]).asInstanceOf[GenericMap[T]]
  
  inline def isRefObject[T](ref: js.Any): /* is react.react.RefObject<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRefObject")(ref.asInstanceOf[js.Any]).asInstanceOf[/* is react.react.RefObject<T> */ Boolean]
  
  inline def normalizeHandlers(handlers: InputEventListener): EventListeners = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeHandlers")(handlers.asInstanceOf[js.Any]).asInstanceOf[EventListeners]
  
  inline def normalizeTarget(target: InputTargetElement): TargetElement = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTarget")(target.asInstanceOf[js.Any]).asInstanceOf[TargetElement]
}
