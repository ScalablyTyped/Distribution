package typings.reactBootstrapTableNext

import typings.reactBootstrapTableNext.mod.SortOrder
import typings.reactBootstrapTableNext.mod.TableChangeType
import typings.reactBootstrapTableNext.mod._CellAlignment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactBootstrapTableNextStrings {
  
  @js.native
  sealed trait TEXT extends StObject
  inline def TEXT: TEXT = "TEXT".asInstanceOf[TEXT]
  
  @js.native
  sealed trait asc
    extends StObject
       with SortOrder
  inline def asc: asc = "asc".asInstanceOf[asc]
  
  @js.native
  sealed trait cellEdit
    extends StObject
       with TableChangeType
  inline def cellEdit: cellEdit = "cellEdit".asInstanceOf[cellEdit]
  
  @js.native
  sealed trait center
    extends StObject
       with _CellAlignment
  inline def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait desc
    extends StObject
       with SortOrder
  inline def desc: desc = "desc".asInstanceOf[desc]
  
  @js.native
  sealed trait end
    extends StObject
       with _CellAlignment
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait filter
    extends StObject
       with TableChangeType
  inline def filter: filter = "filter".asInstanceOf[filter]
  
  @js.native
  sealed trait left
    extends StObject
       with _CellAlignment
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait pagination
    extends StObject
       with TableChangeType
  inline def pagination: pagination = "pagination".asInstanceOf[pagination]
  
  @js.native
  sealed trait right
    extends StObject
       with _CellAlignment
  inline def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait sort
    extends StObject
       with TableChangeType
  inline def sort: sort = "sort".asInstanceOf[sort]
  
  @js.native
  sealed trait start
    extends StObject
       with _CellAlignment
  inline def start: start = "start".asInstanceOf[start]
}
