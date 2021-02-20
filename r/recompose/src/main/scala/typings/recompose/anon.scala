package typings.recompose

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Children[TInner] extends StObject {
    
    def children(props: TInner): ReactElement = js.native
  }
  object Children {
    
    @scala.inline
    def apply[TInner](children: TInner => ReactElement): Children[TInner] = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[Children[TInner]]
    }
    
    @scala.inline
    implicit class ChildrenMutableBuilder[Self <: Children[_], TInner] (val x: Self with Children[TInner]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: TInner => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
}
