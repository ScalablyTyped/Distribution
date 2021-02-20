package typings.sharedb.sharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringDeleteOp extends Op {
  
  var p: Path = js.native
  
  var sd: String = js.native
}
object StringDeleteOp {
  
  @scala.inline
  def apply(p: Path, sd: String): StringDeleteOp = {
    val __obj = js.Dynamic.literal(p = p.asInstanceOf[js.Any], sd = sd.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringDeleteOp]
  }
  
  @scala.inline
  implicit class StringDeleteOpMutableBuilder[Self <: StringDeleteOp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setP(value: Path): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPVarargs(value: (String | Double)*): Self = StObject.set(x, "p", js.Array(value :_*))
    
    @scala.inline
    def setSd(value: String): Self = StObject.set(x, "sd", value.asInstanceOf[js.Any])
  }
}
