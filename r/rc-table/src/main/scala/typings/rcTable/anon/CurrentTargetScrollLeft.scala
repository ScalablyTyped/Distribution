package typings.rcTable.anon

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrentTargetScrollLeft extends StObject {
  
  var currentTarget: js.UndefOr[HTMLElement] = js.native
  
  var scrollLeft: js.UndefOr[Double] = js.native
}
object CurrentTargetScrollLeft {
  
  @scala.inline
  def apply(): CurrentTargetScrollLeft = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentTargetScrollLeft]
  }
  
  @scala.inline
  implicit class CurrentTargetScrollLeftMutableBuilder[Self <: CurrentTargetScrollLeft] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentTarget(value: HTMLElement): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTargetUndefined: Self = StObject.set(x, "currentTarget", js.undefined)
    
    @scala.inline
    def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollLeftUndefined: Self = StObject.set(x, "scrollLeft", js.undefined)
  }
}
