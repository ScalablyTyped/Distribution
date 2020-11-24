package typings.spectacle.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainsSlides extends js.Object {
  
  var children: ReactNode = js.native
  
  var containsSlides: js.UndefOr[Boolean] = js.native
}
object ContainsSlides {
  
  @scala.inline
  def apply(): ContainsSlides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainsSlides]
  }
  
  @scala.inline
  implicit class ContainsSlidesOps[Self <: ContainsSlides] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setContainsSlides(value: Boolean): Self = this.set("containsSlides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainsSlides: Self = this.set("containsSlides", js.undefined)
  }
}
