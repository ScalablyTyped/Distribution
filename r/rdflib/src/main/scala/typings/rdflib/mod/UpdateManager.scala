package typings.rdflib.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "UpdateManager")
@js.native
/**
  * @param store The quadstore to store data and metadata. Created if not passed.
  */
class UpdateManager () extends js.Object {
  def this(store: IndexedFormula) = this()
  /**
    * This is suitable for an initial creation of a document.
    * @param document
    * @param data
    * @param contentType
    * @param callback
    */
  def put(
    document: Node,
    data: String,
    contentType: String,
    callback: js.Function4[
      /* uri */ String, 
      /* ok */ Boolean, 
      /* errorMessage */ String, 
      /* response */ js.UndefOr[js.Any], 
      Unit
    ]
  ): js.Promise[Unit] = js.native
  def put(
    document: Node,
    data: js.Array[Statement],
    contentType: String,
    callback: js.Function4[
      /* uri */ String, 
      /* ok */ Boolean, 
      /* errorMessage */ String, 
      /* response */ js.UndefOr[js.Any], 
      Unit
    ]
  ): js.Promise[Unit] = js.native
  /**
    * This high-level function updates the local store iff the web is changed successfully.
    * Deletions, insertions may be undefined or single statements or lists or formulae (may contain bnodes which can be indirectly identified by a where clause).
    * The `why` property of each statement must be the same and give the web document to be updated.
    * @param statementsToDelete Statement or statements to be deleted.
    * @param statementsToAdd Statement or statements to be inserted.
    * @param callback
    */
  def update(
    statementsToDelete: js.Array[Statement],
    statementsToAdd: js.Array[Statement],
    callback: js.Function3[
      /* uri */ js.UndefOr[String], 
      /* success */ Boolean, 
      /* errorBody */ js.UndefOr[String], 
      Unit
    ]
  ): Unit = js.native
}

