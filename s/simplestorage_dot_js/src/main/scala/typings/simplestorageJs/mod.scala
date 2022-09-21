package typings.simplestorageJs

import org.scalablytyped.runtime.Shortcut
import typings.simplestorageJs.mod.simplestoragejs.SimpleStorage
import typings.simplestorageJs.simplestorageJsBooleans.`false`
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("simplestorage.js", JSImport.Namespace)
  @js.native
  val ^ : SimpleStorage = js.native
  
  type _To = SimpleStorage
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: SimpleStorage = ^
  
  object simplestoragejs {
    
    /**
      * @see https://github.com/andris9/simpleStorage#setkey-value-options
      */
    trait SetOptions extends StObject {
      
      /**
        * Sets the time-to-live (TTL) value in milliseconds for the given key/value.
        * @default 0
        */
      var TTL: js.UndefOr[Double] = js.undefined
    }
    object SetOptions {
      
      inline def apply(): SetOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SetOptions]
      }
      
      extension [Self <: SetOptions](x: Self) {
        
        inline def setTTL(value: Double): Self = StObject.set(x, "TTL", value.asInstanceOf[js.Any])
        
        inline def setTTLUndefined: Self = StObject.set(x, "TTL", js.undefined)
      }
    }
    
    /**
      * {@link simpleStorage} API is a subset of {@link http://www.jstorage.info/|jStorage} with slight modifications,
      * so for most cases it should work out of the box if you are converting from {@link http://www.jstorage.info/|jStorage}.
      * Main difference is between return values - if an action failed because of an error (storage full, storage not available, invalid data used etc.),
      * you get the error object as the return value. {@link http://www.jstorage.info/|jStorage} never indicated anything if an error occurred.
      * @see https://github.com/andris9/simpleStorage#usage
      */
    @js.native
    trait SimpleStorage extends StObject {
      
      /**
        * Check if local storage can be used.
        * Returns <code>true</code> if storage is available.
        * @see https://github.com/andris9/simpleStorage#canuse
        */
      def canUse(): Boolean = js.native
      
      /**
        * Removes a value from local storage.
        * Returns <code>true</code> if the value was deleted, <code>false</code> if the value was not found or <code>{@link Error}</code> object if value was not deleted because of an error.
        * @param key The key to be deleted.
        * @see https://github.com/andris9/simpleStorage#deletekeykey
        */
      def deleteKey(key: String): Boolean | SimpleStorageError = js.native
      
      /**
        * Clear all values.
        * Returns <code>true</code> if storage was flushed or <code>{@link Error}</code> object if storage was not flushed because of an error.
        * @see https://github.com/andris9/simpleStorage#flush
        */
      def flush(): Boolean | SimpleStorageError = js.native
      
      /**
        * Retrieve a value from local storage.
        * Returns the value for a key or undefined if the key was not found.
        * @param key The key to be retrieved.
        * @see https://github.com/andris9/simpleStorage#getkey
        */
      def get(key: String): Any = js.native
      
      /**
        * Retrieve remaining milliseconds for a key with TTL.
        * Returns the finite number of remaining milliseconds, <code>Infinity</code> if TTL is not set for the selected key or <code>false</code> if the selected key does not exist or is expired.
        * @param key The key to be checked.
        * @see https://github.com/andris9/simpleStorage#getttlkey
        */
      def getTTL(key: String): Double | `false` = js.native
      
      /**
        * Checks if there's a value with the given key in the local storage.
        * Returns <code>true</code> if the given key exists, <code>false</code> otherwise.
        * @param key The key to be checked.
        * @see https://github.com/andris9/simpleStorage#haskeykey
        */
      def hasKey(key: String): Boolean = js.native
      
      /**
        * Retrieve all used keys as an array.
        * Returns an array of keys.
        * @see https://github.com/andris9/simpleStorage#index
        */
      def index(): js.Array[String] | `false` = js.native
      
      /**
        * Store or update a value in local storage.
        * Returns <code>true</code> if value was stored, <code>false</code> if value was not stored or <code>{@link Error}</code> object if value was not stored because of an error.
        * @param key The key for the value.
        * @param value Value to be stored (can be any JSONeable value).
        * @param [options] Optional options object.
        * @see https://github.com/andris9/simpleStorage#setkey-value-options
        */
      def set(key: String): Boolean | SimpleStorageError = js.native
      def set(key: String, value: Any): Boolean | SimpleStorageError = js.native
      def set(key: String, value: Any, options: SetOptions): Boolean | SimpleStorageError = js.native
      def set(key: String, value: Unit, options: SetOptions): Boolean | SimpleStorageError = js.native
      
      /**
        * Set a millisecond timeout. When the timeout is reached, the key is removed automatically from local storage.
        * Returns <code>true</code> if ttl was set, <code>false</code> if value was not found or <code>{@link Error}</code> object if ttl was not set because of an error.
        * @param key The key to be updated.
        * @param ttl Timeout in milliseconds. If the value is 0, timeout is cleared from the key.
        * @see https://github.com/andris9/simpleStorage#setttlkey-ttl
        */
      def setTTL(key: String, ttl: Double): Boolean | SimpleStorageError = js.native
      
      var status: js.UndefOr[StatusCode | String | Double] = js.native
      
      /**
        * Get used storage in symbol count.
        * @see https://github.com/andris9/simpleStorage#storagesize
        */
      def storageSize(): Double = js.native
      
      var version: /* "0.2.1" */ String = js.native
    }
    
    trait SimpleStorageError
      extends StObject
         with Error {
      
      var code: js.UndefOr[StatusCode] = js.undefined
    }
    object SimpleStorageError {
      
      inline def apply(message: String, name: String): SimpleStorageError = {
        val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[SimpleStorageError]
      }
      
      extension [Self <: SimpleStorageError](x: Self) {
        
        inline def setCode(value: StatusCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
        
        inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.simplestorageJs.simplestorageJsStrings.OK
      - typings.simplestorageJs.simplestorageJsStrings.LS_NOT_AVAILABLE
      - typings.simplestorageJs.simplestorageJsStrings.LS_DISABLED
      - typings.simplestorageJs.simplestorageJsStrings.LS_QUOTA_EXCEEDED
    */
    trait StatusCode extends StObject
    object StatusCode {
      
      inline def LS_DISABLED: typings.simplestorageJs.simplestorageJsStrings.LS_DISABLED = "LS_DISABLED".asInstanceOf[typings.simplestorageJs.simplestorageJsStrings.LS_DISABLED]
      
      inline def LS_NOT_AVAILABLE: typings.simplestorageJs.simplestorageJsStrings.LS_NOT_AVAILABLE = "LS_NOT_AVAILABLE".asInstanceOf[typings.simplestorageJs.simplestorageJsStrings.LS_NOT_AVAILABLE]
      
      inline def LS_QUOTA_EXCEEDED: typings.simplestorageJs.simplestorageJsStrings.LS_QUOTA_EXCEEDED = "LS_QUOTA_EXCEEDED".asInstanceOf[typings.simplestorageJs.simplestorageJsStrings.LS_QUOTA_EXCEEDED]
      
      inline def OK: typings.simplestorageJs.simplestorageJsStrings.OK = "OK".asInstanceOf[typings.simplestorageJs.simplestorageJsStrings.OK]
    }
  }
}
