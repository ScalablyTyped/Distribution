package typings.reactLeafletSidebarv2

import typings.reactLeafletSidebarv2.mod.Anchor
import typings.reactLeafletSidebarv2.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactLeafletSidebarv2Strings {
  
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait bottom extends Anchor
  
  @js.native
  sealed trait left extends Position
  
  @js.native
  sealed trait right extends Position
  
  @js.native
  sealed trait top extends Anchor
}
