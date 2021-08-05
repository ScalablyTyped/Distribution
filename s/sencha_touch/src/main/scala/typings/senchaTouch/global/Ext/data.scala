package typings.senchaTouch.global.Ext

import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.IClass
import typings.senchaTouch.Ext.data.IModel
import typings.senchaTouch.Ext.data.IStore
import typings.senchaTouch.Ext.util.ICollection
import typings.senchaTouch.Ext.util.IHashMap
import typings.senchaTouch.Ext.util.IMixedCollection
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object data {
  
  @JSGlobal("Ext.data.JsonP")
  @js.native
  class JsonP ()
    extends StObject
       with typings.senchaTouch.Ext.data.JsonP
  /* static members */
  object JsonP {
    
    @JSGlobal("Ext.data.JsonP")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Abort a request
      * @param request Object/String The request to abort.
      */
    inline def abort(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("abort")().asInstanceOf[Unit]
    inline def abort(request: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("abort")(request.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[js.Any]
    inline def callOverridden(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[js.Any]
    inline def callParent(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[js.Any]
    inline def callSuper(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Property] (String) */
    @JSGlobal("Ext.data.JsonP.callbackKey")
    @js.native
    def callbackKey: java.lang.String = js.native
    inline def callbackKey_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("callbackKey")(x.asInstanceOf[js.Any])
    
    /** [Method]  */
    inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.data.JsonP.disableCaching")
    @js.native
    def disableCaching: Boolean = js.native
    
    /** [Property] (String) */
    @JSGlobal("Ext.data.JsonP.disableCachingParam")
    @js.native
    def disableCachingParam: java.lang.String = js.native
    inline def disableCachingParam_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableCachingParam")(x.asInstanceOf[js.Any])
    
    inline def disableCaching_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableCaching")(x.asInstanceOf[js.Any])
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    inline def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
    inline def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    inline def initConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[js.Any]
    inline def initConfig(instanceConfig: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Makes a JSONP request
      * @param options Object An object which may contain the following properties. Note that options will take priority over any defaults that are specified in the class.
      * @returns Object request An object containing the request details.
      */
    inline def request(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("request")().asInstanceOf[js.Any]
    inline def request(options: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.data.JsonP.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    
    /** [Property] (Number) */
    @JSGlobal("Ext.data.JsonP.timeout")
    @js.native
    def timeout: Double = js.native
    inline def timeout_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Ext.data.Model")
  @js.native
  class Model ()
    extends StObject
       with typings.senchaTouch.Ext.data.Model
  /* static members */
  object Model {
    
    @JSGlobal("Ext.data.Model")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    inline def addMembers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")().asInstanceOf[Unit]
    inline def addMembers(members: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")(members.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    inline def addStatics(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")().asInstanceOf[IBase]
    inline def addStatics(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method]
      * @param args Object
      */
    inline def callParent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Unit]
    inline def callParent(args: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Create a new instance of this Class
      * @returns Object the created instance.
      */
    inline def create(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Any]
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    inline def createAlias(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")().asInstanceOf[Unit]
    inline def createAlias(alias: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def createAlias(alias: js.Any, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createAlias(alias: Unit, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    inline def getName(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")().asInstanceOf[java.lang.String]
    
    /** [Method] Asynchronously loads a model instance by id
      * @param id Number The id of the model to load
      * @param config Object Config object containing fields:
      * @param scope Object Same as config.scope.
      */
    inline def load(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("load")().asInstanceOf[Unit]
    inline def load(id: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def load(id: Double, config: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def load(id: Double, config: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def load(id: Double, config: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def load(id: Unit, config: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def load(id: Unit, config: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def load(id: Unit, config: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    inline def `override`(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")().asInstanceOf[IBase]
    inline def `override`(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
  }
  
  @JSGlobal("Ext.data.ModelManager")
  @js.native
  class ModelManager ()
    extends StObject
       with typings.senchaTouch.Ext.data.ModelManager
  /* static members */
  object ModelManager {
    
    @JSGlobal("Ext.data.ModelManager")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Property] (Ext.util.HashMap) */
    @JSGlobal("Ext.data.ModelManager.all")
    @js.native
    def all: IHashMap = js.native
    inline def all_=(x: IHashMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("all")(x.asInstanceOf[js.Any])
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.ModelManager.associationStack")
    @js.native
    def associationStack: js.Any = js.native
    inline def associationStack_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("associationStack")(x.asInstanceOf[js.Any])
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[js.Any]
    inline def callOverridden(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[js.Any]
    inline def callParent(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[js.Any]
    inline def callSuper(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Creates a new instance of a Model using the given data
      * @param data Object Data to initialize the Model's fields with.
      * @param name String The name of the model to create.
      * @param id Number Unique id of the Model instance (see Ext.data.Model).
      * @returns Object
      */
    inline def create(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Any]
    inline def create(data: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def create(data: js.Any, name: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def create(data: js.Any, name: java.lang.String, id: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def create(data: js.Any, name: Unit, id: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def create(data: Unit, name: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def create(data: Unit, name: java.lang.String, id: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def create(data: Unit, name: Unit, id: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.ModelManager.defaultProxyType")
    @js.native
    def defaultProxyType: js.Any = js.native
    inline def defaultProxyType_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProxyType")(x.asInstanceOf[js.Any])
    
    /** [Method]  */
    inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** [Method] Executes the specified function once for each item in the collection
      * @param fn Function The function to execute.
      * @param scope Object The scope to execute in.
      */
    inline def each(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("each")().asInstanceOf[Unit]
    inline def each(fn: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("each")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def each(fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def each(fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Returns an item by id
      * @param id String The id of the item.
      * @returns Object The item, undefined if not found.
      */
    inline def get(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Any]
    inline def get(id: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Gets the number of items in the collection
      * @returns Number The number of items in the collection.
      */
    inline def getCount(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getCount")().asInstanceOf[Double]
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    inline def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
    inline def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Returns the Ext data Model for a given model name
      * @param id String/Object The id of the model or the model instance.
      * @returns Ext.data.Model A model class.
      */
    inline def getModel(): IModel = ^.asInstanceOf[js.Dynamic].applyDynamic("getModel")().asInstanceOf[IModel]
    inline def getModel(id: js.Any): IModel = ^.asInstanceOf[js.Dynamic].applyDynamic("getModel")(id.asInstanceOf[js.Any]).asInstanceOf[IModel]
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    inline def initConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[js.Any]
    inline def initConfig(instanceConfig: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Checks if an item type is registered
      * @param type String The mnemonic string by which the class may be looked up.
      * @returns Boolean Whether the type is registered.
      */
    inline def isRegistered(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegistered")().asInstanceOf[Boolean]
    inline def isRegistered(`type`: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegistered")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** [Method] Registers a function that will be called when an item with the specified id is added to the manager
      * @param id String The item id.
      * @param fn Function The callback function. Called with a single parameter, the item.
      * @param scope Object The scope (this reference) in which the callback is executed. Defaults to the item.
      */
    inline def onAvailable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onAvailable")().asInstanceOf[Unit]
    inline def onAvailable(id: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onAvailable")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def onAvailable(id: java.lang.String, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAvailable")(id.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAvailable(id: java.lang.String, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAvailable")(id.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAvailable(id: java.lang.String, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAvailable")(id.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAvailable(id: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAvailable")(id.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAvailable(id: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAvailable")(id.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAvailable(id: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAvailable")(id.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Registers an item to be managed
      * @param item Object The item to register.
      */
    inline def register(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")().asInstanceOf[Unit]
    inline def register(item: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(item.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Registers a model definition
      * @param name String
      * @param config Object
      * @returns Object
      */
    inline def registerType(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("registerType")().asInstanceOf[js.Any]
    inline def registerType(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("registerType")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def registerType(name: java.lang.String, config: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("registerType")(name.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def registerType(name: Unit, config: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("registerType")(name.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.data.ModelManager.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    
    /** [Method] Unregisters an item by removing it from this manager
      * @param item Object The item to unregister.
      */
    inline def unregister(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")().asInstanceOf[Unit]
    inline def unregister(item: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(item.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSGlobal("Ext.data.Node")
  @js.native
  class Node ()
    extends StObject
       with typings.senchaTouch.Ext.data.Node
  /* static members */
  object Node {
    
    @JSGlobal("Ext.data.Node")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    inline def addMembers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")().asInstanceOf[Unit]
    inline def addMembers(members: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")(members.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    inline def addStatics(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")().asInstanceOf[IBase]
    inline def addStatics(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method]
      * @param args Object
      */
    inline def callParent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Unit]
    inline def callParent(args: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Create a new instance of this Class
      * @returns Object the created instance.
      */
    inline def create(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Any]
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    inline def createAlias(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")().asInstanceOf[Unit]
    inline def createAlias(alias: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def createAlias(alias: js.Any, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createAlias(alias: Unit, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] This method allows you to decorate a Record s prototype to implement the NodeInterface
      * @param record Ext.data.Model The Record you want to decorate the prototype of.
      */
    inline def decorate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("decorate")().asInstanceOf[Unit]
    inline def decorate(record: IModel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(record.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    inline def getName(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")().asInstanceOf[java.lang.String]
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    inline def `override`(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")().asInstanceOf[IBase]
    inline def `override`(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
  }
  
  @JSGlobal("Ext.data.NodeInterface")
  @js.native
  class NodeInterface ()
    extends StObject
       with typings.senchaTouch.Ext.data.NodeInterface
  /* static members */
  object NodeInterface {
    
    @JSGlobal("Ext.data.NodeInterface")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    inline def addMembers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")().asInstanceOf[Unit]
    inline def addMembers(members: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")(members.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    inline def addStatics(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")().asInstanceOf[IBase]
    inline def addStatics(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method]
      * @param args Object
      */
    inline def callParent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Unit]
    inline def callParent(args: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Create a new instance of this Class
      * @returns Object the created instance.
      */
    inline def create(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Any]
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    inline def createAlias(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")().asInstanceOf[Unit]
    inline def createAlias(alias: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def createAlias(alias: js.Any, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createAlias(alias: Unit, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] This method allows you to decorate a Record s prototype to implement the NodeInterface
      * @param record Ext.data.Model The Record you want to decorate the prototype of.
      */
    inline def decorate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("decorate")().asInstanceOf[Unit]
    inline def decorate(record: IModel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(record.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    inline def getName(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")().asInstanceOf[java.lang.String]
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    inline def `override`(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")().asInstanceOf[IBase]
    inline def `override`(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
  }
  
  @JSGlobal("Ext.data.Record")
  @js.native
  class Record ()
    extends StObject
       with typings.senchaTouch.Ext.data.Record
  /* static members */
  object Record {
    
    @JSGlobal("Ext.data.Record")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    inline def addMembers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")().asInstanceOf[Unit]
    inline def addMembers(members: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")(members.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    inline def addStatics(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")().asInstanceOf[IBase]
    inline def addStatics(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method]
      * @param args Object
      */
    inline def callParent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Unit]
    inline def callParent(args: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Create a new instance of this Class
      * @returns Object the created instance.
      */
    inline def create(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Any]
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    inline def createAlias(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")().asInstanceOf[Unit]
    inline def createAlias(alias: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def createAlias(alias: js.Any, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createAlias(alias: Unit, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    inline def getName(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")().asInstanceOf[java.lang.String]
    
    /** [Method] Asynchronously loads a model instance by id
      * @param id Number The id of the model to load
      * @param config Object Config object containing fields:
      * @param scope Object Same as config.scope.
      */
    inline def load(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("load")().asInstanceOf[Unit]
    inline def load(id: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def load(id: Double, config: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def load(id: Double, config: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def load(id: Double, config: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def load(id: Unit, config: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def load(id: Unit, config: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def load(id: Unit, config: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    inline def `override`(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")().asInstanceOf[IBase]
    inline def `override`(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
  }
  
  @JSGlobal("Ext.data.SortTypes")
  @js.native
  class SortTypes ()
    extends StObject
       with typings.senchaTouch.Ext.data.SortTypes
  /* static members */
  object SortTypes {
    
    @JSGlobal("Ext.data.SortTypes")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Date sorting
      * @param value Object The value being converted.
      * @returns Number The comparison value.
      */
    inline def asDate(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("asDate")().asInstanceOf[Double]
    inline def asDate(value: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("asDate")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /** [Method] Float sorting
      * @param value Object The value being converted.
      * @returns Number The comparison value.
      */
    inline def asFloat(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("asFloat")().asInstanceOf[Double]
    inline def asFloat(value: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("asFloat")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /** [Method] Integer sorting
      * @param value Object The value being converted.
      * @returns Number The comparison value.
      */
    inline def asInt(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("asInt")().asInstanceOf[Double]
    inline def asInt(value: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("asInt")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /** [Method] Strips all HTML tags to sort on text only
      * @param value Object The value being converted.
      * @returns String The comparison value.
      */
    inline def asText(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("asText")().asInstanceOf[java.lang.String]
    inline def asText(value: js.Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("asText")(value.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
    /** [Method] Case insensitive string
      * @param value Object The value being converted.
      * @returns String The comparison value.
      */
    inline def asUCString(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("asUCString")().asInstanceOf[java.lang.String]
    inline def asUCString(value: js.Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("asUCString")(value.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
    /** [Method] Strips all HTML tags to sort on text only  case insensitive
      * @param value Object The value being converted.
      * @returns String The comparison value.
      */
    inline def asUCText(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("asUCText")().asInstanceOf[java.lang.String]
    inline def asUCText(value: js.Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("asUCText")(value.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[js.Any]
    inline def callOverridden(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[js.Any]
    inline def callParent(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[js.Any]
    inline def callSuper(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method]  */
    inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    inline def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
    inline def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    inline def initConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[js.Any]
    inline def initConfig(instanceConfig: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Default sort that does nothing
      * @param value Object The value being converted.
      * @returns Object The comparison value.
      */
    inline def none(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("none")().asInstanceOf[js.Any]
    inline def none(value: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("none")(value.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.data.SortTypes.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    
    /** [Property] (RegExp) */
    @JSGlobal("Ext.data.SortTypes.stripTagsRE")
    @js.native
    def stripTagsRE: RegExp = js.native
    inline def stripTagsRE_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stripTagsRE")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Ext.data.StoreManager")
  @js.native
  class StoreManager ()
    extends StObject
       with typings.senchaTouch.Ext.data.StoreManager
  /* static members */
  object StoreManager {
    
    @JSGlobal("Ext.data.StoreManager")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Adds an item to the collection
      * @param key String The key to associate with the item, or the new item. If a getKey implementation was specified for this MixedCollection, or if the key of the stored items is in a property called id, the MixedCollection will be able to derive the key for the new item. In this case just pass the new item in this parameter.
      * @param item Object The item to add.
      * @returns Object The item added.
      */
    inline def add(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("add")().asInstanceOf[js.Any]
    inline def add(key: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(key.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def add(key: java.lang.String, item: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(key.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def add(key: Unit, item: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(key.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Adds all elements of an Array or an Object to the collection
      * @param addItems Object/Array An Object containing properties which will be added to the collection, or an Array of values, each of which are added to the collection. Functions references will be added to the collection if {@link} Ext.util.MixedCollection.allowFunctions allowFunctions} has been set to true.
      */
    inline def addAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addAll")().asInstanceOf[Unit]
    inline def addAll(addItems: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addAll")(addItems.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] This method adds a filter
      * @param filter Ext.util.Sorter/Function/Object Can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
      */
    inline def addFilter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addFilter")().asInstanceOf[Unit]
    inline def addFilter(filter: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addFilter")(filter.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] This method adds all the filters in a passed array
      * @param filters Object
      * @returns Object
      */
    inline def addFilters(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("addFilters")().asInstanceOf[js.Any]
    inline def addFilters(filters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("addFilters")(filters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] This method adds a sorter
      * @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
      * @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
      */
    inline def addSorter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addSorter")().asInstanceOf[Unit]
    inline def addSorter(sorter: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addSorter")(sorter.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def addSorter(sorter: js.Any, defaultDirection: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addSorter")(sorter.asInstanceOf[js.Any], defaultDirection.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addSorter(sorter: Unit, defaultDirection: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addSorter")(sorter.asInstanceOf[js.Any], defaultDirection.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] This method adds all the sorters in a passed array
      * @param sorters Array An array with sorters. A sorter can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
      * @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
      */
    inline def addSorters(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addSorters")().asInstanceOf[Unit]
    inline def addSorters(sorters: Unit, defaultDirection: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addSorters")(sorters.asInstanceOf[js.Any], defaultDirection.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addSorters(sorters: typings.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addSorters")(sorters.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def addSorters(sorters: typings.senchaTouch.Ext.Array, defaultDirection: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addSorters")(sorters.asInstanceOf[js.Any], defaultDirection.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Property] (Array) */
    @JSGlobal("Ext.data.StoreManager.all")
    @js.native
    def all: typings.senchaTouch.Ext.Array = js.native
    inline def all_=(x: typings.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("all")(x.asInstanceOf[js.Any])
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[js.Any]
    inline def callOverridden(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[js.Any]
    inline def callParent(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[js.Any]
    inline def callSuper(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Removes all items from the collection  */
    inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
    
    /** [Method] Returns true if the collection contains the passed Object as an item
      * @param item Object The Object to look for in the collection.
      * @returns Boolean true if the collection contains the Object as an item.
      */
    inline def contains(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("contains")().asInstanceOf[Boolean]
    inline def contains(item: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("contains")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** [Method] Returns true if the collection contains the passed Object as a key
      * @param key String The key to look for in the collection.
      * @returns Boolean true if the collection contains the Object as a key.
      */
    inline def containsKey(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("containsKey")().asInstanceOf[Boolean]
    inline def containsKey(key: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("containsKey")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.StoreManager.currentSortFn")
    @js.native
    def currentSortFn: js.Any = js.native
    inline def currentSortFn_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentSortFn")(x.asInstanceOf[js.Any])
    
    /** [Method]  */
    inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.data.StoreManager.dirtyFilterFn")
    @js.native
    def dirtyFilterFn: Boolean = js.native
    inline def dirtyFilterFn_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dirtyFilterFn")(x.asInstanceOf[js.Any])
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.data.StoreManager.dirtySortFn")
    @js.native
    def dirtySortFn: Boolean = js.native
    inline def dirtySortFn_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dirtySortFn")(x.asInstanceOf[js.Any])
    
    /** [Method] Executes the specified function once for every item in the collection
      * @param fn Function The function to execute for each item.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to the current item in the iteration.
      */
    inline def each(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("each")().asInstanceOf[Unit]
    inline def each(fn: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("each")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def each(fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def each(fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Executes the specified function once for every key in the collection passing each key and its associated item as th
      * @param fn Function The function to execute for each item.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
      */
    inline def eachKey(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("eachKey")().asInstanceOf[Unit]
    inline def eachKey(fn: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("eachKey")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def eachKey(fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachKey")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def eachKey(fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachKey")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] This method will sort a collection based on the currently configured sorters
      * @param property Object
      * @param value Object
      * @param anyMatch Object
      * @param caseSensitive Object
      * @returns Array
      */
    inline def filter(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")().asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def filter(property: js.Any): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def filter(property: js.Any, value: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def filter(property: js.Any, value: js.Any, anyMatch: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def filter(property: js.Any, value: js.Any, anyMatch: js.Any, caseSensitive: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def filter(property: js.Any, value: js.Any, anyMatch: Unit, caseSensitive: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def filter(property: js.Any, value: Unit, anyMatch: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def filter(property: js.Any, value: Unit, anyMatch: js.Any, caseSensitive: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def filter(property: js.Any, value: Unit, anyMatch: Unit, caseSensitive: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def filter(property: Unit, value: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def filter(property: Unit, value: js.Any, anyMatch: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def filter(property: Unit, value: js.Any, anyMatch: js.Any, caseSensitive: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def filter(property: Unit, value: js.Any, anyMatch: Unit, caseSensitive: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def filter(property: Unit, value: Unit, anyMatch: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def filter(property: Unit, value: Unit, anyMatch: js.Any, caseSensitive: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def filter(property: Unit, value: Unit, anyMatch: Unit, caseSensitive: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
    
    /** [Method] Filter by a function
      * @param fn Function The function to be called.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
      * @returns Ext.util.MixedCollection The new filtered collection
      */
    inline def filterBy(): IMixedCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("filterBy")().asInstanceOf[IMixedCollection]
    inline def filterBy(fn: js.Any): IMixedCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("filterBy")(fn.asInstanceOf[js.Any]).asInstanceOf[IMixedCollection]
    inline def filterBy(fn: js.Any, scope: js.Any): IMixedCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("filterBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IMixedCollection]
    inline def filterBy(fn: Unit, scope: js.Any): IMixedCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("filterBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IMixedCollection]
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.data.StoreManager.filtered")
    @js.native
    def filtered: Boolean = js.native
    inline def filtered_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("filtered")(x.asInstanceOf[js.Any])
    
    /** [Method] Returns the first item in the collection which elicits a true return value from the passed selection function
      * @param fn Function The selection function to execute for each item.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
      * @returns Object The first item in the collection which returned true from the selection function.
      */
    inline def findBy(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("findBy")().asInstanceOf[js.Any]
    inline def findBy(fn: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("findBy")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def findBy(fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def findBy(fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Find the index of the first matching object in this collection by a function
      * @param fn Function The function to be called.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
      * @param start Number The index to start searching at.
      * @returns Number The matched index, or -1 if the item was not found.
      */
    inline def findIndexBy(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")().asInstanceOf[Double]
    inline def findIndexBy(fn: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")(fn.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def findIndexBy(fn: js.Any, scope: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndexBy(fn: js.Any, scope: js.Any, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndexBy(fn: js.Any, scope: Unit, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndexBy(fn: Unit, scope: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndexBy(fn: Unit, scope: js.Any, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndexBy(fn: Unit, scope: Unit, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /** [Method] This method returns the index that a given item would be inserted into a given array based on the current sorters
      * @param items Array The array that you want to insert the item into.
      * @param item Mixed The item that you want to insert into the items array.
      * @returns Number The index for the given item in the given array based on the current sorters.
      */
    inline def findInsertionIndex(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findInsertionIndex")().asInstanceOf[Double]
    inline def findInsertionIndex(items: Unit, item: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findInsertionIndex")(items.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findInsertionIndex(items: typings.senchaTouch.Ext.Array): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findInsertionIndex")(items.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def findInsertionIndex(items: typings.senchaTouch.Ext.Array, item: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findInsertionIndex")(items.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /** [Method] Returns the first item in the collection
      * @returns Object the first item in the collection.
      */
    inline def first(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("first")().asInstanceOf[js.Any]
    
    /** [Method] Returns the item associated with the passed key OR index
      * @param key String/Number The key or index of the item.
      * @returns Object If the item is found, returns the item. If the item was not found, returns undefined. If an item was found, but is a Class, returns null.
      */
    inline def get(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Any]
    inline def get(key: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Returns the item at the specified index
      * @param index Number The index of the item.
      * @returns Object The item at the specified index.
      */
    inline def getAt(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getAt")().asInstanceOf[js.Any]
    inline def getAt(index: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getAt")(index.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Returns the value of autoFilter
      * @returns Boolean
      */
    inline def getAutoFilter(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutoFilter")().asInstanceOf[Boolean]
    
    /** [Method] Returns the value of autoSort
      * @returns Boolean
      */
    inline def getAutoSort(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutoSort")().asInstanceOf[Boolean]
    
    /** [Method] Returns the item associated with the passed key
      * @param key String/Number The key of the item.
      * @returns Object The item associated with the passed key.
      */
    inline def getByKey(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getByKey")().asInstanceOf[js.Any]
    inline def getByKey(key: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getByKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Returns the number of items in the collection
      * @returns Number the number of items in the collection.
      */
    inline def getCount(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getCount")().asInstanceOf[Double]
    
    /** [Method] Returns the value of defaultSortDirection
      * @returns String
      */
    inline def getDefaultSortDirection(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultSortDirection")().asInstanceOf[java.lang.String]
    
    /** [Method] Returns an up to date sort function
      * @returns Function sortFn The sort function.
      */
    inline def getFilterFn(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilterFn")().asInstanceOf[js.Any]
    
    /** [Method] Returns the value of filterRoot
      * @returns String
      */
    inline def getFilterRoot(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilterRoot")().asInstanceOf[java.lang.String]
    
    /** [Method] Returns the value of filters
      * @returns Array
      */
    inline def getFilters(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilters")().asInstanceOf[typings.senchaTouch.Ext.Array]
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    inline def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
    inline def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] getKey implementation for MixedCollection
      * @param o Object
      * @returns Object The key for the passed item.
      */
    inline def getKey(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getKey")().asInstanceOf[js.Any]
    inline def getKey(o: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getKey")(o.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Returns a range of items in this collection
      * @param start Number The starting index.
      * @param end Number The ending index. Defaults to the last item.
      * @returns Array An array of items.
      */
    inline def getRange(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getRange")().asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def getRange(start: Double): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getRange")(start.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def getRange(start: Double, end: Double): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getRange")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def getRange(start: Unit, end: Double): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getRange")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
    
    /** [Method] Returns an up to date sort function
      * @returns Function The sort function.
      */
    inline def getSortFn(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getSortFn")().asInstanceOf[js.Any]
    
    /** [Method] Returns the value of sortRoot
      * @returns String
      */
    inline def getSortRoot(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSortRoot")().asInstanceOf[java.lang.String]
    
    /** [Method] Returns the value of sorters
      * @returns Array
      */
    inline def getSorters(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getSorters")().asInstanceOf[typings.senchaTouch.Ext.Array]
    
    /** [Method] Returns index within the collection of the passed Object
      * @param item Object The item to find the index of.
      * @returns Number Index of the item. Returns -1 if not found.
      */
    inline def indexOf(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")().asInstanceOf[Double]
    inline def indexOf(item: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(item.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /** [Method] Returns index within the collection of the passed key
      * @param key String The key to find the index of.
      * @returns Number Index of the key.
      */
    inline def indexOfKey(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOfKey")().asInstanceOf[Double]
    inline def indexOfKey(key: java.lang.String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOfKey")(key.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.StoreManager.indices")
    @js.native
    def indices: js.Any = js.native
    inline def indices_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indices")(x.asInstanceOf[js.Any])
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    inline def initConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[js.Any]
    inline def initConfig(instanceConfig: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Inserts an item at the specified index in the collection
      * @param index Number The index to insert the item at.
      * @param key String The key to associate with the new item, or the item itself.
      * @param item Object If the second parameter was a key, the new item.
      * @returns Object The item inserted.
      */
    inline def insert(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("insert")().asInstanceOf[js.Any]
    inline def insert(index: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def insert(index: Double, key: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def insert(index: Double, key: java.lang.String, item: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any], key.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def insert(index: Double, key: Unit, item: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any], key.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def insert(index: Unit, key: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def insert(index: Unit, key: java.lang.String, item: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any], key.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def insert(index: Unit, key: Unit, item: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any], key.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] This method adds a filter at a given index
      * @param index Number The index at which to insert the filter.
      * @param filter Ext.util.Sorter/Function/Object Can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
      * @returns Object
      */
    inline def insertFilter(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("insertFilter")().asInstanceOf[js.Any]
    inline def insertFilter(index: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("insertFilter")(index.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def insertFilter(index: Double, filter: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insertFilter")(index.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def insertFilter(index: Unit, filter: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insertFilter")(index.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] This method inserts all the filters in the passed array at the given index
      * @param index Number The index at which to insert the filters.
      * @param filters Array Each filter can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
      * @returns Array
      */
    inline def insertFilters(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("insertFilters")().asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def insertFilters(index: Double): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("insertFilters")(index.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def insertFilters(index: Double, filters: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("insertFilters")(index.asInstanceOf[js.Any], filters.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def insertFilters(index: Unit, filters: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("insertFilters")(index.asInstanceOf[js.Any], filters.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
    
    /** [Method] This method adds a sorter at a given index
      * @param index Number The index at which to insert the sorter.
      * @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
      * @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
      */
    inline def insertSorter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("insertSorter")().asInstanceOf[Unit]
    inline def insertSorter(index: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("insertSorter")(index.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def insertSorter(index: Double, sorter: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertSorter")(index.asInstanceOf[js.Any], sorter.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def insertSorter(index: Double, sorter: js.Any, defaultDirection: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertSorter")(index.asInstanceOf[js.Any], sorter.asInstanceOf[js.Any], defaultDirection.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def insertSorter(index: Double, sorter: Unit, defaultDirection: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertSorter")(index.asInstanceOf[js.Any], sorter.asInstanceOf[js.Any], defaultDirection.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def insertSorter(index: Unit, sorter: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertSorter")(index.asInstanceOf[js.Any], sorter.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def insertSorter(index: Unit, sorter: js.Any, defaultDirection: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertSorter")(index.asInstanceOf[js.Any], sorter.asInstanceOf[js.Any], defaultDirection.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def insertSorter(index: Unit, sorter: Unit, defaultDirection: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertSorter")(index.asInstanceOf[js.Any], sorter.asInstanceOf[js.Any], defaultDirection.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] This method inserts all the sorters in the passed array at the given index
      * @returns Ext.util.Collection this
      */
    inline def insertSorters(): ICollection = ^.asInstanceOf[js.Dynamic].applyDynamic("insertSorters")().asInstanceOf[ICollection]
    
    /** [Property] (Array) */
    @JSGlobal("Ext.data.StoreManager.items")
    @js.native
    def items: typings.senchaTouch.Ext.Array = js.native
    inline def items_=(x: typings.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("items")(x.asInstanceOf[js.Any])
    
    /** [Property] (Array) */
    @JSGlobal("Ext.data.StoreManager.keys")
    @js.native
    def keys: typings.senchaTouch.Ext.Array = js.native
    inline def keys_=(x: typings.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keys")(x.asInstanceOf[js.Any])
    
    /** [Method] Returns the last item in the collection
      * @returns Object the last item in the collection.
      */
    inline def last(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("last")().asInstanceOf[js.Any]
    
    /** [Property] (Number) */
    @JSGlobal("Ext.data.StoreManager.length")
    @js.native
    def length: Double = js.native
    inline def length_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("length")(x.asInstanceOf[js.Any])
    
    /** [Method] Gets a registered Store by its id returns a passed store instance or returns a new instance of a store created with
      * @param store String/Object The id of the Store, or a Store instance, or a store configuration.
      * @returns Ext.data.Store
      */
    inline def lookup(): IStore = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")().asInstanceOf[IStore]
    inline def lookup(store: js.Any): IStore = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(store.asInstanceOf[js.Any]).asInstanceOf[IStore]
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.StoreManager.map")
    @js.native
    def map: js.Any = js.native
    inline def map_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("map")(x.asInstanceOf[js.Any])
    
    /** [Method] Registers one or more Stores with the StoreManager
      * @param stores Ext.data.Store... Any number of Store instances.
      */
    inline def register(stores: IStore): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(stores.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Remove an item from the collection
      * @param item Object The item to remove.
      * @returns Object The item removed or false if no item was removed.
      */
    inline def remove(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")().asInstanceOf[js.Any]
    inline def remove(item: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(item.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Remove all items in the passed array from the collection
      * @param items Array An array of items to be removed.
      * @returns Ext.util.MixedCollection this object
      */
    inline def removeAll(): IMixedCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAll")().asInstanceOf[IMixedCollection]
    inline def removeAll(items: typings.senchaTouch.Ext.Array): IMixedCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAll")(items.asInstanceOf[js.Any]).asInstanceOf[IMixedCollection]
    
    /** [Method] Remove an item from a specified index in the collection
      * @param index Number The index within the collection of the item to remove.
      * @returns Object The item removed or false if no item was removed.
      */
    inline def removeAt(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAt")().asInstanceOf[js.Any]
    inline def removeAt(index: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAt")(index.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Removed an item associated with the passed key from the collection
      * @param key String The key of the item to remove.
      * @returns Object/Boolean The item removed or false if no item was removed.
      */
    inline def removeAtKey(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAtKey")().asInstanceOf[js.Any]
    inline def removeAtKey(key: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAtKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] This method removes all the filters in a passed array
      * @param filters Object
      * @returns Ext.util.Collection this
      */
    inline def removeFilters(): ICollection = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFilters")().asInstanceOf[ICollection]
    inline def removeFilters(filters: js.Any): ICollection = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFilters")(filters.asInstanceOf[js.Any]).asInstanceOf[ICollection]
    
    /** [Method] This method removes a sorter
      * @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
      */
    inline def removeSorter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSorter")().asInstanceOf[Unit]
    inline def removeSorter(sorter: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSorter")(sorter.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] This method removes all the sorters in a passed array
      * @param sorters Object
      * @returns Ext.util.Collection this
      */
    inline def removeSorters(): ICollection = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSorters")().asInstanceOf[ICollection]
    inline def removeSorters(sorters: js.Any): ICollection = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSorters")(sorters.asInstanceOf[js.Any]).asInstanceOf[ICollection]
    
    /** [Method] Replaces an item in the collection
      * @param oldKey String The key associated with the item to replace, or the replacement item. If you supplied a getKey implementation for this MixedCollection, or if the key of your stored items is in a property called id, then the MixedCollection will be able to derive the key of the replacement item. If you want to replace an item with one having the same key value, then just pass the replacement item in this parameter.
      * @param item Object {Object} item (optional) If the first parameter passed was a key, the item to associate with that key.
      * @returns Object The new item.
      */
    inline def replace(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")().asInstanceOf[js.Any]
    inline def replace(oldKey: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")(oldKey.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def replace(oldKey: java.lang.String, item: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(oldKey.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def replace(oldKey: Unit, item: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(oldKey.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.data.StoreManager.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Sets the value of autoFilter
      * @param autoFilter Boolean The new value.
      */
    inline def setAutoFilter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAutoFilter")().asInstanceOf[Unit]
    inline def setAutoFilter(autoFilter: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAutoFilter")(autoFilter.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Sets the value of autoSort
      * @param autoSort Boolean The new value.
      */
    inline def setAutoSort(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAutoSort")().asInstanceOf[Unit]
    inline def setAutoSort(autoSort: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAutoSort")(autoSort.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Sets the value of defaultSortDirection
      * @param defaultSortDirection String The new value.
      */
    inline def setDefaultSortDirection(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultSortDirection")().asInstanceOf[Unit]
    inline def setDefaultSortDirection(defaultSortDirection: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultSortDirection")(defaultSortDirection.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Sets the value of filterRoot
      * @param filterRoot String The new value.
      */
    inline def setFilterRoot(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFilterRoot")().asInstanceOf[Unit]
    inline def setFilterRoot(filterRoot: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFilterRoot")(filterRoot.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Sets the value of filters
      * @param filters Array The new value.
      */
    inline def setFilters(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFilters")().asInstanceOf[Unit]
    inline def setFilters(filters: typings.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFilters")(filters.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Sets the value of sortRoot
      * @param sortRoot String The new value.
      */
    inline def setSortRoot(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSortRoot")().asInstanceOf[Unit]
    inline def setSortRoot(sortRoot: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSortRoot")(sortRoot.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Sets the value of sorters
      * @param sorters Array The new value.
      */
    inline def setSorters(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSorters")().asInstanceOf[Unit]
    inline def setSorters(sorters: typings.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSorters")(sorters.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] This method will sort an array based on the currently configured sorters
      * @param sorters Object
      * @param defaultDirection Object
      * @returns Array The array you passed after it is sorted.
      */
    inline def sort(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")().asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def sort(sorters: js.Any): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(sorters.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def sort(sorters: js.Any, defaultDirection: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(sorters.asInstanceOf[js.Any], defaultDirection.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def sort(sorters: Unit, defaultDirection: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(sorters.asInstanceOf[js.Any], defaultDirection.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.data.StoreManager.sorted")
    @js.native
    def sorted: Boolean = js.native
    inline def sorted_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sorted")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    
    /** [Method] Unregisters one or more Stores with the StoreManager
      * @param stores String/Object... Any number of Store instances or ID-s.
      */
    inline def unregister(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")().asInstanceOf[Unit]
    inline def unregister(stores: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(stores.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSGlobal("Ext.data.StoreMgr")
  @js.native
  class StoreMgr ()
    extends StObject
       with typings.senchaTouch.Ext.data.StoreMgr
  /* static members */
  object StoreMgr {
    
    @JSGlobal("Ext.data.StoreMgr")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Adds an item to the collection
      * @param key String The key to associate with the item, or the new item. If a getKey implementation was specified for this MixedCollection, or if the key of the stored items is in a property called id, the MixedCollection will be able to derive the key for the new item. In this case just pass the new item in this parameter.
      * @param item Object The item to add.
      * @returns Object The item added.
      */
    inline def add(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("add")().asInstanceOf[js.Any]
    inline def add(key: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(key.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def add(key: java.lang.String, item: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(key.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def add(key: Unit, item: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(key.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Adds all elements of an Array or an Object to the collection
      * @param addItems Object/Array An Object containing properties which will be added to the collection, or an Array of values, each of which are added to the collection. Functions references will be added to the collection if {@link} Ext.util.MixedCollection.allowFunctions allowFunctions} has been set to true.
      */
    inline def addAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addAll")().asInstanceOf[Unit]
    inline def addAll(addItems: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addAll")(addItems.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] This method adds a filter
      * @param filter Ext.util.Sorter/Function/Object Can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
      */
    inline def addFilter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addFilter")().asInstanceOf[Unit]
    inline def addFilter(filter: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addFilter")(filter.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] This method adds all the filters in a passed array
      * @param filters Object
      * @returns Object
      */
    inline def addFilters(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("addFilters")().asInstanceOf[js.Any]
    inline def addFilters(filters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("addFilters")(filters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] This method adds a sorter
      * @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
      * @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
      */
    inline def addSorter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addSorter")().asInstanceOf[Unit]
    inline def addSorter(sorter: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addSorter")(sorter.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def addSorter(sorter: js.Any, defaultDirection: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addSorter")(sorter.asInstanceOf[js.Any], defaultDirection.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addSorter(sorter: Unit, defaultDirection: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addSorter")(sorter.asInstanceOf[js.Any], defaultDirection.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] This method adds all the sorters in a passed array
      * @param sorters Array An array with sorters. A sorter can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
      * @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
      */
    inline def addSorters(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addSorters")().asInstanceOf[Unit]
    inline def addSorters(sorters: Unit, defaultDirection: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addSorters")(sorters.asInstanceOf[js.Any], defaultDirection.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addSorters(sorters: typings.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addSorters")(sorters.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def addSorters(sorters: typings.senchaTouch.Ext.Array, defaultDirection: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addSorters")(sorters.asInstanceOf[js.Any], defaultDirection.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Property] (Array) */
    @JSGlobal("Ext.data.StoreMgr.all")
    @js.native
    def all: typings.senchaTouch.Ext.Array = js.native
    inline def all_=(x: typings.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("all")(x.asInstanceOf[js.Any])
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[js.Any]
    inline def callOverridden(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[js.Any]
    inline def callParent(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[js.Any]
    inline def callSuper(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Removes all items from the collection  */
    inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
    
    /** [Method] Returns true if the collection contains the passed Object as an item
      * @param item Object The Object to look for in the collection.
      * @returns Boolean true if the collection contains the Object as an item.
      */
    inline def contains(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("contains")().asInstanceOf[Boolean]
    inline def contains(item: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("contains")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** [Method] Returns true if the collection contains the passed Object as a key
      * @param key String The key to look for in the collection.
      * @returns Boolean true if the collection contains the Object as a key.
      */
    inline def containsKey(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("containsKey")().asInstanceOf[Boolean]
    inline def containsKey(key: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("containsKey")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.StoreMgr.currentSortFn")
    @js.native
    def currentSortFn: js.Any = js.native
    inline def currentSortFn_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentSortFn")(x.asInstanceOf[js.Any])
    
    /** [Method]  */
    inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.data.StoreMgr.dirtyFilterFn")
    @js.native
    def dirtyFilterFn: Boolean = js.native
    inline def dirtyFilterFn_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dirtyFilterFn")(x.asInstanceOf[js.Any])
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.data.StoreMgr.dirtySortFn")
    @js.native
    def dirtySortFn: Boolean = js.native
    inline def dirtySortFn_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dirtySortFn")(x.asInstanceOf[js.Any])
    
    /** [Method] Executes the specified function once for every item in the collection
      * @param fn Function The function to execute for each item.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to the current item in the iteration.
      */
    inline def each(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("each")().asInstanceOf[Unit]
    inline def each(fn: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("each")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def each(fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def each(fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Executes the specified function once for every key in the collection passing each key and its associated item as th
      * @param fn Function The function to execute for each item.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
      */
    inline def eachKey(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("eachKey")().asInstanceOf[Unit]
    inline def eachKey(fn: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("eachKey")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def eachKey(fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachKey")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def eachKey(fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachKey")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] This method will sort a collection based on the currently configured sorters
      * @param property Object
      * @param value Object
      * @param anyMatch Object
      * @param caseSensitive Object
      * @returns Array
      */
    inline def filter(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")().asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def filter(property: js.Any): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def filter(property: js.Any, value: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def filter(property: js.Any, value: js.Any, anyMatch: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def filter(property: js.Any, value: js.Any, anyMatch: js.Any, caseSensitive: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def filter(property: js.Any, value: js.Any, anyMatch: Unit, caseSensitive: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def filter(property: js.Any, value: Unit, anyMatch: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def filter(property: js.Any, value: Unit, anyMatch: js.Any, caseSensitive: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def filter(property: js.Any, value: Unit, anyMatch: Unit, caseSensitive: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def filter(property: Unit, value: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def filter(property: Unit, value: js.Any, anyMatch: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def filter(property: Unit, value: js.Any, anyMatch: js.Any, caseSensitive: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def filter(property: Unit, value: js.Any, anyMatch: Unit, caseSensitive: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def filter(property: Unit, value: Unit, anyMatch: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def filter(property: Unit, value: Unit, anyMatch: js.Any, caseSensitive: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def filter(property: Unit, value: Unit, anyMatch: Unit, caseSensitive: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
    
    /** [Method] Filter by a function
      * @param fn Function The function to be called.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
      * @returns Ext.util.MixedCollection The new filtered collection
      */
    inline def filterBy(): IMixedCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("filterBy")().asInstanceOf[IMixedCollection]
    inline def filterBy(fn: js.Any): IMixedCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("filterBy")(fn.asInstanceOf[js.Any]).asInstanceOf[IMixedCollection]
    inline def filterBy(fn: js.Any, scope: js.Any): IMixedCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("filterBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IMixedCollection]
    inline def filterBy(fn: Unit, scope: js.Any): IMixedCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("filterBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IMixedCollection]
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.data.StoreMgr.filtered")
    @js.native
    def filtered: Boolean = js.native
    inline def filtered_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("filtered")(x.asInstanceOf[js.Any])
    
    /** [Method] Returns the first item in the collection which elicits a true return value from the passed selection function
      * @param fn Function The selection function to execute for each item.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
      * @returns Object The first item in the collection which returned true from the selection function.
      */
    inline def findBy(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("findBy")().asInstanceOf[js.Any]
    inline def findBy(fn: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("findBy")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def findBy(fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def findBy(fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Find the index of the first matching object in this collection by a function
      * @param fn Function The function to be called.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
      * @param start Number The index to start searching at.
      * @returns Number The matched index, or -1 if the item was not found.
      */
    inline def findIndexBy(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")().asInstanceOf[Double]
    inline def findIndexBy(fn: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")(fn.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def findIndexBy(fn: js.Any, scope: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndexBy(fn: js.Any, scope: js.Any, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndexBy(fn: js.Any, scope: Unit, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndexBy(fn: Unit, scope: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndexBy(fn: Unit, scope: js.Any, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndexBy(fn: Unit, scope: Unit, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /** [Method] This method returns the index that a given item would be inserted into a given array based on the current sorters
      * @param items Array The array that you want to insert the item into.
      * @param item Mixed The item that you want to insert into the items array.
      * @returns Number The index for the given item in the given array based on the current sorters.
      */
    inline def findInsertionIndex(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findInsertionIndex")().asInstanceOf[Double]
    inline def findInsertionIndex(items: Unit, item: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findInsertionIndex")(items.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findInsertionIndex(items: typings.senchaTouch.Ext.Array): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findInsertionIndex")(items.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def findInsertionIndex(items: typings.senchaTouch.Ext.Array, item: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findInsertionIndex")(items.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /** [Method] Returns the first item in the collection
      * @returns Object the first item in the collection.
      */
    inline def first(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("first")().asInstanceOf[js.Any]
    
    /** [Method] Returns the item associated with the passed key OR index
      * @param key String/Number The key or index of the item.
      * @returns Object If the item is found, returns the item. If the item was not found, returns undefined. If an item was found, but is a Class, returns null.
      */
    inline def get(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Any]
    inline def get(key: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Returns the item at the specified index
      * @param index Number The index of the item.
      * @returns Object The item at the specified index.
      */
    inline def getAt(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getAt")().asInstanceOf[js.Any]
    inline def getAt(index: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getAt")(index.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Returns the value of autoFilter
      * @returns Boolean
      */
    inline def getAutoFilter(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutoFilter")().asInstanceOf[Boolean]
    
    /** [Method] Returns the value of autoSort
      * @returns Boolean
      */
    inline def getAutoSort(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutoSort")().asInstanceOf[Boolean]
    
    /** [Method] Returns the item associated with the passed key
      * @param key String/Number The key of the item.
      * @returns Object The item associated with the passed key.
      */
    inline def getByKey(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getByKey")().asInstanceOf[js.Any]
    inline def getByKey(key: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getByKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Returns the number of items in the collection
      * @returns Number the number of items in the collection.
      */
    inline def getCount(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getCount")().asInstanceOf[Double]
    
    /** [Method] Returns the value of defaultSortDirection
      * @returns String
      */
    inline def getDefaultSortDirection(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultSortDirection")().asInstanceOf[java.lang.String]
    
    /** [Method] Returns an up to date sort function
      * @returns Function sortFn The sort function.
      */
    inline def getFilterFn(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilterFn")().asInstanceOf[js.Any]
    
    /** [Method] Returns the value of filterRoot
      * @returns String
      */
    inline def getFilterRoot(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilterRoot")().asInstanceOf[java.lang.String]
    
    /** [Method] Returns the value of filters
      * @returns Array
      */
    inline def getFilters(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilters")().asInstanceOf[typings.senchaTouch.Ext.Array]
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    inline def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
    inline def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] getKey implementation for MixedCollection
      * @param o Object
      * @returns Object The key for the passed item.
      */
    inline def getKey(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getKey")().asInstanceOf[js.Any]
    inline def getKey(o: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getKey")(o.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Returns a range of items in this collection
      * @param start Number The starting index.
      * @param end Number The ending index. Defaults to the last item.
      * @returns Array An array of items.
      */
    inline def getRange(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getRange")().asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def getRange(start: Double): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getRange")(start.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def getRange(start: Double, end: Double): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getRange")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def getRange(start: Unit, end: Double): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getRange")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
    
    /** [Method] Returns an up to date sort function
      * @returns Function The sort function.
      */
    inline def getSortFn(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getSortFn")().asInstanceOf[js.Any]
    
    /** [Method] Returns the value of sortRoot
      * @returns String
      */
    inline def getSortRoot(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSortRoot")().asInstanceOf[java.lang.String]
    
    /** [Method] Returns the value of sorters
      * @returns Array
      */
    inline def getSorters(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getSorters")().asInstanceOf[typings.senchaTouch.Ext.Array]
    
    /** [Method] Returns index within the collection of the passed Object
      * @param item Object The item to find the index of.
      * @returns Number Index of the item. Returns -1 if not found.
      */
    inline def indexOf(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")().asInstanceOf[Double]
    inline def indexOf(item: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(item.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /** [Method] Returns index within the collection of the passed key
      * @param key String The key to find the index of.
      * @returns Number Index of the key.
      */
    inline def indexOfKey(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOfKey")().asInstanceOf[Double]
    inline def indexOfKey(key: java.lang.String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOfKey")(key.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.StoreMgr.indices")
    @js.native
    def indices: js.Any = js.native
    inline def indices_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indices")(x.asInstanceOf[js.Any])
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    inline def initConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[js.Any]
    inline def initConfig(instanceConfig: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Inserts an item at the specified index in the collection
      * @param index Number The index to insert the item at.
      * @param key String The key to associate with the new item, or the item itself.
      * @param item Object If the second parameter was a key, the new item.
      * @returns Object The item inserted.
      */
    inline def insert(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("insert")().asInstanceOf[js.Any]
    inline def insert(index: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def insert(index: Double, key: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def insert(index: Double, key: java.lang.String, item: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any], key.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def insert(index: Double, key: Unit, item: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any], key.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def insert(index: Unit, key: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def insert(index: Unit, key: java.lang.String, item: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any], key.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def insert(index: Unit, key: Unit, item: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any], key.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] This method adds a filter at a given index
      * @param index Number The index at which to insert the filter.
      * @param filter Ext.util.Sorter/Function/Object Can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
      * @returns Object
      */
    inline def insertFilter(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("insertFilter")().asInstanceOf[js.Any]
    inline def insertFilter(index: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("insertFilter")(index.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def insertFilter(index: Double, filter: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insertFilter")(index.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def insertFilter(index: Unit, filter: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insertFilter")(index.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] This method inserts all the filters in the passed array at the given index
      * @param index Number The index at which to insert the filters.
      * @param filters Array Each filter can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
      * @returns Array
      */
    inline def insertFilters(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("insertFilters")().asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def insertFilters(index: Double): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("insertFilters")(index.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def insertFilters(index: Double, filters: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("insertFilters")(index.asInstanceOf[js.Any], filters.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def insertFilters(index: Unit, filters: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("insertFilters")(index.asInstanceOf[js.Any], filters.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
    
    /** [Method] This method adds a sorter at a given index
      * @param index Number The index at which to insert the sorter.
      * @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
      * @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
      */
    inline def insertSorter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("insertSorter")().asInstanceOf[Unit]
    inline def insertSorter(index: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("insertSorter")(index.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def insertSorter(index: Double, sorter: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertSorter")(index.asInstanceOf[js.Any], sorter.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def insertSorter(index: Double, sorter: js.Any, defaultDirection: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertSorter")(index.asInstanceOf[js.Any], sorter.asInstanceOf[js.Any], defaultDirection.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def insertSorter(index: Double, sorter: Unit, defaultDirection: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertSorter")(index.asInstanceOf[js.Any], sorter.asInstanceOf[js.Any], defaultDirection.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def insertSorter(index: Unit, sorter: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertSorter")(index.asInstanceOf[js.Any], sorter.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def insertSorter(index: Unit, sorter: js.Any, defaultDirection: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertSorter")(index.asInstanceOf[js.Any], sorter.asInstanceOf[js.Any], defaultDirection.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def insertSorter(index: Unit, sorter: Unit, defaultDirection: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertSorter")(index.asInstanceOf[js.Any], sorter.asInstanceOf[js.Any], defaultDirection.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] This method inserts all the sorters in the passed array at the given index
      * @returns Ext.util.Collection this
      */
    inline def insertSorters(): ICollection = ^.asInstanceOf[js.Dynamic].applyDynamic("insertSorters")().asInstanceOf[ICollection]
    
    /** [Property] (Array) */
    @JSGlobal("Ext.data.StoreMgr.items")
    @js.native
    def items: typings.senchaTouch.Ext.Array = js.native
    inline def items_=(x: typings.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("items")(x.asInstanceOf[js.Any])
    
    /** [Property] (Array) */
    @JSGlobal("Ext.data.StoreMgr.keys")
    @js.native
    def keys: typings.senchaTouch.Ext.Array = js.native
    inline def keys_=(x: typings.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keys")(x.asInstanceOf[js.Any])
    
    /** [Method] Returns the last item in the collection
      * @returns Object the last item in the collection.
      */
    inline def last(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("last")().asInstanceOf[js.Any]
    
    /** [Property] (Number) */
    @JSGlobal("Ext.data.StoreMgr.length")
    @js.native
    def length: Double = js.native
    inline def length_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("length")(x.asInstanceOf[js.Any])
    
    /** [Method] Gets a registered Store by its id returns a passed store instance or returns a new instance of a store created with
      * @param store String/Object The id of the Store, or a Store instance, or a store configuration.
      * @returns Ext.data.Store
      */
    inline def lookup(): IStore = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")().asInstanceOf[IStore]
    inline def lookup(store: js.Any): IStore = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(store.asInstanceOf[js.Any]).asInstanceOf[IStore]
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.StoreMgr.map")
    @js.native
    def map: js.Any = js.native
    inline def map_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("map")(x.asInstanceOf[js.Any])
    
    /** [Method] Registers one or more Stores with the StoreManager
      * @param stores Ext.data.Store... Any number of Store instances.
      */
    inline def register(stores: IStore): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(stores.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Remove an item from the collection
      * @param item Object The item to remove.
      * @returns Object The item removed or false if no item was removed.
      */
    inline def remove(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")().asInstanceOf[js.Any]
    inline def remove(item: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(item.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Remove all items in the passed array from the collection
      * @param items Array An array of items to be removed.
      * @returns Ext.util.MixedCollection this object
      */
    inline def removeAll(): IMixedCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAll")().asInstanceOf[IMixedCollection]
    inline def removeAll(items: typings.senchaTouch.Ext.Array): IMixedCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAll")(items.asInstanceOf[js.Any]).asInstanceOf[IMixedCollection]
    
    /** [Method] Remove an item from a specified index in the collection
      * @param index Number The index within the collection of the item to remove.
      * @returns Object The item removed or false if no item was removed.
      */
    inline def removeAt(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAt")().asInstanceOf[js.Any]
    inline def removeAt(index: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAt")(index.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Removed an item associated with the passed key from the collection
      * @param key String The key of the item to remove.
      * @returns Object/Boolean The item removed or false if no item was removed.
      */
    inline def removeAtKey(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAtKey")().asInstanceOf[js.Any]
    inline def removeAtKey(key: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAtKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] This method removes all the filters in a passed array
      * @param filters Object
      * @returns Ext.util.Collection this
      */
    inline def removeFilters(): ICollection = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFilters")().asInstanceOf[ICollection]
    inline def removeFilters(filters: js.Any): ICollection = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFilters")(filters.asInstanceOf[js.Any]).asInstanceOf[ICollection]
    
    /** [Method] This method removes a sorter
      * @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
      */
    inline def removeSorter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSorter")().asInstanceOf[Unit]
    inline def removeSorter(sorter: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSorter")(sorter.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] This method removes all the sorters in a passed array
      * @param sorters Object
      * @returns Ext.util.Collection this
      */
    inline def removeSorters(): ICollection = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSorters")().asInstanceOf[ICollection]
    inline def removeSorters(sorters: js.Any): ICollection = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSorters")(sorters.asInstanceOf[js.Any]).asInstanceOf[ICollection]
    
    /** [Method] Replaces an item in the collection
      * @param oldKey String The key associated with the item to replace, or the replacement item. If you supplied a getKey implementation for this MixedCollection, or if the key of your stored items is in a property called id, then the MixedCollection will be able to derive the key of the replacement item. If you want to replace an item with one having the same key value, then just pass the replacement item in this parameter.
      * @param item Object {Object} item (optional) If the first parameter passed was a key, the item to associate with that key.
      * @returns Object The new item.
      */
    inline def replace(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")().asInstanceOf[js.Any]
    inline def replace(oldKey: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")(oldKey.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def replace(oldKey: java.lang.String, item: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(oldKey.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def replace(oldKey: Unit, item: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(oldKey.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.data.StoreMgr.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Sets the value of autoFilter
      * @param autoFilter Boolean The new value.
      */
    inline def setAutoFilter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAutoFilter")().asInstanceOf[Unit]
    inline def setAutoFilter(autoFilter: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAutoFilter")(autoFilter.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Sets the value of autoSort
      * @param autoSort Boolean The new value.
      */
    inline def setAutoSort(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAutoSort")().asInstanceOf[Unit]
    inline def setAutoSort(autoSort: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAutoSort")(autoSort.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Sets the value of defaultSortDirection
      * @param defaultSortDirection String The new value.
      */
    inline def setDefaultSortDirection(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultSortDirection")().asInstanceOf[Unit]
    inline def setDefaultSortDirection(defaultSortDirection: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultSortDirection")(defaultSortDirection.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Sets the value of filterRoot
      * @param filterRoot String The new value.
      */
    inline def setFilterRoot(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFilterRoot")().asInstanceOf[Unit]
    inline def setFilterRoot(filterRoot: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFilterRoot")(filterRoot.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Sets the value of filters
      * @param filters Array The new value.
      */
    inline def setFilters(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFilters")().asInstanceOf[Unit]
    inline def setFilters(filters: typings.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFilters")(filters.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Sets the value of sortRoot
      * @param sortRoot String The new value.
      */
    inline def setSortRoot(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSortRoot")().asInstanceOf[Unit]
    inline def setSortRoot(sortRoot: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSortRoot")(sortRoot.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Sets the value of sorters
      * @param sorters Array The new value.
      */
    inline def setSorters(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSorters")().asInstanceOf[Unit]
    inline def setSorters(sorters: typings.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSorters")(sorters.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] This method will sort an array based on the currently configured sorters
      * @param sorters Object
      * @param defaultDirection Object
      * @returns Array The array you passed after it is sorted.
      */
    inline def sort(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")().asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def sort(sorters: js.Any): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(sorters.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def sort(sorters: js.Any, defaultDirection: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(sorters.asInstanceOf[js.Any], defaultDirection.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def sort(sorters: Unit, defaultDirection: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(sorters.asInstanceOf[js.Any], defaultDirection.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.data.StoreMgr.sorted")
    @js.native
    def sorted: Boolean = js.native
    inline def sorted_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sorted")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    
    /** [Method] Unregisters one or more Stores with the StoreManager
      * @param stores String/Object... Any number of Store instances or ID-s.
      */
    inline def unregister(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")().asInstanceOf[Unit]
    inline def unregister(stores: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(stores.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSGlobal("Ext.data.Types")
  @js.native
  class Types ()
    extends StObject
       with typings.senchaTouch.Ext.data.Types
  /* static members */
  object Types {
    
    @JSGlobal("Ext.data.Types")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.Types.AUTO")
    @js.native
    def AUTO: js.Any = js.native
    inline def AUTO_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTO")(x.asInstanceOf[js.Any])
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.Types.BOOL")
    @js.native
    def BOOL: js.Any = js.native
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.Types.BOOLEAN")
    @js.native
    def BOOLEAN: js.Any = js.native
    inline def BOOLEAN_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOOLEAN")(x.asInstanceOf[js.Any])
    
    inline def BOOL_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOOL")(x.asInstanceOf[js.Any])
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.Types.DATE")
    @js.native
    def DATE: js.Any = js.native
    inline def DATE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATE")(x.asInstanceOf[js.Any])
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.Types.FLOAT")
    @js.native
    def FLOAT: js.Any = js.native
    inline def FLOAT_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLOAT")(x.asInstanceOf[js.Any])
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.Types.INT")
    @js.native
    def INT: js.Any = js.native
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.Types.INTEGER")
    @js.native
    def INTEGER: js.Any = js.native
    inline def INTEGER_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTEGER")(x.asInstanceOf[js.Any])
    
    inline def INT_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INT")(x.asInstanceOf[js.Any])
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.Types.NUMBER")
    @js.native
    def NUMBER: js.Any = js.native
    inline def NUMBER_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUMBER")(x.asInstanceOf[js.Any])
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.Types.STRING")
    @js.native
    def STRING: js.Any = js.native
    inline def STRING_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STRING")(x.asInstanceOf[js.Any])
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[js.Any]
    inline def callOverridden(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[js.Any]
    inline def callParent(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[js.Any]
    inline def callSuper(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method]  */
    inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    inline def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
    inline def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    inline def initConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[js.Any]
    inline def initConfig(instanceConfig: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.data.Types.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    
    /** [Property] (RegExp) */
    @JSGlobal("Ext.data.Types.stripRe")
    @js.native
    def stripRe: RegExp = js.native
    inline def stripRe_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stripRe")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Ext.data.Validations")
  @js.native
  class Validations ()
    extends StObject
       with typings.senchaTouch.Ext.data.Validations
  /* static members */
  object Validations {
    
    @JSGlobal("Ext.data.Validations")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[js.Any]
    inline def callOverridden(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[js.Any]
    inline def callParent(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[js.Any]
    inline def callSuper(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method]  */
    inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** [Method] Validates that an email string is in the correct format
      * @param config Object Config object.
      * @param email String The email address.
      * @returns Boolean true if the value passes validation.
      */
    inline def email(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("email")().asInstanceOf[Boolean]
    inline def email(config: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("email")(config.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def email(config: js.Any, email: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("email")(config.asInstanceOf[js.Any], email.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def email(config: Unit, email: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("email")(config.asInstanceOf[js.Any], email.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** [Property] (String) */
    @JSGlobal("Ext.data.Validations.emailMessage")
    @js.native
    def emailMessage: java.lang.String = js.native
    inline def emailMessage_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emailMessage")(x.asInstanceOf[js.Any])
    
    /** [Property] (RegExp) */
    @JSGlobal("Ext.data.Validations.emailRe")
    @js.native
    def emailRe: RegExp = js.native
    inline def emailRe_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emailRe")(x.asInstanceOf[js.Any])
    
    /** [Method] Validates that the given value is present in the configured list
      * @param config Object Config object.
      * @param value String The value to validate.
      * @returns Boolean true if the value is not present in the list.
      */
    inline def exclusion(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("exclusion")().asInstanceOf[Boolean]
    inline def exclusion(config: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("exclusion")(config.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def exclusion(config: js.Any, value: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("exclusion")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def exclusion(config: Unit, value: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("exclusion")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** [Property] (String) */
    @JSGlobal("Ext.data.Validations.exclusionMessage")
    @js.native
    def exclusionMessage: java.lang.String = js.native
    inline def exclusionMessage_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exclusionMessage")(x.asInstanceOf[js.Any])
    
    /** [Method] Returns true if the given value passes validation against the configured matcher regex
      * @param config Object Config object.
      * @param value String The value to validate.
      * @returns Boolean true if the value passes the format validation.
      */
    inline def format(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("format")().asInstanceOf[Boolean]
    inline def format(config: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(config.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def format(config: js.Any, value: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def format(config: Unit, value: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** [Property] (String) */
    @JSGlobal("Ext.data.Validations.formatMessage")
    @js.native
    def formatMessage: java.lang.String = js.native
    inline def formatMessage_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatMessage")(x.asInstanceOf[js.Any])
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    inline def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
    inline def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Returns the configured error message for any of the validation types
      * @param type String The type of validation you want to get the error message for.
      * @returns Object
      */
    inline def getMessage(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getMessage")().asInstanceOf[js.Any]
    inline def getMessage(`type`: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getMessage")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Validates that the given value is present in the configured list
      * @param config Object Config object.
      * @param value String The value to validate.
      * @returns Boolean true if the value is present in the list.
      */
    inline def inclusion(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("inclusion")().asInstanceOf[Boolean]
    inline def inclusion(config: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("inclusion")(config.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def inclusion(config: js.Any, value: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inclusion")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def inclusion(config: Unit, value: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inclusion")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** [Property] (String) */
    @JSGlobal("Ext.data.Validations.inclusionMessage")
    @js.native
    def inclusionMessage: java.lang.String = js.native
    inline def inclusionMessage_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inclusionMessage")(x.asInstanceOf[js.Any])
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    inline def initConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[js.Any]
    inline def initConfig(instanceConfig: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Returns true if the given value is between the configured min and max values
      * @param config Object Config object.
      * @param value String The value to validate.
      * @returns Boolean true if the value passes validation.
      */
    inline def length(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("length")().asInstanceOf[Boolean]
    inline def length(config: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("length")(config.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def length(config: js.Any, value: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("length")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def length(config: Unit, value: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("length")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** [Property] (String) */
    @JSGlobal("Ext.data.Validations.lengthMessage")
    @js.native
    def lengthMessage: java.lang.String = js.native
    inline def lengthMessage_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lengthMessage")(x.asInstanceOf[js.Any])
    
    /** [Method] Validates that the given value is present
      * @param config Object Config object.
      * @param value Object The value to validate.
      * @returns Boolean true if validation passed.
      */
    inline def presence(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("presence")().asInstanceOf[Boolean]
    inline def presence(config: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("presence")(config.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def presence(config: js.Any, value: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("presence")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def presence(config: Unit, value: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("presence")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** [Property] (String) */
    @JSGlobal("Ext.data.Validations.presenceMessage")
    @js.native
    def presenceMessage: java.lang.String = js.native
    inline def presenceMessage_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("presenceMessage")(x.asInstanceOf[js.Any])
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.data.Validations.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
  }
}
