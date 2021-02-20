package typings.reactNavigationStack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Horizontal extends StObject {
  
  var horizontal: js.UndefOr[Double] = js.native
  
  var vertical: js.UndefOr[Double] = js.native
}
object Horizontal {
  
  @scala.inline
  def apply(): Horizontal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Horizontal]
  }
  
  @scala.inline
  implicit class HorizontalMutableBuilder[Self <: Horizontal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHorizontal(value: Double): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    @scala.inline
    def setVertical(value: Double): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
