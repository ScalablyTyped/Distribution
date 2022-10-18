package typings.primereact.apiApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FilterOperator extends StObject
@JSImport("primereact/api/api", "FilterOperator")
@js.native
object FilterOperator extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FilterOperator & String] = js.native
  
  @js.native
  sealed trait AND
    extends StObject
       with FilterOperator
  /* "and" */ val AND: typings.primereact.apiApiMod.FilterOperator.AND & String = js.native
  
  @js.native
  sealed trait OR
    extends StObject
       with FilterOperator
  /* "or" */ val OR: typings.primereact.apiApiMod.FilterOperator.OR & String = js.native
}
