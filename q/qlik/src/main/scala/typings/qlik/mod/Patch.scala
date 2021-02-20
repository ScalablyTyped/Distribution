package typings.qlik.mod

import typings.qlik.qlikStrings.add
import typings.qlik.qlikStrings.remove
import typings.qlik.qlikStrings.replace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Patch extends StObject {
  
  var qOp: add | remove | replace = js.native
  
  var qPath: String = js.native
  
  var qValue: String = js.native
}
object Patch {
  
  @scala.inline
  def apply(qOp: add | remove | replace, qPath: String, qValue: String): Patch = {
    val __obj = js.Dynamic.literal(qOp = qOp.asInstanceOf[js.Any], qPath = qPath.asInstanceOf[js.Any], qValue = qValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Patch]
  }
  
  @scala.inline
  implicit class PatchMutableBuilder[Self <: Patch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQOp(value: add | remove | replace): Self = StObject.set(x, "qOp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQPath(value: String): Self = StObject.set(x, "qPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQValue(value: String): Self = StObject.set(x, "qValue", value.asInstanceOf[js.Any])
  }
}
