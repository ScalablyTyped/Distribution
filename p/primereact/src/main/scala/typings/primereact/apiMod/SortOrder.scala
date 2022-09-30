package typings.primereact.apiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SortOrder extends StObject
@JSImport("primereact/api/api", "SortOrder")
@js.native
object SortOrder extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SortOrder & Double] = js.native
  
  @js.native
  sealed trait ASC
    extends StObject
       with SortOrder
  /* 1 */ val ASC: typings.primereact.apiMod.SortOrder.ASC & Double = js.native
  
  @js.native
  sealed trait DESC
    extends StObject
       with SortOrder
  /* -1 */ val DESC: typings.primereact.apiMod.SortOrder.DESC & Double = js.native
  
  @js.native
  sealed trait UNSORTED
    extends StObject
       with SortOrder
  /* 0 */ val UNSORTED: typings.primereact.apiMod.SortOrder.UNSORTED & Double = js.native
}
