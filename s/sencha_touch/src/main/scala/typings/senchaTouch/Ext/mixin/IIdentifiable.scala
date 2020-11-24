package typings.senchaTouch.Ext.mixin

import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IIdentifiable extends IBase {
  
  /** [Method] Retrieves the id of this component
    * @returns any id
    */
  var getId: js.UndefOr[js.Function0[_]] = js.native
}
object IIdentifiable {
  
  @scala.inline
  def apply(): IIdentifiable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IIdentifiable]
  }
  
  @scala.inline
  implicit class IIdentifiableOps[Self <: IIdentifiable] (val x: Self) extends AnyVal {
    
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
    def setGetId(value: () => _): Self = this.set("getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetId: Self = this.set("getId", js.undefined)
  }
}
