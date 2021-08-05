package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentOrShadowRoot extends StObject {
  
  val activeElement: Element | Null
  
  def caretPositionFromPoint(x: Double, y: Double): CaretPosition | Null
  
  /** @deprecated */
  def caretRangeFromPoint(x: Double, y: Double): Range
  
  def elementFromPoint(x: Double, y: Double): Element | Null
  
  def elementsFromPoint(x: Double, y: Double): js.Array[Element]
  
  /**
    * Returns document's fullscreen element.
    */
  val fullscreenElement: Element | Null
  
  def getSelection(): Selection | Null
  
  val pointerLockElement: Element | Null
  
  /**
    * Retrieves a collection of styleSheet objects representing the style sheets that correspond to each instance of a link or style object in the document.
    */
  val styleSheets: StyleSheetList
}
object DocumentOrShadowRoot {
  
  inline def apply(
    caretPositionFromPoint: (Double, Double) => CaretPosition | Null,
    caretRangeFromPoint: (Double, Double) => Range,
    elementFromPoint: (Double, Double) => Element | Null,
    elementsFromPoint: (Double, Double) => js.Array[Element],
    getSelection: () => Selection | Null,
    styleSheets: StyleSheetList
  ): DocumentOrShadowRoot = {
    val __obj = js.Dynamic.literal(caretPositionFromPoint = js.Any.fromFunction2(caretPositionFromPoint), caretRangeFromPoint = js.Any.fromFunction2(caretRangeFromPoint), elementFromPoint = js.Any.fromFunction2(elementFromPoint), elementsFromPoint = js.Any.fromFunction2(elementsFromPoint), getSelection = js.Any.fromFunction0(getSelection), styleSheets = styleSheets.asInstanceOf[js.Any], activeElement = null, fullscreenElement = null, pointerLockElement = null)
    __obj.asInstanceOf[DocumentOrShadowRoot]
  }
  
  extension [Self <: DocumentOrShadowRoot](x: Self) {
    
    inline def setActiveElement(value: Element): Self = StObject.set(x, "activeElement", value.asInstanceOf[js.Any])
    
    inline def setActiveElementNull: Self = StObject.set(x, "activeElement", null)
    
    inline def setCaretPositionFromPoint(value: (Double, Double) => CaretPosition | Null): Self = StObject.set(x, "caretPositionFromPoint", js.Any.fromFunction2(value))
    
    inline def setCaretRangeFromPoint(value: (Double, Double) => Range): Self = StObject.set(x, "caretRangeFromPoint", js.Any.fromFunction2(value))
    
    inline def setElementFromPoint(value: (Double, Double) => Element | Null): Self = StObject.set(x, "elementFromPoint", js.Any.fromFunction2(value))
    
    inline def setElementsFromPoint(value: (Double, Double) => js.Array[Element]): Self = StObject.set(x, "elementsFromPoint", js.Any.fromFunction2(value))
    
    inline def setFullscreenElement(value: Element): Self = StObject.set(x, "fullscreenElement", value.asInstanceOf[js.Any])
    
    inline def setFullscreenElementNull: Self = StObject.set(x, "fullscreenElement", null)
    
    inline def setGetSelection(value: () => Selection | Null): Self = StObject.set(x, "getSelection", js.Any.fromFunction0(value))
    
    inline def setPointerLockElement(value: Element): Self = StObject.set(x, "pointerLockElement", value.asInstanceOf[js.Any])
    
    inline def setPointerLockElementNull: Self = StObject.set(x, "pointerLockElement", null)
    
    inline def setStyleSheets(value: StyleSheetList): Self = StObject.set(x, "styleSheets", value.asInstanceOf[js.Any])
  }
}
