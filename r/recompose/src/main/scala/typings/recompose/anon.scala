package typings.recompose

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children[TInner] extends StObject {
    
    def children(props: TInner): ReactElement
  }
  object Children {
    
    inline def apply[TInner](children: TInner => ReactElement): Children[TInner] = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[Children[TInner]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Children[?], TInner] (val x: Self & Children[TInner]) extends AnyVal {
      
      inline def setChildren(value: TInner => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
}
