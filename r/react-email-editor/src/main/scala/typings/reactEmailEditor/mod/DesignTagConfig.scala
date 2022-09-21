package typings.reactEmailEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DesignTagConfig extends StObject {
  
  val delimiter: js.Tuple2[String, String]
}
object DesignTagConfig {
  
  inline def apply(delimiter: js.Tuple2[String, String]): DesignTagConfig = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DesignTagConfig]
  }
  
  extension [Self <: DesignTagConfig](x: Self) {
    
    inline def setDelimiter(value: js.Tuple2[String, String]): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
  }
}
