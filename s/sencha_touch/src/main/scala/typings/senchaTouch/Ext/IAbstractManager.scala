package typings.senchaTouch.Ext

import typings.senchaTouch.Ext.util.IHashMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAbstractManager extends IBase {
  
  /** [Property] (Ext.util.HashMap) */
  var all: js.UndefOr[IHashMap] = js.native
  
  /** [Method] Creates and returns an instance of whatever this manager manages based on the supplied type and config object
    * @param config Object The config object.
    * @param defaultType String If no type is discovered in the config object, we fall back to this type.
    * @returns Object The instance of whatever this manager is managing.
    */
  var create: js.UndefOr[
    js.Function2[/* config */ js.UndefOr[js.Any], /* defaultType */ js.UndefOr[java.lang.String], _]
  ] = js.native
  
  /** [Method] Executes the specified function once for each item in the collection
    * @param fn Function The function to execute.
    * @param scope Object The scope to execute in.
    */
  var each: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Returns an item by id
    * @param id String The id of the item.
    * @returns Object The item, undefined if not found.
    */
  var get: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], _]] = js.native
  
  /** [Method] Gets the number of items in the collection
    * @returns Number The number of items in the collection.
    */
  var getCount: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Checks if an item type is registered
    * @param type String The mnemonic string by which the class may be looked up.
    * @returns Boolean Whether the type is registered.
    */
  var isRegistered: js.UndefOr[js.Function1[/* type */ js.UndefOr[java.lang.String], Boolean]] = js.native
  
  /** [Method] Registers a function that will be called when an item with the specified id is added to the manager
    * @param id String The item id.
    * @param fn Function The callback function. Called with a single parameter, the item.
    * @param scope Object The scope (this reference) in which the callback is executed. Defaults to the item.
    */
  var onAvailable: js.UndefOr[
    js.Function3[
      /* id */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  /** [Method] Registers an item to be managed
    * @param item Object The item to register.
    */
  var register: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Registers a new item constructor keyed by a type key
    * @param type String The mnemonic string by which the class may be looked up.
    * @param cls Function The new instance class.
    */
  var registerType: js.UndefOr[
    js.Function2[/* type */ js.UndefOr[java.lang.String], /* cls */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  /** [Method] Unregisters an item by removing it from this manager
    * @param item Object The item to unregister.
    */
  var unregister: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.native
}
object IAbstractManager {
  
  @scala.inline
  def apply(): IAbstractManager = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstractManager]
  }
  
  @scala.inline
  implicit class IAbstractManagerOps[Self <: IAbstractManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAll(value: IHashMap): Self = this.set("all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAll: Self = this.set("all", js.undefined)
    
    @scala.inline
    def setCreate(value: (/* config */ js.UndefOr[js.Any], /* defaultType */ js.UndefOr[java.lang.String]) => _): Self = this.set("create", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setEach(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = this.set("each", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteEach: Self = this.set("each", js.undefined)
    
    @scala.inline
    def setGet(value: /* id */ js.UndefOr[java.lang.String] => _): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGet: Self = this.set("get", js.undefined)
    
    @scala.inline
    def setGetCount(value: () => Double): Self = this.set("getCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetCount: Self = this.set("getCount", js.undefined)
    
    @scala.inline
    def setIsRegistered(value: /* type */ js.UndefOr[java.lang.String] => Boolean): Self = this.set("isRegistered", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsRegistered: Self = this.set("isRegistered", js.undefined)
    
    @scala.inline
    def setOnAvailable(
      value: (/* id */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("onAvailable", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnAvailable: Self = this.set("onAvailable", js.undefined)
    
    @scala.inline
    def setRegister(value: /* item */ js.UndefOr[js.Any] => Unit): Self = this.set("register", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRegister: Self = this.set("register", js.undefined)
    
    @scala.inline
    def setRegisterType(value: (/* type */ js.UndefOr[java.lang.String], /* cls */ js.UndefOr[js.Any]) => Unit): Self = this.set("registerType", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRegisterType: Self = this.set("registerType", js.undefined)
    
    @scala.inline
    def setUnregister(value: /* item */ js.UndefOr[js.Any] => Unit): Self = this.set("unregister", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUnregister: Self = this.set("unregister", js.undefined)
  }
}
