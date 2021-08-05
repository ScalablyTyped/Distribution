package typings.smartwizard

import typings.smartwizard.JQuerySmartwizard.ToolbarButtonPosition
import typings.smartwizard.JQuerySmartwizard.ToolbarPosition
import typings.smartwizard.JQuerySmartwizard.TransitionEffect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object smartwizardStrings {
  
  @js.native
  sealed trait both
    extends StObject
       with ToolbarPosition
  inline def both: both = "both".asInstanceOf[both]
  
  @js.native
  sealed trait bottom
    extends StObject
       with ToolbarPosition
  inline def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait fade
    extends StObject
       with TransitionEffect
  inline def fade: fade = "fade".asInstanceOf[fade]
  
  @js.native
  sealed trait left
    extends StObject
       with ToolbarButtonPosition
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait none
    extends StObject
       with ToolbarPosition
       with TransitionEffect
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait right
    extends StObject
       with ToolbarButtonPosition
  inline def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait slide
    extends StObject
       with TransitionEffect
  inline def slide: slide = "slide".asInstanceOf[slide]
  
  @js.native
  sealed trait top
    extends StObject
       with ToolbarPosition
  inline def top: top = "top".asInstanceOf[top]
}
