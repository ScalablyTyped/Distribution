package typings.senchaTouch.Ext.data.identifier

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUuid extends ISimple {
  
  /** [Method] Returns the value of id
    * @returns Object
    */
  var getId: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of version
    * @returns Number
    */
  var getVersion: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Config Option] (Object) */
  var id: js.UndefOr[js.Any] = js.native
  
  /** [Method] Reconfigures this generator given new config properties
    * @param config Object
    */
  var reconfigure: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Property] (Number/Object) */
  var salt: js.UndefOr[js.Any] = js.native
  
  /** [Method] Sets the value of id
    * @param id Object The new value.
    */
  var setId: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of version
    * @param version Number The new value.
    */
  var setVersion: js.UndefOr[js.Function1[/* version */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Property] (Number/Object) */
  var timestamp: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Number) */
  var version: js.UndefOr[Double] = js.native
}
object IUuid {
  
  @scala.inline
  def apply(): IUuid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUuid]
  }
  
  @scala.inline
  implicit class IUuidOps[Self <: IUuid] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setGetVersion(value: () => Double): Self = this.set("getVersion", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetVersion: Self = this.set("getVersion", js.undefined)
    
    @scala.inline
    def setId(value: js.Any): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setReconfigure(value: /* config */ js.UndefOr[js.Any] => Unit): Self = this.set("reconfigure", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteReconfigure: Self = this.set("reconfigure", js.undefined)
    
    @scala.inline
    def setSalt(value: js.Any): Self = this.set("salt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSalt: Self = this.set("salt", js.undefined)
    
    @scala.inline
    def setSetId(value: /* id */ js.UndefOr[js.Any] => Unit): Self = this.set("setId", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetId: Self = this.set("setId", js.undefined)
    
    @scala.inline
    def setSetVersion(value: /* version */ js.UndefOr[Double] => Unit): Self = this.set("setVersion", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetVersion: Self = this.set("setVersion", js.undefined)
    
    @scala.inline
    def setTimestamp(value: js.Any): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
