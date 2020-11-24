package typings.realm.Realm.Services

import typings.realm.Realm.Services.MongoDB.Document
import typings.realm.Realm.Services.MongoDB.MongoDBCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The MongoDB service can be used to get database and collection objects for interacting with MongoDB data.
  */
@js.native
trait MongoDBDatabase extends js.Object {
  
  /**
    * Get the interface to a remote MongoDB collection.
    *
    * @param name The name of the collection.
    * @returns The remote MongoDB collection.
    */
  def collection[T /* <: Document[_] */](name: String): MongoDBCollection[T] = js.native
}
object MongoDBDatabase {
  
  @scala.inline
  def apply(collection: String => MongoDBCollection[js.Any]): MongoDBDatabase = {
    val __obj = js.Dynamic.literal(collection = js.Any.fromFunction1(collection))
    __obj.asInstanceOf[MongoDBDatabase]
  }
  
  @scala.inline
  implicit class MongoDBDatabaseOps[Self <: MongoDBDatabase] (val x: Self) extends AnyVal {
    
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
    def setCollection(value: String => MongoDBCollection[js.Any]): Self = this.set("collection", js.Any.fromFunction1(value))
  }
}
