package typings.reactWithStyles.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WithStylesOptions extends js.Object {
  
  var flushBefore: js.UndefOr[Boolean] = js.native
  
  var pureComponent: js.UndefOr[Boolean] = js.native
}
object WithStylesOptions {
  
  @scala.inline
  def apply(): WithStylesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WithStylesOptions]
  }
  
  @scala.inline
  implicit class WithStylesOptionsOps[Self <: WithStylesOptions] (val x: Self) extends AnyVal {
    
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
    def setFlushBefore(value: Boolean): Self = this.set("flushBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlushBefore: Self = this.set("flushBefore", js.undefined)
    
    @scala.inline
    def setPureComponent(value: Boolean): Self = this.set("pureComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePureComponent: Self = this.set("pureComponent", js.undefined)
  }
}
