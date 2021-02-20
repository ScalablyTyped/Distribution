package typings.reactNativeFbsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-fbsdk", "ShareOpenGraphValueContainer")
@js.native
class ShareOpenGraphValueContainer protected () extends StObject {
  def this(properties: OpenGraphProperties) = this()
  
  var _properties: OpenGraphProperties = js.native
  
  /**
    * Gets an entry for the given key.
    */
  def getEntry(key: String): OpenGraphValue = js.native
  
  /**
    * Sets a number for the specified key.
    */
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
  def putString(key: String, string: String): Unit = js.native
}
