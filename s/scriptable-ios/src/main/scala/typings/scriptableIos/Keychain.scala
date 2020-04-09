package typings.scriptableIos

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Secure storage for credentials._
  * @see https://docs.scriptable.app/keychain
  */
@JSGlobal("Keychain")
@js.native
object Keychain extends js.Object {
  /**
    * _Check if keychain contains a key._
    *
    * Checks if the keychain contains the specified key.
    * @param key - Key to look up in the keychain.
    * @see https://docs.scriptable.app/keychain/#contains
    */
  def contains(key: String): Boolean = js.native
  /**
    * _Reads a value from the keychain._
    *
    * Reads the value for the specified key. If the key doesn't exist the method will throw an error. Used the `contains` method to check if a key exists in the keychain.
    * @param key - Key to read value for.
    * @see https://docs.scriptable.app/keychain/#get
    */
  def get(key: String): String = js.native
  /**
    * _Remove key from keychain._
    * @param key - Key to remove from the keychain.
    * @see https://docs.scriptable.app/keychain/#remove
    */
  def remove(key: String): Unit = js.native
  /**
    * _Add value for a specified key to keychain._
    *
    * Adds the the value to the keychain, assigning it to the specified key. If the key already exists in the keychain, the value is overwritten.
    *
    * Values are securely stored in an encrypted database.
    * @param key - Key which the value should be assigned to.
    * @param value - Value to assign to the specified key.
    * @see https://docs.scriptable.app/keychain/#set
    */
  def set(key: String, value: String): Unit = js.native
}

