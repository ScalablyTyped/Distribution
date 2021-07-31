package typings.senchaTouch.global.Ext

import typings.senchaTouch.Ext.IClass
import typings.senchaTouch.Ext.data.IModel
import typings.senchaTouch.Ext.util.IHashMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.ModelManager")
@js.native
class ModelManager ()
  extends StObject
     with typings.senchaTouch.Ext.ModelManager
/* static members */
object ModelManager {
  
  @JSGlobal("Ext.ModelManager")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Property] (Ext.util.HashMap) */
  @JSGlobal("Ext.ModelManager.all")
  @js.native
  def all: IHashMap = js.native
  @scala.inline
  def all_=(x: IHashMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("all")(x.asInstanceOf[js.Any])
  
  /** [Property] (Object) */
  @JSGlobal("Ext.ModelManager.associationStack")
  @js.native
  def associationStack: js.Any = js.native
  @scala.inline
  def associationStack_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("associationStack")(x.asInstanceOf[js.Any])
  
  /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
    * @returns Object Returns the result of calling the overridden method
    */
  @scala.inline
  def callOverridden(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[js.Any]
  @scala.inline
  def callOverridden(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Call the parent method of the current method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
    * @returns Object Returns the result of calling the parent method
    */
  @scala.inline
  def callParent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[js.Any]
  @scala.inline
  def callParent(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
    * @returns Object Returns the result of calling the superclass method
    */
  @scala.inline
  def callSuper(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[js.Any]
  @scala.inline
  def callSuper(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Creates a new instance of a Model using the given data
    * @param data Object Data to initialize the Model's fields with.
    * @param name String The name of the model to create.
    * @param id Number Unique id of the Model instance (see Ext.data.Model).
    * @returns Object
    */
  @scala.inline
  def create(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Any]
  @scala.inline
  def create(data: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def create(data: js.Any, name: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def create(data: js.Any, name: java.lang.String, id: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def create(data: js.Any, name: Unit, id: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def create(data: Unit, name: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def create(data: Unit, name: java.lang.String, id: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def create(data: Unit, name: Unit, id: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /** [Property] (Object) */
  @JSGlobal("Ext.ModelManager.defaultProxyType")
  @js.native
  def defaultProxyType: js.Any = js.native
  @scala.inline
  def defaultProxyType_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProxyType")(x.asInstanceOf[js.Any])
  
  /** [Method]  */
  @scala.inline
  def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
  
  /** [Method] Executes the specified function once for each item in the collection
    * @param fn Function The function to execute.
    * @param scope Object The scope to execute in.
    */
  @scala.inline
  def each(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("each")().asInstanceOf[Unit]
  @scala.inline
  def each(fn: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("each")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def each(fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def each(fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Returns an item by id
    * @param id String The id of the item.
    * @returns Object The item, undefined if not found.
    */
  @scala.inline
  def get(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Any]
  @scala.inline
  def get(id: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Gets the number of items in the collection
    * @returns Number The number of items in the collection.
    */
  @scala.inline
  def getCount(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getCount")().asInstanceOf[Double]
  
  /** [Method] Returns the initial configuration passed to constructor
    * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
    * @returns Object/Mixed
    */
  @scala.inline
  def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
  @scala.inline
  def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Returns the Ext data Model for a given model name
    * @param id String/Object The id of the model or the model instance.
    * @returns Ext.data.Model A model class.
    */
  @scala.inline
  def getModel(): IModel = ^.asInstanceOf[js.Dynamic].applyDynamic("getModel")().asInstanceOf[IModel]
  @scala.inline
  def getModel(id: js.Any): IModel = ^.asInstanceOf[js.Dynamic].applyDynamic("getModel")(id.asInstanceOf[js.Any]).asInstanceOf[IModel]
  
  /** [Method] Initialize configuration for this class
    * @param instanceConfig Object
    * @returns Object mixins The mixin prototypes as key - value pairs
    */
  @scala.inline
  def initConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[js.Any]
  @scala.inline
  def initConfig(instanceConfig: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Checks if an item type is registered
    * @param type String The mnemonic string by which the class may be looked up.
    * @returns Boolean Whether the type is registered.
    */
  @scala.inline
  def isRegistered(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegistered")().asInstanceOf[Boolean]
  @scala.inline
  def isRegistered(`type`: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegistered")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** [Method] Registers a function that will be called when an item with the specified id is added to the manager
    * @param id String The item id.
    * @param fn Function The callback function. Called with a single parameter, the item.
    * @param scope Object The scope (this reference) in which the callback is executed. Defaults to the item.
    */
  @scala.inline
  def onAvailable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onAvailable")().asInstanceOf[Unit]
  @scala.inline
  def onAvailable(id: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onAvailable")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def onAvailable(id: java.lang.String, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAvailable")(id.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onAvailable(id: java.lang.String, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAvailable")(id.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onAvailable(id: java.lang.String, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAvailable")(id.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onAvailable(id: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAvailable")(id.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onAvailable(id: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAvailable")(id.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onAvailable(id: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAvailable")(id.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Registers an item to be managed
    * @param item Object The item to register.
    */
  @scala.inline
  def register(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")().asInstanceOf[Unit]
  @scala.inline
  def register(item: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(item.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Registers a model definition
    * @param name String
    * @param config Object
    * @returns Object
    */
  @scala.inline
  def registerType(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("registerType")().asInstanceOf[js.Any]
  @scala.inline
  def registerType(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("registerType")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def registerType(name: java.lang.String, config: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("registerType")(name.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def registerType(name: Unit, config: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("registerType")(name.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /** [Property] (Ext.Class) */
  @JSGlobal("Ext.ModelManager.self")
  @js.native
  def self: IClass = js.native
  @scala.inline
  def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
  
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  @scala.inline
  def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
  
  /** [Method] Unregisters an item by removing it from this manager
    * @param item Object The item to unregister.
    */
  @scala.inline
  def unregister(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")().asInstanceOf[Unit]
  @scala.inline
  def unregister(item: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(item.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
