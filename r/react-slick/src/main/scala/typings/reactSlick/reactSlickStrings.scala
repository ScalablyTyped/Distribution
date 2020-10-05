package typings.reactSlick

import typings.reactSlick.mod.LazyLoadTypes
import typings.reactSlick.mod._SwipeDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactSlickStrings {
  @js.native
  sealed trait down extends _SwipeDirection
  
  @js.native
  sealed trait left extends _SwipeDirection
  
  @js.native
  sealed trait ondemand extends LazyLoadTypes
  
  @js.native
  sealed trait progressive extends LazyLoadTypes
  
  @js.native
  sealed trait right extends _SwipeDirection
  
  @js.native
  sealed trait unslick extends js.Object
  
  @js.native
  sealed trait up extends _SwipeDirection
  
  @scala.inline
  def down: down = "down".asInstanceOf[down]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def ondemand: ondemand = "ondemand".asInstanceOf[ondemand]
  @scala.inline
  def progressive: progressive = "progressive".asInstanceOf[progressive]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def unslick: unslick = "unslick".asInstanceOf[unslick]
  @scala.inline
  def up: up = "up".asInstanceOf[up]
}

