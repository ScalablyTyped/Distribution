package typings.reactInteractive

import typings.reactInteractive.mod.ClickType
import typings.reactInteractive.mod.Focus
import typings.reactInteractive.mod.IState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactInteractiveStrings {
  
  @js.native
  sealed trait hover
    extends StObject
       with IState
  inline def hover: hover = "hover".asInstanceOf[hover]
  
  @js.native
  sealed trait hoverActive
    extends StObject
       with IState
  inline def hoverActive: hoverActive = "hoverActive".asInstanceOf[hoverActive]
  
  @js.native
  sealed trait keyActive
    extends StObject
       with IState
  inline def keyActive: keyActive = "keyActive".asInstanceOf[keyActive]
  
  @js.native
  sealed trait keyClick
    extends StObject
       with ClickType
  inline def keyClick: keyClick = "keyClick".asInstanceOf[keyClick]
  
  @js.native
  sealed trait mouse
    extends StObject
       with Focus
  inline def mouse: mouse = "mouse".asInstanceOf[mouse]
  
  @js.native
  sealed trait mouseClick
    extends StObject
       with ClickType
  inline def mouseClick: mouseClick = "mouseClick".asInstanceOf[mouseClick]
  
  @js.native
  sealed trait normal
    extends StObject
       with IState
  inline def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait tab
    extends StObject
       with Focus
  inline def tab: tab = "tab".asInstanceOf[tab]
  
  @js.native
  sealed trait tapClick
    extends StObject
       with ClickType
  inline def tapClick: tapClick = "tapClick".asInstanceOf[tapClick]
  
  @js.native
  sealed trait touch
    extends StObject
       with Focus
  inline def touch: touch = "touch".asInstanceOf[touch]
  
  @js.native
  sealed trait touchActive
    extends StObject
       with IState
  inline def touchActive: touchActive = "touchActive".asInstanceOf[touchActive]
}
