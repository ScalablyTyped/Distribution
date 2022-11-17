package typings.react.mod

import typings.scheduler.tracingMod.Interaction
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfilerProps extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var id: String
  
  var onRender: ProfilerOnRenderCallback
}
object ProfilerProps {
  
  inline def apply(
    id: String,
    onRender: (/* id */ String, /* phase */ "mount" | "update", /* actualDuration */ Double, /* baseDuration */ Double, /* startTime */ Double, /* commitTime */ Double, /* interactions */ Set[Interaction]) => Unit
  ): ProfilerProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onRender = js.Any.fromFunction7(onRender))
    __obj.asInstanceOf[ProfilerProps]
  }
  
  extension [Self <: ProfilerProps](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOnRender(
      value: (/* id */ String, /* phase */ "mount" | "update", /* actualDuration */ Double, /* baseDuration */ Double, /* startTime */ Double, /* commitTime */ Double, /* interactions */ Set[Interaction]) => Unit
    ): Self = StObject.set(x, "onRender", js.Any.fromFunction7(value))
  }
}
