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
  var getInstanceName: js.UndefOr[js.Function0[Any]] = js.undefined
  
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
  var setInstanceName: js.UndefOr[js.Function1[/* instanceName */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of setterName
    * @param setterName String The new value.
    */
  var setSetterName: js.UndefOr[js.Function1[/* setterName */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var setterName: js.UndefOr[String] = js.undefined
}
object IHasOneAssociation {
  
  inline def apply(): IHasOneAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHasOneAssociation]
  }
  
  extension [Self <: IHasOneAssociation](x: Self) {
    
    inline def setForeignKey(value: String): Self = StObject.set(x, "foreignKey", value.asInstanceOf[js.Any])
    
    inline def setForeignKeyUndefined: Self = StObject.set(x, "foreignKey", js.undefined)
    
    inline def setGetForeignKey(value: () => String): Self = StObject.set(x, "getForeignKey", js.Any.fromFunction0(value))
    
    inline def setGetForeignKeyUndefined: Self = StObject.set(x, "getForeignKey", js.undefined)
    
    inline def setGetGetterName(value: () => String): Self = StObject.set(x, "getGetterName", js.Any.fromFunction0(value))
    
    inline def setGetGetterNameUndefined: Self = StObject.set(x, "getGetterName", js.undefined)
    
    inline def setGetInstanceName(value: () => Any): Self = StObject.set(x, "getInstanceName", js.Any.fromFunction0(value))
    
    inline def setGetInstanceNameUndefined: Self = StObject.set(x, "getInstanceName", js.undefined)
    
    inline def setGetSetterName(value: () => String): Self = StObject.set(x, "getSetterName", js.Any.fromFunction0(value))
    
    inline def setGetSetterNameUndefined: Self = StObject.set(x, "getSetterName", js.undefined)
    
    inline def setGetterName(value: String): Self = StObject.set(x, "getterName", value.asInstanceOf[js.Any])
    
    inline def setGetterNameUndefined: Self = StObject.set(x, "getterName", js.undefined)
    
    inline def setSetForeignKey(value: /* foreignKey */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setForeignKey", js.Any.fromFunction1(value))
    
    inline def setSetForeignKeyUndefined: Self = StObject.set(x, "setForeignKey", js.undefined)
    
    inline def setSetGetterName(value: /* getterName */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setGetterName", js.Any.fromFunction1(value))
    
    inline def setSetGetterNameUndefined: Self = StObject.set(x, "setGetterName", js.undefined)
    
    inline def setSetInstanceName(value: /* instanceName */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setInstanceName", js.Any.fromFunction1(value))
    
    inline def setSetInstanceNameUndefined: Self = StObject.set(x, "setInstanceName", js.undefined)
    
    inline def setSetSetterName(value: /* setterName */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setSetterName", js.Any.fromFunction1(value))
    
    inline def setSetSetterNameUndefined: Self = StObject.set(x, "setSetterName", js.undefined)
    
    inline def setSetterName(value: String): Self = StObject.set(x, "setterName", value.asInstanceOf[js.Any])
    
    inline def setSetterNameUndefined: Self = StObject.set(x, "setterName", js.undefined)
  }
}
