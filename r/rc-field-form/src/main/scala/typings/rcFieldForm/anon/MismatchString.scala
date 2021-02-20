package typings.rcFieldForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MismatchString extends StObject {
  
  var mismatch: String = js.native
}
object MismatchString {
  
  @scala.inline
  def apply(mismatch: String): MismatchString = {
    val __obj = js.Dynamic.literal(mismatch = mismatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[MismatchString]
  }
  
  @scala.inline
  implicit class MismatchStringMutableBuilder[Self <: MismatchString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMismatch(value: String): Self = StObject.set(x, "mismatch", value.asInstanceOf[js.Any])
  }
}
