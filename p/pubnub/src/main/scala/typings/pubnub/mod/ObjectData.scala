package typings.pubnub.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Objects v1
// Object
trait ObjectData extends StObject {
  
  var created: String
  
  var custom: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  var eTag: String
  
  var id: String
  
  var updated: String
}
object ObjectData {
  
  @scala.inline
  def apply(created: String, eTag: String, id: String, updated: String): ObjectData = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], eTag = eTag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectData]
  }
  
  @scala.inline
  implicit class ObjectDataMutableBuilder[Self <: ObjectData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom(value: StringDictionary[String]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomNull: Self = StObject.set(x, "custom", null)
    
    @scala.inline
    def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    @scala.inline
    def setETag(value: String): Self = StObject.set(x, "eTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
  }
}
