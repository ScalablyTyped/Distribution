package typings
package atPulumiPulumiLib.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/config", "Config")
@js.native
class Config () extends js.Object {
  def this(name: java.lang.String) = this()
  /**
    * fullKey turns a simple configuration key into a fully resolved one, by prepending the bag's name.
    *
    * @param key The key to lookup.
    */
  var fullKey: js.Any = js.native
  /**
    * name is the configuration bag's logical name and uniquely identifies it.  The default is the name of the current
    * project.
    */
  val name: java.lang.String = js.native
  /**
    * get loads an optional configuration value by its key, or undefined if it doesn't exist.
    *
    * @param key The key to lookup.
    * @param opts An options bag to constrain legal values.
    */
  def get[K /* <: java.lang.String */](key: java.lang.String): js.UndefOr[K] = js.native
  def get[K /* <: java.lang.String */](key: java.lang.String, opts: StringConfigOptions[K]): js.UndefOr[K] = js.native
  /**
    * getBoolean loads an optional configuration value, as a boolean, by its key, or undefined if it doesn't exist.
    * If the configuration value isn't a legal boolean, this function will throw an error.
    *
    * @param key The key to lookup.
    */
  def getBoolean(key: java.lang.String): js.UndefOr[scala.Boolean] = js.native
  /**
    * getNumber loads an optional configuration value, as a number, by its key, or undefined if it doesn't exist.
    * If the configuration value isn't a legal number, this function will throw an error.
    *
    * @param key The key to lookup.
    * @param opts An options bag to constrain legal values.
    */
  def getNumber(key: java.lang.String): js.UndefOr[scala.Double] = js.native
  def getNumber(key: java.lang.String, opts: NumberConfigOptions): js.UndefOr[scala.Double] = js.native
  /**
    * getObject loads an optional configuration value, as an object, by its key, or undefined if it doesn't exist.
    * This routine simply JSON parses and doesn't validate the shape of the contents.
    *
    * @param key The key to lookup.
    */
  def getObject[T](key: java.lang.String): js.UndefOr[T] = js.native
  /**
    * getSecret loads an optional configuration value by its key, marking it as a secret, or undefined if it
    * doesn't exist.
    *
    * @param key The key to lookup.
    * @param opts An options bag to constrain legal values.
    */
  def getSecret[K /* <: java.lang.String */](key: java.lang.String): js.UndefOr[atPulumiPulumiLib.outputMod.Output[K]] = js.native
  def getSecret[K /* <: java.lang.String */](key: java.lang.String, opts: StringConfigOptions[K]): js.UndefOr[atPulumiPulumiLib.outputMod.Output[K]] = js.native
  /**
    * getSecretBoolean loads an optional configuration value, as a boolean, by its key, making it as a secret
    * or undefined if it doesn't exist. If the configuration value isn't a legal boolean, this function will
    * throw an error.
    *
    * @param key The key to lookup.
    */
  def getSecretBoolean(key: java.lang.String): js.UndefOr[atPulumiPulumiLib.outputMod.Output[scala.Boolean]] = js.native
  /**
    * getSecretNumber loads an optional configuration value, as a number, by its key, marking it as a secret
    * or undefined if it doesn't exist.
    * If the configuration value isn't a legal number, this function will throw an error.
    *
    * @param key The key to lookup.
    * @param opts An options bag to constrain legal values.
    */
  def getSecretNumber(key: java.lang.String): js.UndefOr[atPulumiPulumiLib.outputMod.Output[scala.Double]] = js.native
  def getSecretNumber(key: java.lang.String, opts: NumberConfigOptions): js.UndefOr[atPulumiPulumiLib.outputMod.Output[scala.Double]] = js.native
  /**
    * getSecretObject loads an optional configuration value, as an object, by its key, marking it as a secret
    * or undefined if it doesn't exist.
    * This routine simply JSON parses and doesn't validate the shape of the contents.
    *
    * @param key The key to lookup.
    */
  def getSecretObject[T](key: java.lang.String): js.UndefOr[atPulumiPulumiLib.outputMod.Output[T]] = js.native
  /**
    * require loads a configuration value by its given key.  If it doesn't exist, an error is thrown.
    *
    * @param key The key to lookup.
    * @param opts An options bag to constrain legal values.
    */
  def require[K /* <: java.lang.String */](key: java.lang.String): K = js.native
  def require[K /* <: java.lang.String */](key: java.lang.String, opts: StringConfigOptions[K]): K = js.native
  /**
    * requireBoolean loads a configuration value, as a boolean, by its given key.  If it doesn't exist, or the
    * configuration value is not a legal boolean, an error is thrown.
    *
    * @param key The key to lookup.
    */
  def requireBoolean(key: java.lang.String): scala.Boolean = js.native
  /**
    * requireNumber loads a configuration value, as a number, by its given key.  If it doesn't exist, or the
    * configuration value is not a legal number, an error is thrown.
    *
    * @param key The key to lookup.
    * @param opts An options bag to constrain legal values.
    */
  def requireNumber(key: java.lang.String): scala.Double = js.native
  def requireNumber(key: java.lang.String, opts: NumberConfigOptions): scala.Double = js.native
  /**
    * requireObject loads a configuration value as a JSON string and deserializes the JSON into a JavaScript object. If
    * it doesn't exist, or the configuration value is not a legal JSON string, an error is thrown.
    *
    * @param key The key to lookup.
    */
  def requireObject[T](key: java.lang.String): T = js.native
  /**
    * require loads a configuration value by its given key, marking it as a secet.  If it doesn't exist, an error
    * is thrown.
    *
    * @param key The key to lookup.
    * @param opts An options bag to constrain legal values.
    */
  def requireSecret[K /* <: java.lang.String */](key: java.lang.String): atPulumiPulumiLib.outputMod.Output[K] = js.native
  def requireSecret[K /* <: java.lang.String */](key: java.lang.String, opts: StringConfigOptions[K]): atPulumiPulumiLib.outputMod.Output[K] = js.native
  /**
    * requireSecretBoolean loads a configuration value, as a boolean, by its given key, marking it as a secret.
    * If it doesn't exist, or the configuration value is not a legal boolean, an error is thrown.
    *
    * @param key The key to lookup.
    */
  def requireSecretBoolean(key: java.lang.String): atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  /**
    * requireSecretNumber loads a configuration value, as a number, by its given key, marking it as a secret.
    * If it doesn't exist, or the configuration value is not a legal number, an error is thrown.
    *
    * @param key The key to lookup.
    * @param opts An options bag to constrain legal values.
    */
  def requireSecretNumber(key: java.lang.String): atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  def requireSecretNumber(key: java.lang.String, opts: NumberConfigOptions): atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  /**
    * requireSecretObject loads a configuration value as a JSON string and deserializes the JSON into a JavaScript
    * object, marking it as a secret. If it doesn't exist, or the configuration value is not a legal JSON
    * string, an error is thrown.
    *
    * @param key The key to lookup.
    */
  def requireSecretObject[T](key: java.lang.String): atPulumiPulumiLib.outputMod.Output[T] = js.native
}

