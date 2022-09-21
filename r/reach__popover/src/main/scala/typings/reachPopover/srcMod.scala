package typings.reachPopover

import typings.reachPopover.anon.DirectionDown
import typings.reachRect.srcMod.PRect
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.std.HTMLElement
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod {
  
  @JSImport("@reach/popover/dist/declarations/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Popover
    */
  @JSImport("@reach/popover/dist/declarations/src", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', PopoverProps> */ Any = js.native
  
  /**
    * Popover
    */
  @JSImport("@reach/popover/dist/declarations/src", "Popover")
  @js.native
  val Popover: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', PopoverProps> */ Any = js.native
  
  inline def getCollisions(targetRect: PRect, popoverRect: PRect): DirectionDown = (^.asInstanceOf[js.Dynamic].applyDynamic("getCollisions")(targetRect.asInstanceOf[js.Any], popoverRect.asInstanceOf[js.Any])).asInstanceOf[DirectionDown]
  inline def getCollisions(targetRect: PRect, popoverRect: PRect, offsetLeft: Double): DirectionDown = (^.asInstanceOf[js.Dynamic].applyDynamic("getCollisions")(targetRect.asInstanceOf[js.Any], popoverRect.asInstanceOf[js.Any], offsetLeft.asInstanceOf[js.Any])).asInstanceOf[DirectionDown]
  inline def getCollisions(targetRect: PRect, popoverRect: PRect, offsetLeft: Double, offsetBottom: Double): DirectionDown = (^.asInstanceOf[js.Dynamic].applyDynamic("getCollisions")(targetRect.asInstanceOf[js.Any], popoverRect.asInstanceOf[js.Any], offsetLeft.asInstanceOf[js.Any], offsetBottom.asInstanceOf[js.Any])).asInstanceOf[DirectionDown]
  inline def getCollisions(targetRect: PRect, popoverRect: PRect, offsetLeft: Unit, offsetBottom: Double): DirectionDown = (^.asInstanceOf[js.Dynamic].applyDynamic("getCollisions")(targetRect.asInstanceOf[js.Any], popoverRect.asInstanceOf[js.Any], offsetLeft.asInstanceOf[js.Any], offsetBottom.asInstanceOf[js.Any])).asInstanceOf[DirectionDown]
  
  @JSImport("@reach/popover/dist/declarations/src", "positionDefault")
  @js.native
  val positionDefault: Position = js.native
  
  @JSImport("@reach/popover/dist/declarations/src", "positionMatchWidth")
  @js.native
  val positionMatchWidth: Position = js.native
  
  @JSImport("@reach/popover/dist/declarations/src", "positionRight")
  @js.native
  val positionRight: Position = js.native
  
  trait PopoverProps extends StObject {
    
    var children: ReactNode
    
    /**
      * Render the popover markup, but hide it – used by MenuButton so that it
      * can have an `aria-controls` attribute even when its menu isn't open, and
      * used inside `Popover` as a hint that we can tell `useRect` to stop
      * observing for better performance.
      */
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var position: js.UndefOr[Position] = js.undefined
    
    var targetRef: RefObject[PossibleNode]
    
    /**
      * Testing this API so we might accept additional nodes that apps can use to
      * determine the position of the popover. One example where it may be useful
      * is for positioning the popover of a listbox where the cursor rests on top
      * of the selected option. Pretty sure this will change so don't use it
      * anywhere in public yet!
      */
    var unstable_observableRefs: js.UndefOr[js.Array[RefObject[PossibleNode]]] = js.undefined
    
    var unstable_skipInitialPortalRender: js.UndefOr[Boolean] = js.undefined
  }
  object PopoverProps {
    
    inline def apply(targetRef: RefObject[PossibleNode]): PopoverProps = {
      val __obj = js.Dynamic.literal(targetRef = targetRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopoverProps]
    }
    
    extension [Self <: PopoverProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setTargetRef(value: RefObject[PossibleNode]): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
      
      inline def setUnstable_observableRefs(value: js.Array[RefObject[PossibleNode]]): Self = StObject.set(x, "unstable_observableRefs", value.asInstanceOf[js.Any])
      
      inline def setUnstable_observableRefsUndefined: Self = StObject.set(x, "unstable_observableRefs", js.undefined)
      
      inline def setUnstable_observableRefsVarargs(value: RefObject[PossibleNode]*): Self = StObject.set(x, "unstable_observableRefs", js.Array(value*))
      
      inline def setUnstable_skipInitialPortalRender(value: Boolean): Self = StObject.set(x, "unstable_skipInitialPortalRender", value.asInstanceOf[js.Any])
      
      inline def setUnstable_skipInitialPortalRenderUndefined: Self = StObject.set(x, "unstable_skipInitialPortalRender", js.undefined)
    }
  }
  
  @js.native
  trait Position extends StObject {
    
    def apply(targetRect: Null, popoverRect: Null, unstable_observableNodes: PossibleNode*): CSSProperties = js.native
    def apply(targetRect: Null, popoverRect: Unit, unstable_observableNodes: PossibleNode*): CSSProperties = js.native
    def apply(targetRect: Null, popoverRect: PRect, unstable_observableNodes: PossibleNode*): CSSProperties = js.native
    def apply(targetRect: Unit, popoverRect: Null, unstable_observableNodes: PossibleNode*): CSSProperties = js.native
    def apply(targetRect: Unit, popoverRect: Unit, unstable_observableNodes: PossibleNode*): CSSProperties = js.native
    def apply(targetRect: Unit, popoverRect: PRect, unstable_observableNodes: PossibleNode*): CSSProperties = js.native
    def apply(targetRect: PRect, popoverRect: Null, unstable_observableNodes: PossibleNode*): CSSProperties = js.native
    def apply(targetRect: PRect, popoverRect: Unit, unstable_observableNodes: PossibleNode*): CSSProperties = js.native
    def apply(targetRect: PRect, popoverRect: PRect, unstable_observableNodes: PossibleNode*): CSSProperties = js.native
  }
  
  type PossibleNode = js.UndefOr[Null | HTMLElement | SVGElement]
}
