package typings.storybookUi

import typings.store2.mod.StoreAPI
import typings.store2.mod.StoredData
import typings.storybookUi.storybookUiBooleans.`false`
import typings.storybookUi.storybookUiBooleans.`true`
import typings.storybookUi.storybookUiNumbers.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object persistMod {
  
  @JSImport("@storybook/ui/dist/components/layout/persist", "get")
  @js.native
  def get(): js.Any = js.native
  
  @JSImport("@storybook/ui/dist/components/layout/persist", "set")
  @js.native
  val set: (js.Function1[/* changes */ js.Any, Unit]) with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_lodash.Cancelable */ js.Any) = js.native
  
  object store {
    
    @JSImport("@storybook/ui/dist/components/layout/persist", "store")
    @js.native
    def apply(clearIfFalsy: `false`): StoreAPI = js.native
    @JSImport("@storybook/ui/dist/components/layout/persist", "store")
    @js.native
    def apply(clearIfFalsy: `0`): StoreAPI = js.native
    @JSImport("@storybook/ui/dist/components/layout/persist", "store")
    @js.native
    def apply(eachFn: js.Function2[/* key */ js.Any, /* data */ js.Any, `false` | _]): StoredData = js.native
    @JSImport("@storybook/ui/dist/components/layout/persist", "store")
    @js.native
    def apply(eachFn: js.Function2[/* key */ js.Any, /* data */ js.Any, `false` | _], value: js.Any): StoredData = js.native
    @JSImport("@storybook/ui/dist/components/layout/persist", "store")
    @js.native
    def apply(key: js.Any): js.Any = js.native
    @JSImport("@storybook/ui/dist/components/layout/persist", "store")
    @js.native
    def apply(key: js.Any, data: js.Any): js.Any = js.native
    @JSImport("@storybook/ui/dist/components/layout/persist", "store")
    @js.native
    def apply(key: js.Any, fn: js.Function1[/* data */ js.Any, _]): StoreAPI = js.native
    @JSImport("@storybook/ui/dist/components/layout/persist", "store")
    @js.native
    def apply(key: js.Any, fn: js.Function1[/* data */ js.Any, _], alt: js.Any): StoreAPI = js.native
    @JSImport("@storybook/ui/dist/components/layout/persist", "store")
    @js.native
    def apply(obj: js.Object): StoredData = js.native
    
    @JSImport("@storybook/ui/dist/components/layout/persist", "store.add")
    @js.native
    def add(key: js.Any, data: js.Any): js.Any = js.native
    
    @JSImport("@storybook/ui/dist/components/layout/persist", "store.area")
    @js.native
    def area(
      id: String,
      area: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Storage */ js.Any
    ): StoreAPI = js.native
    
    @JSImport("@storybook/ui/dist/components/layout/persist", "store.clear")
    @js.native
    def clear(): StoreAPI = js.native
    
    @JSImport("@storybook/ui/dist/components/layout/persist", "store.clearAll")
    @js.native
    def clearAll(): StoreAPI = js.native
    
    @JSImport("@storybook/ui/dist/components/layout/persist", "store.each")
    @js.native
    def each_false(callback: js.Function2[/* key */ js.Any, /* data */ js.Any, `false` | _]): StoreAPI = js.native
    @JSImport("@storybook/ui/dist/components/layout/persist", "store.each")
    @js.native
    def each_false(callback: js.Function2[/* key */ js.Any, /* data */ js.Any, `false` | _], value: js.Any): StoreAPI = js.native
    
    @JSImport("@storybook/ui/dist/components/layout/persist", "store.get")
    @js.native
    def get(key: js.Any): js.Any = js.native
    @JSImport("@storybook/ui/dist/components/layout/persist", "store.get")
    @js.native
    def get(key: js.Any, alt: js.Any): js.Any = js.native
    
    @JSImport("@storybook/ui/dist/components/layout/persist", "store.getAll")
    @js.native
    def getAll(): StoredData = js.native
    @JSImport("@storybook/ui/dist/components/layout/persist", "store.getAll")
    @js.native
    def getAll(fillObj: StoredData): StoredData = js.native
    
    @JSImport("@storybook/ui/dist/components/layout/persist", "store.has")
    @js.native
    def has(key: js.Any): Boolean = js.native
    
    @JSImport("@storybook/ui/dist/components/layout/persist", "store.isFake")
    @js.native
    def isFake(): Boolean = js.native
    
    @JSImport("@storybook/ui/dist/components/layout/persist", "store.keys")
    @js.native
    def keys(): js.Array[String] = js.native
    @JSImport("@storybook/ui/dist/components/layout/persist", "store.keys")
    @js.native
    def keys(fillList: js.Array[String]): js.Array[String] = js.native
    
    @JSImport("@storybook/ui/dist/components/layout/persist", "store.local")
    @js.native
    val local: StoreAPI = js.native
    
    @JSImport("@storybook/ui/dist/components/layout/persist", "store.namespace")
    @js.native
    def namespace(namespace: String): StoreAPI = js.native
    @JSImport("@storybook/ui/dist/components/layout/persist", "store.namespace")
    @js.native
    def namespace_true(namespace: String, noSession: `true`): StoreAPI = js.native
    
    @JSImport("@storybook/ui/dist/components/layout/persist", "store.page")
    @js.native
    val page: StoreAPI = js.native
    
    @JSImport("@storybook/ui/dist/components/layout/persist", "store.remove")
    @js.native
    def remove(key: js.Any): js.Any = js.native
    @JSImport("@storybook/ui/dist/components/layout/persist", "store.remove")
    @js.native
    def remove(key: js.Any, alt: js.Any): js.Any = js.native
    
    @JSImport("@storybook/ui/dist/components/layout/persist", "store.session")
    @js.native
    val session: StoreAPI = js.native
    
    @JSImport("@storybook/ui/dist/components/layout/persist", "store.set")
    @js.native
    def set(key: js.Any, data: js.Any): js.Any = js.native
    @JSImport("@storybook/ui/dist/components/layout/persist", "store.set")
    @js.native
    def set(key: js.Any, data: js.Any, overwrite: Boolean): js.Any = js.native
    
    @JSImport("@storybook/ui/dist/components/layout/persist", "store.setAll")
    @js.native
    def setAll(data: js.Object): StoredData = js.native
    @JSImport("@storybook/ui/dist/components/layout/persist", "store.setAll")
    @js.native
    def setAll(data: js.Object, overwrite: Boolean): StoredData = js.native
    
    @JSImport("@storybook/ui/dist/components/layout/persist", "store.size")
    @js.native
    def size(): Double = js.native
    
    @JSImport("@storybook/ui/dist/components/layout/persist", "store.transact")
    @js.native
    def transact(key: js.Any, fn: js.Function1[/* data */ js.Any, _]): StoreAPI = js.native
    @JSImport("@storybook/ui/dist/components/layout/persist", "store.transact")
    @js.native
    def transact(key: js.Any, fn: js.Function1[/* data */ js.Any, _], alt: js.Any): StoreAPI = js.native
  }
}
