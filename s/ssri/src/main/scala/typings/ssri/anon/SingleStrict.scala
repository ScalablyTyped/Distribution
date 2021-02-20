package typings.ssri.anon

import typings.ssri.ssriBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SingleStrict extends StObject {
  
  var single: js.UndefOr[`false`] = js.native
  
  var strict: js.UndefOr[Boolean] = js.native
}
object SingleStrict {
  
  @scala.inline
  def apply(): SingleStrict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SingleStrict]
  }
  
  @scala.inline
  implicit class SingleStrictMutableBuilder[Self <: SingleStrict] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSingle(value: `false`): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleUndefined: Self = StObject.set(x, "single", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
