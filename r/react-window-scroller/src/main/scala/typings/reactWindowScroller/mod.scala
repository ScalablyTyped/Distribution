package typings.reactWindowScroller

import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import typings.react.mod.Ref
import typings.reactWindow.mod.FixedSizeList
import typings.reactWindow.mod.ListOnScrollProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-window-scroller", "ReactWindowScroller")
  @js.native
  val ReactWindowScroller: ComponentType[ScrollerProps] = js.native
  
  trait ScrollerChildProps extends StObject {
    
    var onScroll: js.UndefOr[js.Function1[/* props */ ListOnScrollProps, Any]] = js.undefined
    
    var outerRef: js.UndefOr[Ref[Any]] = js.undefined
    
    var ref: Ref[FixedSizeList[Any]]
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object ScrollerChildProps {
    
    inline def apply(): ScrollerChildProps = {
      val __obj = js.Dynamic.literal(ref = null)
      __obj.asInstanceOf[ScrollerChildProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollerChildProps] (val x: Self) extends AnyVal {
      
      inline def setOnScroll(value: /* props */ ListOnScrollProps => Any): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOuterRef(value: Ref[Any]): Self = StObject.set(x, "outerRef", value.asInstanceOf[js.Any])
      
      inline def setOuterRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "outerRef", js.Any.fromFunction1(value))
      
      inline def setOuterRefNull: Self = StObject.set(x, "outerRef", null)
      
      inline def setOuterRefUndefined: Self = StObject.set(x, "outerRef", js.undefined)
      
      inline def setRef(value: Ref[FixedSizeList[Any]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ FixedSizeList[Any] | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait ScrollerProps extends StObject {
    
    var children: ComponentType[ScrollerChildProps]
  }
  object ScrollerProps {
    
    inline def apply(children: ComponentType[ScrollerChildProps]): ScrollerProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollerProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ComponentType[ScrollerChildProps]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    }
  }
}
