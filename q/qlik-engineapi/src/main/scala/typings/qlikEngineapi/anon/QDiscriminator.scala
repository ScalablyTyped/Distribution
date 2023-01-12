package typings.qlikEngineapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QDiscriminator extends StObject {
  
  var qDiscriminator: String
}
object QDiscriminator {
  
  inline def apply(qDiscriminator: String): QDiscriminator = {
    val __obj = js.Dynamic.literal(qDiscriminator = qDiscriminator.asInstanceOf[js.Any])
    __obj.asInstanceOf[QDiscriminator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QDiscriminator] (val x: Self) extends AnyVal {
    
    inline def setQDiscriminator(value: String): Self = StObject.set(x, "qDiscriminator", value.asInstanceOf[js.Any])
  }
}
