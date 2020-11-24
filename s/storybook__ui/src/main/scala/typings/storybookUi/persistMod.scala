package typings.storybookUi

import typings.store2.mod.StoreAPI
import typings.store2.mod.StoredData
import typings.storybookUi.storybookUiBooleans.`false`
import typings.storybookUi.storybookUiBooleans.`true`
import typings.storybookUi.storybookUiNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/ui/dist/components/layout/persist", JSImport.Namespace)
@js.native
object persistMod extends js.Object {
  
  def get(): js.Any = js.native
  
  val set: (js.Function1[/* changes */ js.Any, Unit]) with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_lodash.Cancelable */ js.Any) = js.native
  
  @js.native
  object store extends js.Object {
    
    def apply(clearIfFalsy: `false`): StoreAPI = js.native
    def apply(clearIfFalsy: `0`): StoreAPI = js.native
    def apply(eachFn: js.Function2[/* key */ js.Any, /* data */ js.Any, `false` | _]): StoredData = js.native
    def apply(eachFn: js.Function2[/* key */ js.Any, /* data */ js.Any, `false` | _], value: js.Any): StoredData = js.native
    def apply(key: js.Any): js.Any = js.native
    def apply(key: js.Any, data: js.Any): js.Any = js.native
    def apply(key: js.Any, fn: js.Function1[/* data */ js.Any, _]): StoreAPI = js.native
    def apply(key: js.Any, fn: js.Function1[/* data */ js.Any, _], alt: js.Any): StoreAPI = js.native
    def apply(obj: js.Object): StoredData = js.native
    
    def add(key: js.Any, data: js.Any): js.Any = js.native
    
    def area(
      id: String,
      area: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Storage */ js.Any
    ): StoreAPI = js.native
    
    def clear(): StoreAPI = js.native
    
    def clearAll(): StoreAPI = js.native
    
    @JSName("each")
    def each_false(callback: js.Function2[/* key */ js.Any, /* data */ js.Any, `false` | _]): StoreAPI = js.native
    @JSName("each")
    def each_false(callback: js.Function2[/* key */ js.Any, /* data */ js.Any, `false` | _], value: js.Any): StoreAPI = js.native
    
    def get(key: js.Any): js.Any = js.native
    def get(key: js.Any, alt: js.Any): js.Any = js.native
    
    def getAll(): StoredData = js.native
    def getAll(fillObj: StoredData): StoredData = js.native
    
    def has(key: js.Any): Boolean = js.native
    
    def isFake(): Boolean = js.native
    
    def keys(): js.Array[String] = js.native
    def keys(fillList: js.Array[String]): js.Array[String] = js.native
    
    val local: StoreAPI = js.native
    
    def namespace(namespace: String): StoreAPI = js.native
    @JSName("namespace")
    def namespace_true(namespace: String, noSession: `true`): StoreAPI = js.native
    
    val page: StoreAPI = js.native
    
    def remove(key: js.Any): js.Any = js.native
    def remove(key: js.Any, alt: js.Any): js.Any = js.native
    
    val session: StoreAPI = js.native
    
    def set(key: js.Any, data: js.Any): js.Any = js.native
    def set(key: js.Any, data: js.Any, overwrite: Boolean): js.Any = js.native
    
    def setAll(data: js.Object): StoredData = js.native
    def setAll(data: js.Object, overwrite: Boolean): StoredData = js.native
    
    def size(): Double = js.native
    
    def transact(key: js.Any, fn: js.Function1[/* data */ js.Any, _]): StoreAPI = js.native
    def transact(key: js.Any, fn: js.Function1[/* data */ js.Any, _], alt: js.Any): StoreAPI = js.native
  }
}
