package typings.realm.Realm.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object MongoDB {
  
  /**
    * A stage of an aggregation pipeline.
    */
  type AggregatePipelineStage = js.Object
  
  /**
    * Represents a change event communicated via a MongoDB change stream.
    *
    * @see https://docs.mongodb.com/manual/reference/change-events/
    */
  /* Rewritten from type alias, can be one of: 
    - typings.realm.Realm.Services.MongoDB.InsertEvent[T]
    - typings.realm.Realm.Services.MongoDB.UpdateEvent[T]
    - typings.realm.Realm.Services.MongoDB.ReplaceEvent[T]
    - typings.realm.Realm.Services.MongoDB.DeleteEvent[T]
    - typings.realm.Realm.Services.MongoDB.DropEvent
    - typings.realm.Realm.Services.MongoDB.RenameEvent
    - typings.realm.Realm.Services.MongoDB.DropDatabaseEvent
    - typings.realm.Realm.Services.MongoDB.InvalidateEvent
  */
  type ChangeEvent[T /* <: typings.realm.Realm.Services.MongoDB.Document[_] */] = typings.realm.Realm.Services.MongoDB._ChangeEvent[T] | typings.realm.Realm.Services.MongoDB.InvalidateEvent
  
  /**
    * Acts as the `resumeToken` for the `resumeAfter` parameter when resuming a change stream.
    */
  type ChangeEventId = js.Any
  
  /**
    * A document that contains the _id of the document created or modified by the insert, replace, delete, update operations (i.e. CRUD operations). For sharded collections, also displays the full shard key for the document. The _id field is not repeated if it is already a part of the shard key.
    */
  type DocumentKey[IdType] = typings.realm.anon.Id[IdType] with (typings.std.Record[java.lang.String, _])
  
  /**
    * A filter applied to limit the documents being queried for.
    */
  type Filter = js.Object
  
  /**
    * Invalidate events close the change stream cursor.
    */
  type InvalidateEvent = typings.realm.Realm.Services.MongoDB.BaseChangeEvent[typings.realm.realmStrings.invalidate]
  
  /**
    * A new document with an optional _id defined.
    */
  type NewDocument[T /* <: typings.realm.Realm.Services.MongoDB.Document[_] */] = (typings.std.Omit[T, typings.realm.realmStrings._id]) with (typings.std.Partial[typings.std.Pick[T, typings.realm.realmStrings._id]])
  
  /**
    * An object specifying the update operations to perform when updating a document.
    */
  type Update = js.Object
}
