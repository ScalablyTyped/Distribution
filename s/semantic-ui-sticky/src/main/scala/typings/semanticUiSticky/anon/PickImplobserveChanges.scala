package typings.semanticUiSticky.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sticky.SemanticUI.StickySettings._Impl, 'observeChanges'> */
trait PickImplobserveChanges extends StObject {
  
  var observeChanges: Boolean
}
object PickImplobserveChanges {
  
  @scala.inline
  def apply(observeChanges: Boolean): PickImplobserveChanges = {
    val __obj = js.Dynamic.literal(observeChanges = observeChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplobserveChanges]
  }
  
  @scala.inline
  implicit class PickImplobserveChangesMutableBuilder[Self <: PickImplobserveChanges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObserveChanges(value: Boolean): Self = StObject.set(x, "observeChanges", value.asInstanceOf[js.Any])
  }
}
