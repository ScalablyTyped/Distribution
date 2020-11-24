package typings.recurlyRecurlyJs.anon

import typings.recurlyRecurlyJs.elementsMod.CommonElementStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @recurly/recurly-js.@recurly/recurly-js/lib/elements.IndividualElementOptions & {  selector :string | undefined} */
@js.native
trait IndividualElementOptionss extends js.Object {
  
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
  implicit class IndividualElementOptionssOps[Self <: IndividualElementOptionss] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFormat(value: Boolean): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setInputType(value: String): Self = this.set("inputType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputType: Self = this.set("inputType", js.undefined)
    
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    
    @scala.inline
    def setStyle(value: CommonElementStyle with Invalid): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTabIndex(value: String): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
  }
}
