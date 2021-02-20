package typings.reactBeforeunload

import typings.react.mod.ReactNode
import typings.reactBeforeunload.mod.UseBeforeunloadHandler
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Children extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var onBeforeunload: UseBeforeunloadHandler = js.native
  }
  object Children {
    
    @scala.inline
    def apply(onBeforeunload: /* arg */ Event => js.UndefOr[String | Unit]): Children = {
      val __obj = js.Dynamic.literal(onBeforeunload = js.Any.fromFunction1(onBeforeunload))
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setOnBeforeunload(value: /* arg */ Event => js.UndefOr[String | Unit]): Self = StObject.set(x, "onBeforeunload", js.Any.fromFunction1(value))
    }
  }
}
