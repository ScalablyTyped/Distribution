package typings.reactNativeFbsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectIdAndType extends StObject {
  
  /**
    * The object ID, this can be a URL or a Facebook ID.
    */
  var objectId: String
  
  /**
    * Encapsulates the valid values for the facebook:object_type
    * attribute for a LikeView
    */
  var objectType: ObjectIdActionType
}
object ObjectIdAndType {
  
  inline def apply(objectId: String, objectType: ObjectIdActionType): ObjectIdAndType = {
    val __obj = js.Dynamic.literal(objectId = objectId.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectIdAndType]
  }
  
  extension [Self <: ObjectIdAndType](x: Self) {
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectType(value: ObjectIdActionType): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
  }
}
