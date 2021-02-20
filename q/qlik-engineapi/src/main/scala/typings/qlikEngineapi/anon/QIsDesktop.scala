package typings.qlikEngineapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QIsDesktop extends StObject {
  
  var qIsDesktop: Boolean = js.native
  
  var qSSOEnabled: Boolean = js.native
}
object QIsDesktop {
  
  @scala.inline
  def apply(qIsDesktop: Boolean, qSSOEnabled: Boolean): QIsDesktop = {
    val __obj = js.Dynamic.literal(qIsDesktop = qIsDesktop.asInstanceOf[js.Any], qSSOEnabled = qSSOEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[QIsDesktop]
  }
  
  @scala.inline
  implicit class QIsDesktopMutableBuilder[Self <: QIsDesktop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQIsDesktop(value: Boolean): Self = StObject.set(x, "qIsDesktop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSSOEnabled(value: Boolean): Self = StObject.set(x, "qSSOEnabled", value.asInstanceOf[js.Any])
  }
}
