package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDBObjectStore extends js.Object {
  /**
       * Returns true if the store has a key generator, and false otherwise.
       */
  val autoIncrement: scala.Boolean = js.native
  /**
       * Returns a list of the names of indexes in the store.
       */
  val indexNames: DOMStringList = js.native
  /**
       * Returns the key path of the store, or null if none.
       */
  val keyPath: java.lang.String | js.Array[java.lang.String] = js.native
  /**
       * Updates the name of the store to newName.
       * Throws "InvalidStateError" DOMException if not called within an upgrade
       * transaction.
       */
  var name: java.lang.String = js.native
  /**
       * Returns the associated transaction.
       */
  val transaction: IDBTransaction = js.native
  def add(value: js.Any): IDBRequest[IDBValidKey] = js.native
  def add(value: js.Any, key: IDBKeyRange): IDBRequest[IDBValidKey] = js.native
  def add(value: js.Any, key: IDBValidKey): IDBRequest[IDBValidKey] = js.native
  /**
       * Deletes all records in store.
       * If successful, request's result will
       * be undefined.
       */
  def clear(): IDBRequest[js.UndefOr[scala.Nothing]] = js.native
  /**
       * Retrieves the number of records matching the
       * given key or key range in query.
       * If successful, request's result will be the count.
       */
  def count(): IDBRequest[scala.Double] = js.native
  /**
       * Retrieves the number of records matching the
       * given key or key range in query.
       * If successful, request's result will be the count.
       */
  def count(key: IDBKeyRange): IDBRequest[scala.Double] = js.native
  /**
       * Retrieves the number of records matching the
       * given key or key range in query.
       * If successful, request's result will be the count.
       */
  def count(key: IDBValidKey): IDBRequest[scala.Double] = js.native
  /**
       * Creates a new index in store with the given name, keyPath and options and returns a new IDBIndex. If the keyPath and options define constraints that cannot be
       * satisfied with the data already in store the upgrade
       * transaction will abort with
       * a "ConstraintError" DOMException.
       * Throws an "InvalidStateError" DOMException if not called within an upgrade
       * transaction.
       */
  def createIndex(name: java.lang.String, keyPath: java.lang.String): IDBIndex = js.native
  /**
       * Creates a new index in store with the given name, keyPath and options and returns a new IDBIndex. If the keyPath and options define constraints that cannot be
       * satisfied with the data already in store the upgrade
       * transaction will abort with
       * a "ConstraintError" DOMException.
       * Throws an "InvalidStateError" DOMException if not called within an upgrade
       * transaction.
       */
  def createIndex(name: java.lang.String, keyPath: java.lang.String, options: IDBIndexParameters): IDBIndex = js.native
  /**
       * Creates a new index in store with the given name, keyPath and options and returns a new IDBIndex. If the keyPath and options define constraints that cannot be
       * satisfied with the data already in store the upgrade
       * transaction will abort with
       * a "ConstraintError" DOMException.
       * Throws an "InvalidStateError" DOMException if not called within an upgrade
       * transaction.
       */
  def createIndex(name: java.lang.String, keyPath: js.Array[java.lang.String]): IDBIndex = js.native
  /**
       * Creates a new index in store with the given name, keyPath and options and returns a new IDBIndex. If the keyPath and options define constraints that cannot be
       * satisfied with the data already in store the upgrade
       * transaction will abort with
       * a "ConstraintError" DOMException.
       * Throws an "InvalidStateError" DOMException if not called within an upgrade
       * transaction.
       */
  def createIndex(name: java.lang.String, keyPath: js.Array[java.lang.String], options: IDBIndexParameters): IDBIndex = js.native
  /**
       * Deletes records in store with the given key or in the given key range in query.
       * If successful, request's result will
       * be undefined.
       */
  def delete(key: IDBKeyRange): IDBRequest[js.UndefOr[scala.Nothing]] = js.native
  /**
       * Deletes records in store with the given key or in the given key range in query.
       * If successful, request's result will
       * be undefined.
       */
  def delete(key: IDBValidKey): IDBRequest[js.UndefOr[scala.Nothing]] = js.native
  /**
       * Deletes the index in store with the given name.
       * Throws an "InvalidStateError" DOMException if not called within an upgrade
       * transaction.
       */
  def deleteIndex(name: java.lang.String): scala.Unit = js.native
  /**
       * Retrieves the value of the first record matching the
       * given key or key range in query.
       * If successful, request's result will be the value, or undefined if there was no matching record.
       */
  def get(query: IDBKeyRange): IDBRequest[js.UndefOr[_]] = js.native
  /**
       * Retrieves the value of the first record matching the
       * given key or key range in query.
       * If successful, request's result will be the value, or undefined if there was no matching record.
       */
  def get(query: IDBValidKey): IDBRequest[js.UndefOr[_]] = js.native
  /**
       * Retrieves the values of the records matching the
       * given key or key range in query (up to count if given).
       * If successful, request's result will
       * be an Array of the values.
       */
  def getAll(): IDBRequest[js.Array[_]] = js.native
  /**
       * Retrieves the values of the records matching the
       * given key or key range in query (up to count if given).
       * If successful, request's result will
       * be an Array of the values.
       */
  def getAll(query: IDBKeyRange): IDBRequest[js.Array[_]] = js.native
  /**
       * Retrieves the values of the records matching the
       * given key or key range in query (up to count if given).
       * If successful, request's result will
       * be an Array of the values.
       */
  def getAll(query: IDBKeyRange, count: scala.Double): IDBRequest[js.Array[_]] = js.native
  /**
       * Retrieves the values of the records matching the
       * given key or key range in query (up to count if given).
       * If successful, request's result will
       * be an Array of the values.
       */
  def getAll(query: IDBValidKey): IDBRequest[js.Array[_]] = js.native
  /**
       * Retrieves the values of the records matching the
       * given key or key range in query (up to count if given).
       * If successful, request's result will
       * be an Array of the values.
       */
  def getAll(query: IDBValidKey, count: scala.Double): IDBRequest[js.Array[_]] = js.native
  /**
       * Retrieves the keys of records matching the
       * given key or key range in query (up to count if given).
       * If successful, request's result will
       * be an Array of the keys.
       */
  def getAllKeys(): IDBRequest[js.Array[IDBValidKey]] = js.native
  /**
       * Retrieves the keys of records matching the
       * given key or key range in query (up to count if given).
       * If successful, request's result will
       * be an Array of the keys.
       */
  def getAllKeys(query: IDBKeyRange): IDBRequest[js.Array[IDBValidKey]] = js.native
  /**
       * Retrieves the keys of records matching the
       * given key or key range in query (up to count if given).
       * If successful, request's result will
       * be an Array of the keys.
       */
  def getAllKeys(query: IDBKeyRange, count: scala.Double): IDBRequest[js.Array[IDBValidKey]] = js.native
  /**
       * Retrieves the keys of records matching the
       * given key or key range in query (up to count if given).
       * If successful, request's result will
       * be an Array of the keys.
       */
  def getAllKeys(query: IDBValidKey): IDBRequest[js.Array[IDBValidKey]] = js.native
  /**
       * Retrieves the keys of records matching the
       * given key or key range in query (up to count if given).
       * If successful, request's result will
       * be an Array of the keys.
       */
  def getAllKeys(query: IDBValidKey, count: scala.Double): IDBRequest[js.Array[IDBValidKey]] = js.native
  /**
       * Retrieves the key of the first record matching the
       * given key or key range in query.
       * If successful, request's result will be the key, or undefined if there was no matching record.
       */
  def getKey(query: IDBKeyRange): IDBRequest[js.UndefOr[IDBValidKey]] = js.native
  /**
       * Retrieves the key of the first record matching the
       * given key or key range in query.
       * If successful, request's result will be the key, or undefined if there was no matching record.
       */
  def getKey(query: IDBValidKey): IDBRequest[js.UndefOr[IDBValidKey]] = js.native
  def index(name: java.lang.String): IDBIndex = js.native
  /**
       * Opens a cursor over the records matching query,
       * ordered by direction. If query is null, all records in store are matched.
       * If successful, request's result will be an IDBCursorWithValue pointing at the first matching record, or null if there were no matching records.
       */
  def openCursor(): IDBRequest[IDBCursorWithValue | scala.Null] = js.native
  /**
       * Opens a cursor over the records matching query,
       * ordered by direction. If query is null, all records in store are matched.
       * If successful, request's result will be an IDBCursorWithValue pointing at the first matching record, or null if there were no matching records.
       */
  def openCursor(range: IDBKeyRange): IDBRequest[IDBCursorWithValue | scala.Null] = js.native
  /**
       * Opens a cursor over the records matching query,
       * ordered by direction. If query is null, all records in store are matched.
       * If successful, request's result will be an IDBCursorWithValue pointing at the first matching record, or null if there were no matching records.
       */
  def openCursor(range: IDBKeyRange, direction: IDBCursorDirection): IDBRequest[IDBCursorWithValue | scala.Null] = js.native
  /**
       * Opens a cursor over the records matching query,
       * ordered by direction. If query is null, all records in store are matched.
       * If successful, request's result will be an IDBCursorWithValue pointing at the first matching record, or null if there were no matching records.
       */
  def openCursor(range: IDBValidKey): IDBRequest[IDBCursorWithValue | scala.Null] = js.native
  /**
       * Opens a cursor over the records matching query,
       * ordered by direction. If query is null, all records in store are matched.
       * If successful, request's result will be an IDBCursorWithValue pointing at the first matching record, or null if there were no matching records.
       */
  def openCursor(range: IDBValidKey, direction: IDBCursorDirection): IDBRequest[IDBCursorWithValue | scala.Null] = js.native
  /**
       * Opens a cursor with key only flag set over the records matching query, ordered by direction. If query is null, all records in store are matched.
       * If successful, request's result will be an IDBCursor pointing at the first matching record, or
       * null if there were no matching records.
       */
  def openKeyCursor(): IDBRequest[IDBCursor | scala.Null] = js.native
  /**
       * Opens a cursor with key only flag set over the records matching query, ordered by direction. If query is null, all records in store are matched.
       * If successful, request's result will be an IDBCursor pointing at the first matching record, or
       * null if there were no matching records.
       */
  def openKeyCursor(query: IDBKeyRange): IDBRequest[IDBCursor | scala.Null] = js.native
  /**
       * Opens a cursor with key only flag set over the records matching query, ordered by direction. If query is null, all records in store are matched.
       * If successful, request's result will be an IDBCursor pointing at the first matching record, or
       * null if there were no matching records.
       */
  def openKeyCursor(query: IDBKeyRange, direction: IDBCursorDirection): IDBRequest[IDBCursor | scala.Null] = js.native
  /**
       * Opens a cursor with key only flag set over the records matching query, ordered by direction. If query is null, all records in store are matched.
       * If successful, request's result will be an IDBCursor pointing at the first matching record, or
       * null if there were no matching records.
       */
  def openKeyCursor(query: IDBValidKey): IDBRequest[IDBCursor | scala.Null] = js.native
  /**
       * Opens a cursor with key only flag set over the records matching query, ordered by direction. If query is null, all records in store are matched.
       * If successful, request's result will be an IDBCursor pointing at the first matching record, or
       * null if there were no matching records.
       */
  def openKeyCursor(query: IDBValidKey, direction: IDBCursorDirection): IDBRequest[IDBCursor | scala.Null] = js.native
  def put(value: js.Any): IDBRequest[IDBValidKey] = js.native
  def put(value: js.Any, key: IDBKeyRange): IDBRequest[IDBValidKey] = js.native
  def put(value: js.Any, key: IDBValidKey): IDBRequest[IDBValidKey] = js.native
}

@JSGlobal("IDBObjectStore")
@js.native
object IDBObjectStore
  extends ScalablyTyped.runtime.Instantiable0[IDBObjectStore]

