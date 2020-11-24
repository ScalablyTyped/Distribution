package typings.reactSizeme.mod

import typings.reactSizeme.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WithSizeProps extends js.Object {
  
  var onSize: js.UndefOr[WithSizeOnSizeCallback] = js.native
}
object WithSizeProps {
  
  @scala.inline
  def apply(): WithSizeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WithSizeProps]
  }
  
  @scala.inline
  implicit class WithSizePropsOps[Self <: WithSizeProps] (val x: Self) extends AnyVal {
    
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
    def setOnSize(value: /* size */ Height => Unit): Self = this.set("onSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSize: Self = this.set("onSize", js.undefined)
  }
}
