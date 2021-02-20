package typings.semanticUiSticky.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sticky.SemanticUI.Sticky.ClassNameSettings._Impl, 'top'> */
@js.native
trait PickImpltop extends StObject {
  
  var top: String = js.native
}
object PickImpltop {
  
  @scala.inline
  def apply(top: String): PickImpltop = {
    val __obj = js.Dynamic.literal(top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltop]
  }
  
  @scala.inline
  implicit class PickImpltopMutableBuilder[Self <: PickImpltop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
