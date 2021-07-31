package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyAlgorithm extends StObject {
  
  var name: java.lang.String
}
object KeyAlgorithm {
  
  @scala.inline
  def apply(name: java.lang.String): KeyAlgorithm = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyAlgorithm]
  }
  
  @scala.inline
  implicit class KeyAlgorithmMutableBuilder[Self <: KeyAlgorithm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
