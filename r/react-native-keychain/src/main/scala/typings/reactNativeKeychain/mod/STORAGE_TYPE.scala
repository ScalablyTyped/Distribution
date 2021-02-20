package typings.reactNativeKeychain.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait STORAGE_TYPE extends StObject
@JSImport("react-native-keychain", "STORAGE_TYPE")
@js.native
object STORAGE_TYPE extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[STORAGE_TYPE with String] = js.native
  
  @js.native
  sealed trait AES extends STORAGE_TYPE
  /* "KeystoreAESCBC" */ val AES: typings.reactNativeKeychain.mod.STORAGE_TYPE.AES with String = js.native
  
  @js.native
  sealed trait FB extends STORAGE_TYPE
  /* "FacebookConceal" */ val FB: typings.reactNativeKeychain.mod.STORAGE_TYPE.FB with String = js.native
  
  @js.native
  sealed trait KC extends STORAGE_TYPE
  /* "keychain" */ val KC: typings.reactNativeKeychain.mod.STORAGE_TYPE.KC with String = js.native
  
  @js.native
  sealed trait RSA extends STORAGE_TYPE
  /* "KeystoreRSAECB" */ val RSA: typings.reactNativeKeychain.mod.STORAGE_TYPE.RSA with String = js.native
}
