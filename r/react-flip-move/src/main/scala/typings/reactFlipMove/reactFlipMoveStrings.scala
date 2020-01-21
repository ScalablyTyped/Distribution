package typings.reactFlipMove

import typings.reactFlipMove.mod.FlipMove.AnimationPreset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactFlipMoveStrings {
  @js.native
  sealed trait accordionHorizontal extends AnimationPreset
  
  @js.native
  sealed trait accordionVertical extends AnimationPreset
  
  @js.native
  sealed trait elevator extends AnimationPreset
  
  @js.native
  sealed trait fade extends AnimationPreset
  
  @js.native
  sealed trait none extends AnimationPreset
  
  @scala.inline
  def accordionHorizontal: accordionHorizontal = "accordionHorizontal".asInstanceOf[accordionHorizontal]
  @scala.inline
  def accordionVertical: accordionVertical = "accordionVertical".asInstanceOf[accordionVertical]
  @scala.inline
  def elevator: elevator = "elevator".asInstanceOf[elevator]
  @scala.inline
  def fade: fade = "fade".asInstanceOf[fade]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
}

