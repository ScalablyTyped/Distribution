package typings.spectacle.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait From extends StObject {
  
  var from: Record[String, Double | String]
  
  var to: Record[String, Double | String]
}
object From {
  
  inline def apply(from: Record[String, Double | String], to: Record[String, Double | String]): From = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
  
  extension [Self <: From](x: Self) {
    
    inline def setFrom(value: Record[String, Double | String]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setTo(value: Record[String, Double | String]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
