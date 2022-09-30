package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentDispatcherRef extends StObject {
  
  var current: Any
}
object CurrentDispatcherRef {
  
  inline def apply(current: Any): CurrentDispatcherRef = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentDispatcherRef]
  }
  
  extension [Self <: CurrentDispatcherRef](x: Self) {
    
    inline def setCurrent(value: Any): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
  }
}
