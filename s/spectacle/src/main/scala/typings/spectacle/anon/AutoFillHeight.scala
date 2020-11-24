package typings.spectacle.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoFillHeight extends js.Object {
  
  var autoFillHeight: Boolean = js.native
  
  var children: ReactNode = js.native
  
  var fontSize: js.UndefOr[Double] = js.native
  
  var highlightEnd: js.UndefOr[Double] = js.native
  
  var highlightStart: js.UndefOr[Double] = js.native
  
  var indentSize: js.UndefOr[Double] = js.native
  
  var language: String = js.native
  
  var theme: js.UndefOr[Plain] = js.native
}
object AutoFillHeight {
  
  @scala.inline
  def apply(autoFillHeight: Boolean, language: String): AutoFillHeight = {
    val __obj = js.Dynamic.literal(autoFillHeight = autoFillHeight.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoFillHeight]
  }
  
  @scala.inline
  implicit class AutoFillHeightOps[Self <: AutoFillHeight] (val x: Self) extends AnyVal {
    
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
    def setAutoFillHeight(value: Boolean): Self = this.set("autoFillHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setHighlightEnd(value: Double): Self = this.set("highlightEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightEnd: Self = this.set("highlightEnd", js.undefined)
    
    @scala.inline
    def setHighlightStart(value: Double): Self = this.set("highlightStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightStart: Self = this.set("highlightStart", js.undefined)
    
    @scala.inline
    def setIndentSize(value: Double): Self = this.set("indentSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndentSize: Self = this.set("indentSize", js.undefined)
    
    @scala.inline
    def setTheme(value: Plain): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
