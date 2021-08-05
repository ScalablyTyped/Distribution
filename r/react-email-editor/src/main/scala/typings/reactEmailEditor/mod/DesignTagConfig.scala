package typings.reactEmailEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DesignTagConfig extends StObject {
  
  val delimeter: js.Tuple2[String, String]
}
object DesignTagConfig {
  
  inline def apply(delimeter: js.Tuple2[String, String]): DesignTagConfig = {
    val __obj = js.Dynamic.literal(delimeter = delimeter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DesignTagConfig]
  }
  
  extension [Self <: DesignTagConfig](x: Self) {
    
    inline def setDelimeter(value: js.Tuple2[String, String]): Self = StObject.set(x, "delimeter", value.asInstanceOf[js.Any])
  }
}
