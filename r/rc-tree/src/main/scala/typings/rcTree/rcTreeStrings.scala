package typings.rcTree

import typings.rcTree.interfaceMod._Direction
import typings.rcTree.treeMod.ExpandAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rcTreeStrings {
  
  @js.native
  sealed trait check extends StObject
  inline def check: check = "check".asInstanceOf[check]
  
  @js.native
  sealed trait children extends StObject
  inline def children: children = "children".asInstanceOf[children]
  
  @js.native
  sealed trait click
    extends StObject
       with ExpandAction
  inline def click: click = "click".asInstanceOf[click]
  
  @js.native
  sealed trait close extends StObject
  inline def close: close = "close".asInstanceOf[close]
  
  @js.native
  sealed trait doubleClick
    extends StObject
       with ExpandAction
  inline def doubleClick: doubleClick = "doubleClick".asInstanceOf[doubleClick]
  
  @js.native
  sealed trait hide extends StObject
  inline def hide: hide = "hide".asInstanceOf[hide]
  
  @js.native
  sealed trait load extends StObject
  inline def load: load = "load".asInstanceOf[load]
  
  @js.native
  sealed trait ltr
    extends StObject
       with _Direction
  inline def ltr: ltr = "ltr".asInstanceOf[ltr]
  
  @js.native
  sealed trait open extends StObject
  inline def open: open = "open".asInstanceOf[open]
  
  @js.native
  sealed trait rtl
    extends StObject
       with _Direction
  inline def rtl: rtl = "rtl".asInstanceOf[rtl]
  
  @js.native
  sealed trait select extends StObject
  inline def select: select = "select".asInstanceOf[select]
  
  @js.native
  sealed trait show extends StObject
  inline def show: show = "show".asInstanceOf[show]
}
