package typings.realm.Realm.Services.MongoDB

import typings.realm.anon.OmitDocumentNamespacecoll
import typings.realm.realmStrings.dropDatabase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Occurs when a database is dropped.
  */
/* Inlined {  ns :std.Omit<realm.Realm.Services.MongoDB.DocumentNamespace, 'coll'>} & realm.Realm.Services.MongoDB.BaseChangeEvent<'dropDatabase'> */
@js.native
trait DropDatabaseEvent
  extends _ChangeEvent[js.Any] {
  
  /** The id of the change event. */
  var _id: ChangeEventId = js.native
  
  /** The timestamp from the oplog entry associated with the event. */
  var clusterTime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Timestamp */ js.Any = js.native
  
  /**
    * The identifier for the session associated with the transaction.
    * Only present if the operation is part of a multi-document transaction.
    */
  var lsid: js.UndefOr[js.Object] = js.native
  
  /** The namespace (specifying only the database name) of the database that got dropped. */
  var ns: OmitDocumentNamespacecoll = js.native
  
  /** The type of operation which was performed on the document. */
  var operationType: dropDatabase = js.native
  
  /**
    * The transaction number.
    * Only present if the operation is part of a multi-document transaction.
    */
  var txnNumber: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any
  ] = js.native
}
object DropDatabaseEvent {
  
  @scala.inline
  def apply(
    _id: ChangeEventId,
    clusterTime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Timestamp */ js.Any,
    ns: OmitDocumentNamespacecoll,
    operationType: dropDatabase
  ): DropDatabaseEvent = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropDatabaseEvent]
  }
  
  @scala.inline
  implicit class DropDatabaseEventOps[Self <: DropDatabaseEvent] (val x: Self) extends AnyVal {
    
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
    def setNs(value: OmitDocumentNamespacecoll): Self = this.set("ns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationType(value: dropDatabase): Self = this.set("operationType", value.asInstanceOf[js.Any])
    
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
