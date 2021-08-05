package typings.primereact.anon

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetHTMLElement extends StObject {
  
  var originalEvent: typings.std.Event
  
  var target: HTMLElement
}
object TargetHTMLElement {
  
  inline def apply(originalEvent: typings.std.Event, target: HTMLElement): TargetHTMLElement = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetHTMLElement]
  }
  
  extension [Self <: TargetHTMLElement](x: Self) {
    
    inline def setOriginalEvent(value: typings.std.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
