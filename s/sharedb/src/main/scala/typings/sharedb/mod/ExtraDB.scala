package typings.sharedb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// The DBs in `extraDbs` are only ever used for queries, so they don't need the other DB methods.
@js.native
trait ExtraDB extends StObject {
  
  def close(): Unit = js.native
  def close(callback: BasicCallback): Unit = js.native
  
  def query(collection: String, query: Any, fields: ProjectionFields, options: Any, callback: DBQueryCallback): Unit = js.native
  @JSName("query")
  var query_Original: DBQueryMethod = js.native
}
