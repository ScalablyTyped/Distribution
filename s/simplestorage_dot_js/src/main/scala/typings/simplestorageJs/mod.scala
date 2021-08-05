package typings.simplestorageJs

import org.scalablytyped.runtime.Shortcut
import typings.simplestorageJs.mod.simplestoragejs.SimpleStorage
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
    
    trait SetOptions extends StObject {
      
      /**
        * Sets the time-to-live (TTL) value in milliseconds for the given key/value.
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
      def deleteKey(key: String): Boolean | Error = js.native
      
      /**
        * Clear all values.
        * Returns <code>true</code> if storage was flushed or <code>{@link Error}</code> object if storage was not flushed because of an error.
        * @see https://github.com/andris9/simpleStorage#flush
        */
      def flush(): Boolean | Error = js.native
      
      /**
        * Retrieve a value from local storage.
        * Returns the value for a key or undefined if the key was not found.
        * @param key The key to be retrieved.
        * @see https://github.com/andris9/simpleStorage#getkey
        */
      def get(key: String): js.Any = js.native
      
      /**
        * Retrieve remaining milliseconds for a key with TTL.
        * Returns the finite number of remaining milliseconds, <code>Infinity</code> if TTL is not set for the selected key or <code>false</code> if the selected key does not exist or is expired.
        * @param key The key to be checked.
        * @see https://github.com/andris9/simpleStorage#getttlkey
        */
      def getTTL(key: String): Double | Boolean = js.native
      
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
      def index(): js.Array[String] | Boolean = js.native
      
      /**
        * Store or update a value in local storage.
        * Returns <code>true</code> if value was stored, <code>false</code> if value was not stored or <code>{@link Error}</code> object if value was not stored because of an error.
        * @param key The key for the value.
        * @param value Value to be stored (can be any JSONeable value).
        * @param [options] Optional options object.
        * @see https://github.com/andris9/simpleStorage#setkey-value-options
        */
      def set(key: String, value: js.Any): Boolean | Error = js.native
      def set(key: String, value: js.Any, options: SetOptions): Boolean | Error = js.native
      
      /**
        * Set a millisecond timeout. When the timeout is reached, the key is removed automatically from local storage.
        * Returns <code>true</code> if ttl was set, <code>false</code> if value was not found or <code>{@link Error}</code> object if ttl was not set because of an error.
        * @param key The key to be updated.
        * @param ttl Timeout in milliseconds. If the value is 0, timeout is cleared from the key.
        * @see https://github.com/andris9/simpleStorage#setttlkey-ttl
        */
      def setTTL(key: String, ttl: Double): Boolean | Error = js.native
      
      /**
        * Get used storage in symbol count.
        * @see https://github.com/andris9/simpleStorage#storagesize
        */
      def storageSize(): Double = js.native
      
      var version: String = js.native
    }
  }
}
