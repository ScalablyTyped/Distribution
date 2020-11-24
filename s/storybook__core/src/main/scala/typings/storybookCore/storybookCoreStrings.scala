package typings.storybookCore

import typings.storybookCore.storyRendererMod.Layout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storybookCoreStrings {
  
  @scala.inline
  def centered: centered = "centered".asInstanceOf[centered]
  
  @scala.inline
  def fullscreen: fullscreen = "fullscreen".asInstanceOf[fullscreen]
  
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @scala.inline
  def padded: padded = "padded".asInstanceOf[padded]
  
  @scala.inline
  def `sb-main-centered`: `sb-main-centered` = "sb-main-centered".asInstanceOf[`sb-main-centered`]
  
  @scala.inline
  def `sb-main-fullscreen`: `sb-main-fullscreen` = "sb-main-fullscreen".asInstanceOf[`sb-main-fullscreen`]
  
  @scala.inline
  def `sb-main-padded`: `sb-main-padded` = "sb-main-padded".asInstanceOf[`sb-main-padded`]
  
  @js.native
  sealed trait centered extends Layout
  
  @js.native
  sealed trait fullscreen extends Layout
  
  @js.native
  sealed trait none extends Layout
  
  @js.native
  sealed trait padded extends Layout
  
  @js.native
  sealed trait `sb-main-centered` extends js.Object
  
  @js.native
  sealed trait `sb-main-fullscreen` extends js.Object
  
  @js.native
  sealed trait `sb-main-padded` extends js.Object
}
