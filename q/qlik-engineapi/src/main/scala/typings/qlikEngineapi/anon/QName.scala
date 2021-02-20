package typings.qlikEngineapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QName extends StObject {
  
  var qName: String = js.native
}
object QName {
  
  @scala.inline
  def apply(qName: String): QName = {
    val __obj = js.Dynamic.literal(qName = qName.asInstanceOf[js.Any])
    __obj.asInstanceOf[QName]
  }
  
  @scala.inline
  implicit class QNameMutableBuilder[Self <: QName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
  }
}
