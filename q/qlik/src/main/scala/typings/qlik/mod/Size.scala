package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Size extends StObject {
  
  var qcx: Double = js.native
  
  var qcy: Double = js.native
}
object Size {
  
  @scala.inline
  def apply(qcx: Double, qcy: Double): Size = {
    val __obj = js.Dynamic.literal(qcx = qcx.asInstanceOf[js.Any], qcy = qcy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
  
  @scala.inline
  implicit class SizeMutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQcx(value: Double): Self = StObject.set(x, "qcx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQcy(value: Double): Self = StObject.set(x, "qcy", value.asInstanceOf[js.Any])
  }
}
