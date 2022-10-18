package typings.storybookCoreCommon.distTs3Dot9TypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectoryMapping extends StObject {
  
  var from: String
  
  var to: String
}
object DirectoryMapping {
  
  inline def apply(from: String, to: String): DirectoryMapping = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryMapping]
  }
  
  extension [Self <: DirectoryMapping](x: Self) {
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
