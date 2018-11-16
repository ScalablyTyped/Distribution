package typings
package reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-fbsdk", "GraphRequest")
@js.native
class GraphRequest protected () extends js.Object {
  /**
       * Constructs a new Graph API request.
       */
  def this(graphPath: java.lang.String) = this()
  /**
       * Constructs a new Graph API request.
       */
  def this(graphPath: java.lang.String, config: GraphRequestConfig) = this()
  /**
       * Constructs a new Graph API request.
       */
  def this(graphPath: java.lang.String, config: GraphRequestConfig, callback: GraphRequestCallback) = this()
  /**
       * Constructs a new Graph API request.
       */
  def this(graphPath: java.lang.String, config: scala.Null, callback: GraphRequestCallback) = this()
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
  var graphPath: java.lang.String = js.native
  /**
       * Adds a string parameter to the request.
       */
  def addStringParameter(paramString: java.lang.String, key: java.lang.String): scala.Unit = js.native
}

