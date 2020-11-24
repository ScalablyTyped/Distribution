package typings.reactImageMagnifiers

import typings.reactImageMagnifiers.mod.MouseActivation
import typings.reactImageMagnifiers.mod.TouchActivation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactImageMagnifiersStrings {
  
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @scala.inline
  def click: click = "click".asInstanceOf[click]
  
  @scala.inline
  def doubleClick: doubleClick = "doubleClick".asInstanceOf[doubleClick]
  
  @scala.inline
  def doubleTap: doubleTap = "doubleTap".asInstanceOf[doubleTap]
  
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @scala.inline
  def longTouch: longTouch = "longTouch".asInstanceOf[longTouch]
  
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @scala.inline
  def tap: tap = "tap".asInstanceOf[tap]
  
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait bottom extends js.Object
  
  @js.native
  sealed trait click extends MouseActivation
  
  @js.native
  sealed trait doubleClick extends MouseActivation
  
  @js.native
  sealed trait doubleTap extends TouchActivation
  
  @js.native
  sealed trait left extends js.Object
  
  @js.native
  sealed trait longTouch extends TouchActivation
  
  @js.native
  sealed trait right extends js.Object
  
  @js.native
  sealed trait tap extends TouchActivation
  
  @js.native
  sealed trait top extends js.Object
}
