package typings.reactBootstrapTable.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonProps extends StObject {
  
  /**
    * Bootstrap css style class for the button, e.g. 'btn-warning'
    */
  var btnContextual: js.UndefOr[String] = js.undefined
  
  /**
    * Glyphicon glyph string for the button, e.g. 'glyphicon-edit'
    */
  var btnGlyphicon: js.UndefOr[String] = js.undefined
  
  /**
    * Label for the button
    */
  var btnText: js.UndefOr[String] = js.undefined
  
  /**
    * Custom class for the button
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * Function to be called to activate the normal onClick functionality for this button.
    */
  var onClick: js.UndefOr[js.Function1[/* e */ MouseEvent[Any, NativeMouseEvent], Unit]] = js.undefined
}
object ButtonProps {
  
  inline def apply(): ButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonProps]
  }
  
  extension [Self <: ButtonProps](x: Self) {
    
    inline def setBtnContextual(value: String): Self = StObject.set(x, "btnContextual", value.asInstanceOf[js.Any])
    
    inline def setBtnContextualUndefined: Self = StObject.set(x, "btnContextual", js.undefined)
    
    inline def setBtnGlyphicon(value: String): Self = StObject.set(x, "btnGlyphicon", value.asInstanceOf[js.Any])
    
    inline def setBtnGlyphiconUndefined: Self = StObject.set(x, "btnGlyphicon", js.undefined)
    
    inline def setBtnText(value: String): Self = StObject.set(x, "btnText", value.asInstanceOf[js.Any])
    
    inline def setBtnTextUndefined: Self = StObject.set(x, "btnText", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setOnClick(value: /* e */ MouseEvent[Any, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
