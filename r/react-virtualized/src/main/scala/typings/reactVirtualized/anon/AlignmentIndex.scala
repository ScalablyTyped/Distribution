package typings.reactVirtualized.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignmentIndex extends StObject {
  
  var alignment: js.UndefOr[typings.reactVirtualized.mod.Alignment] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
}
object AlignmentIndex {
  
  @scala.inline
  def apply(): AlignmentIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignmentIndex]
  }
  
  @scala.inline
  implicit class AlignmentIndexMutableBuilder[Self <: AlignmentIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignment(value: typings.reactVirtualized.mod.Alignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
  }
}
