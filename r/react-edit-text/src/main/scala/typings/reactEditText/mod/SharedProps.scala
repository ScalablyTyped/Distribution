package typings.reactEditText.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedProps extends js.Object {
  
  /**
    * className attribute set for both input and div element
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * id attribute set for both input and div element
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * name attribute set for input element
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * onSave is called when the input blur event is triggered or enter key is pressed
    * returns an object: {name, value} which correspond to the input name and value
    */
  var onSave: js.UndefOr[js.Function1[/* hasNameValue */ onSaveProps, Unit]] = js.native
  
  /**
    * placeholder is displayed in the div element when value is empty
    */
  var placeholder: js.UndefOr[String] = js.native
  
  /**
    * Displays only the view element when set to true,
    * default: false
    */
  var readonly: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the css styling for both input and div elements
    */
  var style: js.UndefOr[CSSProperties] = js.native
  
  /**
    * value sets the defaultValue for input element and display text of div element
    */
  var value: js.UndefOr[String] = js.native
}
object SharedProps {
  
  @scala.inline
  def apply(): SharedProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedProps]
  }
  
  @scala.inline
  implicit class SharedPropsOps[Self <: SharedProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOnSave(value: /* hasNameValue */ onSaveProps => Unit): Self = this.set("onSave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSave: Self = this.set("onSave", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadonly: Self = this.set("readonly", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
