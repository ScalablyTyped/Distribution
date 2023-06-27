package typings.sentryReplay.typesTypesReplayMod

import typings.sentryTypes.typesBreadcrumbMod.Breadcrumb
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplayClickDetector extends StObject {
  
  def addListeners(): Unit
  
  def handleClick(breadcrumb: Breadcrumb, node: HTMLElement): Unit
  
  def removeListeners(): Unit
}
object ReplayClickDetector {
  
  inline def apply(
    addListeners: () => Unit,
    handleClick: (Breadcrumb, HTMLElement) => Unit,
    removeListeners: () => Unit
  ): ReplayClickDetector = {
    val __obj = js.Dynamic.literal(addListeners = js.Any.fromFunction0(addListeners), handleClick = js.Any.fromFunction2(handleClick), removeListeners = js.Any.fromFunction0(removeListeners))
    __obj.asInstanceOf[ReplayClickDetector]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplayClickDetector] (val x: Self) extends AnyVal {
    
    inline def setAddListeners(value: () => Unit): Self = StObject.set(x, "addListeners", js.Any.fromFunction0(value))
    
    inline def setHandleClick(value: (Breadcrumb, HTMLElement) => Unit): Self = StObject.set(x, "handleClick", js.Any.fromFunction2(value))
    
    inline def setRemoveListeners(value: () => Unit): Self = StObject.set(x, "removeListeners", js.Any.fromFunction0(value))
  }
}
