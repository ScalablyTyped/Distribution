package typings.reactDevtoolsInline.commonsMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceAndStyle extends StObject {
  
  var instance: (Record[String, Any]) | Null
  
  var style: (Record[String, Any]) | Null
}
object InstanceAndStyle {
  
  inline def apply(): InstanceAndStyle = {
    val __obj = js.Dynamic.literal(instance = null, style = null)
    __obj.asInstanceOf[InstanceAndStyle]
  }
  
  extension [Self <: InstanceAndStyle](x: Self) {
    
    inline def setInstance(value: Record[String, Any]): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceNull: Self = StObject.set(x, "instance", null)
    
    inline def setStyle(value: Record[String, Any]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
  }
}
