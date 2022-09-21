package typings.sawtoothSdk.mod

import typings.sawtoothSdk.coreMod.Context
import typings.sawtoothSdk.coreMod.PrivateKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signing {
  
  @JSImport("sawtooth-sdk", "signing")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sawtooth-sdk", "signing.CryptoFactory")
  @js.native
  open class CryptoFactory protected ()
    extends typings.sawtoothSdk.signingMod.CryptoFactory {
    /**
      * Constructs a CryptoFactory.
      *
      * @param context - a cryptographic context
      */
    def this(context: Context) = this()
  }
  
  @JSImport("sawtooth-sdk", "signing.Signer")
  @js.native
  open class Signer protected ()
    extends typings.sawtoothSdk.signingMod.Signer {
    /**
      * Constructs a new Signer
      *
      * @param context - a cryptographic context
      * @param privateKey - private key
      */
    def this(content: Context, privateKey: PrivateKey) = this()
  }
  
  inline def createContext(algorithmName: String): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(algorithmName.asInstanceOf[js.Any]).asInstanceOf[Context]
}
