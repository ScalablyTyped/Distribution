package typings.rbx.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnlyValue extends StObject {
  
  var only: js.UndefOr[Boolean] = js.native
  
  var value: Boolean = js.native
}
object OnlyValue {
  
  @scala.inline
  def apply(value: Boolean): OnlyValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnlyValue]
  }
  
  @scala.inline
  implicit class OnlyValueMutableBuilder[Self <: OnlyValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnly(value: Boolean): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
    
    @scala.inline
    def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
