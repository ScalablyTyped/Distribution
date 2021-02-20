package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollOptions extends StObject {
  
  var behavior: js.UndefOr[ScrollBehavior] = js.native
}
object ScrollOptions {
  
  @scala.inline
  def apply(): ScrollOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollOptions]
  }
  
  @scala.inline
  implicit class ScrollOptionsMutableBuilder[Self <: ScrollOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBehavior(value: ScrollBehavior): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
  }
}
