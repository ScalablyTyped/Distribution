package typings.securePassword

import typings.node.Buffer
import typings.securePassword.anon.Memlimit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("secure-password", JSImport.Namespace)
  @js.native
  class ^ () extends SecurePassword {
    def this(opts: Memlimit) = this()
  }
  @JSImport("secure-password", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("secure-password", "HASH_BYTES")
  @js.native
  def HASH_BYTES: Double = js.native
  @scala.inline
  def HASH_BYTES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HASH_BYTES")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("secure-password", "INVALID")
  @js.native
  def INVALID: js.Symbol = js.native
  @scala.inline
  def INVALID_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("secure-password", "INVALID_UNRECOGNIZED_HASH")
  @js.native
  def INVALID_UNRECOGNIZED_HASH: js.Symbol = js.native
  @scala.inline
  def INVALID_UNRECOGNIZED_HASH_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_UNRECOGNIZED_HASH")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("secure-password", "MEMLIMIT_DEFAULT")
  @js.native
  def MEMLIMIT_DEFAULT: Double = js.native
  @scala.inline
  def MEMLIMIT_DEFAULT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEMLIMIT_DEFAULT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("secure-password", "MEMLIMIT_MAX")
  @js.native
  def MEMLIMIT_MAX: Double = js.native
  @scala.inline
  def MEMLIMIT_MAX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEMLIMIT_MAX")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("secure-password", "MEMLIMIT_MIN")
  @js.native
  def MEMLIMIT_MIN: Double = js.native
  @scala.inline
  def MEMLIMIT_MIN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEMLIMIT_MIN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("secure-password", "OPSLIMIT_DEFAULT")
  @js.native
  def OPSLIMIT_DEFAULT: Double = js.native
  @scala.inline
  def OPSLIMIT_DEFAULT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPSLIMIT_DEFAULT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("secure-password", "OPSLIMIT_MAX")
  @js.native
  def OPSLIMIT_MAX: Double = js.native
  @scala.inline
  def OPSLIMIT_MAX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPSLIMIT_MAX")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("secure-password", "OPSLIMIT_MIN")
  @js.native
  def OPSLIMIT_MIN: Double = js.native
  @scala.inline
  def OPSLIMIT_MIN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPSLIMIT_MIN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("secure-password", "PASSWORD_BYTES_MAX")
  @js.native
  def PASSWORD_BYTES_MAX: Double = js.native
  @scala.inline
  def PASSWORD_BYTES_MAX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PASSWORD_BYTES_MAX")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("secure-password", "PASSWORD_BYTES_MIN")
  @js.native
  def PASSWORD_BYTES_MIN: Double = js.native
  @scala.inline
  def PASSWORD_BYTES_MIN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PASSWORD_BYTES_MIN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("secure-password", "VALID")
  @js.native
  def VALID: js.Symbol = js.native
  @scala.inline
  def VALID_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VALID")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("secure-password", "VALID_NEEDS_REHASH")
  @js.native
  def VALID_NEEDS_REHASH: js.Symbol = js.native
  @scala.inline
  def VALID_NEEDS_REHASH_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VALID_NEEDS_REHASH")(x.asInstanceOf[js.Any])
  
  @js.native
  trait SecurePassword extends StObject {
    
    /**
      * Create a hash of the password.
      * @param passwordBuf
      */
    def hash(passwordBuf: Buffer): js.Promise[Buffer] = js.native
    def hash(passwordBuf: Buffer, cb: js.Function2[/* err */ js.Any, /* hash */ js.UndefOr[Buffer], Unit]): Unit = js.native
    
    /**
      * Create a hash of the password buffer.
      * @param buff
      */
    def hashSync(buff: Buffer): Buffer = js.native
    
    var memlimit: Double = js.native
    
    var opslimit: Double = js.native
    
    /**
      * Verify password and hash match.
      * @param passwordBuf
      * @param hashBuf
      */
    def verify(passwordBuf: Buffer, hashBuf: Buffer): js.Promise[js.Symbol] = js.native
    def verify(
      passwordBuf: Buffer,
      hashBuf: Buffer,
      cb: js.Function2[/* err */ js.Any, /* result */ js.UndefOr[js.Symbol], Unit]
    ): Unit = js.native
    
    /**
      * Verify password and hash match.
      * @param passwordBuf
      * @param hashBuf
      */
    def verifySync(passwordBuf: Buffer, hashBuf: Buffer): js.Symbol = js.native
  }
}
