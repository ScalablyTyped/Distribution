package typings.std.anon

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Raw extends StObject {
  
  /* standard es2015.core */
  var raw: js.Array[String] | ArrayLike[String]
}
object Raw {
  
  inline def apply(raw: js.Array[String] | ArrayLike[String]): Raw = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Raw]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Raw] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: js.Array[String] | ArrayLike[String]): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawVarargs(value: String*): Self = StObject.set(x, "raw", js.Array(value*))
  }
}
