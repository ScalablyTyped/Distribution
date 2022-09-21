package typings.securePassword

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Making password storage safer for all.
    *
    * @example
    * // with async-await
    *
    * import SecurePassword = require('secure-password')
    *
    * // Initialise our password policy
    * const pwd = new SecurePassword()
    *
    * const userPassword = Buffer.from('my secret password');
    *
    * // Register user
    * const hash = await pwd.hash(userPassword)
    *
    * // Save hash somewhere
    * const result = await pwd.verify(userPassword, hash)
    *
    * switch (result) {
    *   case SecurePassword.INVALID_UNRECOGNIZED_HASH:
    *     console.error('This hash was not made with secure-password. Attempt legacy algorithm')
    *     return
    *   case SecurePassword.INVALID:
    *     console.log('Invalid password')
    *     return
    *   case SecurePassword.VALID:
    *     console.log('Authenticated')
    *     return
    *   case SecurePassword.VALID_NEEDS_REHASH:
    *     console.log('Yay you made it, wait for us to improve your safety')
    *
    *     try {
    *       const improvedHash = await pwd.hash(userPassword)
    *       // Save improvedHash somewhere
    *     } catch (err) {
    *       console.error('You are authenticated, but we could not improve your safety this time around')
    *     }
    *     return
    * }
    *
    * @example
    * // with continuation-passing-style (callbacks)
    *
    * import SecurePassword = require('secure-password')
    *
    * // Initialise our password policy
    * const pwd = new SecurePassword()
    *
    * const userPassword = Buffer.from('my secret password')
    *
    * // Register user
    * pwd.hash(userPassword, (err, hash) => {
    *   if (err) throw err
    *
    *   // Save hash somewhere
    *   pwd.verify(userPassword, hash, (err, result) => {
    *     if (err) throw err
    *
    *     switch (result) {
    *       case SecurePassword.INVALID_UNRECOGNIZED_HASH:
    *         console.error('This hash was not made with secure-password. Attempt legacy algorithm')
    *         return
    *       case SecurePassword.INVALID:
    *         console.log('Invalid password')
    *         return
    *       case SecurePassword.VALID:
    *         console.log('Authenticated')
    *         return
    *       case SecurePassword.VALID_NEEDS_REHASH:
    *         console.log('Yay you made it, wait for us to improve your safety')
    *
    *         pwd.hash(userPassword, (err, improvedHash) => {
    *           if (err) console.error('You are authenticated, but we could not improve your safety this time around')
    *
    *           // Save improvedHash somewhere
    *         })
    *         return
    *     }
    *   })
    * })
    */
  @JSImport("secure-password", JSImport.Namespace)
  @js.native
  /**
    * Make a new instance of SecurePassword which will contain your settings.
    * You can view this as a password policy for your application.
    */
  open class ^ ()
    extends StObject
       with SecurePassword {
    def this(opts: Options) = this()
  }
  
  /**
    * Size of the `hashBuffer` buffer returned by `hash()` and `hashSync()` and used by
    * `verify()` and `verifySync()`.
    */
  /* static member */
  @JSImport("secure-password", "HASH_BYTES")
  @js.native
  val HASH_BYTES: Double = js.native
  
  /** The password was invalid. */
  /* static member */
  @JSImport("secure-password", "INVALID")
  @js.native
  val INVALID: js.Symbol = js.native
  
  /**
    * The hash was unrecognized and therefore could not be verified. As an implementation
    * detail it is currently very cheap to attempt verifying unrecognized hashes, since this
    * only requires some lightweight pattern matching.
    */
  /* static member */
  @JSImport("secure-password", "INVALID_UNRECOGNIZED_HASH")
  @js.native
  val INVALID_UNRECOGNIZED_HASH: js.Symbol = js.native
  
  /** Default value for the `opts.memlimit` option. */
  /* static member */
  @JSImport("secure-password", "MEMLIMIT_DEFAULT")
  @js.native
  val MEMLIMIT_DEFAULT: Double = js.native
  
  /** Maximum value for the `opts.memlimit` option. */
  /* static member */
  @JSImport("secure-password", "MEMLIMIT_MAX")
  @js.native
  val MEMLIMIT_MAX: Double = js.native
  
  /** Minimum value for the `opts.memlimit` option. */
  /* static member */
  @JSImport("secure-password", "MEMLIMIT_MIN")
  @js.native
  val MEMLIMIT_MIN: Double = js.native
  
  /** Default value for the `opts.opslimit` option. */
  /* static member */
  @JSImport("secure-password", "OPSLIMIT_DEFAULT")
  @js.native
  val OPSLIMIT_DEFAULT: Double = js.native
  
  /** Maximum value for the `opts.opslimit` option. */
  /* static member */
  @JSImport("secure-password", "OPSLIMIT_MAX")
  @js.native
  val OPSLIMIT_MAX: Double = js.native
  
  /** Minimum value for the `opts.opslimit` option. */
  /* static member */
  @JSImport("secure-password", "OPSLIMIT_MIN")
  @js.native
  val OPSLIMIT_MIN: Double = js.native
  
  /** Maximum length of the `passwordBuffer` buffer. */
  /* static member */
  @JSImport("secure-password", "PASSWORD_BYTES_MAX")
  @js.native
  val PASSWORD_BYTES_MAX: Double = js.native
  
  /** Minimum length of the `passwordBuffer` buffer. */
  /* static member */
  @JSImport("secure-password", "PASSWORD_BYTES_MIN")
  @js.native
  val PASSWORD_BYTES_MIN: Double = js.native
  
  /** The password was verified and is valid. */
  /* static member */
  @JSImport("secure-password", "VALID")
  @js.native
  val VALID: js.Symbol = js.native
  
  /** The password was verified and is valid, but needs to be rehashed with new parameters. */
  /* static member */
  @JSImport("secure-password", "VALID_NEEDS_REHASH")
  @js.native
  val VALID_NEEDS_REHASH: js.Symbol = js.native
  
  trait Options extends StObject {
    
    /**
      * Constrained by the constants `SecurePassword.MEMLIMIT_MIN` - `SecurePassword.MEMLIMIT_MAX`.
      * Default value should be fast enough for a general purpose web server without your users
      * noticing too much of a load time.
      *
      * @default SecurePassword.MEMLIMIT_DEFAULT
      */
    var memlimit: js.UndefOr[Double] = js.undefined
    
    /**
      * Constrained by the constants `SecurePassword.OPSLIMIT_MIN` - `SecurePassword.OPSLIMIT_MAX`.
      * Default value should be fast enough for a general purpose web server without your users
      * noticing too much of a load time.
      *
      * @default SecurePassword.OPSLIMIT_DEFAULT
      */
    var opslimit: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setMemlimit(value: Double): Self = StObject.set(x, "memlimit", value.asInstanceOf[js.Any])
      
      inline def setMemlimitUndefined: Self = StObject.set(x, "memlimit", js.undefined)
      
      inline def setOpslimit(value: Double): Self = StObject.set(x, "opslimit", value.asInstanceOf[js.Any])
      
      inline def setOpslimitUndefined: Self = StObject.set(x, "opslimit", js.undefined)
    }
  }
  
  /**
    * Making password storage safer for all.
    *
    * @example
    * // with async-await
    *
    * import SecurePassword = require('secure-password')
    *
    * // Initialise our password policy
    * const pwd = new SecurePassword()
    *
    * const userPassword = Buffer.from('my secret password');
    *
    * // Register user
    * const hash = await pwd.hash(userPassword)
    *
    * // Save hash somewhere
    * const result = await pwd.verify(userPassword, hash)
    *
    * switch (result) {
    *   case SecurePassword.INVALID_UNRECOGNIZED_HASH:
    *     console.error('This hash was not made with secure-password. Attempt legacy algorithm')
    *     return
    *   case SecurePassword.INVALID:
    *     console.log('Invalid password')
    *     return
    *   case SecurePassword.VALID:
    *     console.log('Authenticated')
    *     return
    *   case SecurePassword.VALID_NEEDS_REHASH:
    *     console.log('Yay you made it, wait for us to improve your safety')
    *
    *     try {
    *       const improvedHash = await pwd.hash(userPassword)
    *       // Save improvedHash somewhere
    *     } catch (err) {
    *       console.error('You are authenticated, but we could not improve your safety this time around')
    *     }
    *     return
    * }
    *
    * @example
    * // with continuation-passing-style (callbacks)
    *
    * import SecurePassword = require('secure-password')
    *
    * // Initialise our password policy
    * const pwd = new SecurePassword()
    *
    * const userPassword = Buffer.from('my secret password')
    *
    * // Register user
    * pwd.hash(userPassword, (err, hash) => {
    *   if (err) throw err
    *
    *   // Save hash somewhere
    *   pwd.verify(userPassword, hash, (err, result) => {
    *     if (err) throw err
    *
    *     switch (result) {
    *       case SecurePassword.INVALID_UNRECOGNIZED_HASH:
    *         console.error('This hash was not made with secure-password. Attempt legacy algorithm')
    *         return
    *       case SecurePassword.INVALID:
    *         console.log('Invalid password')
    *         return
    *       case SecurePassword.VALID:
    *         console.log('Authenticated')
    *         return
    *       case SecurePassword.VALID_NEEDS_REHASH:
    *         console.log('Yay you made it, wait for us to improve your safety')
    *
    *         pwd.hash(userPassword, (err, improvedHash) => {
    *           if (err) console.error('You are authenticated, but we could not improve your safety this time around')
    *
    *           // Save improvedHash somewhere
    *         })
    *         return
    *     }
    *   })
    * })
    */
  @js.native
  trait SecurePassword extends StObject {
    
    /**
      * Create a hash of the password. The hashing is done by a separate worker as to not
      * block the event loop, so normal execution and I/O can continue.
      *
      * @param passwordBuffer The password to hash. Must be a `Buffer` of length
      * `SecurePassword.PASSWORD_BYTES_MIN` - `SecurePassword.PASSWORD_BYTES_MAX`.
      * @returns A buffer of length `SecurePassword.HASH_BYTES`.
      */
    def hash(passwordBuffer: Buffer): js.Promise[Buffer] = js.native
    def hash(passwordBuffer: Buffer, cb: js.Function2[/* err */ js.Error | Null, /* hash */ Buffer, Unit]): Unit = js.native
    
    /**
      * Create a hash of the password buffer. The hashing is done on the same thread as
      * the event loop, therefore normal execution and I/O will be blocked.
      *
      * @param passwordBuffer The password to hash. Must be a `Buffer` of length
      * `SecurePassword.PASSWORD_BYTES_MIN` - `SecurePassword.PASSWORD_BYTES_MAX`.
      * @returns A buffer of length `SecurePassword.HASH_BYTES`.
      */
    def hashSync(passwordBuffer: Buffer): Buffer = js.native
    
    val memlimit: Double = js.native
    
    val opslimit: Double = js.native
    
    /**
      * Takes buffer `passwordBuffer` and hashes it and then safely compares it to the
      * buffer `hashBuffer`. The hashing is done by a separate worker as to not block the
      * event loop, so normal execution and I/O can continue.
      *
      * @param passwordBuffer The password to verify. Must be a `Buffer` of length
      * `SecurePassword.PASSWORD_BYTES_MIN` - `SecurePassword.PASSWORD_BYTES_MAX`.
      * @param hashBuffer The hash to compare against. Must be a Buffer of length
      * `SecurePassword.HASH_BYTES`.
      * @return A symbol describing the verification result. If return value is
      * `SecurePassword.NEEDS_REHASH` you should call `securePassword.hash()` with
      * `passwordBuffer` and save the new hash for next time. Be careful not to introduce a
      * bug where a user trying to login multiple times, successfully, in quick succession
      * makes your server do unnecessary work.
      */
    def verify(passwordBuffer: Buffer, hashBuffer: Buffer): js.Promise[VerificationResult] = js.native
    def verify(
      passwordBuffer: Buffer,
      hashBuffer: Buffer,
      cb: js.Function2[/* err */ js.Error | Null, /* result */ VerificationResult, Unit]
    ): Unit = js.native
    
    /**
      * Takes buffer `passwordBuffer` and hashes it and then safely compares it to the
      * buffer `hashBuffer`. The hashing is done on the same thread as the event loop,
      * therefore normal execution and I/O will be blocked.
      *
      * @param passwordBuffer The password to verify. Must be a `Buffer` of length
      * `SecurePassword.PASSWORD_BYTES_MIN` - `SecurePassword.PASSWORD_BYTES_MAX`.
      * @param hashBuffer The hash to compare against. Must be a Buffer of length
      * `SecurePassword.HASH_BYTES`.
      * @return A symbol describing the verification result. If return value is
      * `SecurePassword.NEEDS_REHASH` you should call `securePassword.hash()` with
      * `passwordBuffer` and save the new hash for next time. Be careful not to introduce a
      * bug where a user trying to login multiple times, successfully, in quick succession
      * makes your server do unnecessary work.
      */
    def verifySync(passwordBuffer: Buffer, hashBuffer: Buffer): VerificationResult = js.native
  }
  
  type VerificationResult = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SecurePassword.INVALID_UNRECOGNIZED_HASH */ Any
}
