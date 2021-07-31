package typings.semanticUiPopup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.Popup.MetadataSettings._Impl, 'offset'> */
trait PickImploffsetOffset extends StObject {
  
  var offset: String
}
object PickImploffsetOffset {
  
  @scala.inline
  def apply(offset: String): PickImploffsetOffset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImploffsetOffset]
  }
  
  @scala.inline
  implicit class PickImploffsetOffsetMutableBuilder[Self <: PickImploffsetOffset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
