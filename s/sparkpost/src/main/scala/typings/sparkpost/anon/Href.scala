package typings.sparkpost.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Href extends StObject {
  
  var href: String
  
  var method: js.Array[String]
  
  var rel: String
}
object Href {
  
  @scala.inline
  def apply(href: String, method: js.Array[String], rel: String): Href = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], rel = rel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Href]
  }
  
  @scala.inline
  implicit class HrefMutableBuilder[Self <: Href] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: js.Array[String]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodVarargs(value: String*): Self = StObject.set(x, "method", js.Array(value :_*))
    
    @scala.inline
    def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
  }
}
