package typings.smartwizard

import typings.smartwizard.JQuerySmartwizard.ToolbarButtonPosition
import typings.smartwizard.JQuerySmartwizard.ToolbarPosition
import typings.smartwizard.JQuerySmartwizard.TransitionEffect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object smartwizardStrings {
  
  @js.native
  sealed trait both extends ToolbarPosition
  @scala.inline
  def both: both = "both".asInstanceOf[both]
  
  @js.native
  sealed trait bottom extends ToolbarPosition
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait fade extends TransitionEffect
  @scala.inline
  def fade: fade = "fade".asInstanceOf[fade]
  
  @js.native
  sealed trait left extends ToolbarButtonPosition
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait none
    extends ToolbarPosition
       with TransitionEffect
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait right extends ToolbarButtonPosition
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait slide extends TransitionEffect
  @scala.inline
  def slide: slide = "slide".asInstanceOf[slide]
  
  @js.native
  sealed trait top extends ToolbarPosition
  @scala.inline
  def top: top = "top".asInstanceOf[top]
}
