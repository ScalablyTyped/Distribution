package typings.senchaTouch.Ext.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHasManyAssociation
  extends typings.senchaTouch.Ext.data.association.IAssociation {
  
  /** [Config Option] (Boolean) */
  var autoLoad: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var autoSync: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var filterProperty: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var foreignKey: js.UndefOr[String] = js.native
  
  /** [Method] Returns the value of autoLoad
    * @returns Boolean
    */
  var getAutoLoad: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of autoSync
    * @returns Boolean
    */
  var getAutoSync: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of filterProperty
    * @returns String
    */
  var getFilterProperty: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of foreignKey
    * @returns String
    */
  var getForeignKey: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of store
    * @returns Object
    */
  var getStore: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of storeName
    * @returns String
    */
  var getStoreName: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.native
  
  /** [Method] Sets the value of autoLoad
    * @param autoLoad Boolean The new value.
    */
  var setAutoLoad: js.UndefOr[js.Function1[/* autoLoad */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of autoSync
    * @param autoSync Boolean The new value.
    */
  var setAutoSync: js.UndefOr[js.Function1[/* autoSync */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of filterProperty
    * @param filterProperty String The new value.
    */
  var setFilterProperty: js.UndefOr[js.Function1[/* filterProperty */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of foreignKey
    * @param foreignKey String The new value.
    */
  var setForeignKey: js.UndefOr[js.Function1[/* foreignKey */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of store
    * @param store Object The new value.
    */
  var setStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of storeName
    * @param storeName String The new value.
    */
  var setStoreName: js.UndefOr[js.Function1[/* storeName */ js.UndefOr[String], Unit]] = js.native
  
  /** [Config Option] (Object) */
  var store: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Object) */
  var storeConfig: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var storeName: js.UndefOr[String] = js.native
}
object IHasManyAssociation {
  
  @scala.inline
  def apply(): IHasManyAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHasManyAssociation]
  }
  
  @scala.inline
  implicit class IHasManyAssociationMutableBuilder[Self <: IHasManyAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoLoad(value: Boolean): Self = StObject.set(x, "autoLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoLoadUndefined: Self = StObject.set(x, "autoLoad", js.undefined)
    
    @scala.inline
    def setAutoSync(value: Boolean): Self = StObject.set(x, "autoSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSyncUndefined: Self = StObject.set(x, "autoSync", js.undefined)
    
    @scala.inline
    def setFilterProperty(value: String): Self = StObject.set(x, "filterProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterPropertyUndefined: Self = StObject.set(x, "filterProperty", js.undefined)
    
    @scala.inline
    def setForeignKey(value: String): Self = StObject.set(x, "foreignKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeignKeyUndefined: Self = StObject.set(x, "foreignKey", js.undefined)
    
    @scala.inline
    def setGetAutoLoad(value: () => Boolean): Self = StObject.set(x, "getAutoLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAutoLoadUndefined: Self = StObject.set(x, "getAutoLoad", js.undefined)
    
    @scala.inline
    def setGetAutoSync(value: () => Boolean): Self = StObject.set(x, "getAutoSync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAutoSyncUndefined: Self = StObject.set(x, "getAutoSync", js.undefined)
    
    @scala.inline
    def setGetFilterProperty(value: () => String): Self = StObject.set(x, "getFilterProperty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFilterPropertyUndefined: Self = StObject.set(x, "getFilterProperty", js.undefined)
    
    @scala.inline
    def setGetForeignKey(value: () => String): Self = StObject.set(x, "getForeignKey", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetForeignKeyUndefined: Self = StObject.set(x, "getForeignKey", js.undefined)
    
    @scala.inline
    def setGetStore(value: () => _): Self = StObject.set(x, "getStore", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStoreName(value: () => String): Self = StObject.set(x, "getStoreName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStoreNameUndefined: Self = StObject.set(x, "getStoreName", js.undefined)
    
    @scala.inline
    def setGetStoreUndefined: Self = StObject.set(x, "getStore", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSetAutoLoad(value: /* autoLoad */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAutoLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAutoLoadUndefined: Self = StObject.set(x, "setAutoLoad", js.undefined)
    
    @scala.inline
    def setSetAutoSync(value: /* autoSync */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAutoSync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAutoSyncUndefined: Self = StObject.set(x, "setAutoSync", js.undefined)
    
    @scala.inline
    def setSetFilterProperty(value: /* filterProperty */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setFilterProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFilterPropertyUndefined: Self = StObject.set(x, "setFilterProperty", js.undefined)
    
    @scala.inline
    def setSetForeignKey(value: /* foreignKey */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setForeignKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetForeignKeyUndefined: Self = StObject.set(x, "setForeignKey", js.undefined)
    
    @scala.inline
    def setSetStore(value: /* store */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setStore", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStoreName(value: /* storeName */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setStoreName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStoreNameUndefined: Self = StObject.set(x, "setStoreName", js.undefined)
    
    @scala.inline
    def setSetStoreUndefined: Self = StObject.set(x, "setStore", js.undefined)
    
    @scala.inline
    def setStore(value: js.Any): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreConfig(value: js.Any): Self = StObject.set(x, "storeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreConfigUndefined: Self = StObject.set(x, "storeConfig", js.undefined)
    
    @scala.inline
    def setStoreName(value: String): Self = StObject.set(x, "storeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreNameUndefined: Self = StObject.set(x, "storeName", js.undefined)
    
    @scala.inline
    def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
  }
}
