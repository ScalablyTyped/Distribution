package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This IndexedDB API interface represents a cursor for traversing or iterating over multiple records in a database.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor)
  */
@js.native
trait IDBCursor extends StObject {
  
  /**
    * Advances the cursor through the next count records in range.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/advance)
    */
  /* standard dom */
  def advance(count: Double): Unit = js.native
  
  /**
    * Advances the cursor to the next record in range.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/continue)
    */
  /* standard dom */
  def continue(): Unit = js.native
  def continue(key: IDBValidKey): Unit = js.native
  
  /**
    * Advances the cursor to the next record in range matching or after key and primaryKey. Throws an "InvalidAccessError" DOMException if the source is not an index.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/continuePrimaryKey)
    */
  /* standard dom */
  def continuePrimaryKey(key: IDBValidKey, primaryKey: IDBValidKey): Unit = js.native
  
  /**
    * Delete the record pointed at by the cursor with a new value.
    *
    * If successful, request's result will be undefined.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/delete)
    */
  /* standard dom */
  def delete(): IDBRequest[Unit] = js.native
  
  /**
    * Returns the direction ("next", "nextunique", "prev" or "prevunique") of the cursor.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/direction)
    */
  /* standard dom */
  val direction: IDBCursorDirection = js.native
  
  /**
    * Returns the key of the cursor. Throws a "InvalidStateError" DOMException if the cursor is advancing or is finished.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/key)
    */
  /* standard dom */
  val key: IDBValidKey = js.native
  
  /**
    * Returns the effective key of the cursor. Throws a "InvalidStateError" DOMException if the cursor is advancing or is finished.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/primaryKey)
    */
  /* standard dom */
  val primaryKey: IDBValidKey = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/request) */
  /* standard dom */
  val request: IDBRequest[Any] = js.native
  
  /**
    * Returns the IDBObjectStore or IDBIndex the cursor was opened from.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/source)
    */
  /* standard dom */
  val source: IDBObjectStore | IDBIndex = js.native
  
  /**
    * Updated the record pointed at by the cursor with a new value.
    *
    * Throws a "DataError" DOMException if the effective object store uses in-line keys and the key would have changed.
    *
    * If successful, request's result will be the record's key.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/update)
    */
  /* standard dom */
  def update(value: Any): IDBRequest[IDBValidKey] = js.native
}
