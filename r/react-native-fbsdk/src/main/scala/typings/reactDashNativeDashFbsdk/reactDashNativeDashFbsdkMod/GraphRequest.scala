package typings.reactDashNativeDashFbsdk.reactDashNativeDashFbsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-fbsdk", "GraphRequest")
@js.native
class GraphRequest protected () extends js.Object {
  /**
    * Constructs a new Graph API request.
    */
  def this(graphPath: String) = this()
  def this(graphPath: String, config: GraphRequestConfig) = this()
  def this(graphPath: String, config: Null, callback: GraphRequestCallback) = this()
  def this(graphPath: String, config: GraphRequestConfig, callback: GraphRequestCallback) = this()
  /**
    * Called upon completion or failure of the request.
    */
  var callback: js.UndefOr[GraphRequestCallback] = js.native
  /**
    * The optional config for the request.
    */
  var config: js.UndefOr[GraphRequestConfig] = js.native
  /**
    * The Graph API endpoint to use for the request, for example "me".
    */
  var graphPath: String = js.native
  /**
    * Adds a string parameter to the request.
    */
  def addStringParameter(paramString: String, key: String): Unit = js.native
}

