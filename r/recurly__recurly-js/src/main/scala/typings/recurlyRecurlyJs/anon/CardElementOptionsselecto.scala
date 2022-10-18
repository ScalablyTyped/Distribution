package typings.recurlyRecurlyJs.anon

import typings.recurlyRecurlyJs.libElementsMod.CommonElementStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @recurly/recurly-js.@recurly/recurly-js/lib/elements.CardElementOptions & {  selector :string | undefined} */
trait CardElementOptionsselecto extends StObject {
  
  /**
    * If false, the card brand icon will be hidden
    */
  var displayIcon: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Modifies the input type of the card field:
    *
    * 'text' - text input for all fields.
    *
    * 'mobileSelect' - if the user is using amobile device, a native expiry select interface will appear when entering the
    * expiration date.
    *
    * 'select' - Expiration date will be input using a select field on all devices. Mobile devices will display an
    * optimized interface.
    */
  var inputType: js.UndefOr[String] = js.undefined
  
  var selector: js.UndefOr[String] = js.undefined
  
  /**
    * Style to apply to input elements
    *
    * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#styling-the-individual-card-elements|Styling the invididual card elements}
    */
  var style: js.UndefOr[CommonElementStyle & Placeholder] = js.undefined
  
  /**
    * `tabindex` property to be applied to the outer iframe.
    */
  var tabIndex: js.UndefOr[String] = js.undefined
}
object CardElementOptionsselecto {
  
  inline def apply(): CardElementOptionsselecto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardElementOptionsselecto]
  }
  
  extension [Self <: CardElementOptionsselecto](x: Self) {
    
    inline def setDisplayIcon(value: Boolean): Self = StObject.set(x, "displayIcon", value.asInstanceOf[js.Any])
    
    inline def setDisplayIconUndefined: Self = StObject.set(x, "displayIcon", js.undefined)
    
    inline def setInputType(value: String): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
    
    inline def setInputTypeUndefined: Self = StObject.set(x, "inputType", js.undefined)
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setStyle(value: CommonElementStyle & Placeholder): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTabIndex(value: String): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
  }
}
