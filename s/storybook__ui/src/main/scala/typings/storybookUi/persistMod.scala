package typings.storybookUi

import typings.store2.mod.StoreAPI
import typings.store2.mod.StoredData
import typings.storybookUi.storybookUiBooleans.`false`
import typings.storybookUi.storybookUiBooleans.`true`
import typings.storybookUi.storybookUiNumbers.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object persistMod {
  
  @JSImport("@storybook/ui/dist/components/layout/persist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def get(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Any]
  
  @JSImport("@storybook/ui/dist/components/layout/persist", "set")
  @js.native
  val set: (js.Function1[/* changes */ js.Any, Unit]) & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_lodash.Cancelable */ js.Any) = js.native
  
  object store {
    
    inline def apply(clearIfFalsy: `false`): StoreAPI = ^.asInstanceOf[js.Dynamic].apply(clearIfFalsy.asInstanceOf[js.Any]).asInstanceOf[StoreAPI]
    inline def apply(clearIfFalsy: `0`): StoreAPI = ^.asInstanceOf[js.Dynamic].apply(clearIfFalsy.asInstanceOf[js.Any]).asInstanceOf[StoreAPI]
    inline def apply(eachFn: js.Function2[/* key */ js.Any, /* data */ js.Any, `false` | js.Any]): StoredData = ^.asInstanceOf[js.Dynamic].apply(eachFn.asInstanceOf[js.Any]).asInstanceOf[StoredData]
    inline def apply(eachFn: js.Function2[/* key */ js.Any, /* data */ js.Any, `false` | js.Any], value: js.Any): StoredData = (^.asInstanceOf[js.Dynamic].apply(eachFn.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[StoredData]
    inline def apply(key: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def apply(key: js.Any, data: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def apply(key: js.Any, fn: js.Function1[/* data */ js.Any, js.Any]): StoreAPI = (^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[StoreAPI]
    inline def apply(key: js.Any, fn: js.Function1[/* data */ js.Any, js.Any], alt: js.Any): StoreAPI = (^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], alt.asInstanceOf[js.Any])).asInstanceOf[StoreAPI]
    inline def apply(obj: js.Object): StoredData = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[StoredData]
    
    @JSImport("@storybook/ui/dist/components/layout/persist", "store")
    @js.native
    val ^ : js.Any = js.native
    
    inline def add(key: js.Any, data: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    inline def area(
      id: String,
      area: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Storage */ js.Any
    ): StoreAPI = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(id.asInstanceOf[js.Any], area.asInstanceOf[js.Any])).asInstanceOf[StoreAPI]
    
    inline def clear(): StoreAPI = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[StoreAPI]
    
    inline def clearAll(): StoreAPI = ^.asInstanceOf[js.Dynamic].applyDynamic("clearAll")().asInstanceOf[StoreAPI]
    
    inline def each_false(callback: js.Function2[/* key */ js.Any, /* data */ js.Any, `false` | js.Any]): StoreAPI = ^.asInstanceOf[js.Dynamic].applyDynamic("each")(callback.asInstanceOf[js.Any]).asInstanceOf[StoreAPI]
    inline def each_false(callback: js.Function2[/* key */ js.Any, /* data */ js.Any, `false` | js.Any], value: js.Any): StoreAPI = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(callback.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[StoreAPI]
    
    inline def get(key: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def get(key: js.Any, alt: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any], alt.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    inline def getAll(): StoredData = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")().asInstanceOf[StoredData]
    inline def getAll(fillObj: StoredData): StoredData = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")(fillObj.asInstanceOf[js.Any]).asInstanceOf[StoredData]
    
    inline def has(key: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("has")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isFake(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFake")().asInstanceOf[Boolean]
    
    inline def keys(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")().asInstanceOf[js.Array[String]]
    inline def keys(fillList: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(fillList.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    @JSImport("@storybook/ui/dist/components/layout/persist", "store.local")
    @js.native
    val local: StoreAPI = js.native
    
    inline def namespace(namespace: String): StoreAPI = ^.asInstanceOf[js.Dynamic].applyDynamic("namespace")(namespace.asInstanceOf[js.Any]).asInstanceOf[StoreAPI]
    
    inline def namespace_true(namespace: String, noSession: `true`): StoreAPI = (^.asInstanceOf[js.Dynamic].applyDynamic("namespace")(namespace.asInstanceOf[js.Any], noSession.asInstanceOf[js.Any])).asInstanceOf[StoreAPI]
    
    @JSImport("@storybook/ui/dist/components/layout/persist", "store.page")
    @js.native
    val page: StoreAPI = js.native
    
    inline def remove(key: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(key.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def remove(key: js.Any, alt: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(key.asInstanceOf[js.Any], alt.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @JSImport("@storybook/ui/dist/components/layout/persist", "store.session")
    @js.native
    val session: StoreAPI = js.native
    
    inline def set(key: js.Any, data: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def set(key: js.Any, data: js.Any, overwrite: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], overwrite.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    inline def setAll(data: js.Object): StoredData = ^.asInstanceOf[js.Dynamic].applyDynamic("setAll")(data.asInstanceOf[js.Any]).asInstanceOf[StoredData]
    inline def setAll(data: js.Object, overwrite: Boolean): StoredData = (^.asInstanceOf[js.Dynamic].applyDynamic("setAll")(data.asInstanceOf[js.Any], overwrite.asInstanceOf[js.Any])).asInstanceOf[StoredData]
    
    inline def size(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("size")().asInstanceOf[Double]
    
    inline def transact(key: js.Any, fn: js.Function1[/* data */ js.Any, js.Any]): StoreAPI = (^.asInstanceOf[js.Dynamic].applyDynamic("transact")(key.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[StoreAPI]
    inline def transact(key: js.Any, fn: js.Function1[/* data */ js.Any, js.Any], alt: js.Any): StoreAPI = (^.asInstanceOf[js.Dynamic].applyDynamic("transact")(key.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], alt.asInstanceOf[js.Any])).asInstanceOf[StoreAPI]
  }
}
