package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TaxTypeEnum extends js.Object

@JSImport("square-connect", "TaxTypeEnum")
@js.native
object TaxTypeEnum extends js.Object {
  @js.native
  sealed trait ADDITIVE extends TaxTypeEnum
  
  @js.native
  sealed trait INCLUSIVE extends TaxTypeEnum
  
  @js.native
  sealed trait UNKNOWN_TAX extends TaxTypeEnum
  
  /* "ADDITIVE" */ val ADDITIVE: typings.squareDashConnect.squareDashConnectMod.TaxTypeEnum.ADDITIVE with String = js.native
  /* "INCLUSIVE" */ val INCLUSIVE: typings.squareDashConnect.squareDashConnectMod.TaxTypeEnum.INCLUSIVE with String = js.native
  /* "UNKNOWN_TAX" */ val UNKNOWN_TAX: typings.squareDashConnect.squareDashConnectMod.TaxTypeEnum.UNKNOWN_TAX with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TaxTypeEnum with String] = js.native
}

