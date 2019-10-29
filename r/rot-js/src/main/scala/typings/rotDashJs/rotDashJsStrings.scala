package typings.rotDashJs

import typings.rotDashJs.libDisplayTypesMod.LayoutType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rotDashJsStrings {
  @js.native
  sealed trait hex extends LayoutType
  
  @js.native
  sealed trait rect extends LayoutType
  
  @js.native
  sealed trait term extends LayoutType
  
  @js.native
  sealed trait tile extends LayoutType
  
  @js.native
  sealed trait `tile-gl` extends LayoutType
  
  @scala.inline
  def hex: hex = "hex".asInstanceOf[hex]
  @scala.inline
  def rect: rect = "rect".asInstanceOf[rect]
  @scala.inline
  def term: term = "term".asInstanceOf[term]
  @scala.inline
  def tile: tile = "tile".asInstanceOf[tile]
  @scala.inline
  def `tile-gl`: `tile-gl` = "tile-gl".asInstanceOf[`tile-gl`]
}

