package typings.roslib.mod

import typings.roslib.anon.GroovyCompatibility
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roslib", "Ros")
@js.native
class Ros protected () extends js.Object {
  /**
    * Manages connection to the server and all interactions with ROS.
    *
    * Emits the following events:
    *  * 'error' - there was an error with ROS
    *  * 'connection' - connected to the WebSocket server
    *  * 'close' - disconnected to the WebSocket server
    *  * <topicName> - a message came from rosbridge with the given topic name
    *  * <serviceID> - a service response came from rosbridge with the given ID
    *
    * @constructor
    * @param options - possible keys include:
    *   * url (optional) - (can be specified later with `connect`) the WebSocket URL for rosbridge or the node server url to connect using socket.io (if socket.io exists in the page) <br>
    *   * groovyCompatibility - don't use interfaces that changed after the last groovy release or rosbridge_suite and related tools (defaults to true)
    *   * transportLibrary (optional) - one of 'websocket' (default), 'socket.io' or RTCPeerConnection instance controlling how the connection is created in `connect`.
    *   * transportOptions (optional) - the options to use use when creating a connection. Currently only used if `transportLibrary` is RTCPeerConnection.
    */
  def this(options: GroovyCompatibility) = this()
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
  def authenticate(mac: String, client: String, dest: String, rand: String, t: Double, level: String, end: Double): Unit = js.native
  /**
    * Sends the message over the WebSocket, but queues the message up if not yet
    * connected.
    */
  def callOnConnection(message: js.Any): Unit = js.native
  /**
    * Disconnect from the WebSocket server.
    */
  def close(): Unit = js.native
  /**
    * Connect to the specified WebSocket.
    *
    * @param url - WebSocket URL for Rosbridge
    */
  def connect(url: String): Unit = js.native
  /**
    * Decode a typedefs into a dictionary like `rosmsg show foo/bar`
    *
    * @param defs - array of type_def dictionary
    */
  def decodeTypeDefs(defs: js.Any): Unit = js.native
  /**
    * Retrieves list of actionlib servers in ROS as an array.
    *
    * @param callback function with params:
    *   * action_servers - Array of actionlib servers names
    * @param failedCallback - the callback function when the ros call failed (optional). Params:
    *   * error - the error message reported by ROS
    */
  def getActionServers(callback: js.Function1[/* action_servers */ js.Array[String], Unit]): Unit = js.native
  def getActionServers(
    callback: js.Function1[/* action_servers */ js.Array[String], Unit],
    failedCallback: js.Function1[/* error */ js.Any, Unit]
  ): Unit = js.native
  /**
    * Retrieves a detail of ROS message.
    *
    * @param callback - function with params:
    *   * details - Array of the message detail
    * @param message - String of a topic type
    * @param failedCallback - the callback function when the ros call failed (optional). Params:
    *   * error - the error message reported by ROS
    */
  def getMessageDetails(message: Message, callback: js.Function1[/* detail */ js.Any, Unit]): Unit = js.native
  def getMessageDetails(
    message: Message,
    callback: js.Function1[/* detail */ js.Any, Unit],
    failedCallback: js.Function1[/* error */ js.Any, Unit]
  ): Unit = js.native
  /**
    * Retrieves list of active node names in ROS.
    *
    * @param callback - function with the following params:
    *   * nodes - array of node names
    * @param failedCallback - the callback function when the ros call failed (optional). Params:
    *   * error - the error message reported by ROS
    */
  def getNodes(callback: js.Function1[/* nodes */ js.Array[String], Unit]): Unit = js.native
  def getNodes(
    callback: js.Function1[/* nodes */ js.Array[String], Unit],
    failedCallback: js.Function1[/* error */ js.Any, Unit]
  ): Unit = js.native
  /**
    * Retrieves list of param names from the ROS Parameter Server.
    *
    * @param callback function with params:
    *  * params - array of param names.
    * @param failedCallback - the callback function when the ros call failed (optional). Params:
    *   * error - the error message reported by ROS
    */
  def getParams(callback: js.Function1[/* params */ js.Array[String], Unit]): Unit = js.native
  def getParams(
    callback: js.Function1[/* params */ js.Array[String], Unit],
    failedCallback: js.Function1[/* error */ js.Any, Unit]
  ): Unit = js.native
  /**
    * Retrieves a type of ROS service.
    *
    * @param service name of service:
    * @param callback - function with params:
    *   * type - String of the service type
    * @param failedCallback - the callback function when the ros call failed (optional). Params:
    *   * error - the error message reported by ROS
    */
  def getServiceType(service: String, callback: js.Function1[/* type */ String, Unit]): Unit = js.native
  def getServiceType(
    service: String,
    callback: js.Function1[/* type */ String, Unit],
    failedCallback: js.Function1[/* error */ js.Any, Unit]
  ): Unit = js.native
  /**
    * Retrieves list of active service names in ROS.
    *
    * @param callback - function with the following params:
    *   * services - array of service names
    * @param failedCallback - the callback function when the ros call failed (optional). Params:
    *   * error - the error message reported by ROS
    */
  def getServices(callback: js.Function1[/* services */ js.Array[String], Unit]): Unit = js.native
  def getServices(
    callback: js.Function1[/* services */ js.Array[String], Unit],
    failedCallback: js.Function1[/* error */ js.Any, Unit]
  ): Unit = js.native
  /**
    * Retrieves list of services in ROS as an array as specific type
    *
    * @param serviceType service type to find:
    * @param callback function with params:
    *   * topics - Array of service names
    * @param failedCallback - the callback function when the ros call failed (optional). Params:
    *   * error - the error message reported by ROS
    */
  def getServicesForType(serviceType: String, callback: js.Function1[/* services */ js.Array[String], Unit]): Unit = js.native
  def getServicesForType(
    serviceType: String,
    callback: js.Function1[/* services */ js.Array[String], Unit],
    failedCallback: js.Function1[/* error */ js.Any, Unit]
  ): Unit = js.native
  /**
    * Retrieves a type of ROS topic.
    *
    * @param topic name of the topic:
    * @param callback - function with params:
    *   * type - String of the topic type
    * @param failedCallback - the callback function when the ros call failed (optional). Params:
    *   * error - the error message reported by ROS
    */
  def getTopicType(topic: String, callback: js.Function1[/* type */ String, Unit]): Unit = js.native
  def getTopicType(
    topic: String,
    callback: js.Function1[/* type */ String, Unit],
    failedCallback: js.Function1[/* error */ js.Any, Unit]
  ): Unit = js.native
  /**
    * Retrieves list of topics in ROS as an array.
    *
    * @param callback function with params:
    *   * topics - Array of topic names
    * @param failedCallback - the callback function when the ros call failed (optional). Params:
    *   * error - the error message reported by ROS
    */
  def getTopics(callback: js.Function1[/* topics */ js.Array[String], Unit]): Unit = js.native
  def getTopics(
    callback: js.Function1[/* topics */ js.Array[String], Unit],
    failedCallback: js.Function1[/* error */ js.Any, Unit]
  ): Unit = js.native
  /**
    * Retrieves Topics in ROS as an array as specific type
    *
    * @param topicType topic type to find:
    * @param callback function with params:
    *   * topics - Array of topic names
    * @param failedCallback - the callback function when the ros call failed (optional). Params:
    *   * error - the error message reported by ROS
    */
  def getTopicsForType(topicType: String, callback: js.Function1[/* topics */ js.Array[String], Unit]): Unit = js.native
  def getTopicsForType(
    topicType: String,
    callback: js.Function1[/* topics */ js.Array[String], Unit],
    failedCallback: js.Function1[/* error */ js.Any, Unit]
  ): Unit = js.native
  def on(eventName: String, callback: js.Function1[/* event */ js.Any, Unit]): Unit = js.native
}

