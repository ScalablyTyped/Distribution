package typings.sharedb.sharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddNumOp extends Op {
  
  var na: Double = js.native
  
  var p: Path = js.native
}
object AddNumOp {
  
  @scala.inline
  def apply(na: Double, p: Path): AddNumOp = {
    val __obj = js.Dynamic.literal(na = na.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddNumOp]
  }
  
  @scala.inline
  implicit class AddNumOpMutableBuilder[Self <: AddNumOp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNa(value: Double): Self = StObject.set(x, "na", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP(value: Path): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPVarargs(value: (String | Double)*): Self = StObject.set(x, "p", js.Array(value :_*))
  }
}
