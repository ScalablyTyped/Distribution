package typings.reactNativeKeychain.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait STORAGE_TYPE extends js.Object

@JSImport("react-native-keychain", "STORAGE_TYPE")
@js.native
object STORAGE_TYPE extends js.Object {
  @js.native
  sealed trait AES extends STORAGE_TYPE
  
  @js.native
  sealed trait FB extends STORAGE_TYPE
  
  @js.native
  sealed trait KC extends STORAGE_TYPE
  
  @js.native
  sealed trait RSA extends STORAGE_TYPE
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[STORAGE_TYPE with String] = js.native
  /* "KeystoreAESCBC" */ @js.native
  object AES extends TopLevel[AES with String]
  
  /* "FacebookConceal" */ @js.native
  object FB extends TopLevel[FB with String]
  
  /* "keychain" */ @js.native
  object KC extends TopLevel[KC with String]
  
  /* "KeystoreRSAECB" */ @js.native
  object RSA extends TopLevel[RSA with String]
  
}

