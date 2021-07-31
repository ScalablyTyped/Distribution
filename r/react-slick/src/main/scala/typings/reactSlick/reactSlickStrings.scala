package typings.reactSlick

import typings.reactSlick.mod.LazyLoadTypes
import typings.reactSlick.mod._SwipeDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactSlickStrings {
  
  @js.native
  sealed trait down
    extends StObject
       with _SwipeDirection
  @scala.inline
  def down: down = "down".asInstanceOf[down]
  
  @js.native
  sealed trait left
    extends StObject
       with _SwipeDirection
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait ondemand
    extends StObject
       with LazyLoadTypes
  @scala.inline
  def ondemand: ondemand = "ondemand".asInstanceOf[ondemand]
  
  @js.native
  sealed trait progressive
    extends StObject
       with LazyLoadTypes
  @scala.inline
  def progressive: progressive = "progressive".asInstanceOf[progressive]
  
  @js.native
  sealed trait right
    extends StObject
       with _SwipeDirection
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait unslick extends StObject
  @scala.inline
  def unslick: unslick = "unslick".asInstanceOf[unslick]
  
  @js.native
  sealed trait up
    extends StObject
       with _SwipeDirection
  @scala.inline
  def up: up = "up".asInstanceOf[up]
}
