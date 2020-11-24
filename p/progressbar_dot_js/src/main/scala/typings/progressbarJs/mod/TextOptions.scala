package typings.progressbarJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextOptions extends js.Object {
  
  /**
    * Only effective if the shape is SemiCircle.
    * If true, baseline for text is aligned with bottom of the SVG canvas.
    * If false, bottom line of SVG canvas is in the center of text.
    * @default true
    */
  var alignToBottom: js.UndefOr[Boolean] = js.native
  
  /**
    * Only effective if the `text.style` is not `null`.
    * By default `position: relative` is applied to container if text is set.
    * Setting this to false disables that feature.
    * @default true
    */
  var autoStyleContainer: js.UndefOr[Boolean] = js.native
  
  /**
    * Class name for text element.
    * @default 'progressbar-text'
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * Inline CSS styles for the text element.
    * If you want to modify all CSS your self, set null to disable all default styles.
    * If the style option contains values, container is automatically
    * set to position: relative. You can disable behavior this with `autoStyleContainer: false`
    * If you specify anything in this object, none of the default styles apply.
    */
  var style: js.UndefOr[TextInlineStyle | Null] = js.native
  
  /**
    * Initial value for text.
    * @default null
    */
  var value: js.UndefOr[String | Null] = js.native
}
object TextOptions {
  
  @scala.inline
  def apply(): TextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextOptions]
  }
  
  @scala.inline
  implicit class TextOptionsOps[Self <: TextOptions] (val x: Self) extends AnyVal {
    
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
    def setAlignToBottom(value: Boolean): Self = this.set("alignToBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignToBottom: Self = this.set("alignToBottom", js.undefined)
    
    @scala.inline
    def setAutoStyleContainer(value: Boolean): Self = this.set("autoStyleContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoStyleContainer: Self = this.set("autoStyleContainer", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setStyle(value: TextInlineStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
}
