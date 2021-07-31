package typings.spectacle

import typings.spectacle.mod.TransitionEffect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spectacleStrings {
  
  @js.native
  sealed trait arrows extends StObject
  @scala.inline
  def arrows: arrows = "arrows".asInstanceOf[arrows]
  
  @js.native
  sealed trait colors extends StObject
  @scala.inline
  def colors: colors = "colors".asInstanceOf[colors]
  
  @js.native
  sealed trait fade
    extends StObject
       with TransitionEffect
  @scala.inline
  def fade: fade = "fade".asInstanceOf[fade]
  
  @js.native
  sealed trait none
    extends StObject
       with TransitionEffect
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait slide
    extends StObject
       with TransitionEffect
  @scala.inline
  def slide: slide = "slide".asInstanceOf[slide]
  
  @js.native
  sealed trait space extends StObject
  @scala.inline
  def space: space = "space".asInstanceOf[space]
}
