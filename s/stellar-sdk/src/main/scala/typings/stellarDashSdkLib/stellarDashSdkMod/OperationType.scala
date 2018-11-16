package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OperationType extends js.Object

@JSImport("stellar-sdk", "OperationType")
@js.native
object OperationType extends js.Object {
  @js.native
  sealed trait accountMerge
    extends stellarDashSdkLib.stellarDashSdkMod.OperationType
  
  @js.native
  sealed trait allowTrust
    extends stellarDashSdkLib.stellarDashSdkMod.OperationType
  
  @js.native
  sealed trait bumpSequence
    extends stellarDashSdkLib.stellarDashSdkMod.OperationType
  
  @js.native
  sealed trait changeTrust
    extends stellarDashSdkLib.stellarDashSdkMod.OperationType
  
  @js.native
  sealed trait createAccount
    extends stellarDashSdkLib.stellarDashSdkMod.OperationType
  
  @js.native
  sealed trait createPassiveOffer
    extends stellarDashSdkLib.stellarDashSdkMod.OperationType
  
  @js.native
  sealed trait inflation
    extends stellarDashSdkLib.stellarDashSdkMod.OperationType
  
  @js.native
  sealed trait manageData
    extends stellarDashSdkLib.stellarDashSdkMod.OperationType
  
  @js.native
  sealed trait manageOffer
    extends stellarDashSdkLib.stellarDashSdkMod.OperationType
  
  @js.native
  sealed trait pathPayment
    extends stellarDashSdkLib.stellarDashSdkMod.OperationType
  
  @js.native
  sealed trait payment
    extends stellarDashSdkLib.stellarDashSdkMod.OperationType
  
  @js.native
  sealed trait setOptions
    extends stellarDashSdkLib.stellarDashSdkMod.OperationType
  
  /* "accountMerge" */ val accountMerge: accountMerge with java.lang.String = js.native
  /* "allowTrust" */ val allowTrust: allowTrust with java.lang.String = js.native
  /* "bumpSequence" */ val bumpSequence: bumpSequence with java.lang.String = js.native
  /* "changeTrust" */ val changeTrust: changeTrust with java.lang.String = js.native
  /* "createAccount" */ val createAccount: createAccount with java.lang.String = js.native
  /* "createPassiveOffer" */ val createPassiveOffer: createPassiveOffer with java.lang.String = js.native
  /* "inflation" */ val inflation: inflation with java.lang.String = js.native
  /* "manageData" */ val manageData: manageData with java.lang.String = js.native
  /* "manageOffer" */ val manageOffer: manageOffer with java.lang.String = js.native
  /* "pathPayment" */ val pathPayment: pathPayment with java.lang.String = js.native
  /* "payment" */ val payment: payment with java.lang.String = js.native
  /* "setOptions" */ val setOptions: setOptions with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[stellarDashSdkLib.stellarDashSdkMod.OperationType with java.lang.String] = js.native
}

