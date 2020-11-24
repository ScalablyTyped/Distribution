package typings.realm.Realm.Services.MongoDB

import typings.realm.realmStrings.insert
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A document got inserted into the collection.
  */
/* Inlined {  ns :realm.Realm.Services.MongoDB.DocumentNamespace,   documentKey :realm.Realm.Services.MongoDB.DocumentKey<T['_id']>,   fullDocument :T} & realm.Realm.Services.MongoDB.BaseChangeEvent<'insert'> */
@js.native
trait InsertEvent[T /* <: Document[_] */] extends _ChangeEvent[T] {
  
  /** The id of the change event. */
  var _id: ChangeEventId = js.native
  
  /** The timestamp from the oplog entry associated with the event. */
  var clusterTime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Timestamp */ js.Any = js.native
  
  /** A document that contains the _id of the inserted document. */
  var documentKey: DocumentKey[
    /* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any
  ] = js.native
  
  /** The new document created by the operation */
  var fullDocument: T = js.native
  
  /**
    * The identifier for the session associated with the transaction.
    * Only present if the operation is part of a multi-document transaction.
    */
  var lsid: js.UndefOr[js.Object] = js.native
  
  /** The namespace (database and collection) of the document got inserted into. */
  var ns: DocumentNamespace = js.native
  
  /** The type of operation which was performed on the document. */
  var operationType: insert = js.native
  
  /**
    * The transaction number.
    * Only present if the operation is part of a multi-document transaction.
    */
  var txnNumber: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any
  ] = js.native
}
object InsertEvent {
  
  @scala.inline
  def apply[T /* <: Document[_] */](
    _id: ChangeEventId,
    clusterTime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Timestamp */ js.Any,
    documentKey: DocumentKey[
      /* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any
    ],
    fullDocument: T,
    ns: DocumentNamespace,
    operationType: insert
  ): InsertEvent[T] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], fullDocument = fullDocument.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertEvent[T]]
  }
  
  @scala.inline
  implicit class InsertEventOps[Self <: InsertEvent[_], T /* <: Document[_] */] (val x: Self with InsertEvent[T]) extends AnyVal {
    
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
    def set_id(value: ChangeEventId): Self = this.set("_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterTime(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Timestamp */ js.Any
    ): Self = this.set("clusterTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentKey(
      value: DocumentKey[
          /* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any
        ]
    ): Self = this.set("documentKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullDocument(value: T): Self = this.set("fullDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNs(value: DocumentNamespace): Self = this.set("ns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationType(value: insert): Self = this.set("operationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLsid(value: js.Object): Self = this.set("lsid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLsid: Self = this.set("lsid", js.undefined)
    
    @scala.inline
    def setTxnNumber(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any
    ): Self = this.set("txnNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTxnNumber: Self = this.set("txnNumber", js.undefined)
  }
}
