package typings.reactBootstrapTable.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowSelectedButtonProps extends StObject {
  
  /**
    * Bootstrap css style class for the button, e.g. 'btn-warning'
    */
  var btnContextual: js.UndefOr[String] = js.undefined
  
  /**
    * Glyphicon glyph string for the button, e.g. 'glyphicon-edit'
    */
  var btnGlyphicon: js.UndefOr[String] = js.undefined
  
  /**
    * Custom class for the button
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * Function to be called to activate the normal onClick functionality for this button.
    */
  var onClick: js.UndefOr[js.Function1[/* e */ MouseEvent[js.Any, NativeMouseEvent], Unit]] = js.undefined
  
  /**
    * Label for when clicking the button will toggle the table back into "show all rows" mode.
    */
  var showAllText: js.UndefOr[String] = js.undefined
  
  /**
    * Label for when clicking the button will toggle the table into "show only selected rows" mode.
    */
  var showOnlySelectText: js.UndefOr[String] = js.undefined
}
object ShowSelectedButtonProps {
  
  @scala.inline
  def apply(): ShowSelectedButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowSelectedButtonProps]
  }
  
  @scala.inline
  implicit class ShowSelectedButtonPropsMutableBuilder[Self <: ShowSelectedButtonProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBtnContextual(value: String): Self = StObject.set(x, "btnContextual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBtnContextualUndefined: Self = StObject.set(x, "btnContextual", js.undefined)
    
    @scala.inline
    def setBtnGlyphicon(value: String): Self = StObject.set(x, "btnGlyphicon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBtnGlyphiconUndefined: Self = StObject.set(x, "btnGlyphicon", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* e */ MouseEvent[js.Any, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setShowAllText(value: String): Self = StObject.set(x, "showAllText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAllTextUndefined: Self = StObject.set(x, "showAllText", js.undefined)
    
    @scala.inline
    def setShowOnlySelectText(value: String): Self = StObject.set(x, "showOnlySelectText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowOnlySelectTextUndefined: Self = StObject.set(x, "showOnlySelectText", js.undefined)
  }
}
