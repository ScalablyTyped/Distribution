package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncStorageStatic extends js.Object {
  /**
    * Erases all AsyncStorage for all clients, libraries, etc. You probably don't want to call this.
    * Use removeItem or multiRemove to clear only your own keys instead.
    */
  def clear(): js.Promise[scala.Unit] = js.native
  def clear(callback: js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit]): js.Promise[scala.Unit] = js.native
  /**
    * Gets all keys known to the app, for all callers, libraries, etc
    */
  def getAllKeys(): js.Promise[js.Array[java.lang.String]] = js.native
  def getAllKeys(
    callback: js.Function2[
      /* error */ js.UndefOr[stdLib.Error], 
      /* keys */ js.UndefOr[js.Array[java.lang.String]], 
      scala.Unit
    ]
  ): js.Promise[js.Array[java.lang.String]] = js.native
  /**
    * Fetches key and passes the result to callback, along with an Error if there is any.
    */
  def getItem(key: java.lang.String): js.Promise[java.lang.String | scala.Null] = js.native
  def getItem(
    key: java.lang.String,
    callback: js.Function2[
      /* error */ js.UndefOr[stdLib.Error], 
      /* result */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): js.Promise[java.lang.String | scala.Null] = js.native
  /**
    * Merges existing value with input value, assuming they are stringified json. Returns a Promise object.
    * Not supported by all native implementation
    */
  def mergeItem(key: java.lang.String, value: java.lang.String): js.Promise[scala.Unit] = js.native
  def mergeItem(
    key: java.lang.String,
    value: java.lang.String,
    callback: js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit]
  ): js.Promise[scala.Unit] = js.native
  /**
    * multiGet invokes callback with an array of key-value pair arrays that matches the input format of multiSet
    */
  def multiGet(keys: js.Array[java.lang.String]): js.Promise[js.Array[js.Tuple2[java.lang.String, java.lang.String]]] = js.native
  def multiGet(
    keys: js.Array[java.lang.String],
    callback: js.Function2[
      /* errors */ js.UndefOr[js.Array[stdLib.Error]], 
      /* result */ js.UndefOr[js.Array[js.Tuple2[java.lang.String, java.lang.String]]], 
      scala.Unit
    ]
  ): js.Promise[js.Array[js.Tuple2[java.lang.String, java.lang.String]]] = js.native
  /**
    * Merges existing values with input values, assuming they are stringified json.
    * Returns a Promise object.
    *
    * Not supported by all native implementations.
    */
  def multiMerge(keyValuePairs: js.Array[js.Array[java.lang.String]]): js.Promise[scala.Unit] = js.native
  def multiMerge(
    keyValuePairs: js.Array[js.Array[java.lang.String]],
    callback: js.Function1[/* errors */ js.UndefOr[js.Array[stdLib.Error]], scala.Unit]
  ): js.Promise[scala.Unit] = js.native
  /**
    * Delete all the keys in the keys array.
    */
  def multiRemove(keys: js.Array[java.lang.String]): js.Promise[scala.Unit] = js.native
  def multiRemove(
    keys: js.Array[java.lang.String],
    callback: js.Function1[/* errors */ js.UndefOr[js.Array[stdLib.Error]], scala.Unit]
  ): js.Promise[scala.Unit] = js.native
  /**
    * multiSet and multiMerge take arrays of key-value array pairs that match the output of multiGet,
    *
    * multiSet([['k1', 'val1'], ['k2', 'val2']], cb);
    */
  def multiSet(keyValuePairs: js.Array[js.Array[java.lang.String]]): js.Promise[scala.Unit] = js.native
  def multiSet(
    keyValuePairs: js.Array[js.Array[java.lang.String]],
    callback: js.Function1[/* errors */ js.UndefOr[js.Array[stdLib.Error]], scala.Unit]
  ): js.Promise[scala.Unit] = js.native
  def removeItem(key: java.lang.String): js.Promise[scala.Unit] = js.native
  def removeItem(key: java.lang.String, callback: js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit]): js.Promise[scala.Unit] = js.native
  /**
    * Sets value for key and calls callback on completion, along with an Error if there is any
    */
  def setItem(key: java.lang.String, value: java.lang.String): js.Promise[scala.Unit] = js.native
  def setItem(
    key: java.lang.String,
    value: java.lang.String,
    callback: js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit]
  ): js.Promise[scala.Unit] = js.native
}

