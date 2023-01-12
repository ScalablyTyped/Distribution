package typings.roslib.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringString extends StObject {
  
  var string: java.lang.String
}
object StringString {
  
  inline def apply(string: java.lang.String): StringString = {
    val __obj = js.Dynamic.literal(string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StringString] (val x: Self) extends AnyVal {
    
    inline def setString(value: java.lang.String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
  }
}
