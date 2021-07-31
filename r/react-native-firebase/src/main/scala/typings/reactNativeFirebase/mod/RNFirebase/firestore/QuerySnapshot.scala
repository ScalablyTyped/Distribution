package typings.reactNativeFirebase.mod.RNFirebase.firestore

import typings.reactNativeFirebase.mod.RNFirebase.firestore.Types.NativeDocumentChange
import typings.reactNativeFirebase.mod.RNFirebase.firestore.Types.NativeDocumentSnapshot
import typings.reactNativeFirebase.mod.RNFirebase.firestore.Types.SnapshotMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuerySnapshot extends StObject {
  
  val docChanges: js.Array[DocumentChange]
  
  val docs: js.Array[DocumentSnapshot]
  
  val empty: Boolean
  
  def forEach(callback: js.Function1[/* snapshot */ DocumentSnapshot, js.Any]): Unit
  
  val metadata: SnapshotMetadata
  
  val query: Query
  
  val size: Double
}
object QuerySnapshot {
  
  @scala.inline
  def apply(
    docChanges: js.Array[DocumentChange],
    docs: js.Array[DocumentSnapshot],
    empty: Boolean,
    forEach: js.Function1[/* snapshot */ DocumentSnapshot, js.Any] => Unit,
    metadata: SnapshotMetadata,
    query: Query,
    size: Double
  ): QuerySnapshot = {
    val __obj = js.Dynamic.literal(docChanges = docChanges.asInstanceOf[js.Any], docs = docs.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any], forEach = js.Any.fromFunction1(forEach), metadata = metadata.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuerySnapshot]
  }
  
  trait NativeData extends StObject {
    
    var changes: js.Array[NativeDocumentChange]
    
    var documents: js.Array[NativeDocumentSnapshot]
    
    var metadata: SnapshotMetadata
  }
  object NativeData {
    
    @scala.inline
    def apply(
      changes: js.Array[NativeDocumentChange],
      documents: js.Array[NativeDocumentSnapshot],
      metadata: SnapshotMetadata
    ): NativeData = {
      val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], documents = documents.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeData]
    }
    
    @scala.inline
    implicit class NativeDataMutableBuilder[Self <: NativeData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChanges(value: js.Array[NativeDocumentChange]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangesVarargs(value: NativeDocumentChange*): Self = StObject.set(x, "changes", js.Array(value :_*))
      
      @scala.inline
      def setDocuments(value: js.Array[NativeDocumentSnapshot]): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentsVarargs(value: NativeDocumentSnapshot*): Self = StObject.set(x, "documents", js.Array(value :_*))
      
      @scala.inline
      def setMetadata(value: SnapshotMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    }
  }
  
  @scala.inline
  implicit class QuerySnapshotMutableBuilder[Self <: QuerySnapshot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocChanges(value: js.Array[DocumentChange]): Self = StObject.set(x, "docChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocChangesVarargs(value: DocumentChange*): Self = StObject.set(x, "docChanges", js.Array(value :_*))
    
    @scala.inline
    def setDocs(value: js.Array[DocumentSnapshot]): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocsVarargs(value: DocumentSnapshot*): Self = StObject.set(x, "docs", js.Array(value :_*))
    
    @scala.inline
    def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForEach(value: js.Function1[/* snapshot */ DocumentSnapshot, js.Any] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMetadata(value: SnapshotMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
