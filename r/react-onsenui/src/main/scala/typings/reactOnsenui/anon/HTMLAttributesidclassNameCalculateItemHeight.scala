package typings.reactOnsenui.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  modifier :string | undefined,   length :number | undefined, renderRow (rowIndex : number): any, calculateItemHeight (rowIndex : number): any} */
@js.native
trait HTMLAttributesidclassNameCalculateItemHeight extends js.Object {
  
  def calculateItemHeight(rowIndex: Double): js.Any = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var length: js.UndefOr[Double] = js.native
  
  var modifier: js.UndefOr[String] = js.native
  
  def renderRow(rowIndex: Double): js.Any = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object HTMLAttributesidclassNameCalculateItemHeight {
  
  @scala.inline
  def apply(calculateItemHeight: Double => js.Any, renderRow: Double => js.Any): HTMLAttributesidclassNameCalculateItemHeight = {
    val __obj = js.Dynamic.literal(calculateItemHeight = js.Any.fromFunction1(calculateItemHeight), renderRow = js.Any.fromFunction1(renderRow))
    __obj.asInstanceOf[HTMLAttributesidclassNameCalculateItemHeight]
  }
  
  @scala.inline
  implicit class HTMLAttributesidclassNameCalculateItemHeightOps[Self <: HTMLAttributesidclassNameCalculateItemHeight] (val x: Self) extends AnyVal {
    
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
    def setCalculateItemHeight(value: Double => js.Any): Self = this.set("calculateItemHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderRow(value: Double => js.Any): Self = this.set("renderRow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setModifier(value: String): Self = this.set("modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifier: Self = this.set("modifier", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
