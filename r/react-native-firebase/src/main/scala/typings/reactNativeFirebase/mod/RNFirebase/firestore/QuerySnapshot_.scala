package typings.reactNativeFirebase.mod.RNFirebase.firestore

import typings.reactNativeFirebase.mod.RNFirebase.firestore.Types.SnapshotMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuerySnapshot_ extends js.Object {
  
  val docChanges: js.Array[DocumentChange] = js.native
  
  val docs: js.Array[DocumentSnapshot] = js.native
  
  val empty: Boolean = js.native
  
  def forEach(callback: js.Function1[/* snapshot */ DocumentSnapshot, _]): Unit = js.native
  
  val metadata: SnapshotMetadata = js.native
  
  val query: Query = js.native
  
  val size: Double = js.native
}
object QuerySnapshot_ {
  
  @scala.inline
  def apply(
    docChanges: js.Array[DocumentChange],
    docs: js.Array[DocumentSnapshot],
    empty: Boolean,
    forEach: js.Function1[/* snapshot */ DocumentSnapshot, _] => Unit,
    metadata: SnapshotMetadata,
    query: Query,
    size: Double
  ): QuerySnapshot_ = {
    val __obj = js.Dynamic.literal(docChanges = docChanges.asInstanceOf[js.Any], docs = docs.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any], forEach = js.Any.fromFunction1(forEach), metadata = metadata.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuerySnapshot_]
  }
  
  @scala.inline
  implicit class QuerySnapshot_Ops[Self <: QuerySnapshot_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDocChangesVarargs(value: DocumentChange*): Self = this.set("docChanges", js.Array(value :_*))
    
    @scala.inline
    def setDocChanges(value: js.Array[DocumentChange]): Self = this.set("docChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocsVarargs(value: DocumentSnapshot*): Self = this.set("docs", js.Array(value :_*))
    
    @scala.inline
    def setDocs(value: js.Array[DocumentSnapshot]): Self = this.set("docs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmpty(value: Boolean): Self = this.set("empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForEach(value: js.Function1[/* snapshot */ DocumentSnapshot, _] => Unit): Self = this.set("forEach", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMetadata(value: SnapshotMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: Query): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
}
