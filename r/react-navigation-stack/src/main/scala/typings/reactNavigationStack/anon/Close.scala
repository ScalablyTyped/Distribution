package typings.reactNavigationStack.anon

import typings.reactNavigationStack.vendorTypesMod.TransitionSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Close extends StObject {
  
  var close: TransitionSpec
  
  var open: TransitionSpec
}
object Close {
  
  @scala.inline
  def apply(close: TransitionSpec, open: TransitionSpec): Close = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[Close]
  }
  
  @scala.inline
  implicit class CloseMutableBuilder[Self <: Close] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: TransitionSpec): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: TransitionSpec): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
  }
}
