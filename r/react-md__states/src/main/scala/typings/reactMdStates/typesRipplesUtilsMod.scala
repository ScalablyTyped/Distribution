package typings.reactMdStates

import typings.reactMdStates.anon.PickRippleEventHTMLElemen
import typings.reactMdStates.anon.PickRippleEventHTMLElemenPageX
import typings.reactMdStates.reactMdStatesStrings.currentTarget
import typings.reactMdStates.reactMdStatesStrings.target
import typings.reactMdStates.typesRipplesTypesMod.RippleEvent
import typings.reactMdStates.typesRipplesTypesMod.RippleState
import typings.reactMdStates.typesRipplesTypesMod.RippleType
import typings.std.HTMLElement
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRipplesUtilsMod {
  
  @JSImport("@react-md/states/types/ripples/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createRippleState(event: RippleEvent[HTMLElement]): RippleState = ^.asInstanceOf[js.Dynamic].applyDynamic("createRippleState")(event.asInstanceOf[js.Any]).asInstanceOf[RippleState]
  
  inline def getOrigin(event: PickRippleEventHTMLElemenPageX, element: HTMLElement): Origin = (^.asInstanceOf[js.Dynamic].applyDynamic("getOrigin")(event.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Origin]
  
  inline def getType(event: PickRippleEventHTMLElemen): RippleType = ^.asInstanceOf[js.Dynamic].applyDynamic("getType")(event.asInstanceOf[js.Any]).asInstanceOf[RippleType]
  
  inline def isBubbled[E /* <: HTMLElement */](event: Pick[RippleEvent[E], currentTarget | target]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBubbled")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRippleable(event: RippleEvent[HTMLElement], disableSpacebarClick: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isRippleable")(event.asInstanceOf[js.Any], disableSpacebarClick.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait Origin extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Origin {
    
    inline def apply(x: Double, y: Double): Origin = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Origin]
    }
    
    extension [Self <: Origin](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
