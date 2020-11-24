package typings.reactstrap.colMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColProps
  extends HTMLAttributes[HTMLDivElement]
     with /* key */ StringDictionary[js.Any] {
  
  var cssModule: js.UndefOr[CSSModule] = js.native
  
  var lg: js.UndefOr[ColumnProps] = js.native
  
  var md: js.UndefOr[ColumnProps] = js.native
  
  var sm: js.UndefOr[ColumnProps] = js.native
  
  var tag: js.UndefOr[ElementType[_]] = js.native
  
  // custom widths
  var widths: js.UndefOr[js.Array[String]] = js.native
  
  var xl: js.UndefOr[ColumnProps] = js.native
  
  var xs: js.UndefOr[ColumnProps] = js.native
}
object ColProps {
  
  @scala.inline
  def apply(): ColProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColProps]
  }
  
  @scala.inline
  implicit class ColPropsOps[Self <: ColProps] (val x: Self) extends AnyVal {
    
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
    def setCssModule(value: CSSModule): Self = this.set("cssModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssModule: Self = this.set("cssModule", js.undefined)
    
    @scala.inline
    def setLg(value: ColumnProps): Self = this.set("lg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLg: Self = this.set("lg", js.undefined)
    
    @scala.inline
    def setMd(value: ColumnProps): Self = this.set("md", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMd: Self = this.set("md", js.undefined)
    
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
