package typings.reactHelmetAsync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilledContext extends js.Object {
  
  var helmet: HelmetData = js.native
}
object FilledContext {
  
  @scala.inline
  def apply(helmet: HelmetData): FilledContext = {
    val __obj = js.Dynamic.literal(helmet = helmet.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilledContext]
  }
  
  @scala.inline
  implicit class FilledContextOps[Self <: FilledContext] (val x: Self) extends AnyVal {
    
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
    def setHelmet(value: HelmetData): Self = this.set("helmet", value.asInstanceOf[js.Any])
  }
}
