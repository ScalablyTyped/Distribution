package typings.squareDashConnect.squareDashConnectMod.ModelError

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CategoryEnum extends js.Object

@JSImport("square-connect", "ModelError.CategoryEnum")
@js.native
object CategoryEnum extends js.Object {
  @js.native
  sealed trait API_ERROR extends CategoryEnum
  
  @js.native
  sealed trait AUTHENTICATION_ERROR extends CategoryEnum
  
  @js.native
  sealed trait INVALID_REQUEST_ERROR extends CategoryEnum
  
  @js.native
  sealed trait PAYMENT_METHOD_ERROR extends CategoryEnum
  
  @js.native
  sealed trait RATE_LIMIT_ERROR extends CategoryEnum
  
  @js.native
  sealed trait REFUND_ERROR extends CategoryEnum
  
  /* "API_ERROR" */ val API_ERROR: typings.squareDashConnect.squareDashConnectMod.ModelError.CategoryEnum.API_ERROR with String = js.native
  /* "AUTHENTICATION_ERROR" */ val AUTHENTICATION_ERROR: typings.squareDashConnect.squareDashConnectMod.ModelError.CategoryEnum.AUTHENTICATION_ERROR with String = js.native
  /* "INVALID_REQUEST_ERROR" */ val INVALID_REQUEST_ERROR: typings.squareDashConnect.squareDashConnectMod.ModelError.CategoryEnum.INVALID_REQUEST_ERROR with String = js.native
  /* "PAYMENT_METHOD_ERROR" */ val PAYMENT_METHOD_ERROR: typings.squareDashConnect.squareDashConnectMod.ModelError.CategoryEnum.PAYMENT_METHOD_ERROR with String = js.native
  /* "RATE_LIMIT_ERROR" */ val RATE_LIMIT_ERROR: typings.squareDashConnect.squareDashConnectMod.ModelError.CategoryEnum.RATE_LIMIT_ERROR with String = js.native
  /* "REFUND_ERROR" */ val REFUND_ERROR: typings.squareDashConnect.squareDashConnectMod.ModelError.CategoryEnum.REFUND_ERROR with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CategoryEnum with String] = js.native
}

