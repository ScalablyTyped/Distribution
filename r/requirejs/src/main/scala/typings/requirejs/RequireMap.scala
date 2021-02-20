package typings.requirejs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
*
**/
@js.native
trait RequireMap extends StObject {
  
  /**
    *
    **/
  var fullName: String = js.native
  
  /**
    *
    **/
  var name: String = js.native
  
  /**
    *
    **/
  var originalName: String = js.native
  
  /**
    *
    **/
  var parentMap: RequireMap = js.native
  
  /**
    *
    **/
  var prefix: String = js.native
  
  /**
    *
    **/
  var url: String = js.native
}
object RequireMap {
  
  @scala.inline
  def apply(
    fullName: String,
    name: String,
    originalName: String,
    parentMap: RequireMap,
    prefix: String,
    url: String
  ): RequireMap = {
    val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], originalName = originalName.asInstanceOf[js.Any], parentMap = parentMap.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequireMap]
  }
  
  @scala.inline
  implicit class RequireMapMutableBuilder[Self <: RequireMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalName(value: String): Self = StObject.set(x, "originalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentMap(value: RequireMap): Self = StObject.set(x, "parentMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
