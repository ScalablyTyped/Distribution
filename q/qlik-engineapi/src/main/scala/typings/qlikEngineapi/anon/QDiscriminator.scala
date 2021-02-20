package typings.qlikEngineapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QDiscriminator extends StObject {
  
  var qDiscriminator: String = js.native
}
object QDiscriminator {
  
  @scala.inline
  def apply(qDiscriminator: String): QDiscriminator = {
    val __obj = js.Dynamic.literal(qDiscriminator = qDiscriminator.asInstanceOf[js.Any])
    __obj.asInstanceOf[QDiscriminator]
  }
  
  @scala.inline
  implicit class QDiscriminatorMutableBuilder[Self <: QDiscriminator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQDiscriminator(value: String): Self = StObject.set(x, "qDiscriminator", value.asInstanceOf[js.Any])
  }
}
