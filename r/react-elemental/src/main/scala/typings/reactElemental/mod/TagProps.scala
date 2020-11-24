package typings.reactElemental.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagProps extends js.Object {
  
  val backgroundColor: js.UndefOr[String] = js.native
  
  val dismissible: js.UndefOr[Boolean] = js.native
  
  val onDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  
  val outlineColor: js.UndefOr[String] = js.native
  
  val size: js.UndefOr[TagSize] = js.native
  
  val style: js.UndefOr[CSSProperties] = js.native
  
  val text: String = js.native
}
object TagProps {
  
  @scala.inline
  def apply(text: String): TagProps = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagProps]
  }
  
  @scala.inline
  implicit class TagPropsOps[Self <: TagProps] (val x: Self) extends AnyVal {
    
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setDismissible(value: Boolean): Self = this.set("dismissible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDismissible: Self = this.set("dismissible", js.undefined)
    
    @scala.inline
    def setOnDismiss(value: () => Unit): Self = this.set("onDismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
    
    @scala.inline
    def setOutlineColor(value: String): Self = this.set("outlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlineColor: Self = this.set("outlineColor", js.undefined)
    
    @scala.inline
    def setSize(value: TagSize): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
