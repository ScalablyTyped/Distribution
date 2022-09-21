package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentRef extends StObject {
  
  var filePath: String
  
  var tag: String
}
object ComponentRef {
  
  inline def apply(filePath: String, tag: String): ComponentRef = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentRef]
  }
  
  extension [Self <: ComponentRef](x: Self) {
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
