package typings.rcSteps.interfaceMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Icons extends js.Object {
  
  var error: ReactNode = js.native
  
  var finish: ReactNode = js.native
}
object Icons {
  
  @scala.inline
  def apply(): Icons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Icons]
  }
  
  @scala.inline
  implicit class IconsOps[Self <: Icons] (val x: Self) extends AnyVal {
    
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
    def setError(value: ReactNode): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setFinish(value: ReactNode): Self = this.set("finish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinish: Self = this.set("finish", js.undefined)
  }
}
