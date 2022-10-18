package typings.sawtoothSdk.global.sawtooth

import typings.sawtoothSdk.signingCoreMod.Context
import typings.sawtoothSdk.signingCoreMod.PrivateKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signing {
  
  @JSGlobal("sawtooth.signing")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("sawtooth.signing.CryptoFactory")
  @js.native
  open class CryptoFactory protected ()
    extends typings.sawtoothSdk.mod.signing.CryptoFactory {
    /**
      * Constructs a CryptoFactory.
      *
      * @param context - a cryptographic context
      */
    def this(context: Context) = this()
  }
  
  @JSGlobal("sawtooth.signing.Signer")
  @js.native
  open class Signer protected ()
    extends typings.sawtoothSdk.mod.signing.Signer {
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
