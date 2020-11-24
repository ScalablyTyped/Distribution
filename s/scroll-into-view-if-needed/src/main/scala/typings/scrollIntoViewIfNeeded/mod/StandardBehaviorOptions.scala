package typings.scrollIntoViewIfNeeded.mod

import typings.scrollIntoViewIfNeeded.typesMod.ScrollBehavior
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StandardBehaviorOptions
  extends typings.scrollIntoViewIfNeeded.typesMod.Options {
  
  var behavior: js.UndefOr[ScrollBehavior] = js.native
}
object StandardBehaviorOptions {
  
  @scala.inline
  def apply(): StandardBehaviorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardBehaviorOptions]
  }
  
  @scala.inline
  implicit class StandardBehaviorOptionsOps[Self <: StandardBehaviorOptions] (val x: Self) extends AnyVal {
    
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
    def setBehavior(value: ScrollBehavior): Self = this.set("behavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBehavior: Self = this.set("behavior", js.undefined)
  }
}
