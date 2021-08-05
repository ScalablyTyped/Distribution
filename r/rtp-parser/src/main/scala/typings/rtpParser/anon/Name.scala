package typings.rtpParser.anon

import typings.rtpParser.rtpParserStrings.dynamic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var name: dynamic
}
object Name {
  
  inline def apply(): Name = {
    val __obj = js.Dynamic.literal(name = "dynamic")
    __obj.asInstanceOf[Name]
  }
  
  extension [Self <: Name](x: Self) {
    
    inline def setName(value: dynamic): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
