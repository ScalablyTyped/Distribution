package typings.senchaTouch.Ext.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHasOneAssociation
  extends typings.senchaTouch.Ext.data.association.IAssociation {
  
  /** [Config Option] (String) */
  var foreignKey: js.UndefOr[String] = js.native
  
  /** [Method] Returns the value of foreignKey
    * @returns String
    */
  var getForeignKey: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of getterName
    * @returns String
    */
  var getGetterName: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of instanceName
    * @returns Object
    */
  var getInstanceName: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of setterName
    * @returns String
    */
  var getSetterName: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Config Option] (String) */
  var getterName: js.UndefOr[String] = js.native
  
  /** [Method] Sets the value of foreignKey
    * @param foreignKey String The new value.
    */
  var setForeignKey: js.UndefOr[js.Function1[/* foreignKey */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of getterName
    * @param getterName String The new value.
    */
  var setGetterName: js.UndefOr[js.Function1[/* getterName */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of instanceName
    * @param instanceName Object The new value.
    */
  var setInstanceName: js.UndefOr[js.Function1[/* instanceName */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of setterName
    * @param setterName String The new value.
    */
  var setSetterName: js.UndefOr[js.Function1[/* setterName */ js.UndefOr[String], Unit]] = js.native
  
  /** [Config Option] (String) */
  var setterName: js.UndefOr[String] = js.native
}
object IHasOneAssociation {
  
  @scala.inline
  def apply(): IHasOneAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHasOneAssociation]
  }
  
  @scala.inline
  implicit class IHasOneAssociationOps[Self <: IHasOneAssociation] (val x: Self) extends AnyVal {
    
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
    def setForeignKey(value: String): Self = this.set("foreignKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForeignKey: Self = this.set("foreignKey", js.undefined)
    
    @scala.inline
    def setGetForeignKey(value: () => String): Self = this.set("getForeignKey", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetForeignKey: Self = this.set("getForeignKey", js.undefined)
    
    @scala.inline
    def setGetGetterName(value: () => String): Self = this.set("getGetterName", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetGetterName: Self = this.set("getGetterName", js.undefined)
    
    @scala.inline
    def setGetInstanceName(value: () => _): Self = this.set("getInstanceName", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetInstanceName: Self = this.set("getInstanceName", js.undefined)
    
    @scala.inline
    def setGetSetterName(value: () => String): Self = this.set("getSetterName", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetSetterName: Self = this.set("getSetterName", js.undefined)
    
    @scala.inline
    def setGetterName(value: String): Self = this.set("getterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetterName: Self = this.set("getterName", js.undefined)
    
    @scala.inline
    def setSetForeignKey(value: /* foreignKey */ js.UndefOr[String] => Unit): Self = this.set("setForeignKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetForeignKey: Self = this.set("setForeignKey", js.undefined)
    
    @scala.inline
    def setSetGetterName(value: /* getterName */ js.UndefOr[String] => Unit): Self = this.set("setGetterName", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetGetterName: Self = this.set("setGetterName", js.undefined)
    
    @scala.inline
    def setSetInstanceName(value: /* instanceName */ js.UndefOr[js.Any] => Unit): Self = this.set("setInstanceName", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetInstanceName: Self = this.set("setInstanceName", js.undefined)
    
    @scala.inline
    def setSetSetterName(value: /* setterName */ js.UndefOr[String] => Unit): Self = this.set("setSetterName", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetSetterName: Self = this.set("setSetterName", js.undefined)
    
    @scala.inline
    def setSetterName(value: String): Self = this.set("setterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetterName: Self = this.set("setterName", js.undefined)
  }
}
