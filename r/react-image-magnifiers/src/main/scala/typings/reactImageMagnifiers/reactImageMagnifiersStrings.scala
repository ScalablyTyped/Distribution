package typings.reactImageMagnifiers

import typings.reactImageMagnifiers.mod.MouseActivation
import typings.reactImageMagnifiers.mod.TouchActivation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactImageMagnifiersStrings {
  
  @js.native
  sealed trait bottom extends StObject
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait click extends MouseActivation
  @scala.inline
  def click: click = "click".asInstanceOf[click]
  
  @js.native
  sealed trait doubleClick extends MouseActivation
  @scala.inline
  def doubleClick: doubleClick = "doubleClick".asInstanceOf[doubleClick]
  
  @js.native
  sealed trait doubleTap extends TouchActivation
  @scala.inline
  def doubleTap: doubleTap = "doubleTap".asInstanceOf[doubleTap]
  
  @js.native
  sealed trait left extends StObject
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait longTouch extends TouchActivation
  @scala.inline
  def longTouch: longTouch = "longTouch".asInstanceOf[longTouch]
  
  @js.native
  sealed trait right extends StObject
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait tap extends TouchActivation
  @scala.inline
  def tap: tap = "tap".asInstanceOf[tap]
  
  @js.native
  sealed trait top extends StObject
  @scala.inline
  def top: top = "top".asInstanceOf[top]
}
