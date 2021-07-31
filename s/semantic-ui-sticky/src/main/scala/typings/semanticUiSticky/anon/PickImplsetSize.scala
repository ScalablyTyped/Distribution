package typings.semanticUiSticky.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sticky.SemanticUI.StickySettings._Impl, 'setSize'> */
trait PickImplsetSize extends StObject {
  
  var setSize: Boolean
}
object PickImplsetSize {
  
  @scala.inline
  def apply(setSize: Boolean): PickImplsetSize = {
    val __obj = js.Dynamic.literal(setSize = setSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsetSize]
  }
  
  @scala.inline
  implicit class PickImplsetSizeMutableBuilder[Self <: PickImplsetSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetSize(value: Boolean): Self = StObject.set(x, "setSize", value.asInstanceOf[js.Any])
  }
}
