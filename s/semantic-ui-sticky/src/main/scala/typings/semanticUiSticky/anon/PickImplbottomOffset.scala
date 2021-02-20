package typings.semanticUiSticky.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sticky.SemanticUI.StickySettings._Impl, 'bottomOffset'> */
@js.native
trait PickImplbottomOffset extends StObject {
  
  var bottomOffset: Double = js.native
}
object PickImplbottomOffset {
  
  @scala.inline
  def apply(bottomOffset: Double): PickImplbottomOffset = {
    val __obj = js.Dynamic.literal(bottomOffset = bottomOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplbottomOffset]
  }
  
  @scala.inline
  implicit class PickImplbottomOffsetMutableBuilder[Self <: PickImplbottomOffset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottomOffset(value: Double): Self = StObject.set(x, "bottomOffset", value.asInstanceOf[js.Any])
  }
}
