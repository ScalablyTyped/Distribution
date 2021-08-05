package typings.reactable

import typings.reactable.mod.SortDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactableStrings {
  
  @js.native
  sealed trait asc
    extends StObject
       with SortDirection
  inline def asc: asc = "asc".asInstanceOf[asc]
  
  @js.native
  sealed trait desc
    extends StObject
       with SortDirection
  inline def desc: desc = "desc".asInstanceOf[desc]
}
