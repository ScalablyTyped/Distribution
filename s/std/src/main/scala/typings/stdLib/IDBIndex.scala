package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDBIndex extends js.Object {
  val keyPath: java.lang.String | js.Array[java.lang.String] = js.native
  val multiEntry: scala.Boolean = js.native
  /**
       * Updates the name of the store to newName.
       * Throws an "InvalidStateError" DOMException if not called within an upgrade
       * transaction.
       */
  var name: java.lang.String = js.native
  /**
       * Returns the IDBObjectStore the index belongs to.
       */
  val objectStore: IDBObjectStore = js.native
  val unique: scala.Boolean = js.native
  /**
       * Retrieves the number of records matching the given key or key range in query.
       * If successful, request's result will be the
       * count.
       */
  def count(): IDBRequest[scala.Double] = js.native
  /**
       * Retrieves the number of records matching the given key or key range in query.
       * If successful, request's result will be the
       * count.
       */
  def count(key: IDBKeyRange): IDBRequest[scala.Double] = js.native
  /**
       * Retrieves the number of records matching the given key or key range in query.
       * If successful, request's result will be the
       * count.
       */
  def count(key: IDBValidKey): IDBRequest[scala.Double] = js.native
  /**
       * Retrieves the value of the first record matching the
       * given key or key range in query.
       * If successful, request's result will be the value, or undefined if there was no matching record.
       */
  def get(key: IDBKeyRange): IDBRequest[js.UndefOr[_]] = js.native
  /**
       * Retrieves the value of the first record matching the
       * given key or key range in query.
       * If successful, request's result will be the value, or undefined if there was no matching record.
       */
  def get(key: IDBValidKey): IDBRequest[js.UndefOr[_]] = js.native
  /**
       * Retrieves the values of the records matching the given key or key range in query (up to count if given).
       * If successful, request's result will be an Array of the values.
       */
  def getAll(): IDBRequest[js.Array[_]] = js.native
  /**
       * Retrieves the values of the records matching the given key or key range in query (up to count if given).
       * If successful, request's result will be an Array of the values.
       */
  def getAll(query: IDBKeyRange): IDBRequest[js.Array[_]] = js.native
  /**
       * Retrieves the values of the records matching the given key or key range in query (up to count if given).
       * If successful, request's result will be an Array of the values.
       */
  def getAll(query: IDBKeyRange, count: scala.Double): IDBRequest[js.Array[_]] = js.native
  /**
       * Retrieves the values of the records matching the given key or key range in query (up to count if given).
       * If successful, request's result will be an Array of the values.
       */
  def getAll(query: IDBValidKey): IDBRequest[js.Array[_]] = js.native
  /**
       * Retrieves the values of the records matching the given key or key range in query (up to count if given).
       * If successful, request's result will be an Array of the values.
       */
  def getAll(query: IDBValidKey, count: scala.Double): IDBRequest[js.Array[_]] = js.native
  /**
       * Retrieves the keys of records matching the given key or key range in query (up to count if given).
       * If successful, request's result will be an Array of the keys.
       */
  def getAllKeys(): IDBRequest[js.Array[IDBValidKey]] = js.native
  /**
       * Retrieves the keys of records matching the given key or key range in query (up to count if given).
       * If successful, request's result will be an Array of the keys.
       */
  def getAllKeys(query: IDBKeyRange): IDBRequest[js.Array[IDBValidKey]] = js.native
  /**
       * Retrieves the keys of records matching the given key or key range in query (up to count if given).
       * If successful, request's result will be an Array of the keys.
       */
  def getAllKeys(query: IDBKeyRange, count: scala.Double): IDBRequest[js.Array[IDBValidKey]] = js.native
  /**
       * Retrieves the keys of records matching the given key or key range in query (up to count if given).
       * If successful, request's result will be an Array of the keys.
       */
  def getAllKeys(query: IDBValidKey): IDBRequest[js.Array[IDBValidKey]] = js.native
  /**
       * Retrieves the keys of records matching the given key or key range in query (up to count if given).
       * If successful, request's result will be an Array of the keys.
       */
  def getAllKeys(query: IDBValidKey, count: scala.Double): IDBRequest[js.Array[IDBValidKey]] = js.native
  /**
       * Retrieves the key of the first record matching the
       * given key or key range in query.
       * If successful, request's result will be the key, or undefined if there was no matching record.
       */
  def getKey(key: IDBKeyRange): IDBRequest[js.UndefOr[IDBValidKey]] = js.native
  /**
       * Retrieves the key of the first record matching the
       * given key or key range in query.
       * If successful, request's result will be the key, or undefined if there was no matching record.
       */
  def getKey(key: IDBValidKey): IDBRequest[js.UndefOr[IDBValidKey]] = js.native
  /**
       * Opens a cursor over the records matching query,
       * ordered by direction. If query is null, all records in index are matched.
       * If successful, request's result will be an IDBCursorWithValue, or null if there were no matching records.
       */
  def openCursor(): IDBRequest[IDBCursorWithValue | scala.Null] = js.native
  /**
       * Opens a cursor over the records matching query,
       * ordered by direction. If query is null, all records in index are matched.
       * If successful, request's result will be an IDBCursorWithValue, or null if there were no matching records.
       */
  def openCursor(range: IDBKeyRange): IDBRequest[IDBCursorWithValue | scala.Null] = js.native
  /**
       * Opens a cursor over the records matching query,
       * ordered by direction. If query is null, all records in index are matched.
       * If successful, request's result will be an IDBCursorWithValue, or null if there were no matching records.
       */
  def openCursor(range: IDBKeyRange, direction: IDBCursorDirection): IDBRequest[IDBCursorWithValue | scala.Null] = js.native
  /**
       * Opens a cursor over the records matching query,
       * ordered by direction. If query is null, all records in index are matched.
       * If successful, request's result will be an IDBCursorWithValue, or null if there were no matching records.
       */
  def openCursor(range: IDBValidKey): IDBRequest[IDBCursorWithValue | scala.Null] = js.native
  /**
       * Opens a cursor over the records matching query,
       * ordered by direction. If query is null, all records in index are matched.
       * If successful, request's result will be an IDBCursorWithValue, or null if there were no matching records.
       */
  def openCursor(range: IDBValidKey, direction: IDBCursorDirection): IDBRequest[IDBCursorWithValue | scala.Null] = js.native
  /**
       * Opens a cursor with key only flag set over the records matching query, ordered by direction. If query is null, all records in index are matched.
       * If successful, request's result will be an IDBCursor, or null if there were no matching records.
       */
  def openKeyCursor(): IDBRequest[IDBCursor | scala.Null] = js.native
  /**
       * Opens a cursor with key only flag set over the records matching query, ordered by direction. If query is null, all records in index are matched.
       * If successful, request's result will be an IDBCursor, or null if there were no matching records.
       */
  def openKeyCursor(range: IDBKeyRange): IDBRequest[IDBCursor | scala.Null] = js.native
  /**
       * Opens a cursor with key only flag set over the records matching query, ordered by direction. If query is null, all records in index are matched.
       * If successful, request's result will be an IDBCursor, or null if there were no matching records.
       */
  def openKeyCursor(range: IDBKeyRange, direction: IDBCursorDirection): IDBRequest[IDBCursor | scala.Null] = js.native
  /**
       * Opens a cursor with key only flag set over the records matching query, ordered by direction. If query is null, all records in index are matched.
       * If successful, request's result will be an IDBCursor, or null if there were no matching records.
       */
  def openKeyCursor(range: IDBValidKey): IDBRequest[IDBCursor | scala.Null] = js.native
  /**
       * Opens a cursor with key only flag set over the records matching query, ordered by direction. If query is null, all records in index are matched.
       * If successful, request's result will be an IDBCursor, or null if there were no matching records.
       */
  def openKeyCursor(range: IDBValidKey, direction: IDBCursorDirection): IDBRequest[IDBCursor | scala.Null] = js.native
}

@JSGlobal("IDBIndex")
@js.native
object IDBIndex
  extends org.scalablytyped.runtime.Instantiable0[IDBIndex]

