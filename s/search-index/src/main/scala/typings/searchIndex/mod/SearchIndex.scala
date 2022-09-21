package typings.searchIndex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchIndex extends StObject {
  
  def ALL_DOCUMENTS(): js.Promise[js.Array[AllDocumentsResultItem]] = js.native
  def ALL_DOCUMENTS(limit: Double): js.Promise[js.Array[AllDocumentsResultItem]] = js.native
  
  def BUCKETS(tokens: Token*): js.Promise[js.Array[FieldValueIdObject]] = js.native
  
  def CREATED(): js.Promise[Double] = js.native
  
  def DELETE(docIds: String*): js.Promise[js.Array[Operation]] = js.native
  
  def DICTIONARY(): js.Promise[js.Array[String]] = js.native
  def DICTIONARY(token: Token): js.Promise[js.Array[String]] = js.native
  
  def DISTINCT(): js.Promise[js.Array[FieldValue]] = js.native
  def DISTINCT(token: Token): js.Promise[js.Array[FieldValue]] = js.native
  
  def DOCUMENTS(docIds: String*): js.Promise[js.Array[Any]] = js.native
  
  def DOCUMENT_COUNT(): js.Promise[Double] = js.native
  
  def EXPORT(): js.Promise[js.Array[KeyValue]] = js.native
  
  def FACETS(): js.Promise[js.Array[FieldValueIdObject]] = js.native
  def FACETS(token: Token): js.Promise[js.Array[FieldValueIdObject]] = js.native
  
  def FIELDS(): js.Promise[js.Array[String]] = js.native
  
  def FLUSH(): js.Promise[Unit] = js.native
  
  def IMPORT(index: js.Array[KeyValue]): js.Promise[Unit] = js.native
  
  var INDEX: Any = js.native
  
  def MAX(): js.Promise[String] = js.native
  def MAX(token: Token): js.Promise[String] = js.native
  
  def MIN(): js.Promise[String] = js.native
  def MIN(token: Token): js.Promise[String] = js.native
  
  def PUT(documents: js.Array[Any]): js.Promise[js.Array[Operation]] = js.native
  def PUT(documents: js.Array[Any], options: PutOptions): js.Promise[js.Array[Operation]] = js.native
  
  def PUT_RAW(documents: js.Array[Any]): js.Promise[js.Array[Operation]] = js.native
  
  def QUERY(query: Token): js.Promise[QueryResult] = js.native
  def QUERY(query: Token, options: QueryOptions): js.Promise[QueryResult] = js.native
  
  def SEARCH(token: Token): js.Promise[QueryResult] = js.native
  
  var TOKENIZATION_PIPELINE_STAGES: TokenizationPipelineStages = js.native
}
