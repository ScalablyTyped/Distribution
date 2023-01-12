package typings.reactBeforeunload

import typings.react.mod.ReactNode
import typings.reactBeforeunload.mod.UseBeforeunloadHandler
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var onBeforeunload: UseBeforeunloadHandler
  }
  object Children {
    
    inline def apply(onBeforeunload: /* arg */ Event => js.UndefOr[String | Unit]): Children = {
      val __obj = js.Dynamic.literal(onBeforeunload = js.Any.fromFunction1(onBeforeunload))
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setOnBeforeunload(value: /* arg */ Event => js.UndefOr[String | Unit]): Self = StObject.set(x, "onBeforeunload", js.Any.fromFunction1(value))
    }
  }
}
