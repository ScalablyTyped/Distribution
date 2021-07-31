package typings.simpleUrlCache

import typings.simpleUrlCache.mod.privateN.CacheCategory
import typings.simpleUrlCache.mod.privateN.CacheStorage
import typings.simpleUrlCache.mod.privateN.StorageConfig
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("simple-url-cache", "CacheEngine")
  @js.native
  class CacheEngine protected () extends StObject {
    def this(storageConfig: FileStorageConfig, cacheRules: CacheRules) = this()
    def this(storageConfig: RedisStorageConfig, cacheRules: CacheRules) = this()
    
    def url(url: String): FileStorage = js.native
    @JSName("url")
    def url_RedisStorage(url: String): RedisStorage = js.native
  }
  
  @JSImport("simple-url-cache", "FileStorage")
  @js.native
  class FileStorage protected ()
    extends StObject
       with CacheCategory
       with CacheStorage {
    def this(_url: String, _storageConfig: FileStorageConfig, _regexRules: CacheRules) = this()
    
    /* CompleteClass */
    /* private */ override def getCacheCategory(): String = js.native
    
    /* CompleteClass */
    override def getCategory(): String = js.native
    
    /* CompleteClass */
    override def getCurrentUrl(): String = js.native
    
    /* CompleteClass */
    /* private */ override def getRegexTest(u: RegexRule): Boolean = js.native
  }
  
  @JSImport("simple-url-cache", "RedisStorage")
  @js.native
  class RedisStorage protected ()
    extends StObject
       with CacheCategory
       with CacheStorage {
    def this(_url: String, _storageConfig: RedisStorageConfig, _regexRules: CacheRules) = this()
    
    /* CompleteClass */
    /* private */ override def getCacheCategory(): String = js.native
    
    /* CompleteClass */
    override def getCategory(): String = js.native
    
    /* CompleteClass */
    override def getCurrentUrl(): String = js.native
    
    /* CompleteClass */
    /* private */ override def getRegexTest(u: RegexRule): Boolean = js.native
  }
  
  trait CacheRules extends StObject {
    
    var default: String
    
    var cacheAlways: js.Array[RegexRule]
    
    var cacheMaxAge: js.Array[MaxAgeRegexRule]
    
    var cacheNever: js.Array[RegexRule]
  }
  object CacheRules {
    
    @scala.inline
    def apply(
      cacheAlways: js.Array[RegexRule],
      cacheMaxAge: js.Array[MaxAgeRegexRule],
      cacheNever: js.Array[RegexRule],
      default: String
    ): CacheRules = {
      val __obj = js.Dynamic.literal(cacheAlways = cacheAlways.asInstanceOf[js.Any], cacheMaxAge = cacheMaxAge.asInstanceOf[js.Any], cacheNever = cacheNever.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheRules]
    }
    
    @scala.inline
    implicit class CacheRulesMutableBuilder[Self <: CacheRules] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheAlways(value: js.Array[RegexRule]): Self = StObject.set(x, "cacheAlways", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheAlwaysVarargs(value: RegexRule*): Self = StObject.set(x, "cacheAlways", js.Array(value :_*))
      
      @scala.inline
      def setCacheMaxAge(value: js.Array[MaxAgeRegexRule]): Self = StObject.set(x, "cacheMaxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheMaxAgeVarargs(value: MaxAgeRegexRule*): Self = StObject.set(x, "cacheMaxAge", js.Array(value :_*))
      
      @scala.inline
      def setCacheNever(value: js.Array[RegexRule]): Self = StObject.set(x, "cacheNever", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheNeverVarargs(value: RegexRule*): Self = StObject.set(x, "cacheNever", js.Array(value :_*))
      
      @scala.inline
      def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileStorageConfig
    extends StObject
       with StorageConfig {
    
    var dir: String
  }
  object FileStorageConfig {
    
    @scala.inline
    def apply(dir: String, `type`: String): FileStorageConfig = {
      val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileStorageConfig]
    }
    
    @scala.inline
    implicit class FileStorageConfigMutableBuilder[Self <: FileStorageConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    }
  }
  
  trait MaxAgeRegexRule
    extends StObject
       with RegexRule {
    
    var maxAge: Double
  }
  object MaxAgeRegexRule {
    
    @scala.inline
    def apply(maxAge: Double, regex: RegExp): MaxAgeRegexRule = {
      val __obj = js.Dynamic.literal(maxAge = maxAge.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaxAgeRegexRule]
    }
    
    @scala.inline
    implicit class MaxAgeRegexRuleMutableBuilder[Self <: MaxAgeRegexRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    }
  }
  
  trait RedisStorageConfig
    extends StObject
       with StorageConfig {
    
    var db: js.UndefOr[String] = js.undefined
    
    var host: String
    
    var password: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var port: Double
    
    var socket_keepalive: js.UndefOr[Boolean] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object RedisStorageConfig {
    
    @scala.inline
    def apply(host: String, port: Double, `type`: String): RedisStorageConfig = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RedisStorageConfig]
    }
    
    @scala.inline
    implicit class RedisStorageConfigMutableBuilder[Self <: RedisStorageConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDb(value: String): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbUndefined: Self = StObject.set(x, "db", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocket_keepalive(value: Boolean): Self = StObject.set(x, "socket_keepalive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocket_keepaliveUndefined: Self = StObject.set(x, "socket_keepalive", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait RegexRule extends StObject {
    
    var regex: RegExp
  }
  object RegexRule {
    
    @scala.inline
    def apply(regex: RegExp): RegexRule = {
      val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegexRule]
    }
    
    @scala.inline
    implicit class RegexRuleMutableBuilder[Self <: RegexRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegex(value: RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    }
  }
  
  object privateN {
    
    trait CacheCategory extends StObject {
      
      /* private */ def getCacheCategory(): String
      
      def getCategory(): String
      
      def getCurrentUrl(): String
      
      /* private */ def getRegexTest(u: RegexRule): Boolean
    }
    object CacheCategory {
      
      @scala.inline
      def apply(
        getCacheCategory: () => String,
        getCategory: () => String,
        getCurrentUrl: () => String,
        getRegexTest: RegexRule => Boolean
      ): CacheCategory = {
        val __obj = js.Dynamic.literal(getCacheCategory = js.Any.fromFunction0(getCacheCategory), getCategory = js.Any.fromFunction0(getCategory), getCurrentUrl = js.Any.fromFunction0(getCurrentUrl), getRegexTest = js.Any.fromFunction1(getRegexTest))
        __obj.asInstanceOf[CacheCategory]
      }
      
      @scala.inline
      implicit class CacheCategoryMutableBuilder[Self <: CacheCategory] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetCacheCategory(value: () => String): Self = StObject.set(x, "getCacheCategory", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetCategory(value: () => String): Self = StObject.set(x, "getCategory", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetCurrentUrl(value: () => String): Self = StObject.set(x, "getCurrentUrl", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetRegexTest(value: RegexRule => Boolean): Self = StObject.set(x, "getRegexTest", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait CacheStorage extends StObject {
      
      def cache(html: String): js.Promise[Boolean] = js.native
      def cache(html: String, force: Boolean): js.Promise[Boolean] = js.native
      
      def destroy(): Unit = js.native
      
      def getUrl(): js.Promise[String] = js.native
      
      def isCached(): js.Promise[Boolean] = js.native
      
      def removeUrl(): js.Promise[Boolean] = js.native
    }
    
    trait StorageConfig extends StObject {
      
      var `type`: String
    }
    object StorageConfig {
      
      @scala.inline
      def apply(`type`: String): StorageConfig = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[StorageConfig]
      }
      
      @scala.inline
      implicit class StorageConfigMutableBuilder[Self <: StorageConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
  }
}
