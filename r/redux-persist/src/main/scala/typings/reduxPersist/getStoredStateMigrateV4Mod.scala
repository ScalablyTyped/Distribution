package typings.reduxPersist

import typings.reduxPersist.typesMod.PersistConfig
import typings.reduxPersist.typesMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getStoredStateMigrateV4Mod {
  
  @JSImport("redux-persist/es/integration/getStoredStateMigrateV4", JSImport.Default)
  @js.native
  def default(v4Config: V4Config): js.Function1[/* config */ PersistConfig[_, _, _, _], js.Promise[js.UndefOr[js.Object]]] = js.native
  
  @js.native
  trait V4Config extends StObject {
    
    var blacklist: js.UndefOr[js.Array[String]] = js.native
    
    var keyPrefix: js.UndefOr[String] = js.native
    
    var storage: js.UndefOr[V4Storage] = js.native
    
    var transforms: js.UndefOr[js.Array[Transform[_, _, _, _]]] = js.native
    
    var whitelist: js.UndefOr[js.Array[String]] = js.native
  }
  object V4Config {
    
    @scala.inline
    def apply(): V4Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[V4Config]
    }
    
    @scala.inline
    implicit class V4ConfigMutableBuilder[Self <: V4Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlacklist(value: js.Array[String]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
      
      @scala.inline
      def setBlacklistVarargs(value: String*): Self = StObject.set(x, "blacklist", js.Array(value :_*))
      
      @scala.inline
      def setKeyPrefix(value: String): Self = StObject.set(x, "keyPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyPrefixUndefined: Self = StObject.set(x, "keyPrefix", js.undefined)
      
      @scala.inline
      def setStorage(value: V4Storage): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
      
      @scala.inline
      def setTransforms(value: js.Array[Transform[_, _, _, _]]): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformsUndefined: Self = StObject.set(x, "transforms", js.undefined)
      
      @scala.inline
      def setTransformsVarargs(value: (Transform[js.Any, js.Any, js.Any, js.Any])*): Self = StObject.set(x, "transforms", js.Array(value :_*))
      
      @scala.inline
      def setWhitelist(value: js.Array[String]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
      
      @scala.inline
      def setWhitelistVarargs(value: String*): Self = StObject.set(x, "whitelist", js.Array(value :_*))
    }
  }
  
  @js.native
  trait V4Storage extends StObject {
    
    var getAllKeys: js.UndefOr[
        js.Function1[/* cb */ js.Function2[/* err */ js.Any, /* allKeys */ js.Array[String], _], _]
      ] = js.native
    
    var getItem: js.UndefOr[
        js.Function1[
          /* cb */ js.Function2[/* err */ js.Any, /* serialized */ js.UndefOr[String | Null], _], 
          _
        ]
      ] = js.native
    
    var keys: js.UndefOr[
        js.Function1[/* cb */ js.Function2[/* err */ js.Any, /* allKeys */ js.Array[String], _], _]
      ] = js.native
  }
  object V4Storage {
    
    @scala.inline
    def apply(): V4Storage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[V4Storage]
    }
    
    @scala.inline
    implicit class V4StorageMutableBuilder[Self <: V4Storage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetAllKeys(value: /* cb */ js.Function2[/* err */ js.Any, /* allKeys */ js.Array[String], _] => _): Self = StObject.set(x, "getAllKeys", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetAllKeysUndefined: Self = StObject.set(x, "getAllKeys", js.undefined)
      
      @scala.inline
      def setGetItem(value: /* cb */ js.Function2[/* err */ js.Any, /* serialized */ js.UndefOr[String | Null], _] => _): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetItemUndefined: Self = StObject.set(x, "getItem", js.undefined)
      
      @scala.inline
      def setKeys(value: /* cb */ js.Function2[/* err */ js.Any, /* allKeys */ js.Array[String], _] => _): Self = StObject.set(x, "keys", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    }
  }
}
