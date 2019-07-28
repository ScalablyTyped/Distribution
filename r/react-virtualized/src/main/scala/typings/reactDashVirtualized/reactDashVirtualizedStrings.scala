package typings.reactDashVirtualized

import typings.reactDashVirtualized.distEsGridMod.ScrollDirection
import typings.reactDashVirtualized.distEsTableMod.SortDirectionType
import typings.reactDashVirtualized.reactDashVirtualizedMod.Alignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashVirtualizedStrings {
  @js.native
  sealed trait ASC extends SortDirectionType
  
  @js.native
  sealed trait DESC extends SortDirectionType
  
  @js.native
  sealed trait Empty extends js.Object
  
  @js.native
  sealed trait auto extends Alignment
  
  @js.native
  sealed trait cells extends js.Object
  
  @js.native
  sealed trait center extends Alignment
  
  @js.native
  sealed trait edges extends js.Object
  
  @js.native
  sealed trait end extends Alignment
  
  @js.native
  sealed trait grid extends js.Object
  
  @js.native
  sealed trait horizontal extends ScrollDirection
  
  @js.native
  sealed trait rowIndex extends js.Object
  
  @js.native
  sealed trait rowgroup extends js.Object
  
  @js.native
  sealed trait start extends Alignment
  
  @js.native
  sealed trait vertical extends ScrollDirection
  
  @scala.inline
  def ASC: ASC = "ASC".asInstanceOf[ASC]
  @scala.inline
  def DESC: DESC = "DESC".asInstanceOf[DESC]
  @scala.inline
  def Empty: Empty = "".asInstanceOf[Empty]
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  @scala.inline
  def cells: cells = "cells".asInstanceOf[cells]
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  @scala.inline
  def edges: edges = "edges".asInstanceOf[edges]
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  @scala.inline
  def grid: grid = "grid".asInstanceOf[grid]
  @scala.inline
  def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  @scala.inline
  def rowIndex: rowIndex = "rowIndex".asInstanceOf[rowIndex]
  @scala.inline
  def rowgroup: rowgroup = "rowgroup".asInstanceOf[rowgroup]
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  @scala.inline
  def vertical: vertical = "vertical".asInstanceOf[vertical]
}

