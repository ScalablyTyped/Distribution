package typings.reactNativeFbsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-fbsdk", "GraphRequestManager")
@js.native
class GraphRequestManager () extends js.Object {
  var batchCallback: GraphRequestCallback = js.native
  var requestBatch: js.Array[GraphRequest] = js.native
  var requestCallbacks: js.Array[GraphRequestCallback | Null] = js.native
  /**
    * Add call back to the GraphRequestManager. Only one callback can be added.
    * Note that invocation of the batch callback does not indicate success of every
    * graph request made, only that the entire batch has finished executing.
    */
  def addBatchCallback(callback: GraphRequestCallback): GraphRequestManager = js.native
  /**
    * Add a graph request.
    */
  def addRequest(request: GraphRequest): GraphRequestManager = js.native
  /**
    * Executes requests in a batch.
    * Note that when there's an issue with network connection the batch callback
    * behavior differs in Android and iOS.
    * On iOS, the batch callback returns an error if the batch fails with a network error.
    * On Android, the batch callback always returns {"result": "batch finished executing"}
    * after the batch time out. This is because detecting network status requires
    * extra permission and it's unncessary for the sdk. Instead, you can use the NetInfo module
    * in react-native to get the network status.
    */
  def start(): Unit = js.native
  def start(timeout: Double): Unit = js.native
}

