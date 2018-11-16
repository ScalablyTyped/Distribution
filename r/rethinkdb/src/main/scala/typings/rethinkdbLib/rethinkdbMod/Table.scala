package typings
package rethinkdbLib.rethinkdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Table
  extends Sequence
     with HasFields[Sequence] {
  def get[TObjectType /* <: js.Object */](key: java.lang.String): (Operation[TObjectType | scala.Null]) with Writeable = js.native
   // without index defaults to primary key
  /**
           * Get all documents matching 2 or more compound index keys.
           * See [getAll](https://www.rethinkdb.com/api/javascript/get_all/) and
           * [compound indexes](https://www.rethinkdb.com/docs/secondary-indexes/javascript/#compound-indexes)
           */
  def getAll(
    compoundKey: js.Array[java.lang.String],
    compoundKey2: js.Array[java.lang.String],
    compoundKey3: js.Array[java.lang.String],
    compoundKey4: js.Array[java.lang.String],
    compoundKey5: js.Array[java.lang.String],
    index: Index
  ): Sequence = js.native
   // without index defaults to primary key
  /**
           * Get all documents matching 2 or more compound index keys.
           * See [getAll](https://www.rethinkdb.com/api/javascript/get_all/) and
           * [compound indexes](https://www.rethinkdb.com/docs/secondary-indexes/javascript/#compound-indexes)
           */
  def getAll(
    compoundKey: js.Array[java.lang.String],
    compoundKey2: js.Array[java.lang.String],
    compoundKey3: js.Array[java.lang.String],
    compoundKey4: js.Array[java.lang.String],
    index: Index
  ): Sequence = js.native
   // without index defaults to primary key
  /**
           * Get all documents matching 2 or more compound index keys.
           * See [getAll](https://www.rethinkdb.com/api/javascript/get_all/) and
           * [compound indexes](https://www.rethinkdb.com/docs/secondary-indexes/javascript/#compound-indexes)
           */
  def getAll(
    compoundKey: js.Array[java.lang.String],
    compoundKey2: js.Array[java.lang.String],
    compoundKey3: js.Array[java.lang.String],
    index: Index
  ): Sequence = js.native
   // without index defaults to primary key
  /**
           * Get all documents matching 2 or more compound index keys.
           * See [getAll](https://www.rethinkdb.com/api/javascript/get_all/) and
           * [compound indexes](https://www.rethinkdb.com/docs/secondary-indexes/javascript/#compound-indexes)
           */
  def getAll(compoundKey: js.Array[java.lang.String], compoundKey2: js.Array[java.lang.String], index: Index): Sequence = js.native
   // without index defaults to primary key
  /**
           * Get all documents matching a compound index key.
           * See [getAll](https://www.rethinkdb.com/api/javascript/get_all/) and
           * [compound indexes](https://www.rethinkdb.com/docs/secondary-indexes/javascript/#compound-indexes)
           */
  def getAll(compoundKey: js.Array[java.lang.String], index: Index): Sequence = js.native
  /**
           * Get all documents matching a key on a simple index; defaults to primary key if no index provided.
           * See [getAll](https://www.rethinkdb.com/api/javascript/get_all/)
           */
  def getAll(key: java.lang.String): Sequence = js.native
  /**
           * Get all documents matching a key on a simple index; defaults to primary key if no index provided.
           * See [getAll](https://www.rethinkdb.com/api/javascript/get_all/)
           */
  def getAll(key: java.lang.String, index: Index): Sequence = js.native
   // without index defaults to primary key
  /**
           * Get all documents matching 2 or more keys on a simple index; defaults to primary key if no index provided.
           * See [getAll](https://www.rethinkdb.com/api/javascript/get_all/)
           */
  def getAll(key: java.lang.String, key2: java.lang.String): Sequence = js.native
   // without index defaults to primary key
  /**
           * Get all documents matching 2 or more keys on a simple index; defaults to primary key if no index provided.
           * See [getAll](https://www.rethinkdb.com/api/javascript/get_all/)
           */
  def getAll(key: java.lang.String, key2: java.lang.String, index: Index): Sequence = js.native
   // without index defaults to primary key
  /**
           * Get all documents matching 2 or more keys on a simple index; defaults to primary key if no index provided.
           * See [getAll](https://www.rethinkdb.com/api/javascript/get_all/)
           */
  def getAll(key: java.lang.String, key2: java.lang.String, key3: java.lang.String): Sequence = js.native
   // without index defaults to primary key
  /**
           * Get all documents matching 2 or more keys on a simple index; defaults to primary key if no index provided.
           * See [getAll](https://www.rethinkdb.com/api/javascript/get_all/)
           */
  def getAll(key: java.lang.String, key2: java.lang.String, key3: java.lang.String, index: Index): Sequence = js.native
   // without index defaults to primary key
  /**
           * Get all documents matching 2 or more keys on a simple index; defaults to primary key if no index provided.
           * See [getAll](https://www.rethinkdb.com/api/javascript/get_all/)
           */
  def getAll(key: java.lang.String, key2: java.lang.String, key3: java.lang.String, key4: java.lang.String): Sequence = js.native
   // without index defaults to primary key
  /**
           * Get all documents matching 2 or more keys on a simple index; defaults to primary key if no index provided.
           * See [getAll](https://www.rethinkdb.com/api/javascript/get_all/)
           */
  def getAll(
    key: java.lang.String,
    key2: java.lang.String,
    key3: java.lang.String,
    key4: java.lang.String,
    index: Index
  ): Sequence = js.native
   // without index defaults to primary key
  /**
           * Get all documents matching 2 or more keys on a simple index; defaults to primary key if no index provided.
           * See [getAll](https://www.rethinkdb.com/api/javascript/get_all/)
           */
  def getAll(
    key: java.lang.String,
    key2: java.lang.String,
    key3: java.lang.String,
    key4: java.lang.String,
    key5: java.lang.String
  ): Sequence = js.native
   // without index defaults to primary key
  /**
           * Get all documents matching 2 or more keys on a simple index; defaults to primary key if no index provided.
           * See [getAll](https://www.rethinkdb.com/api/javascript/get_all/)
           */
  def getAll(
    key: java.lang.String,
    key2: java.lang.String,
    key3: java.lang.String,
    key4: java.lang.String,
    key5: java.lang.String,
    index: Index
  ): Sequence = js.native
   // without index defaults to primary key
  /**
           * Get all documents matching a key on a simple index; defaults to primary key if no index provided.
           * See [getAll](https://www.rethinkdb.com/api/javascript/get_all/) and
           * [compound indexes](https://www.rethinkdb.com/docs/secondary-indexes/javascript/#compound-indexes)
           */
  def getAll(key: Expression[_]): Sequence = js.native
   // without index defaults to primary key
  /**
           * Get all documents matching a key on a simple index; defaults to primary key if no index provided.
           * See [getAll](https://www.rethinkdb.com/api/javascript/get_all/) and
           * [compound indexes](https://www.rethinkdb.com/docs/secondary-indexes/javascript/#compound-indexes)
           */
  /**
           * Get all documents matching a key on a compound index; index must be provided.
           * See [getAll](https://www.rethinkdb.com/api/javascript/get_all/) and
           * [compound indexes](https://www.rethinkdb.com/docs/secondary-indexes/javascript/#compound-indexes)
           */
  def getAll(key: Expression[_ | js.Array[_]], index: Index): Sequence = js.native
  /**
           * Get all documents matching one or more keys on a simple index; defaults to primary key if no index provided.
           * See [getAll](https://www.rethinkdb.com/api/javascript/get_all/)
           */
  def getAll(keys: java.lang.String*): Sequence = js.native
  def getIntersecting(geometry: Geometry, index: Index): Sequence = js.native
  def indexCreate(name: java.lang.String): Operation[CreateResult] = js.native
  def indexCreate(name: java.lang.String, index: IndexFunction[_]): Operation[CreateResult] = js.native
  def indexDrop(name: java.lang.String): Operation[DropResult] = js.native
  def indexList(): Operation[js.Array[java.lang.String]] = js.native
  def indexWait(): Operation[js.Array[rethinkdbLib.Anon_Outdated]] = js.native
  def indexWait(name: java.lang.String): Operation[js.Array[rethinkdbLib.Anon_Outdated]] = js.native
  def insert(obj: js.Any): Operation[WriteResult] = js.native
  def insert(obj: js.Any, options: InsertOptions): Operation[WriteResult] = js.native
  def insert(obj: js.Array[_]): Operation[WriteResult] = js.native
  def insert(obj: js.Array[_], options: InsertOptions): Operation[WriteResult] = js.native
  def wait(WaitOptions: WaitOptions): Operation[WaitResult] = js.native
}

