package typings.reactstrap.labelMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ElementType
import typings.react.mod.LabelHTMLAttributes
import typings.reactstrap.colMod.ColumnProps
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLLabelElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelProps
  extends LabelHTMLAttributes[HTMLLabelElement]
     with /* key */ StringDictionary[js.Any] {
  
  var check: js.UndefOr[Boolean] = js.native
  
  var cssModule: js.UndefOr[CSSModule] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var `for`: js.UndefOr[String] = js.native
  
  var `inline`: js.UndefOr[Boolean] = js.native
  
  var lg: js.UndefOr[ColumnProps] = js.native
  
  var md: js.UndefOr[ColumnProps] = js.native
  
  var size: js.UndefOr[String] = js.native
  
  var sm: js.UndefOr[ColumnProps] = js.native
  
  var tag: js.UndefOr[ElementType[_]] = js.native
  
  // custom widths
  var widths: js.UndefOr[js.Array[String]] = js.native
  
  var xl: js.UndefOr[ColumnProps] = js.native
  
  var xs: js.UndefOr[ColumnProps] = js.native
}
object LabelProps {
  
  @scala.inline
  def apply(): LabelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelProps]
  }
  
  @scala.inline
  implicit class LabelPropsOps[Self <: LabelProps] (val x: Self) extends AnyVal {
    
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
    def setCheck(value: Boolean): Self = this.set("check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheck: Self = this.set("check", js.undefined)
    
    @scala.inline
    def setCssModule(value: CSSModule): Self = this.set("cssModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssModule: Self = this.set("cssModule", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setFor(value: String): Self = this.set("for", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFor: Self = this.set("for", js.undefined)
    
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    
    @scala.inline
    def setLg(value: ColumnProps): Self = this.set("lg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLg: Self = this.set("lg", js.undefined)
    
    @scala.inline
    def setMd(value: ColumnProps): Self = this.set("md", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMd: Self = this.set("md", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSm(value: ColumnProps): Self = this.set("sm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSm: Self = this.set("sm", js.undefined)
    
    @scala.inline
    def setTag(value: ElementType[_]): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    
    @scala.inline
    def setWidthsVarargs(value: String*): Self = this.set("widths", js.Array(value :_*))
    
    @scala.inline
    def setWidths(value: js.Array[String]): Self = this.set("widths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidths: Self = this.set("widths", js.undefined)
    
    @scala.inline
    def setXl(value: ColumnProps): Self = this.set("xl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXl: Self = this.set("xl", js.undefined)
    
    @scala.inline
    def setXs(value: ColumnProps): Self = this.set("xs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXs: Self = this.set("xs", js.undefined)
  }
}
