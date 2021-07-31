package typings.senchaTouch.Ext.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHasOneAssociation
  extends StObject
     with typings.senchaTouch.Ext.data.association.IAssociation {
  
  /** [Config Option] (String) */
  var foreignKey: js.UndefOr[String] = js.undefined
  
  /** [Method] Returns the value of foreignKey
    * @returns String
    */
  var getForeignKey: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of getterName
    * @returns String
    */
  var getGetterName: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of instanceName
    * @returns Object
    */
  var getInstanceName: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of setterName
    * @returns String
    */
  var getSetterName: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Config Option] (String) */
  var getterName: js.UndefOr[String] = js.undefined
  
  /** [Method] Sets the value of foreignKey
    * @param foreignKey String The new value.
    */
  var setForeignKey: js.UndefOr[js.Function1[/* foreignKey */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of getterName
    * @param getterName String The new value.
    */
  var setGetterName: js.UndefOr[js.Function1[/* getterName */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of instanceName
    * @param instanceName Object The new value.
    */
  var setInstanceName: js.UndefOr[js.Function1[/* instanceName */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of setterName
    * @param setterName String The new value.
    */
  var setSetterName: js.UndefOr[js.Function1[/* setterName */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var setterName: js.UndefOr[String] = js.undefined
}
object IHasOneAssociation {
  
  @scala.inline
  def apply(): IHasOneAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHasOneAssociation]
  }
  
  @scala.inline
  implicit class IHasOneAssociationMutableBuilder[Self <: IHasOneAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForeignKey(value: String): Self = StObject.set(x, "foreignKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeignKeyUndefined: Self = StObject.set(x, "foreignKey", js.undefined)
    
    @scala.inline
    def setGetForeignKey(value: () => String): Self = StObject.set(x, "getForeignKey", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetForeignKeyUndefined: Self = StObject.set(x, "getForeignKey", js.undefined)
    
    @scala.inline
    def setGetGetterName(value: () => String): Self = StObject.set(x, "getGetterName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGetterNameUndefined: Self = StObject.set(x, "getGetterName", js.undefined)
    
    @scala.inline
    def setGetInstanceName(value: () => js.Any): Self = StObject.set(x, "getInstanceName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInstanceNameUndefined: Self = StObject.set(x, "getInstanceName", js.undefined)
    
    @scala.inline
    def setGetSetterName(value: () => String): Self = StObject.set(x, "getSetterName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSetterNameUndefined: Self = StObject.set(x, "getSetterName", js.undefined)
    
    @scala.inline
    def setGetterName(value: String): Self = StObject.set(x, "getterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetterNameUndefined: Self = StObject.set(x, "getterName", js.undefined)
    
    @scala.inline
    def setSetForeignKey(value: /* foreignKey */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setForeignKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetForeignKeyUndefined: Self = StObject.set(x, "setForeignKey", js.undefined)
    
    @scala.inline
    def setSetGetterName(value: /* getterName */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setGetterName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetGetterNameUndefined: Self = StObject.set(x, "setGetterName", js.undefined)
    
    @scala.inline
    def setSetInstanceName(value: /* instanceName */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setInstanceName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetInstanceNameUndefined: Self = StObject.set(x, "setInstanceName", js.undefined)
    
    @scala.inline
    def setSetSetterName(value: /* setterName */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setSetterName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSetterNameUndefined: Self = StObject.set(x, "setSetterName", js.undefined)
    
    @scala.inline
    def setSetterName(value: String): Self = StObject.set(x, "setterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetterNameUndefined: Self = StObject.set(x, "setterName", js.undefined)
  }
}
