package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxMetaTitleDescriptionTag width extend NxMetaTitleDescription
  */
trait INxMetaTitleDescriptionTag
  extends StObject
     with INxMetaTitleDescription {
  
  /**
    * Array of String
    */
  var tags: js.Array[String]
}
object INxMetaTitleDescriptionTag {
  
  inline def apply(description: String, tags: js.Array[String], title: String): INxMetaTitleDescriptionTag = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxMetaTitleDescriptionTag]
  }
  
  extension [Self <: INxMetaTitleDescriptionTag](x: Self) {
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
