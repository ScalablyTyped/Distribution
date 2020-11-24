package typings.reactOnsenui.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  index :number | undefined,   tabbarId :string | undefined,   modifier :string | undefined,   onPostChange :(): void | undefined} */
@js.native
trait HTMLAttributesidclassNameIndex extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var index: js.UndefOr[Double] = js.native
  
  var modifier: js.UndefOr[String] = js.native
  
  var onPostChange: js.UndefOr[js.Function0[Unit]] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var tabbarId: js.UndefOr[String] = js.native
}
object HTMLAttributesidclassNameIndex {
  
  @scala.inline
  def apply(): HTMLAttributesidclassNameIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLAttributesidclassNameIndex]
  }
  
  @scala.inline
  implicit class HTMLAttributesidclassNameIndexOps[Self <: HTMLAttributesidclassNameIndex] (val x: Self) extends AnyVal {
    
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setModifier(value: String): Self = this.set("modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifier: Self = this.set("modifier", js.undefined)
    
    @scala.inline
    def setOnPostChange(value: () => Unit): Self = this.set("onPostChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnPostChange: Self = this.set("onPostChange", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTabbarId(value: String): Self = this.set("tabbarId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabbarId: Self = this.set("tabbarId", js.undefined)
  }
}
