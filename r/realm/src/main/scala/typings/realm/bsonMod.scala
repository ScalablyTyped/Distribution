package typings.realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("realm/types/bson", JSImport.Namespace)
@js.native
object bsonMod extends js.Object {
  
  @js.native
  object Realm extends js.Object {
    
    type Binary = typings.bson.mod.Binary
    
    type Long = typings.bson.mod.Long
    
    // See https://stackoverflow.com/a/51114250 on why we're importing the BSON types like this
    type ObjectId = typings.bson.mod.ObjectId
    
    type Timestamp = typings.bson.mod.Timestamp
  }
}
