package typings.atPulumiPulumi.configMod

import typings.atPulumiPulumi.outputMod.Output
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/config", "Config")
@js.native
class Config () extends js.Object {
  def this(name: String) = this()
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
  val name: String = js.native
  /**
    * get loads an optional configuration value by its key, or undefined if it doesn't exist.
    *
    * @param key The key to lookup.
    * @param opts An options bag to constrain legal values.
    */
  def get[K /* <: String */](key: String): js.UndefOr[K] = js.native
  def get[K /* <: String */](key: String, opts: StringConfigOptions[K]): js.UndefOr[K] = js.native
  /**
    * getBoolean loads an optional configuration value, as a boolean, by its key, or undefined if it doesn't exist.
    * If the configuration value isn't a legal boolean, this function will throw an error.
    *
    * @param key The key to lookup.
    */
  def getBoolean(key: String): js.UndefOr[Boolean] = js.native
  /**
    * getNumber loads an optional configuration value, as a number, by its key, or undefined if it doesn't exist.
    * If the configuration value isn't a legal number, this function will throw an error.
    *
    * @param key The key to lookup.
    * @param opts An options bag to constrain legal values.
    */
  def getNumber(key: String): js.UndefOr[Double] = js.native
  def getNumber(key: String, opts: NumberConfigOptions): js.UndefOr[Double] = js.native
  /**
    * getObject loads an optional configuration value, as an object, by its key, or undefined if it doesn't exist.
    * This routine simply JSON parses and doesn't validate the shape of the contents.
    *
    * @param key The key to lookup.
    */
  def getObject[T](key: String): js.UndefOr[T] = js.native
  /**
    * getSecret loads an optional configuration value by its key, marking it as a secret, or undefined if it
    * doesn't exist.
    *
    * @param key The key to lookup.
    * @param opts An options bag to constrain legal values.
    */
  def getSecret[K /* <: String */](key: String): js.UndefOr[Output[K]] = js.native
  def getSecret[K /* <: String */](key: String, opts: StringConfigOptions[K]): js.UndefOr[Output[K]] = js.native
  /**
    * getSecretBoolean loads an optional configuration value, as a boolean, by its key, making it as a secret
    * or undefined if it doesn't exist. If the configuration value isn't a legal boolean, this function will
    * throw an error.
    *
    * @param key The key to lookup.
    */
  def getSecretBoolean(key: String): js.UndefOr[Output[Boolean]] = js.native
  /**
    * getSecretNumber loads an optional configuration value, as a number, by its key, marking it as a secret
    * or undefined if it doesn't exist.
    * If the configuration value isn't a legal number, this function will throw an error.
    *
    * @param key The key to lookup.
    * @param opts An options bag to constrain legal values.
    */
  def getSecretNumber(key: String): js.UndefOr[Output[Double]] = js.native
  def getSecretNumber(key: String, opts: NumberConfigOptions): js.UndefOr[Output[Double]] = js.native
  /**
    * getSecretObject loads an optional configuration value, as an object, by its key, marking it as a secret
    * or undefined if it doesn't exist.
    * This routine simply JSON parses and doesn't validate the shape of the contents.
    *
    * @param key The key to lookup.
    */
  def getSecretObject[T](key: String): js.UndefOr[Output[T]] = js.native
  /**
    * require loads a configuration value by its given key.  If it doesn't exist, an error is thrown.
    *
    * @param key The key to lookup.
    * @param opts An options bag to constrain legal values.
    */
  def require[K /* <: String */](key: String): K = js.native
  def require[K /* <: String */](key: String, opts: StringConfigOptions[K]): K = js.native
  /**
    * requireBoolean loads a configuration value, as a boolean, by its given key.  If it doesn't exist, or the
    * configuration value is not a legal boolean, an error is thrown.
    *
    * @param key The key to lookup.
    */
  def requireBoolean(key: String): Boolean = js.native
  /**
    * requireNumber loads a configuration value, as a number, by its given key.  If it doesn't exist, or the
    * configuration value is not a legal number, an error is thrown.
    *
    * @param key The key to lookup.
    * @param opts An options bag to constrain legal values.
    */
  def requireNumber(key: String): Double = js.native
  def requireNumber(key: String, opts: NumberConfigOptions): Double = js.native
  /**
    * requireObject loads a configuration value as a JSON string and deserializes the JSON into a JavaScript object. If
    * it doesn't exist, or the configuration value is not a legal JSON string, an error is thrown.
    *
    * @param key The key to lookup.
    */
  def requireObject[T](key: String): T = js.native
  /**
    * require loads a configuration value by its given key, marking it as a secet.  If it doesn't exist, an error
    * is thrown.
    *
    * @param key The key to lookup.
    * @param opts An options bag to constrain legal values.
    */
  def requireSecret[K /* <: String */](key: String): Output[K] = js.native
  def requireSecret[K /* <: String */](key: String, opts: StringConfigOptions[K]): Output[K] = js.native
  /**
    * requireSecretBoolean loads a configuration value, as a boolean, by its given key, marking it as a secret.
    * If it doesn't exist, or the configuration value is not a legal boolean, an error is thrown.
    *
    * @param key The key to lookup.
    */
  def requireSecretBoolean(key: String): Output[Boolean] = js.native
  /**
    * requireSecretNumber loads a configuration value, as a number, by its given key, marking it as a secret.
    * If it doesn't exist, or the configuration value is not a legal number, an error is thrown.
    *
    * @param key The key to lookup.
    * @param opts An options bag to constrain legal values.
    */
  def requireSecretNumber(key: String): Output[Double] = js.native
  def requireSecretNumber(key: String, opts: NumberConfigOptions): Output[Double] = js.native
  /**
    * requireSecretObject loads a configuration value as a JSON string and deserializes the JSON into a JavaScript
    * object, marking it as a secret. If it doesn't exist, or the configuration value is not a legal JSON
    * string, an error is thrown.
    *
    * @param key The key to lookup.
    */
  def requireSecretObject[T](key: String): Output[T] = js.native
}

