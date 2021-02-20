package typings.reactNativeCommunityAsyncStorage

import org.scalablytyped.runtime.Shortcut
import typings.reactNativeCommunityAsyncStorage.anon.GetItem
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@react-native-community/async-storage", JSImport.Default)
  @js.native
  val default: AsyncStorageStatic = js.native
  
  @JSImport("@react-native-community/async-storage", "useAsyncStorage")
  @js.native
  def useAsyncStorage(key: String): GetItem = js.native
  
  @js.native
  trait AsyncStorageStatic extends StObject {
    
    /**
      * Erases all AsyncStorage for all clients, libraries, etc. You probably don't want to call this.
      * Use removeItem or multiRemove to clear only your own keys instead.
      */
    def clear(): js.Promise[Unit] = js.native
    def clear(callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): js.Promise[Unit] = js.native
    
    /**
      * Gets all keys known to the app, for all callers, libraries, etc
      */
    def getAllKeys(): js.Promise[js.Array[String]] = js.native
    def getAllKeys(
      callback: js.Function2[/* error */ js.UndefOr[Error], /* keys */ js.UndefOr[js.Array[String]], Unit]
    ): js.Promise[js.Array[String]] = js.native
    
    /**
      * Fetches key and passes the result to callback, along with an Error if there is any.
      */
    def getItem(key: String): js.Promise[String | Null] = js.native
    def getItem(
      key: String,
      callback: js.Function2[/* error */ js.UndefOr[Error], /* result */ js.UndefOr[String], Unit]
    ): js.Promise[String | Null] = js.native
    
    /**
      * Merges existing value with input value, assuming they are stringified json. Returns a Promise object.
      * Not supported by all native implementation
      */
    def mergeItem(key: String, value: String): js.Promise[Unit] = js.native
    def mergeItem(key: String, value: String, callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): js.Promise[Unit] = js.native
    
    /**
      * multiGet invokes callback with an array of key-value pair arrays that matches the input format of multiSet
      */
    def multiGet(keys: js.Array[String]): js.Promise[js.Array[js.Tuple2[String, String | Null]]] = js.native
    def multiGet(
      keys: js.Array[String],
      callback: js.Function2[
          /* errors */ js.UndefOr[js.Array[Error]], 
          /* result */ js.UndefOr[js.Array[js.Tuple2[String, String | Null]]], 
          Unit
        ]
    ): js.Promise[js.Array[js.Tuple2[String, String | Null]]] = js.native
    
    /**
      * Merges existing values with input values, assuming they are stringified json.
      * Returns a Promise object.
      *
      * Not supported by all native implementations.
      */
    def multiMerge(keyValuePairs: js.Array[js.Array[String]]): js.Promise[Unit] = js.native
    def multiMerge(
      keyValuePairs: js.Array[js.Array[String]],
      callback: js.Function1[/* errors */ js.UndefOr[js.Array[Error]], Unit]
    ): js.Promise[Unit] = js.native
    
    /**
      * Delete all the keys in the keys array.
      */
    def multiRemove(keys: js.Array[String]): js.Promise[Unit] = js.native
    def multiRemove(keys: js.Array[String], callback: js.Function1[/* errors */ js.UndefOr[js.Array[Error]], Unit]): js.Promise[Unit] = js.native
    
    /**
      * multiSet and multiMerge take arrays of key-value array pairs that match the output of multiGet,
      *
      * multiSet([['k1', 'val1'], ['k2', 'val2']], cb);
      */
    def multiSet(keyValuePairs: js.Array[js.Array[String]]): js.Promise[Unit] = js.native
    def multiSet(
      keyValuePairs: js.Array[js.Array[String]],
      callback: js.Function1[/* errors */ js.UndefOr[js.Array[Error]], Unit]
    ): js.Promise[Unit] = js.native
    
    def removeItem(key: String): js.Promise[Unit] = js.native
    def removeItem(key: String, callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): js.Promise[Unit] = js.native
    
    /**
      * Sets value for key and calls callback on completion, along with an Error if there is any
      */
    def setItem(key: String, value: String): js.Promise[Unit] = js.native
    def setItem(key: String, value: String, callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): js.Promise[Unit] = js.native
  }
  
  type _To = AsyncStorageStatic
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: AsyncStorageStatic = default
}
