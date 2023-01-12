package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MongoDbIntegration extends StObject {
  
  /**
    * MongoDB connection URI string
    * @type {string}
    * @memberof MongoDbIntegration
    */
  var connection_uri: String
}
object MongoDbIntegration {
  
  inline def apply(connection_uri: String): MongoDbIntegration = {
    val __obj = js.Dynamic.literal(connection_uri = connection_uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongoDbIntegration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MongoDbIntegration] (val x: Self) extends AnyVal {
    
    inline def setConnection_uri(value: String): Self = StObject.set(x, "connection_uri", value.asInstanceOf[js.Any])
  }
}
