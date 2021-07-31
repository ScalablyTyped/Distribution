package typings.semanticUiVisibility.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'offset'> */
trait PickImploffset extends StObject {
  
  var offset: Double
}
object PickImploffset {
  
  @scala.inline
  def apply(offset: Double): PickImploffset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImploffset]
  }
  
  @scala.inline
  implicit class PickImploffsetMutableBuilder[Self <: PickImploffset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
