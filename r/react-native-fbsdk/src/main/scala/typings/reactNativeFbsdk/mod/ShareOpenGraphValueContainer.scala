package typings.reactNativeFbsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-fbsdk", "ShareOpenGraphValueContainer")
@js.native
class ShareOpenGraphValueContainer protected () extends js.Object {
  def this(properties: OpenGraphProperties) = this()
  var _properties: OpenGraphProperties = js.native
  /**
    * Gets an entry for the given key.
    */
  def getEntry(key: String): OpenGraphValue = js.native
  /**
    * Sets a number for the specified key.
    */
  // tslint:disable-next-line:variable-name
  def putNumber(key: String, number: Double): Unit = js.native
  /**
    * Sets an open graph object for the specified key.
    */
  def putObject(key: String, `object`: ShareOpenGraphValueContainer): Unit = js.native
  /**
    * Sets a photo for the specified key.
    */
  def putPhoto(key: String, photo: SharePhoto): Unit = js.native
  /**
    * Sets a string for the specified key.
    */
  // tslint:disable-next-line:variable-name
  def putString(key: String, string: String): Unit = js.native
}

