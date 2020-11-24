package typings.pulumiAws.containerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ulimit extends js.Object {
  
  var hardLimit: Double = js.native
  
  var name: UlimitName = js.native
  
  var softLimit: Double = js.native
}
object Ulimit {
  
  @scala.inline
  def apply(hardLimit: Double, name: UlimitName, softLimit: Double): Ulimit = {
    val __obj = js.Dynamic.literal(hardLimit = hardLimit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], softLimit = softLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ulimit]
  }
  
  @scala.inline
  implicit class UlimitOps[Self <: Ulimit] (val x: Self) extends AnyVal {
    
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
    def setHardLimit(value: Double): Self = this.set("hardLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: UlimitName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftLimit(value: Double): Self = this.set("softLimit", value.asInstanceOf[js.Any])
  }
}
