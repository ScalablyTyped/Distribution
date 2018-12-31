package typings
package simplestorageDotJsLib.simplestorageDotJsMod.simplestoragejsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleStorage extends js.Object {
  var version: java.lang.String = js.native
  /**
    * Check if local storage can be used.
    * Returns <code>true</code> if storage is available.
    * @see https://github.com/andris9/simpleStorage#canuse
    */
  def canUse(): scala.Boolean = js.native
  /**
    * Removes a value from local storage.
    * Returns <code>true</code> if the value was deleted, <code>false</code> if the value was not found or <code>{@link Error}</code> object if value was not deleted because of an error.
    * @param key The key to be deleted.
    * @see https://github.com/andris9/simpleStorage#deletekeykey
    */
  def deleteKey(key: java.lang.String): scala.Boolean | stdLib.Error = js.native
  /**
    * Clear all values.
    * Returns <code>true</code> if storage was flushed or <code>{@link Error}</code> object if storage was not flushed because of an error.
    * @see https://github.com/andris9/simpleStorage#flush
    */
  def flush(): scala.Boolean | stdLib.Error = js.native
  /**
    * Retrieve a value from local storage.
    * Returns the value for a key or undefined if the key was not found.
    * @param key The key to be retrieved.
    * @see https://github.com/andris9/simpleStorage#getkey
    */
  def get(key: java.lang.String): js.Any = js.native
  /**
    * Retrieve remaining milliseconds for a key with TTL.
    * Returns the finite number of remaining milliseconds, <code>Infinity</code> if TTL is not set for the selected key or <code>false</code> if the selected key does not exist or is expired.
    * @param key The key to be checked.
    * @see https://github.com/andris9/simpleStorage#getttlkey
    */
  def getTTL(key: java.lang.String): scala.Double | scala.Boolean = js.native
  /**
    * Checks if there's a value with the given key in the local storage.
    * Returns <code>true</code> if the given key exists, <code>false</code> otherwise.
    * @param key The key to be checked.
    * @see https://github.com/andris9/simpleStorage#haskeykey
    */
  def hasKey(key: java.lang.String): scala.Boolean = js.native
  /**
    * Retrieve all used keys as an array.
    * Returns an array of keys.
    * @see https://github.com/andris9/simpleStorage#index
    */
  def index(): js.Array[java.lang.String] | scala.Boolean = js.native
  /**
    * Store or update a value in local storage.
    * Returns <code>true</code> if value was stored, <code>false</code> if value was not stored or <code>{@link Error}</code> object if value was not stored because of an error.
    * @param key The key for the value.
    * @param value Value to be stored (can be any JSONeable value).
    * @param [options] Optional options object.
    * @see https://github.com/andris9/simpleStorage#setkey-value-options
    */
  def set(key: java.lang.String, value: js.Any): scala.Boolean | stdLib.Error = js.native
  def set(key: java.lang.String, value: js.Any, options: SetOptions): scala.Boolean | stdLib.Error = js.native
  /**
    * Set a millisecond timeout. When the timeout is reached, the key is removed automatically from local storage.
    * Returns <code>true</code> if ttl was set, <code>false</code> if value was not found or <code>{@link Error}</code> object if ttl was not set because of an error.
    * @param key The key to be updated.
    * @param ttl Timeout in milliseconds. If the value is 0, timeout is cleared from the key.
    * @see https://github.com/andris9/simpleStorage#setttlkey-ttl
    */
  def setTTL(key: java.lang.String, ttl: scala.Double): scala.Boolean | stdLib.Error = js.native
  /**
    * Get used storage in symbol count.
    * @see https://github.com/andris9/simpleStorage#storagesize
    */
  def storageSize(): scala.Double = js.native
}

