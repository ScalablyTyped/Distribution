package typings.storybookComponents.syntaxhighlighterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyntaxHighlighterRendererProps extends js.Object {
  
  var rows: js.Array[_] = js.native
  
  var stylesheet: String = js.native
  
  var useInlineStyles: Boolean = js.native
}
object SyntaxHighlighterRendererProps {
  
  @scala.inline
  def apply(rows: js.Array[_], stylesheet: String, useInlineStyles: Boolean): SyntaxHighlighterRendererProps = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any], stylesheet = stylesheet.asInstanceOf[js.Any], useInlineStyles = useInlineStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntaxHighlighterRendererProps]
  }
  
  @scala.inline
  implicit class SyntaxHighlighterRendererPropsOps[Self <: SyntaxHighlighterRendererProps] (val x: Self) extends AnyVal {
    
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
    def setRowsVarargs(value: js.Any*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[_]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesheet(value: String): Self = this.set("stylesheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseInlineStyles(value: Boolean): Self = this.set("useInlineStyles", value.asInstanceOf[js.Any])
  }
}
