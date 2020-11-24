package typings.reactLatexNext.anon

import typings.reactLatexNext.typesMod.Delimiter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-latex-next.react-latex-next/dist/Latex.LatexProps> */
@js.native
trait PartialLatexProps extends js.Object {
  
  var children: js.UndefOr[String] = js.native
  
  var delimiters: js.UndefOr[js.Array[Delimiter]] = js.native
  
  var strict: js.UndefOr[Boolean] = js.native
}
object PartialLatexProps {
  
  @scala.inline
  def apply(): PartialLatexProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLatexProps]
  }
  
  @scala.inline
  implicit class PartialLatexPropsOps[Self <: PartialLatexProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: String): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDelimitersVarargs(value: Delimiter*): Self = this.set("delimiters", js.Array(value :_*))
    
    @scala.inline
    def setDelimiters(value: js.Array[Delimiter]): Self = this.set("delimiters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiters: Self = this.set("delimiters", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
  }
}
