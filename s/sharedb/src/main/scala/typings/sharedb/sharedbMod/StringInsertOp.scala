package typings.sharedb.sharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringInsertOp extends Op {
  
  var p: Path = js.native
  
  var si: String = js.native
}
object StringInsertOp {
  
  @scala.inline
  def apply(p: Path, si: String): StringInsertOp = {
    val __obj = js.Dynamic.literal(p = p.asInstanceOf[js.Any], si = si.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringInsertOp]
  }
  
  @scala.inline
  implicit class StringInsertOpMutableBuilder[Self <: StringInsertOp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setP(value: Path): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPVarargs(value: (String | Double)*): Self = StObject.set(x, "p", js.Array(value :_*))
    
    @scala.inline
    def setSi(value: String): Self = StObject.set(x, "si", value.asInstanceOf[js.Any])
  }
}
