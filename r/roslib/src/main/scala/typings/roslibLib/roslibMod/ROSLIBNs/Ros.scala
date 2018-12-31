package typings
package roslibLib.roslibMod.ROSLIBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ros extends js.Object {
  /**
  		 * Sends an authorization request to the server.
  		 *
  		 * @param mac - MAC (hash) string given by the trusted source.
  		 * @param client - IP of the client.
  		 * @param dest - IP of the destination.
  		 * @param rand - Random string given by the trusted source.
  		 * @param t - Time of the authorization request.
  		 * @param level - User level as a string given by the client.
  		 * @param end - End time of the client's session.
  		 */
  def authenticate(
    mac: java.lang.String,
    client: java.lang.String,
    dest: java.lang.String,
    rand: java.lang.String,
    t: scala.Double,
    level: java.lang.String,
    end: scala.Double
  ): scala.Unit = js.native
  /**
  		 * Sends the message over the WebSocket, but queues the message up if not yet
  		 * connected.
  		 */
  def callOnConnection(message: js.Any): scala.Unit = js.native
  /**
  		 * Disconnect from the WebSocket server.
  		 */
  def close(): scala.Unit = js.native
  /**
  		 * Connect to the specified WebSocket.
  		 *
  		 * @param url - WebSocket URL for Rosbridge
  		 */
  def connect(url: java.lang.String): scala.Unit = js.native
  /**
  		 * Decode a typedefs into a dictionary like `rosmsg show foo/bar`
  		 *
  		 * @param defs - array of type_def dictionary
  		 */
  def decodeTypeDefs(defs: js.Any): scala.Unit = js.native
  /**
  		 * Retrieves list of actionlib servers in ROS as an array.
  		 *
  		 * @param callback function with params:
  		 *   * action_servers - Array of actionlib servers names
  		 * @param failedCallback - the callback function when the ros call failed (optional). Params:
  		 *   * error - the error message reported by ROS
  		 */
  def getActionServers(callback: js.Function1[/* action_servers */ js.Array[java.lang.String], scala.Unit]): scala.Unit = js.native
  def getActionServers(
    callback: js.Function1[/* action_servers */ js.Array[java.lang.String], scala.Unit],
    failedCallback: js.Function1[/* error */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /**
  		 * Retrieves a detail of ROS message.
  		 *
  		 * @param callback - function with params:
  		 *   * details - Array of the message detail
  		 * @param message - String of a topic type
  		 * @param failedCallback - the callback function when the ros call failed (optional). Params:
  		 *   * error - the error message reported by ROS
  		 */
  def getMessageDetails(message: Message, callback: js.Function1[/* detail */ js.Any, scala.Unit]): scala.Unit = js.native
  def getMessageDetails(
    message: Message,
    callback: js.Function1[/* detail */ js.Any, scala.Unit],
    failedCallback: js.Function1[/* error */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /**
  		 * Retrieves list of active node names in ROS.
  		 *
  		 * @param callback - function with the following params:
  		 *   * nodes - array of node names
  		 * @param failedCallback - the callback function when the ros call failed (optional). Params:
  		 *   * error - the error message reported by ROS
  		 */
  def getNodes(callback: js.Function1[/* nodes */ js.Array[java.lang.String], scala.Unit]): scala.Unit = js.native
  def getNodes(
    callback: js.Function1[/* nodes */ js.Array[java.lang.String], scala.Unit],
    failedCallback: js.Function1[/* error */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /**
  		 * Retrieves list of param names from the ROS Parameter Server.
  		 *
  		 * @param callback function with params:
  		 *  * params - array of param names.
  		 * @param failedCallback - the callback function when the ros call failed (optional). Params:
  		 *   * error - the error message reported by ROS
  		 */
  def getParams(callback: js.Function1[/* params */ js.Array[java.lang.String], scala.Unit]): scala.Unit = js.native
  def getParams(
    callback: js.Function1[/* params */ js.Array[java.lang.String], scala.Unit],
    failedCallback: js.Function1[/* error */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /**
  		 * Retrieves a type of ROS service.
  		 *
  		 * @param service name of service:
  		 * @param callback - function with params:
  		 *   * type - String of the service type
  		 * @param failedCallback - the callback function when the ros call failed (optional). Params:
  		 *   * error - the error message reported by ROS
  		 */
  def getServiceType(service: java.lang.String, callback: js.Function1[/* type */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def getServiceType(
    service: java.lang.String,
    callback: js.Function1[/* type */ java.lang.String, scala.Unit],
    failedCallback: js.Function1[/* error */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /**
  		 * Retrieves list of active service names in ROS.
  		 *
  		 * @param callback - function with the following params:
  		 *   * services - array of service names
  		 * @param failedCallback - the callback function when the ros call failed (optional). Params:
  		 *   * error - the error message reported by ROS
  		 */
  def getServices(callback: js.Function1[/* services */ js.Array[java.lang.String], scala.Unit]): scala.Unit = js.native
  def getServices(
    callback: js.Function1[/* services */ js.Array[java.lang.String], scala.Unit],
    failedCallback: js.Function1[/* error */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /**
  		 * Retrieves list of services in ROS as an array as specific type
  		 *
  		 * @param serviceType service type to find:
  		 * @param callback function with params:
  		 *   * topics - Array of service names
  		 * @param failedCallback - the callback function when the ros call failed (optional). Params:
  		 *   * error - the error message reported by ROS
  		 */
  def getServicesForType(
    serviceType: java.lang.String,
    callback: js.Function1[/* services */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  def getServicesForType(
    serviceType: java.lang.String,
    callback: js.Function1[/* services */ js.Array[java.lang.String], scala.Unit],
    failedCallback: js.Function1[/* error */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /**
  		 * Retrieves a type of ROS topic.
  		 *
  		 * @param topic name of the topic:
  		 * @param callback - function with params:
  		 *   * type - String of the topic type
  		 * @param failedCallback - the callback function when the ros call failed (optional). Params:
  		 *   * error - the error message reported by ROS
  		 */
  def getTopicType(topic: java.lang.String, callback: js.Function1[/* type */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def getTopicType(
    topic: java.lang.String,
    callback: js.Function1[/* type */ java.lang.String, scala.Unit],
    failedCallback: js.Function1[/* error */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /**
  		 * Retrieves list of topics in ROS as an array.
  		 *
  		 * @param callback function with params:
  		 *   * topics - Array of topic names
  		 * @param failedCallback - the callback function when the ros call failed (optional). Params:
  		 *   * error - the error message reported by ROS
  		 */
  def getTopics(callback: js.Function1[/* topics */ js.Array[java.lang.String], scala.Unit]): scala.Unit = js.native
  def getTopics(
    callback: js.Function1[/* topics */ js.Array[java.lang.String], scala.Unit],
    failedCallback: js.Function1[/* error */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /**
  		 * Retrieves Topics in ROS as an array as specific type
  		 *
  		 * @param topicType topic type to find:
  		 * @param callback function with params:
  		 *   * topics - Array of topic names
  		 * @param failedCallback - the callback function when the ros call failed (optional). Params:
  		 *   * error - the error message reported by ROS
  		 */
  def getTopicsForType(
    topicType: java.lang.String,
    callback: js.Function1[/* topics */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  def getTopicsForType(
    topicType: java.lang.String,
    callback: js.Function1[/* topics */ js.Array[java.lang.String], scala.Unit],
    failedCallback: js.Function1[/* error */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def on(eventName: java.lang.String, callback: js.Function1[/* event */ js.Any, scala.Unit]): scala.Unit = js.native
}

