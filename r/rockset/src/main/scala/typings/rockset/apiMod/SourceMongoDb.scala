package typings.rockset.apiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceMongoDb extends StObject {
  
  /**
    * MongoDB collection name
    * @type {string}
    * @memberof SourceMongoDb
    */
  var collection_name: String
  
  /**
    * MongoDB database name containing this collection
    * @type {string}
    * @memberof SourceMongoDb
    */
  var database_name: String
  
  /**
    * MongoDB source status
    * @type {StatusMongoDb}
    * @memberof SourceMongoDb
    */
  var status: js.UndefOr[StatusMongoDb] = js.undefined
}
object SourceMongoDb {
  
  inline def apply(collection_name: String, database_name: String): SourceMongoDb = {
    val __obj = js.Dynamic.literal(collection_name = collection_name.asInstanceOf[js.Any], database_name = database_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMongoDb]
  }
  
  extension [Self <: SourceMongoDb](x: Self) {
    
    inline def setCollection_name(value: String): Self = StObject.set(x, "collection_name", value.asInstanceOf[js.Any])
    
    inline def setDatabase_name(value: String): Self = StObject.set(x, "database_name", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: StatusMongoDb): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
