package typings.reactPose

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Current extends StObject {
    
    var current: Any
  }
  object Current {
    
    inline def apply(current: Any): Current = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
      __obj.asInstanceOf[Current]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Current] (val x: Self) extends AnyVal {
      
      inline def setCurrent(value: Any): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var children: js.UndefOr[Any] = js.undefined
    
    var withParent: js.UndefOr[Boolean] = js.undefined
  }
  object Dictkey {
    
    inline def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setWithParent(value: Boolean): Self = StObject.set(x, "withParent", value.asInstanceOf[js.Any])
      
      inline def setWithParentUndefined: Self = StObject.set(x, "withParent", js.undefined)
    }
  }
  
  trait FlipMove extends StObject {
    
    var flipMove: Boolean
  }
  object FlipMove {
    
    inline def apply(flipMove: Boolean): FlipMove = {
      val __obj = js.Dynamic.literal(flipMove = flipMove.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlipMove]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlipMove] (val x: Self) extends AnyVal {
      
      inline def setFlipMove(value: Boolean): Self = StObject.set(x, "flipMove", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<react-pose.react-pose/lib/components/Transition/types.State> */
  trait PartialState extends StObject {
    
    var displayedChildren: js.UndefOr[js.Array[ReactElement]] = js.undefined
    
    var finishedLeaving: js.UndefOr[StringDictionary[Boolean]] = js.undefined
    
    var hasInitialized: js.UndefOr[Boolean] = js.undefined
    
    var indexedChildren: js.UndefOr[StringDictionary[ReactElement]] = js.undefined
    
    var scheduleChildRemoval: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.undefined
  }
  object PartialState {
    
    inline def apply(): PartialState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialState] (val x: Self) extends AnyVal {
      
      inline def setDisplayedChildren(value: js.Array[ReactElement]): Self = StObject.set(x, "displayedChildren", value.asInstanceOf[js.Any])
      
      inline def setDisplayedChildrenUndefined: Self = StObject.set(x, "displayedChildren", js.undefined)
      
      inline def setDisplayedChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "displayedChildren", js.Array(value*))
      
      inline def setFinishedLeaving(value: StringDictionary[Boolean]): Self = StObject.set(x, "finishedLeaving", value.asInstanceOf[js.Any])
      
      inline def setFinishedLeavingUndefined: Self = StObject.set(x, "finishedLeaving", js.undefined)
      
      inline def setHasInitialized(value: Boolean): Self = StObject.set(x, "hasInitialized", value.asInstanceOf[js.Any])
      
      inline def setHasInitializedUndefined: Self = StObject.set(x, "hasInitialized", js.undefined)
      
      inline def setIndexedChildren(value: StringDictionary[ReactElement]): Self = StObject.set(x, "indexedChildren", value.asInstanceOf[js.Any])
      
      inline def setIndexedChildrenUndefined: Self = StObject.set(x, "indexedChildren", js.undefined)
      
      inline def setScheduleChildRemoval(value: /* key */ String => Unit): Self = StObject.set(x, "scheduleChildRemoval", js.Any.fromFunction1(value))
      
      inline def setScheduleChildRemovalUndefined: Self = StObject.set(x, "scheduleChildRemoval", js.undefined)
    }
  }
}
