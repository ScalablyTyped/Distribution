package typings.reactMdStates

import typings.reactMdStates.typesMod.MergableRippleHandlerNames
import typings.reactMdStates.typesMod.RippleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactMdStatesStrings {
  
  @js.native
  sealed trait currentTarget extends StObject
  inline def currentTarget: currentTarget = "currentTarget".asInstanceOf[currentTarget]
  
  @js.native
  sealed trait keyboard
    extends StObject
       with RippleType
  inline def keyboard: keyboard = "keyboard".asInstanceOf[keyboard]
  
  @js.native
  sealed trait mouse
    extends StObject
       with RippleType
  inline def mouse: mouse = "mouse".asInstanceOf[mouse]
  
  @js.native
  sealed trait onClick
    extends StObject
       with MergableRippleHandlerNames
  inline def onClick: onClick = "onClick".asInstanceOf[onClick]
  
  @js.native
  sealed trait onKeyDown
    extends StObject
       with MergableRippleHandlerNames
  inline def onKeyDown: onKeyDown = "onKeyDown".asInstanceOf[onKeyDown]
  
  @js.native
  sealed trait onKeyUp
    extends StObject
       with MergableRippleHandlerNames
  inline def onKeyUp: onKeyUp = "onKeyUp".asInstanceOf[onKeyUp]
  
  @js.native
  sealed trait onMouseDown
    extends StObject
       with MergableRippleHandlerNames
  inline def onMouseDown: onMouseDown = "onMouseDown".asInstanceOf[onMouseDown]
  
  @js.native
  sealed trait onMouseLeave
    extends StObject
       with MergableRippleHandlerNames
  inline def onMouseLeave: onMouseLeave = "onMouseLeave".asInstanceOf[onMouseLeave]
  
  @js.native
  sealed trait onMouseUp
    extends StObject
       with MergableRippleHandlerNames
  inline def onMouseUp: onMouseUp = "onMouseUp".asInstanceOf[onMouseUp]
  
  @js.native
  sealed trait onTouchEnd
    extends StObject
       with MergableRippleHandlerNames
  inline def onTouchEnd: onTouchEnd = "onTouchEnd".asInstanceOf[onTouchEnd]
  
  @js.native
  sealed trait onTouchMove
    extends StObject
       with MergableRippleHandlerNames
  inline def onTouchMove: onTouchMove = "onTouchMove".asInstanceOf[onTouchMove]
  
  @js.native
  sealed trait onTouchStart
    extends StObject
       with MergableRippleHandlerNames
  inline def onTouchStart: onTouchStart = "onTouchStart".asInstanceOf[onTouchStart]
  
  @js.native
  sealed trait programmatic
    extends StObject
       with RippleType
  inline def programmatic: programmatic = "programmatic".asInstanceOf[programmatic]
  
  @js.native
  sealed trait target extends StObject
  inline def target: target = "target".asInstanceOf[target]
  
  @js.native
  sealed trait touch
    extends StObject
       with RippleType
  inline def touch: touch = "touch".asInstanceOf[touch]
}
