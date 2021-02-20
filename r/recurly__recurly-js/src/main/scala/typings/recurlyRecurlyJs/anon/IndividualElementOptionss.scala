package typings.recurlyRecurlyJs.anon

import typings.recurlyRecurlyJs.elementsMod.CommonElementStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @recurly/recurly-js.@recurly/recurly-js/lib/elements.IndividualElementOptions & {  selector :string | undefined} */
@js.native
trait IndividualElementOptionss extends StObject {
  
  /**
    * Enables contextual input formatting, injecting spaces to match the card brand, and forcing numeric input on expiry
    * and cvv.
    */
  var format: js.UndefOr[Boolean] = js.native
  
  /**
    * Modifies the input type of the expiry fields. 'text' - normal text input. 'mobileSelect' - if the user is using a
    * mobile device, a native select interface will appear. 'select' - A select field will display on all devices
    */
  var inputType: js.UndefOr[String] = js.native
  
  var selector: js.UndefOr[String] = js.native
  
  /**
    * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#common-field-style-properties|Common field style properties}
    */
  var style: js.UndefOr[CommonElementStyle with Invalid] = js.native
  
  /**
    * tabIndex property to be applied to the outer iframe.
    */
  var tabIndex: js.UndefOr[String] = js.native
}
object IndividualElementOptionss {
  
  @scala.inline
  def apply(): IndividualElementOptionss = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndividualElementOptionss]
  }
  
  @scala.inline
  implicit class IndividualElementOptionssMutableBuilder[Self <: IndividualElementOptionss] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: Boolean): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setInputType(value: String): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputTypeUndefined: Self = StObject.set(x, "inputType", js.undefined)
    
    @scala.inline
    def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    @scala.inline
    def setStyle(value: CommonElementStyle with Invalid): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTabIndex(value: String): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
  }
}
