package typings.reactInteractive

import typings.reactInteractive.mod.ActiveState
import typings.reactInteractive.mod.FocusState
import typings.reactInteractive.mod.InteractiveStateKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactInteractiveStrings {
  
  @js.native
  sealed trait a extends StObject
  inline def a: a = "a".asInstanceOf[a]
  
  @js.native
  sealed trait active
    extends StObject
       with InteractiveStateKey
  inline def active: active = "active".asInstanceOf[active]
  
  @js.native
  sealed trait as extends StObject
  inline def as: as = "as".asInstanceOf[as]
  
  @js.native
  sealed trait button extends StObject
  inline def button: button = "button".asInstanceOf[button]
  
  @js.native
  sealed trait div extends StObject
  inline def div: div = "div".asInstanceOf[div]
  
  @js.native
  sealed trait focus
    extends StObject
       with InteractiveStateKey
  inline def focus: focus = "focus".asInstanceOf[focus]
  
  @js.native
  sealed trait focusFromKey
    extends StObject
       with FocusState
  inline def focusFromKey: focusFromKey = "focusFromKey".asInstanceOf[focusFromKey]
  
  @js.native
  sealed trait focusFromMouse
    extends StObject
       with FocusState
  inline def focusFromMouse: focusFromMouse = "focusFromMouse".asInstanceOf[focusFromMouse]
  
  @js.native
  sealed trait focusFromTouch
    extends StObject
       with FocusState
  inline def focusFromTouch: focusFromTouch = "focusFromTouch".asInstanceOf[focusFromTouch]
  
  @js.native
  sealed trait hover
    extends StObject
       with InteractiveStateKey
  inline def hover: hover = "hover".asInstanceOf[hover]
  
  @js.native
  sealed trait input extends StObject
  inline def input: input = "input".asInstanceOf[input]
  
  @js.native
  sealed trait keyActive
    extends StObject
       with ActiveState
  inline def keyActive: keyActive = "keyActive".asInstanceOf[keyActive]
  
  @js.native
  sealed trait mouseActive
    extends StObject
       with ActiveState
  inline def mouseActive: mouseActive = "mouseActive".asInstanceOf[mouseActive]
  
  @js.native
  sealed trait ref extends StObject
  inline def ref: ref = "ref".asInstanceOf[ref]
  
  @js.native
  sealed trait select extends StObject
  inline def select: select = "select".asInstanceOf[select]
  
  @js.native
  sealed trait span extends StObject
  inline def span: span = "span".asInstanceOf[span]
  
  @js.native
  sealed trait touchActive
    extends StObject
       with ActiveState
  inline def touchActive: touchActive = "touchActive".asInstanceOf[touchActive]
}
