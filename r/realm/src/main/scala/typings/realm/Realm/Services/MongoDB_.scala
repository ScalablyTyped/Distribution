package typings.realm.Realm.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The MongoDB service can be used to get database and collection objects for interacting with MongoDB data.
  */
@js.native
trait MongoDB_ extends js.Object {
  
  /**
    * Get the interface to a remote MongoDB database.
    *
    * @param databaseName The name of the database.
    * @returns The remote MongoDB database.
    */
  def db(databaseName: String): MongoDBDatabase = js.native
}
object MongoDB_ {
  
  @scala.inline
  def apply(db: String => MongoDBDatabase): MongoDB_ = {
    val __obj = js.Dynamic.literal(db = js.Any.fromFunction1(db))
    __obj.asInstanceOf[MongoDB_]
  }
  
  @scala.inline
  implicit class MongoDB_Ops[Self <: MongoDB_] (val x: Self) extends AnyVal {
    
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
    def setDb(value: String => MongoDBDatabase): Self = this.set("db", js.Any.fromFunction1(value))
  }
}
