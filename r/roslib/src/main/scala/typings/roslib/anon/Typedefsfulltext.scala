package typings.roslib.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typedefsfulltext extends StObject {
  
  var topics: js.Array[java.lang.String]
  
  var typedefs_full_text: js.Array[java.lang.String]
  
  var types: js.Array[java.lang.String]
}
object Typedefsfulltext {
  
  inline def apply(
    topics: js.Array[java.lang.String],
    typedefs_full_text: js.Array[java.lang.String],
    types: js.Array[java.lang.String]
  ): Typedefsfulltext = {
    val __obj = js.Dynamic.literal(topics = topics.asInstanceOf[js.Any], typedefs_full_text = typedefs_full_text.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typedefsfulltext]
  }
  
  extension [Self <: Typedefsfulltext](x: Self) {
    
    inline def setTopics(value: js.Array[java.lang.String]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsVarargs(value: java.lang.String*): Self = StObject.set(x, "topics", js.Array(value*))
    
    inline def setTypedefs_full_text(value: js.Array[java.lang.String]): Self = StObject.set(x, "typedefs_full_text", value.asInstanceOf[js.Any])
    
    inline def setTypedefs_full_textVarargs(value: java.lang.String*): Self = StObject.set(x, "typedefs_full_text", js.Array(value*))
    
    inline def setTypes(value: js.Array[java.lang.String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: java.lang.String*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
