package typings.reactOnsenui.anon

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  modifier :string | undefined,   tappable :boolean | undefined,   tapBackgroundColor :string | undefined,   lockOnDrag :boolean | undefined,   expandable :boolean | undefined,   expanded :boolean | undefined,   onClick :react.react.MouseEventHandler<any> | undefined} */
@js.native
trait HTMLAttributesidclassNameExpandable extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var expandable: js.UndefOr[Boolean] = js.native
  
  var expanded: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var lockOnDrag: js.UndefOr[Boolean] = js.native
  
  var modifier: js.UndefOr[String] = js.native
  
  var onClick: js.UndefOr[MouseEventHandler[_]] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var tapBackgroundColor: js.UndefOr[String] = js.native
  
  var tappable: js.UndefOr[Boolean] = js.native
}
object HTMLAttributesidclassNameExpandable {
  
  @scala.inline
  def apply(): HTMLAttributesidclassNameExpandable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLAttributesidclassNameExpandable]
  }
  
  @scala.inline
  implicit class HTMLAttributesidclassNameExpandableOps[Self <: HTMLAttributesidclassNameExpandable] (val x: Self) extends AnyVal {
    
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
    def setExpandable(value: Boolean): Self = this.set("expandable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandable: Self = this.set("expandable", js.undefined)
    
    @scala.inline
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLockOnDrag(value: Boolean): Self = this.set("lockOnDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockOnDrag: Self = this.set("lockOnDrag", js.undefined)
    
    @scala.inline
    def setModifier(value: String): Self = this.set("modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifier: Self = this.set("modifier", js.undefined)
    
    @scala.inline
    def setOnClick(value: MouseEvent[_, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTapBackgroundColor(value: String): Self = this.set("tapBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTapBackgroundColor: Self = this.set("tapBackgroundColor", js.undefined)
    
    @scala.inline
    def setTappable(value: Boolean): Self = this.set("tappable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTappable: Self = this.set("tappable", js.undefined)
  }
}
