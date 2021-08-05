package typings.storybookUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WithLoader extends StObject {
  
  var id: String
  
  var withLoader: Boolean
}
object WithLoader {
  
  inline def apply(id: String, withLoader: Boolean): WithLoader = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], withLoader = withLoader.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithLoader]
  }
  
  extension [Self <: WithLoader](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setWithLoader(value: Boolean): Self = StObject.set(x, "withLoader", value.asInstanceOf[js.Any])
  }
}
