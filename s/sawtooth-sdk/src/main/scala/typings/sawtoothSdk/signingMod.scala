package typings.sawtoothSdk

import typings.node.Buffer
import typings.node.NodeJS.TypedArray
import typings.sawtoothSdk.coreMod.Context
import typings.sawtoothSdk.coreMod.PrivateKey
import typings.sawtoothSdk.coreMod.PublicKey
import typings.std.DataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/signing", JSImport.Namespace)
@js.native
object signingMod extends js.Object {
  @js.native
  class CryptoFactory protected () extends js.Object {
    /**
      * Constructs a CryptoFactory.
      *
      * @param context - a cryptographic context
      */
    def this(context: Context) = this()
    /** A cryptographic context */
    var _context: Context = js.native
    /**
      * Returns the context associated with this factory
      *
      */ def getContext(): Context = js.native
    /**
      * Create a new signer for the given private key.
      *
      * @param privateKey - a private key
      */
    def newSigner(privateKey: PrivateKey): Signer = js.native
  }
  
  @js.native
  class Signer protected () extends js.Object {
    /**
      * Constructs a new Signer
      *
      * @param context - a cryptographic context
      * @param privateKey - private key
      */
    def this(content: Context, privateKey: PrivateKey) = this()
    var _context: Context = js.native
    var _privateKey: PrivateKey = js.native
    var _publicKey: js.UndefOr[PublicKey] = js.native
    /**
      * Return the public key for this Signer instance.
      *
      */
    def getPublicKey(): PublicKey = js.native
    /**
      * Signs the given message.
      *
      * @param message - the message bytes
      * @throws {SigningError} - if any error occurs during the signing process
      */
    def sign(message: Buffer): String = js.native
  }
  
  def createContext(algorithmName: String): Context = js.native
  type message = String | Buffer | TypedArray | DataView
}

