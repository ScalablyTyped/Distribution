package typings.rethinkdb.mod

import typings.rethinkdb.anon.Function
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Table_
  extends StObject
     with Sequence
     with HasFields[Sequence] {
  
  def get[TObjectType /* <: js.Object */](key: String): (Operation[TObjectType | Null]) & Writeable = js.native
  
  // without index defaults to primary key
  /**
    * Get all documents matching 2 or more compound index keys.
    * See [getAll](https://www.rethinkdb.com/api/javascript/get_all/) and
    * [compound indexes](https://www.rethinkdb.com/docs/secondary-indexes/javascript/#compound-indexes)
    */
  def getAll(
    compoundKey: js.Array[String],
    compoundKey2: js.Array[String],
    compoundKey3: js.Array[String],
    compoundKey4: js.Array[String],
    compoundKey5: js.Array[String],
    index: Index
  ): Sequence = js.native
  // without index defaults to primary key
  /**
    * Get all documents matching 2 or more compound index keys.
    * See [getAll](https://www.rethinkdb.com/api/javascript/get_all/) and
    * [compound indexes](https://www.rethinkdb.com/docs/secondary-indexes/javascript/#compound-indexes)
    */
  def getAll(
    compoundKey: js.Array[String],
    compoundKey2: js.Array[String],
    compoundKey3: js.Array[String],
    compoundKey4: js.Array[String],
    index: Index
  ): Sequence = js.native
  // without index defaults to primary key
  /**
    * Get all documents matching 2 or more compound index keys.
    * See [getAll](https://www.rethinkdb.com/api/javascript/get_all/) and
    * [compound indexes](https://www.rethinkdb.com/docs/secondary-indexes/javascript/#compound-indexes)
    */
  def getAll(
    compoundKey: js.Array[String],
    compoundKey2: js.Array[String],
    compoundKey3: js.Array[String],
    index: Index
  ): Sequence = js.native
  // without index defaults to primary key
  /**
    * Get all documents matching 2 or more compound index keys.
    * See [getAll](https://www.rethinkdb.com/api/javascript/get_all/) and
    * [compound indexes](https://www.rethinkdb.com/docs/secondary-indexes/javascript/#compound-indexes)
    */
  def getAll(compoundKey: js.Array[String], compoundKey2: js.Array[String], index: Index): Sequence = js.native
  // without index defaults to primary key
  /**
    * Get all documents matching a compound index key.
    * See [getAll](https://www.rethinkdb.com/api/javascript/get_all/) and
    * [compound indexes](https://www.rethinkdb.com/docs/secondary-indexes/javascript/#compound-indexes)
    */
  def getAll(compoundKey: js.Array[String], index: Index): Sequence = js.native
  /**
    * Get all documents matching a key on a simple index; defaults to primary key if no index provided.
    * See [getAll](https://www.rethinkdb.com/api/javascript/get_all/)
    */
  def getAll(key: String): Sequence = js.native
  def getAll(key: String, index: Index): Sequence = js.native
  // without index defaults to primary key
  /**
    * Get all documents matching 2 or more keys on a simple index; defaults to primary key if no index provided.
    * See [getAll](https://www.rethinkdb.com/api/javascript/get_all/)
    */
  def getAll(key: String, key2: String): Sequence = js.native
  def getAll(key: String, key2: String, index: Index): Sequence = js.native
  // without index defaults to primary key
  /**
    * Get all documents matching 2 or more keys on a simple index; defaults to primary key if no index provided.
    * See [getAll](https://www.rethinkdb.com/api/javascript/get_all/)
    */
  def getAll(key: String, key2: String, key3: String): Sequence = js.native
  def getAll(key: String, key2: String, key3: String, index: Index): Sequence = js.native
  // without index defaults to primary key
  /**
    * Get all documents matching 2 or more keys on a simple index; defaults to primary key if no index provided.
    * See [getAll](https://www.rethinkdb.com/api/javascript/get_all/)
    */
  def getAll(key: String, key2: String, key3: String, key4: String): Sequence = js.native
  def getAll(key: String, key2: String, key3: String, key4: String, index: Index): Sequence = js.native
  // without index defaults to primary key
  /**
    * Get all documents matching 2 or more keys on a simple index; defaults to primary key if no index provided.
    * See [getAll](https://www.rethinkdb.com/api/javascript/get_all/)
    */
  def getAll(key: String, key2: String, key3: String, key4: String, key5: String): Sequence = js.native
  def getAll(key: String, key2: String, key3: String, key4: String, key5: String, index: Index): Sequence = js.native
  /**
    * Get all documents matching one or more keys on a simple index; defaults to primary key if no index provided.
    * See [getAll](https://www.rethinkdb.com/api/javascript/get_all/)
    */
  def getAll(keys: String*): Sequence = js.native
  // without index defaults to primary key
  /**
    * Get all documents matching a key on a simple index; defaults to primary key if no index provided.
    * See [getAll](https://www.rethinkdb.com/api/javascript/get_all/) and
    * [compound indexes](https://www.rethinkdb.com/docs/secondary-indexes/javascript/#compound-indexes)
    */
  def getAll(key: Expression[Any]): Sequence = js.native
  /**
    * Get all documents matching a key on a compound index; index must be provided.
    * See [getAll](https://www.rethinkdb.com/api/javascript/get_all/) and
    * [compound indexes](https://www.rethinkdb.com/docs/secondary-indexes/javascript/#compound-indexes)
    */
  def getAll(key: Expression[Any | js.Array[Any]], index: Index): Sequence = js.native
  
  def getIntersecting(geometry: Geometry, index: Index): Sequence = js.native
  
  def indexCreate(name: String): Operation[CreateResult] = js.native
  def indexCreate(name: String, index: IndexFunction[Any]): Operation[CreateResult] = js.native
  
  def indexDrop(name: String): Operation[DropResult] = js.native
  
  def indexList(): Operation[js.Array[String]] = js.native
  
  def indexWait(): Operation[js.Array[Function]] = js.native
  def indexWait(name: String): Operation[js.Array[Function]] = js.native
  
  def insert(obj: js.Array[Any]): Operation[WriteResult] = js.native
  def insert(obj: js.Array[Any], options: InsertOptions): Operation[WriteResult] = js.native
  def insert(obj: Any): Operation[WriteResult] = js.native
  def insert(obj: Any, options: InsertOptions): Operation[WriteResult] = js.native
  
  def wait(WaitOptions: WaitOptions): Operation[WaitResult] = js.native
}
