package typings.reduxPersist

import typings.reduxPersist.esTypesMod.PersistConfig
import typings.reduxPersist.esTypesMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esIntegrationGetStoredStateMigrateV4Mod {
  
  @JSImport("redux-persist/es/integration/getStoredStateMigrateV4", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(v4Config: V4Config): js.Function1[/* config */ PersistConfig[Any, Any, Any, Any], js.Promise[js.UndefOr[js.Object]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(v4Config.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* config */ PersistConfig[Any, Any, Any, Any], js.Promise[js.UndefOr[js.Object]]]]
  
  trait V4Config extends StObject {
    
    var blacklist: js.UndefOr[js.Array[String]] = js.undefined
    
    var keyPrefix: js.UndefOr[String] = js.undefined
    
    var storage: js.UndefOr[V4Storage] = js.undefined
    
    var transforms: js.UndefOr[js.Array[Transform[Any, Any, Any, Any]]] = js.undefined
    
    var whitelist: js.UndefOr[js.Array[String]] = js.undefined
  }
  object V4Config {
    
    inline def apply(): V4Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[V4Config]
    }
    
    extension [Self <: V4Config](x: Self) {
      
      inline def setBlacklist(value: js.Array[String]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
      
      inline def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
      
      inline def setBlacklistVarargs(value: String*): Self = StObject.set(x, "blacklist", js.Array(value*))
      
      inline def setKeyPrefix(value: String): Self = StObject.set(x, "keyPrefix", value.asInstanceOf[js.Any])
      
      inline def setKeyPrefixUndefined: Self = StObject.set(x, "keyPrefix", js.undefined)
      
      inline def setStorage(value: V4Storage): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
      
      inline def setTransforms(value: js.Array[Transform[Any, Any, Any, Any]]): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
      
      inline def setTransformsUndefined: Self = StObject.set(x, "transforms", js.undefined)
      
      inline def setTransformsVarargs(value: (Transform[Any, Any, Any, Any])*): Self = StObject.set(x, "transforms", js.Array(value*))
      
      inline def setWhitelist(value: js.Array[String]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
      
      inline def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
      
      inline def setWhitelistVarargs(value: String*): Self = StObject.set(x, "whitelist", js.Array(value*))
    }
  }
  
  trait V4Storage extends StObject {
    
    var getAllKeys: js.UndefOr[
        js.Function1[/* cb */ js.Function2[/* err */ Any, /* allKeys */ js.Array[String], Any], Any]
      ] = js.undefined
    
    var getItem: js.UndefOr[
        js.Function1[
          /* cb */ js.Function2[/* err */ Any, /* serialized */ js.UndefOr[String | Null], Any], 
          Any
        ]
      ] = js.undefined
    
    var keys: js.UndefOr[
        js.Function1[/* cb */ js.Function2[/* err */ Any, /* allKeys */ js.Array[String], Any], Any]
      ] = js.undefined
  }
  object V4Storage {
    
    inline def apply(): V4Storage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[V4Storage]
    }
    
    extension [Self <: V4Storage](x: Self) {
      
      inline def setGetAllKeys(value: /* cb */ js.Function2[/* err */ Any, /* allKeys */ js.Array[String], Any] => Any): Self = StObject.set(x, "getAllKeys", js.Any.fromFunction1(value))
      
      inline def setGetAllKeysUndefined: Self = StObject.set(x, "getAllKeys", js.undefined)
      
      inline def setGetItem(
        value: /* cb */ js.Function2[/* err */ Any, /* serialized */ js.UndefOr[String | Null], Any] => Any
      ): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
      
      inline def setGetItemUndefined: Self = StObject.set(x, "getItem", js.undefined)
      
      inline def setKeys(value: /* cb */ js.Function2[/* err */ Any, /* allKeys */ js.Array[String], Any] => Any): Self = StObject.set(x, "keys", js.Any.fromFunction1(value))
      
      inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    }
  }
}
