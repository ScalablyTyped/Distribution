package typings.reactMdTransition.typesMod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FixedPositioningScrollData[FixedToElement /* <: HTMLElement */, FixedElement /* <: HTMLElement */] extends StObject {
  
  var fixedElement: FixedElement
  
  var fixedToElement: FixedToElement
  
  /**
    * Boolean if the {@link fixedToElement} is visible within the viewport.
    */
  var visible: Boolean
}
object FixedPositioningScrollData {
  
  inline def apply[FixedToElement /* <: HTMLElement */, FixedElement /* <: HTMLElement */](fixedElement: FixedElement, fixedToElement: FixedToElement, visible: Boolean): FixedPositioningScrollData[FixedToElement, FixedElement] = {
    val __obj = js.Dynamic.literal(fixedElement = fixedElement.asInstanceOf[js.Any], fixedToElement = fixedToElement.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixedPositioningScrollData[FixedToElement, FixedElement]]
  }
  
  extension [Self <: FixedPositioningScrollData[?, ?], FixedToElement /* <: HTMLElement */, FixedElement /* <: HTMLElement */](x: Self & (FixedPositioningScrollData[FixedToElement, FixedElement])) {
    
    inline def setFixedElement(value: FixedElement): Self = StObject.set(x, "fixedElement", value.asInstanceOf[js.Any])
    
    inline def setFixedToElement(value: FixedToElement): Self = StObject.set(x, "fixedToElement", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
