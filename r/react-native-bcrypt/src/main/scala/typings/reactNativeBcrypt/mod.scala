package typings.reactNativeBcrypt

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-native-bcrypt", JSImport.Default)
  @js.native
  val default: ReactNativeBcrypt = js.native
  
  @js.native
  trait ReactNativeBcrypt extends StObject {
    
    /**
      * Asynchronously compares the given data against the given hash.
      * @param s Data to compare
      * @param hash Data to be compared to
      * @param callback Callback receiving the error, if any, otherwise the result
      * @param progressCallback Callback successively called with the percentage of rounds completed
      *  (0.0 - 1.0), maximally once per `MAX_EXECUTION_TIME = 100` ms.
      */
    def compare(s: String, hash: String, callback: js.Function2[/* error */ js.Error, /* boolean */ Boolean, Any]): Unit = js.native
    def compare(
      s: String,
      hash: String,
      callback: js.Function2[/* error */ js.Error, /* boolean */ Boolean, Any],
      progressCallback: js.Function1[/* number */ Double, Any]
    ): Unit = js.native
    
    /**
      * Synchronously tests a string against a hash.
      * @param s String to compare
      * @param hash Hash to test against
      * @returns true if matching, otherwise false
      */
    def compareSync(s: String, hash: String): Boolean = js.native
    
    /**
      * Decodes a base64 encoded string to up to len bytes of output, using the custom bcrypt alphabet.
      * @param s String to decode
      * @param len Maximum output length
      */
    def decodeBase64(s: String, len: Double): js.Array[Double] = js.native
    
    /**
      * Encodes a byte array to base64 with up to len bytes of input, using the custom bcrypt alphabet.
      * @param b Byte array
      * @param len Maximum input length
      */
    def encodeBase64(b: js.Array[Double], len: Double): String = js.native
    
    /**
      * Asynchronously generates a salt.
      * @param rounds Number of rounds to use, defaults to 10 if omitted
      * @param seed_length Not supported.
      * @param callback Callback receiving the error, if any, and the resulting salt
      */
    def genSalt(): Unit = js.native
    def genSalt(rounds: js.Function2[/* error */ js.Error, /* string */ js.UndefOr[String], Any]): Unit = js.native
    def genSalt(
      rounds: js.Function2[/* error */ js.Error, /* string */ js.UndefOr[String], Any],
      seed_length: js.Function2[/* error */ js.Error, /* string */ js.UndefOr[String], Any]
    ): Unit = js.native
    def genSalt(
      rounds: js.Function2[/* error */ js.Error, /* string */ js.UndefOr[String], Any],
      seed_length: js.Function2[/* error */ js.Error, /* string */ js.UndefOr[String], Any],
      callback: js.Function2[/* error */ js.Error, /* string */ js.UndefOr[String], Any]
    ): Unit = js.native
    def genSalt(
      rounds: js.Function2[/* error */ js.Error, /* string */ js.UndefOr[String], Any],
      seed_length: Double
    ): Unit = js.native
    def genSalt(
      rounds: js.Function2[/* error */ js.Error, /* string */ js.UndefOr[String], Any],
      seed_length: Double,
      callback: js.Function2[/* error */ js.Error, /* string */ js.UndefOr[String], Any]
    ): Unit = js.native
    def genSalt(
      rounds: js.Function2[/* error */ js.Error, /* string */ js.UndefOr[String], Any],
      seed_length: Unit,
      callback: js.Function2[/* error */ js.Error, /* string */ js.UndefOr[String], Any]
    ): Unit = js.native
    def genSalt(rounds: Double): Unit = js.native
    def genSalt(
      rounds: Double,
      seed_length: js.Function2[/* error */ js.Error, /* string */ js.UndefOr[String], Any]
    ): Unit = js.native
    def genSalt(
      rounds: Double,
      seed_length: js.Function2[/* error */ js.Error, /* string */ js.UndefOr[String], Any],
      callback: js.Function2[/* error */ js.Error, /* string */ js.UndefOr[String], Any]
    ): Unit = js.native
    def genSalt(rounds: Double, seed_length: Double): Unit = js.native
    def genSalt(
      rounds: Double,
      seed_length: Double,
      callback: js.Function2[/* error */ js.Error, /* string */ js.UndefOr[String], Any]
    ): Unit = js.native
    def genSalt(
      rounds: Double,
      seed_length: Unit,
      callback: js.Function2[/* error */ js.Error, /* string */ js.UndefOr[String], Any]
    ): Unit = js.native
    def genSalt(
      rounds: Unit,
      seed_length: js.Function2[/* error */ js.Error, /* string */ js.UndefOr[String], Any]
    ): Unit = js.native
    def genSalt(
      rounds: Unit,
      seed_length: js.Function2[/* error */ js.Error, /* string */ js.UndefOr[String], Any],
      callback: js.Function2[/* error */ js.Error, /* string */ js.UndefOr[String], Any]
    ): Unit = js.native
    def genSalt(rounds: Unit, seed_length: Double): Unit = js.native
    def genSalt(
      rounds: Unit,
      seed_length: Double,
      callback: js.Function2[/* error */ js.Error, /* string */ js.UndefOr[String], Any]
    ): Unit = js.native
    def genSalt(
      rounds: Unit,
      seed_length: Unit,
      callback: js.Function2[/* error */ js.Error, /* string */ js.UndefOr[String], Any]
    ): Unit = js.native
    
    /**
      * Synchronously generates a salt.
      * @param  rounds Number of rounds to use, defaults to 10 if omitted
      * @param  seed_length Not supported.
      * @returns Resulting salt
      * @throws If a random fallback is required but not set
      */
    def genSaltSync(): String = js.native
    def genSaltSync(round: Double): String = js.native
    def genSaltSync(round: Double, seed_length: Double): String = js.native
    def genSaltSync(round: Unit, seed_length: Double): String = js.native
    
    /**
      * Gets the number of rounds used to encrypt the specified hash.
      * @param hash Hash to extract the used number of rounds from
      * @returns Number of rounds used
      */
    def getRounds(hash: String): Double = js.native
    
    /**
      * Gets the salt portion from a hash. Does not validate the hash.
      * @param hash Hash to extract the salt from
      * @returns Extracted salt part
      */
    def getSalt(hash: String): String = js.native
    
    def hash(
      s: String,
      salt: String,
      callback: js.Function2[/* error */ js.Error, /* string */ js.UndefOr[String], Any]
    ): Unit = js.native
    def hash(
      s: String,
      salt: String,
      callback: js.Function2[/* error */ js.Error, /* string */ js.UndefOr[String], Any],
      progressCallback: js.Function1[/* number */ Double, Unit]
    ): Unit = js.native
    /**
      * Asynchronously generates a hash for the given string.
      * @param s String to hash
      * @param salt Salt length to generate or salt to use
      * @param callback Callback receiving the error, if any, and the resulting hash
      * @param progressCallback Callback successively called with the percentage of rounds completed
      *  (0.0 - 1.0), maximally once per `MAX_EXECUTION_TIME = 100` ms.
      */
    def hash(
      s: String,
      salt: Double,
      callback: js.Function2[/* error */ js.Error, /* string */ js.UndefOr[String], Any]
    ): Unit = js.native
    def hash(
      s: String,
      salt: Double,
      callback: js.Function2[/* error */ js.Error, /* string */ js.UndefOr[String], Any],
      progressCallback: js.Function1[/* number */ Double, Unit]
    ): Unit = js.native
    
    /**
      * Synchronously generates a hash for the given string.
      * @param s String to hash
      * @param salt Salt length to generate or salt to use, default to 10
      * @returns Resulting hash
      */
    def hashSync(s: String): String = js.native
    def hashSync(s: String, salt: String): String = js.native
    def hashSync(s: String, salt: Double): String = js.native
    
    /**
      * Sets the pseudo random number generator to use as a fallback if neither node's `crypto` module nor the Web Crypto
      *  API is available. Please note: It is highly important that the PRNG used is cryptographically secure and that it
      *  is seeded properly!
      * @param random Function taking the number of bytes to generate as its
      *  sole argument, returning the corresponding array of cryptographically secure random byte values.
      * @see https://nodejs.org/api/crypto.html
      * @see http://www.w3.org/TR/WebCryptoAPI/
      */
    def setRandomFallback(): Unit = js.native
    def setRandomFallback(random: js.Function1[/* number */ Double, js.Array[Double]]): Unit = js.native
  }
  
  type _To = ReactNativeBcrypt
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ReactNativeBcrypt = default
}
