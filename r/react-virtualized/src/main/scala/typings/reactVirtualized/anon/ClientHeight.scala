package typings.reactVirtualized.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientHeight extends StObject {
  
  var clientHeight: Double
  
  var scrollHeight: Double
  
  var scrollTop: Double
}
object ClientHeight {
  
  @scala.inline
  def apply(clientHeight: Double, scrollHeight: Double, scrollTop: Double): ClientHeight = {
    val __obj = js.Dynamic.literal(clientHeight = clientHeight.asInstanceOf[js.Any], scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientHeight]
  }
  
  @scala.inline
  implicit class ClientHeightMutableBuilder[Self <: ClientHeight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientHeight(value: Double): Self = StObject.set(x, "clientHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollHeight(value: Double): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
  }
}
