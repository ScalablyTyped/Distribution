package typings.roslib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roslib", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ActionClient protected () extends js.Object {
    /**
    		 * An actionlib action client.
    		 *
    		 * Emits the following events:
    		 *  * 'timeout' - if a timeout occurred while sending a goal
    		 *  * 'status' - the status messages received from the action server
    		 *  * 'feedback' -  the feedback messages received from the action server
    		 *  * 'result' - the result returned from the action server
    		 *
    		 *  @constructor
    		 *  @param options - object with following keys:
    		 *   * ros - the ROSLIB.Ros connection handle
    		 *   * serverName - the action server name, like /fibonacci
    		 *   * actionName - the action message name, like 'actionlib_tutorials/FibonacciAction'
    		 *   * timeout - the timeout length when connecting to the action server
    		 */
    def this(options: AnonActionName) = this()
    /**
    		 * Cancel all goals associated with this ActionClient.
    		 */
    def cancel(): Unit = js.native
  }
  
  @js.native
  class Goal protected () extends js.Object {
    /**
    		 * An actionlib goal goal is associated with an action server.
    		 *
    		 * Emits the following events:
    		 *  * 'timeout' - if a timeout occurred while sending a goal
    		 *
    		 *  @constructor
    		 *  @param options with following keys:
    		 *   * actionClient - the ROSLIB.ActionClient to use with this goal
    		 *   * goalMessage - The JSON object containing the goal for the action server
    		 */
    def this(options: AnonActionClient) = this()
    /**
    		 * Cancel the current goal.
    		 */
    def cancel(): Unit = js.native
    /**
    		 * Connect callback functions to goal based events
    		 *
    		 * @param eventName Name of event ('timeout', 'status', 'feedback', 'result')
    		 * @param callback Callback function executed on connected event
    		 */
    def on(eventName: String, callback: js.Function1[/* event */ js.Any, Unit]): Unit = js.native
    /**
    		 * Send the goal to the action server.
    		 *
    		 * @param timeout (optional) - a timeout length for the goal's result
    		 */
    def send(): Unit = js.native
    def send(timeout: Double): Unit = js.native
  }
  
  @js.native
  class Message protected () extends js.Object {
    /**
    		 * Message objects are used for publishing and subscribing to and from topics.
    		 *
    		 * @constructor
    		 * @param values - object matching the fields defined in the .msg definition file
    		 */
    def this(values: js.Any) = this()
  }
  
  @js.native
  class Param protected () extends js.Object {
    /**
    		 * A ROS parameter.
    		 *
    		 * @constructor
    		 * @param options - possible keys include:
    		 *   * ros - the ROSLIB.Ros connection handle
    		 *   * name - the param name, like max_vel_x
    		 */
    def this(options: AnonName) = this()
    /**
    		 * Delete this parameter on the ROS server.
    		 */
    def delete(callback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
    /**
    		 * Fetches the value of the param.
    		 *
    		 * @param callback - function with the following params:
    		 *  * value - the value of the param from ROS.
    		 */
    def get(callback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
    /**
    		 * Sets the value of the param in ROS.
    		 *
    		 * @param value - value to set param to.
    		 * @param callback - function with params:
    		 *   * response - the response from the service request
    		 */
    def set(value: js.Any): Unit = js.native
    def set(value: js.Any, callback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  }
  
  @js.native
  /**
    * A Quaternion.
    *
    * @constructor
    * @param options - object with following keys:
    *   * x - the x value
    *   * y - the y value
    *   * z - the z value
    *   * w - the w value
    */
  class Quaternion () extends js.Object {
    def this(options: AnonW) = this()
    var w: Double = js.native
    // getters
    var x: Double = js.native
    var y: Double = js.native
    var z: Double = js.native
    /**
      * Perform a conjugation on this quaternion.
      */
    def conjugate(): Unit = js.native
    /**
      * Convert this quaternion into its inverse.
      */
    def invert(): Unit = js.native
    /**
      * Set the values of this quaternion to the product of itself and the given quaternion.
      * @param q - the quaternion to multiply with
      */
    def multiply(q: Quaternion): Unit = js.native
    /**
      * Return the norm of this quaternion.
      */
    def norm(): Double = js.native
    /**
      * Perform a normalization on this quaternion.
      */
    def normalize(): Unit = js.native
  }
  
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
    def this(options: AnonGroovyCompatibility) = this()
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
  
  @js.native
  class Service protected () extends js.Object {
    /**
    		 * A ROS service client.
    		 *
    		 * @constructor
    		 * @params options - possible keys include:
    		 *   * ros - the ROSLIB.Ros connection handle
    		 *   * name - the service name, like /add_two_ints
    		 *   * serviceType - the service type, like 'rospy_tutorials/AddTwoInts'
    		 */
    def this(data: AnonNameRos) = this()
    // getter
    var name: String = js.native
    // getter
    var serviceType: String = js.native
    /**
    		 * Advertise this service and call the callback each time a client calls it.
    		 *
    		 * @param callback - function with the following params:
    		 *   * request - the service request data
    		 *   * response - the data which should be sent back to the caller
    		 */
    def advertise(callback: js.Function2[/* request */ js.Any, /* response */ js.Any, Unit]): Unit = js.native
    /**
    		 * Calls the service. Returns the service response in the callback.
    		 *
    		 * @param request - the ROSLIB.ServiceRequest to send
    		 * @param callback - function with params:
    		 *   * response - the response from the service request
    		 * @param failedCallback - the callback function when the service call failed (optional). Params:
    		 *   * error - the error message reported by ROS
    		 */
    def callService(request: ServiceRequest, callback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
    def callService(
      request: ServiceRequest,
      callback: js.Function1[/* response */ js.Any, Unit],
      failedCallback: js.Function1[/* error */ js.Any, Unit]
    ): Unit = js.native
    /**
    		 * Unadvertise a previously advertised service
    		 */
    def unadvertise(): Unit = js.native
  }
  
  @js.native
  /**
  		 * A ServiceRequest is passed into the service call.
  		 *
  		 * @constructor
  		 * @param values - object matching the fields defined in the .srv definition file
  		 */
  class ServiceRequest () extends js.Object {
    def this(values: js.Any) = this()
  }
  
  @js.native
  /**
  		 * A ServiceResponse is returned from the service call.
  		 *
  		 * @constructor
  		 * @param values - object matching the fields defined in the .srv definition file
  		 */
  class ServiceResponse () extends js.Object {
    def this(values: js.Any) = this()
  }
  
  @js.native
  class TFClient protected () extends js.Object {
    /**
      * A TF Client that listens to TFs from tf2_web_republisher.
      *
      * @constructor
      * @param options - object with following keys:
      *   * ros - the ROSLIB.Ros connection handle
      *   * fixedFrame - the fixed frame, like /base_link
      *   * angularThres - the angular threshold for the TF republisher
      *   * transThres - the translation threshold for the TF republisher
      *   * rate - the rate for the TF republisher
      *   * updateDelay - the time (in ms) to wait after a new subscription to update the TF republisher's list of TFs
      *   * topicTimeout - the timeout parameter for the TF republisher
      *   * serverName (optional) - the name of the tf2_web_republisher server
      *   * repubServiceName (optional) - the name of the republish_tfs service (non groovy compatibility mode only) default: '/republish_tfs'
      */
    def this(options: AnonAngularThres) = this()
    /**
      * Unsubscribe and unadvertise all topics associated with this TFClient.
      */
    def dispose(): Unit = js.native
    /**
      * Process the service response and subscribe to the tf republisher topic.
      *
      * @param response - the service response containing the topic name
      */
    def processResponse(response: js.Any): Unit = js.native
    /**
      * Process the incoming TF message and send them out using the callback functions
      * @param tf - the TF message from the server
      */
    def processTfArray(tf: js.Any): Unit = js.native
    /**
      * Subscribe to the given TF frame.
      * @param frameId - the TF frame to subscribe to
      * @param callback - function with params:
      *  * transform - the transform data
      */
    def subscribe(frameId: String, callback: js.Function1[/* transform */ Transform, Unit]): Unit = js.native
    /**
      * Unsubscribe from the given TF frame.
      *
      * @param frameId - the TF frame to unsubscribe from
      * @param callback - the callback function to remove
      */
    def unsubscribe(frameId: String): Unit = js.native
    def unsubscribe(frameId: String, callback: js.Function1[/* transform */ Transform, Unit]): Unit = js.native
    /**
      * Create and send a new goal (or service request) to the tf2_web_republisher based on the current list of TFs.
      */
    def updateGoal(): Unit = js.native
  }
  
  @js.native
  class Topic protected () extends js.Object {
    /**
    		 * Publish and/or subscribe to a topic in ROS.
    		 *
    		 * Emits the following events:
    		 *  * 'warning' - if there are any warning during the Topic creation
    		 *  * 'message' - the message data from rosbridge
    		 *
    		 * @constructor
    		 * @param options - object with following keys:
    		 *   * ros - the ROSLIB.Ros connection handle
    		 *   * name - the topic name, like /cmd_vel
    		 *   * messageType - the message type, like 'std_msgs/String'
    		 *   * compression - the type of compression to use, like 'png'
    		 *   * throttle_rate - the rate (in ms in between messages) at which to throttle the topics
    		 *   * queue_size - the queue created at bridge side for re-publishing webtopics (defaults to 100)
    		 *   * latch - latch the topic when publishing
    		 *   * queue_length - the queue length at bridge side used when subscribing (defaults to 0, no queueing).
    		 */
    def this(options: AnonCompression) = this()
    // getter
    var messageType: String = js.native
    // getter
    var name: String = js.native
    /**
    		 * Registers as a publisher for the topic.
    		 */
    def advertise(): Unit = js.native
    /**
    		 * Publish the message.
    		 *
    		 * @param message - A ROSLIB.Message object.
    		 */
    def publish(message: Message): Unit = js.native
    /**
    		 * Every time a message is published for the given topic, the callback
    		 * will be called with the message object.
    		 *
    		 * @param callback - function with the following params:
    		 *   * message - the published message
    		 */
    def subscribe(callback: js.Function1[/* message */ Message, Unit]): Unit = js.native
    /**
    		 * Unregisters as a publisher for the topic.
    		 */
    def unadvertise(): Unit = js.native
    /**
    		 * Unregisters as a subscriber for the topic. Unsubscribing stop remove
    		 * all subscribe callbacks. To remove a call back, you must explicitly
    		 * pass the callback function in.
    		 *
    		 * @param callback - the optional callback to unregister, if
    		 *     * provided and other listeners are registered the topic won't
    		 *     * unsubscribe, just stop emitting to the passed listener
    		 */
    def unsubscribe(): Unit = js.native
    def unsubscribe(callback: js.Function1[/* callback */ js.Function1[/* message */ Message, Unit], Unit]): Unit = js.native
  }
  
  @js.native
  class Transform protected () extends js.Object {
    /**
      * A Transform in 3-space. Values are copied into this object.
      *
      * @constructor
      * @param options - object with following keys:
      *   * translation - the Vector3 describing the translation
      *   * rotation - the ROSLIB.Quaternion describing the rotation
      */
    def this(options: AnonRotation) = this()
    var rotation: Quaternion = js.native
    // getters
    var translation: Vector3 = js.native
  }
  
  @js.native
  class Vector3 protected () extends js.Object {
    /**
      * A 3D vector.
      *
      * @constructor
      * @param options - object with following keys:
      *   * x - the x value
      *   * y - the y value
      *   * z - the z value
      */
    def this(options: AnonX) = this()
    // getters
    var x: Double = js.native
    var y: Double = js.native
    var z: Double = js.native
    /**
      * Set the values of this vector to the sum of itself and the given vector.
      *
      * @param v - the vector to add with
      */
    def add(v: Vector3): Unit = js.native
    /**
      * Multiply the given Quaternion with this vector.
      * @param q - the quaternion to multiply with
      */
    def multiplyQuaternion(q: Quaternion): Unit = js.native
    /**
      * Set the values of this vector to the difference of itself and the given vector.
      *
      * @param v - the vector to subtract with
      */
    def subtract(v: Vector3): Unit = js.native
  }
  
}

