package typings.reactWindowInfiniteLoader

import typings.react.mod.Ref
import typings.reactWindow.mod.ListOnItemsRenderedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait OnItemsRendered extends StObject {
    
    var onItemsRendered: typings.reactWindowInfiniteLoader.mod.OnItemsRendered = js.native
    
    var ref: Ref[_] = js.native
  }
  object OnItemsRendered {
    
    @scala.inline
    def apply(onItemsRendered: /* props */ ListOnItemsRenderedProps => js.Any): OnItemsRendered = {
      val __obj = js.Dynamic.literal(onItemsRendered = js.Any.fromFunction1(onItemsRendered))
      __obj.asInstanceOf[OnItemsRendered]
    }
    
    @scala.inline
    implicit class OnItemsRenderedMutableBuilder[Self <: OnItemsRendered] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnItemsRendered(value: /* props */ ListOnItemsRenderedProps => js.Any): Self = StObject.set(x, "onItemsRendered", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRef(value: Ref[_]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
    }
  }
}
