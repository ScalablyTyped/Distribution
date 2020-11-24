package typings.reactstrap.paginationLinkMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.ElementType
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaginationLinkProps
  extends AnchorHTMLAttributes[HTMLAnchorElement]
     with /* key */ StringDictionary[js.Any] {
  
  var cssModule: js.UndefOr[CSSModule] = js.native
  
  var first: js.UndefOr[Boolean] = js.native
  
  var last: js.UndefOr[Boolean] = js.native
  
  var next: js.UndefOr[Boolean] = js.native
  
  var previous: js.UndefOr[Boolean] = js.native
  
  var tag: js.UndefOr[ElementType[_]] = js.native
}
object PaginationLinkProps {
  
  @scala.inline
  def apply(): PaginationLinkProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginationLinkProps]
  }
  
  @scala.inline
  implicit class PaginationLinkPropsOps[Self <: PaginationLinkProps] (val x: Self) extends AnyVal {
    
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
    def setFirst(value: Boolean): Self = this.set("first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirst: Self = this.set("first", js.undefined)
    
    @scala.inline
    def setLast(value: Boolean): Self = this.set("last", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLast: Self = this.set("last", js.undefined)
    
    @scala.inline
    def setNext(value: Boolean): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    
    @scala.inline
    def setPrevious(value: Boolean): Self = this.set("previous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevious: Self = this.set("previous", js.undefined)
    
    @scala.inline
    def setTag(value: ElementType[_]): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
}
