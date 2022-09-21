package typings.reachPopover

import typings.reachPopover.anon.DirectionDown
import typings.reachPopover.srcMod.Position
import typings.reachRect.srcMod.PRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@reach/popover", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Popover
    */
  @JSImport("@reach/popover", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', PopoverProps> */ Any = js.native
  
  /**
    * Popover
    */
  @JSImport("@reach/popover", "Popover")
  @js.native
  val Popover: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', PopoverProps> */ Any = js.native
  
  inline def getCollisions(targetRect: PRect, popoverRect: PRect): DirectionDown = (^.asInstanceOf[js.Dynamic].applyDynamic("getCollisions")(targetRect.asInstanceOf[js.Any], popoverRect.asInstanceOf[js.Any])).asInstanceOf[DirectionDown]
  inline def getCollisions(targetRect: PRect, popoverRect: PRect, offsetLeft: Double): DirectionDown = (^.asInstanceOf[js.Dynamic].applyDynamic("getCollisions")(targetRect.asInstanceOf[js.Any], popoverRect.asInstanceOf[js.Any], offsetLeft.asInstanceOf[js.Any])).asInstanceOf[DirectionDown]
  inline def getCollisions(targetRect: PRect, popoverRect: PRect, offsetLeft: Double, offsetBottom: Double): DirectionDown = (^.asInstanceOf[js.Dynamic].applyDynamic("getCollisions")(targetRect.asInstanceOf[js.Any], popoverRect.asInstanceOf[js.Any], offsetLeft.asInstanceOf[js.Any], offsetBottom.asInstanceOf[js.Any])).asInstanceOf[DirectionDown]
  inline def getCollisions(targetRect: PRect, popoverRect: PRect, offsetLeft: Unit, offsetBottom: Double): DirectionDown = (^.asInstanceOf[js.Dynamic].applyDynamic("getCollisions")(targetRect.asInstanceOf[js.Any], popoverRect.asInstanceOf[js.Any], offsetLeft.asInstanceOf[js.Any], offsetBottom.asInstanceOf[js.Any])).asInstanceOf[DirectionDown]
  
  @JSImport("@reach/popover", "positionDefault")
  @js.native
  val positionDefault: Position = js.native
  
  @JSImport("@reach/popover", "positionMatchWidth")
  @js.native
  val positionMatchWidth: Position = js.native
  
  @JSImport("@reach/popover", "positionRight")
  @js.native
  val positionRight: Position = js.native
}
