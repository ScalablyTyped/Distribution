package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options used for Instance.update method
  */
@js.native
trait InstanceUpdateOptions
  extends InstanceSaveOptions
     with InstanceSetOptions {
  
  /**
    * A hash of attributes to describe your search. See above for examples.
    */
  var where: js.UndefOr[AnyWhereOptions | (js.Array[col | and | or | String])] = js.native
}
object InstanceUpdateOptions {
  
  @scala.inline
  def apply(): InstanceUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceUpdateOptions]
  }
  
  @scala.inline
  implicit class InstanceUpdateOptionsOps[Self <: InstanceUpdateOptions] (val x: Self) extends AnyVal {
    
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
    def setWhereVarargs(value: (col | and | or | String)*): Self = this.set("where", js.Array(value :_*))
    
    @scala.inline
    def setWhere(value: AnyWhereOptions | (js.Array[col | and | or | String])): Self = this.set("where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhere: Self = this.set("where", js.undefined)
  }
}
