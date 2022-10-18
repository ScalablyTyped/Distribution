package typings.reactUid

import typings.reactUid.distEs5ContextMod.IdSourceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Id extends StObject {
    
    var id: Double
    
    var prefix: String
    
    var quartz: IdSourceType
  }
  object Id {
    
    inline def apply(id: Double, prefix: String, quartz: IdSourceType): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], quartz = quartz.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setQuartz(value: IdSourceType): Self = StObject.set(x, "quartz", value.asInstanceOf[js.Any])
    }
  }
}
