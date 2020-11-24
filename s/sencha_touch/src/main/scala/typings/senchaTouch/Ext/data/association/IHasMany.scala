package typings.senchaTouch.Ext.data.association

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHasMany extends IAssociation {
  
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
object IHasMany {
  
  @scala.inline
  def apply(): IHasMany = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHasMany]
  }
  
  @scala.inline
  implicit class IHasManyOps[Self <: IHasMany] (val x: Self) extends AnyVal {
    
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
    def setAutoLoad(value: Boolean): Self = this.set("autoLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoLoad: Self = this.set("autoLoad", js.undefined)
    
    @scala.inline
    def setAutoSync(value: Boolean): Self = this.set("autoSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoSync: Self = this.set("autoSync", js.undefined)
    
    @scala.inline
    def setFilterProperty(value: String): Self = this.set("filterProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterProperty: Self = this.set("filterProperty", js.undefined)
    
    @scala.inline
    def setForeignKey(value: String): Self = this.set("foreignKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForeignKey: Self = this.set("foreignKey", js.undefined)
    
    @scala.inline
    def setGetAutoLoad(value: () => Boolean): Self = this.set("getAutoLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAutoLoad: Self = this.set("getAutoLoad", js.undefined)
    
    @scala.inline
    def setGetAutoSync(value: () => Boolean): Self = this.set("getAutoSync", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAutoSync: Self = this.set("getAutoSync", js.undefined)
    
    @scala.inline
    def setGetFilterProperty(value: () => String): Self = this.set("getFilterProperty", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetFilterProperty: Self = this.set("getFilterProperty", js.undefined)
    
    @scala.inline
    def setGetForeignKey(value: () => String): Self = this.set("getForeignKey", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetForeignKey: Self = this.set("getForeignKey", js.undefined)
    
    @scala.inline
    def setGetStore(value: () => _): Self = this.set("getStore", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetStore: Self = this.set("getStore", js.undefined)
    
    @scala.inline
    def setGetStoreName(value: () => String): Self = this.set("getStoreName", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetStoreName: Self = this.set("getStoreName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSetAutoLoad(value: /* autoLoad */ js.UndefOr[Boolean] => Unit): Self = this.set("setAutoLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAutoLoad: Self = this.set("setAutoLoad", js.undefined)
    
    @scala.inline
    def setSetAutoSync(value: /* autoSync */ js.UndefOr[Boolean] => Unit): Self = this.set("setAutoSync", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAutoSync: Self = this.set("setAutoSync", js.undefined)
    
    @scala.inline
    def setSetFilterProperty(value: /* filterProperty */ js.UndefOr[String] => Unit): Self = this.set("setFilterProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetFilterProperty: Self = this.set("setFilterProperty", js.undefined)
    
    @scala.inline
    def setSetForeignKey(value: /* foreignKey */ js.UndefOr[String] => Unit): Self = this.set("setForeignKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetForeignKey: Self = this.set("setForeignKey", js.undefined)
    
    @scala.inline
    def setSetStore(value: /* store */ js.UndefOr[js.Any] => Unit): Self = this.set("setStore", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetStore: Self = this.set("setStore", js.undefined)
    
    @scala.inline
    def setSetStoreName(value: /* storeName */ js.UndefOr[String] => Unit): Self = this.set("setStoreName", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetStoreName: Self = this.set("setStoreName", js.undefined)
    
    @scala.inline
    def setStore(value: js.Any): Self = this.set("store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
    
    @scala.inline
    def setStoreConfig(value: js.Any): Self = this.set("storeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoreConfig: Self = this.set("storeConfig", js.undefined)
    
    @scala.inline
    def setStoreName(value: String): Self = this.set("storeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoreName: Self = this.set("storeName", js.undefined)
  }
}
