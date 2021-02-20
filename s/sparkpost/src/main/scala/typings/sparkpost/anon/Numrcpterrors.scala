package typings.sparkpost.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Numrcpterrors extends StObject {
  
  var num_rcpt_errors: js.UndefOr[Double] = js.native
}
object Numrcpterrors {
  
  @scala.inline
  def apply(): Numrcpterrors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Numrcpterrors]
  }
  
  @scala.inline
  implicit class NumrcpterrorsMutableBuilder[Self <: Numrcpterrors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNum_rcpt_errors(value: Double): Self = StObject.set(x, "num_rcpt_errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNum_rcpt_errorsUndefined: Self = StObject.set(x, "num_rcpt_errors", js.undefined)
  }
}
