package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Secure storage for credentials._
  * @see https://docs.scriptable.app/keychain
  */
object Keychain {
  
  @JSGlobal("Keychain")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * _Check if keychain contains a key._
    *
    * Checks if the keychain contains the specified key.
    * @param key - Key to look up in the keychain.
    * @see https://docs.scriptable.app/keychain/#contains
    */
  inline def contains(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("contains")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * _Reads a value from the keychain._
    *
    * Reads the value for the specified key. If the key doesn't exist the method will throw an error. Used the `contains` method to check if a key exists in the keychain.
    * @param key - Key to read value for.
    * @see https://docs.scriptable.app/keychain/#get
    */
  inline def get(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * _Remove key from keychain._
    * @param key - Key to remove from the keychain.
    * @see https://docs.scriptable.app/keychain/#remove
    */
  inline def remove(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * _Add value for a specified key to keychain._
    *
    * Adds the value to the keychain, assigning it to the specified key. If the key already exists in the keychain, the value is overwritten.
    *
    * Values are securely stored in an encrypted database.
    * @param key - Key which the value should be assigned to.
    * @param value - Value to assign to the specified key.
    * @see https://docs.scriptable.app/keychain/#set
    */
  inline def set(key: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
