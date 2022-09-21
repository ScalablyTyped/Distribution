package typings.store2

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.std.Storage
import typings.store2.anon._empty
import typings.store2.store2Booleans.`false`
import typings.store2.store2Booleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("store2", JSImport.Default)
  @js.native
  val default: StoreType = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Already inherited
  - scala.AnyRef because Already inherited
  - js.Any because Already inherited
  - js.Object because Already inherited
  - js.Function because Already inherited
  - typings.store2.mod.BaseClear because Already inherited
  - typings.store2.mod.BaseTransact because Already inherited
  - typings.store2.mod.BaseSetAll because Already inherited */ @js.native
  trait Base
    extends BaseSet
       with BaseGet
       with BaseGetAll {
    
    /* InferMemberOverrides */
    override def apply(): StoredData = js.native
    /* InferMemberOverrides */
    override def apply(arg1: /* key */ Any): Any = js.native
    /* InferMemberOverrides */
    override def apply(arg1: /* key */ Any, arg2: /* data */ Any): Any = js.native
  }
  
  type BaseClear = js.Function1[`false`, StoreBase]
  
  type BaseGet = js.Function1[/* key */ Any, Any]
  
  type BaseGetAll = js.Function0[StoredData]
  
  type BaseSet = js.Function2[/* key */ Any, /* data */ Any, Any]
  
  type BaseSetAll = js.Function1[/* obj */ js.Object, StoredData]
  
  type BaseTransact = js.Function2[/* fn */ EachFn, /* value */ js.UndefOr[Any], StoredData]
  
  @js.native
  trait DeveloperTools extends StObject {
    
    val apis: StringDictionary[StoreAPI] = js.native
    
    val areas: StringDictionary[Storage] = js.native
    
    def clear(area: Storage): Unit = js.native
    
    def fn(name: String, fn: js.Function): Unit = js.native
    
    def get(area: Storage, key: String): String = js.native
    
    def inherit(api: StoreAPI, o: js.Object): js.Object = js.native
    
    def key(area: Storage, i: Double): String = js.native
    
    def length(area: Storage): Double = js.native
    
    var nsdelim: String = js.native
    
    def parse(s: String): Any = js.native
    def parse(s: String, fn: Reviver): Any = js.native
    
    def remove(area: Storage, key: String): Unit = js.native
    
    def replace(key: Any, value: Any): String | (js.Array[Double | String]) = js.native
    @JSName("replace")
    var replace_Original: Replacer = js.native
    
    def revive(key: String, value: Any): Any = js.native
    @JSName("revive")
    var revive_Original: Reviver = js.native
    
    def set(area: Storage, key: String, string: String): Unit = js.native
    
    var storeAPI: StoreAPI = js.native
    
    def stringify(d: Any): String = js.native
    def stringify(d: Any, fn: Replacer): String = js.native
    
    val version: String = js.native
  }
  
  type EachFn = js.Function2[/* key */ Any, /* data */ Any, `false` | Any]
  
  type Replacer = js.Function2[/* key */ Any, /* value */ Any, String | (js.Array[Double | String])]
  
  type Reviver = js.Function2[/* key */ String, /* value */ Any, Any]
  
  @js.native
  trait StoreAPI extends StObject {
    
    def add(key: Any, data: Any): Any = js.native
    
    def area(id: String, area: Storage): StoreBase = js.native
    
    def clear(): StoreBase = js.native
    
    def clearAll(): StoreBase = js.native
    
    def each(callback: EachFn): StoreBase = js.native
    
    def get(key: Any): Any = js.native
    def get(key: Any, alt: Any): Any = js.native
    def get(key: Any, alt: Reviver): Any = js.native
    
    def getAll(): StoredData = js.native
    def getAll(fillObj: StoredData): StoredData = js.native
    
    def has(key: Any): Boolean = js.native
    
    def isFake(): Boolean = js.native
    def isFake(force: Boolean): Boolean = js.native
    
    def keys(): js.Array[String] = js.native
    def keys(fillList: js.Array[String]): js.Array[String] = js.native
    
    def namespace(namespace: String): StoreType = js.native
    def namespace(namespace: String, singleArea: Unit, delim: String): StoreType = js.native
    @JSName("namespace")
    def namespace_true(namespace: String, singleArea: `true`): StoreType = js.native
    @JSName("namespace")
    def namespace_true(namespace: String, singleArea: `true`, delim: String): StoreType = js.native
    
    def remove(key: Any): Any = js.native
    def remove(key: Any, alt: Any): Any = js.native
    def remove(key: Any, alt: Reviver): Any = js.native
    
    def set(key: Any, data: Any): Any = js.native
    def set(key: Any, data: Any, overwrite: Boolean): Any = js.native
    def set(key: Any, data: Any, overwrite: Replacer): Any = js.native
    
    def setAll(data: js.Object): StoredData = js.native
    def setAll(data: js.Object, overwrite: Boolean): StoredData = js.native
    def setAll(data: js.Object, overwrite: Replacer): StoredData = js.native
    
    def size(): Double = js.native
    
    def transact(key: Any, fn: TransactFn): StoreBase = js.native
    def transact(key: Any, fn: TransactFn, alt: Any): StoreBase = js.native
    def transact(key: Any, fn: TransactFn, alt: Reviver): StoreBase = js.native
  }
  
  type StoreBase = StoreAPI & Base
  
  type StoreType = StoreBase & _empty
  
  type StoredData = StringDictionary[Any]
  
  type TransactFn = js.Function1[/* data */ Any, js.UndefOr[Any]]
  
  type _To = StoreType
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: StoreType = default
}
