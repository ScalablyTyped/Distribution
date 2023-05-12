package typings.rcComponentTrigger

import typings.rcComponentTrigger.esInterfaceMod.ActionType
import typings.rcComponentTrigger.esInterfaceMod.AlignPointLeftRight
import typings.rcComponentTrigger.esInterfaceMod.AlignPointTopBottom
import typings.rcComponentTrigger.esInterfaceMod.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rcComponentTriggerStrings {
  
  @js.native
  sealed trait b
    extends StObject
       with AlignPointTopBottom
  inline def b: b = "b".asInstanceOf[b]
  
  @js.native
  sealed trait bottom
    extends StObject
       with Placement
  inline def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait bottomLeft
    extends StObject
       with Placement
  inline def bottomLeft: bottomLeft = "bottomLeft".asInstanceOf[bottomLeft]
  
  @js.native
  sealed trait bottomRight
    extends StObject
       with Placement
  inline def bottomRight: bottomRight = "bottomRight".asInstanceOf[bottomRight]
  
  @js.native
  sealed trait c
    extends StObject
       with AlignPointLeftRight
       with AlignPointTopBottom
  inline def c: c = "c".asInstanceOf[c]
  
  @js.native
  sealed trait click
    extends StObject
       with ActionType
  inline def click: click = "click".asInstanceOf[click]
  
  @js.native
  sealed trait contextMenu
    extends StObject
       with ActionType
  inline def contextMenu: contextMenu = "contextMenu".asInstanceOf[contextMenu]
  
  @js.native
  sealed trait focus
    extends StObject
       with ActionType
  inline def focus: focus = "focus".asInstanceOf[focus]
  
  @js.native
  sealed trait hover
    extends StObject
       with ActionType
  inline def hover: hover = "hover".asInstanceOf[hover]
  
  @js.native
  sealed trait l
    extends StObject
       with AlignPointLeftRight
  inline def l: l = "l".asInstanceOf[l]
  
  @js.native
  sealed trait left
    extends StObject
       with Placement
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait leftBottom
    extends StObject
       with Placement
  inline def leftBottom: leftBottom = "leftBottom".asInstanceOf[leftBottom]
  
  @js.native
  sealed trait leftTop
    extends StObject
       with Placement
  inline def leftTop: leftTop = "leftTop".asInstanceOf[leftTop]
  
  @js.native
  sealed trait r
    extends StObject
       with AlignPointLeftRight
  inline def r: r = "r".asInstanceOf[r]
  
  @js.native
  sealed trait right
    extends StObject
       with Placement
  inline def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait rightBottom
    extends StObject
       with Placement
  inline def rightBottom: rightBottom = "rightBottom".asInstanceOf[rightBottom]
  
  @js.native
  sealed trait rightTop
    extends StObject
       with Placement
  inline def rightTop: rightTop = "rightTop".asInstanceOf[rightTop]
  
  @js.native
  sealed trait scroll extends StObject
  inline def scroll: scroll = "scroll".asInstanceOf[scroll]
  
  @js.native
  sealed trait t
    extends StObject
       with AlignPointTopBottom
  inline def t: t = "t".asInstanceOf[t]
  
  @js.native
  sealed trait top
    extends StObject
       with Placement
  inline def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait topLeft
    extends StObject
       with Placement
  inline def topLeft: topLeft = "topLeft".asInstanceOf[topLeft]
  
  @js.native
  sealed trait topRight
    extends StObject
       with Placement
  inline def topRight: topRight = "topRight".asInstanceOf[topRight]
  
  @js.native
  sealed trait visible extends StObject
  inline def visible: visible = "visible".asInstanceOf[visible]
}
