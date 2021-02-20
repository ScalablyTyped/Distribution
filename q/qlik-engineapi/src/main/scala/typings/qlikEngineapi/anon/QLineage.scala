package typings.qlikEngineapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QLineage extends StObject {
  
  var qLineage: js.Array[QDiscriminator] = js.native
}
object QLineage {
  
  @scala.inline
  def apply(qLineage: js.Array[QDiscriminator]): QLineage = {
    val __obj = js.Dynamic.literal(qLineage = qLineage.asInstanceOf[js.Any])
    __obj.asInstanceOf[QLineage]
  }
  
  @scala.inline
  implicit class QLineageMutableBuilder[Self <: QLineage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQLineage(value: js.Array[QDiscriminator]): Self = StObject.set(x, "qLineage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLineageVarargs(value: QDiscriminator*): Self = StObject.set(x, "qLineage", js.Array(value :_*))
  }
}
