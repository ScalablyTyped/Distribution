package typings.spectacle.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Plain extends StObject {
  
  var plain: Record[String, String]
  
  var styles: js.Array[Style]
}
object Plain {
  
  inline def apply(plain: Record[String, String], styles: js.Array[Style]): Plain = {
    val __obj = js.Dynamic.literal(plain = plain.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plain]
  }
  
  extension [Self <: Plain](x: Self) {
    
    inline def setPlain(value: Record[String, String]): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
    
    inline def setStyles(value: js.Array[Style]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesVarargs(value: Style*): Self = StObject.set(x, "styles", js.Array(value :_*))
  }
}
