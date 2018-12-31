package typings
package reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkMod

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
  def getEntry(key: java.lang.String): OpenGraphValue = js.native
  /**
    * Sets a number for the specified key.
    */
  // tslint:disable-next-line:variable-name
  def putNumber(key: java.lang.String, number: scala.Double): scala.Unit = js.native
  /**
    * Sets an open graph object for the specified key.
    */
  def putObject(key: java.lang.String, `object`: ShareOpenGraphValueContainer): scala.Unit = js.native
  /**
    * Sets a photo for the specified key.
    */
  def putPhoto(key: java.lang.String, photo: SharePhoto): scala.Unit = js.native
  /**
    * Sets a string for the specified key.
    */
  // tslint:disable-next-line:variable-name
  def putString(key: java.lang.String, string: java.lang.String): scala.Unit = js.native
}

