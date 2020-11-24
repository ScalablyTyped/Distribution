package typings.sawtoothSdk.mod

import typings.sawtoothSdk.coreMod.Context
import typings.sawtoothSdk.coreMod.PrivateKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "signing")
@js.native
object signing extends js.Object {
  
  def createContext(algorithmName: String): Context = js.native
  
  @js.native
  class CryptoFactory protected ()
    extends typings.sawtoothSdk.signingMod.CryptoFactory {
    /**
      * Constructs a CryptoFactory.
      *
      * @param context - a cryptographic context
      */
    def this(context: Context) = this()
  }
  
  @js.native
  class Signer protected ()
    extends typings.sawtoothSdk.signingMod.Signer {
    /**
      * Constructs a new Signer
      *
      * @param context - a cryptographic context
      * @param privateKey - private key
      */
    def this(content: Context, privateKey: PrivateKey) = this()
  }
}
