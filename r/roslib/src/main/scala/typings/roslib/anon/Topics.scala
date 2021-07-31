package typings.roslib.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Topics extends StObject {
  
  var topics: js.Array[java.lang.String]
  
  var types: js.Array[java.lang.String]
}
object Topics {
  
  @scala.inline
  def apply(topics: js.Array[java.lang.String], types: js.Array[java.lang.String]): Topics = {
    val __obj = js.Dynamic.literal(topics = topics.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[Topics]
  }
  
  @scala.inline
  implicit class TopicsMutableBuilder[Self <: Topics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTopics(value: js.Array[java.lang.String]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicsVarargs(value: java.lang.String*): Self = StObject.set(x, "topics", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: js.Array[java.lang.String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: java.lang.String*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
