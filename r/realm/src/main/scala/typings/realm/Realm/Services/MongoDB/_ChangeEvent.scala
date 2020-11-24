package typings.realm.Realm.Services.MongoDB

import typings.realm.anon.OmitDocumentNamespacecoll
import typings.realm.realmStrings.delete
import typings.realm.realmStrings.drop
import typings.realm.realmStrings.dropDatabase
import typings.realm.realmStrings.insert
import typings.realm.realmStrings.rename
import typings.realm.realmStrings.replace
import typings.realm.realmStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _ChangeEvent[T /* <: Document[_] */] extends js.Object
object _ChangeEvent {
  
  @scala.inline
  def DeleteEvent[T /* <: Document[_] */](
    _id: ChangeEventId,
    clusterTime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Timestamp */ js.Any,
    documentKey: DocumentKey[
      /* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any
    ],
    ns: DocumentNamespace,
    operationType: delete
  ): _ChangeEvent[T] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ChangeEvent[T]]
  }
  
  @scala.inline
  def ReplaceEvent[T /* <: Document[_] */](
    _id: ChangeEventId,
    clusterTime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Timestamp */ js.Any,
    documentKey: DocumentKey[
      /* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any
    ],
    fullDocument: T,
    ns: DocumentNamespace,
    operationType: replace
  ): _ChangeEvent[T] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], fullDocument = fullDocument.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ChangeEvent[T]]
  }
  
  @scala.inline
  def RenameEvent[T /* <: Document[_] */](
    _id: ChangeEventId,
    clusterTime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Timestamp */ js.Any,
    ns: DocumentNamespace,
    operationType: rename,
    to: DocumentNamespace
  ): _ChangeEvent[T] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ChangeEvent[T]]
  }
  
  @scala.inline
  def DropEvent[T /* <: Document[_] */](
    _id: ChangeEventId,
    clusterTime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Timestamp */ js.Any,
    ns: DocumentNamespace,
    operationType: drop
  ): _ChangeEvent[T] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ChangeEvent[T]]
  }
  
  @scala.inline
  def InsertEvent[T /* <: Document[_] */](
    _id: ChangeEventId,
    clusterTime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Timestamp */ js.Any,
    documentKey: DocumentKey[
      /* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any
    ],
    fullDocument: T,
    ns: DocumentNamespace,
    operationType: insert
  ): _ChangeEvent[T] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], fullDocument = fullDocument.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ChangeEvent[T]]
  }
  
  @scala.inline
  def DropDatabaseEvent[T /* <: Document[_] */](
    _id: ChangeEventId,
    clusterTime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Timestamp */ js.Any,
    ns: OmitDocumentNamespacecoll,
    operationType: dropDatabase
  ): _ChangeEvent[T] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ChangeEvent[T]]
  }
  
  @scala.inline
  def UpdateEvent[T /* <: Document[_] */](
    _id: ChangeEventId,
    clusterTime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Timestamp */ js.Any,
    documentKey: DocumentKey[
      /* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any
    ],
    ns: DocumentNamespace,
    operationType: update,
    updateDescription: UpdateDescription
  ): _ChangeEvent[T] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any], updateDescription = updateDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ChangeEvent[T]]
  }
}
