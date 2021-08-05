package typings.reactVirtualized

import typings.reactVirtualized.esGridMod.ScrollDirection
import typings.reactVirtualized.esTableMod.SortDirectionType
import typings.reactVirtualized.mod.Alignment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactVirtualizedStrings {
  
  @js.native
  sealed trait ASC
    extends StObject
       with SortDirectionType
  inline def ASC: ASC = "ASC".asInstanceOf[ASC]
  
  @js.native
  sealed trait DESC
    extends StObject
       with SortDirectionType
  inline def DESC: DESC = "DESC".asInstanceOf[DESC]
  
  @js.native
  sealed trait _empty extends StObject
  inline def _empty: _empty = "".asInstanceOf[_empty]
  
  @js.native
  sealed trait auto
    extends StObject
       with Alignment
  inline def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait cells extends StObject
  inline def cells: cells = "cells".asInstanceOf[cells]
  
  @js.native
  sealed trait center
    extends StObject
       with Alignment
  inline def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait edges extends StObject
  inline def edges: edges = "edges".asInstanceOf[edges]
  
  @js.native
  sealed trait end
    extends StObject
       with Alignment
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait grid extends StObject
  inline def grid: grid = "grid".asInstanceOf[grid]
  
  @js.native
  sealed trait horizontal
    extends StObject
       with ScrollDirection
  inline def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  
  @js.native
  sealed trait rowgroup extends StObject
  inline def rowgroup: rowgroup = "rowgroup".asInstanceOf[rowgroup]
  
  @js.native
  sealed trait start
    extends StObject
       with Alignment
  inline def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait vertical
    extends StObject
       with ScrollDirection
  inline def vertical: vertical = "vertical".asInstanceOf[vertical]
}
