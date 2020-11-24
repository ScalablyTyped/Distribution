package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options used for Instance.set method
  */
@js.native
trait InstanceSetOptions extends js.Object {
  
  /**
    * If set to true, field and virtual setters will be ignored
    */
  var raw: js.UndefOr[Boolean] = js.native
  
  /**
    * Clear all previously set data values
    */
  var reset: js.UndefOr[Boolean] = js.native
}
object InstanceSetOptions {
  
  @scala.inline
  def apply(): InstanceSetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceSetOptions]
  }
  
  @scala.inline
  implicit class InstanceSetOptionsOps[Self <: InstanceSetOptions] (val x: Self) extends AnyVal {
    
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
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    
    @scala.inline
    def setReset(value: Boolean): Self = this.set("reset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
  }
}
