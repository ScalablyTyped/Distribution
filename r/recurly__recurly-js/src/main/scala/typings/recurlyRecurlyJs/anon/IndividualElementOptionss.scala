package typings.recurlyRecurlyJs.anon

import typings.recurlyRecurlyJs.libElementsMod.CommonElementStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @recurly/recurly-js.@recurly/recurly-js/lib/elements.IndividualElementOptions & {  selector :string | undefined} */
trait IndividualElementOptionss extends StObject {
  
  /**
    * Enables contextual input formatting, injecting spaces to match the card brand, and forcing numeric input on expiry
    * and cvv.
    */
  var format: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Modifies the input type of the expiry fields. 'text' - normal text input. 'mobileSelect' - if the user is using a
    * mobile device, a native select interface will appear. 'select' - A select field will display on all devices
    */
  var inputType: js.UndefOr[String] = js.undefined
  
  var selector: js.UndefOr[String] = js.undefined
  
  /**
    * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#common-field-style-properties|Common field style properties}
    */
  var style: js.UndefOr[CommonElementStyle & Invalid] = js.undefined
  
  /**
    * tabIndex property to be applied to the outer iframe.
    */
  var tabIndex: js.UndefOr[String] = js.undefined
}
object IndividualElementOptionss {
  
  inline def apply(): IndividualElementOptionss = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndividualElementOptionss]
  }
  
  extension [Self <: IndividualElementOptionss](x: Self) {
    
    inline def setFormat(value: Boolean): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setInputType(value: String): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
    
    inline def setInputTypeUndefined: Self = StObject.set(x, "inputType", js.undefined)
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setStyle(value: CommonElementStyle & Invalid): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTabIndex(value: String): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
  }
}
