package typings.roslib

import typings.eventemitter2.mod.EventEmitter2
import typings.roslib.anon.ActionName
import typings.roslib.anon.AngularThres
import typings.roslib.anon.Compression
import typings.roslib.anon.GroovyCompatibility
import typings.roslib.anon.Name
import typings.roslib.anon.Orientation
import typings.roslib.anon.Publishing
import typings.roslib.anon.Rotation
import typings.roslib.anon.ServerName
import typings.roslib.anon.StringString
import typings.roslib.anon.Topics
import typings.roslib.anon.Typedefs
import typings.roslib.anon.Typedefsfulltext
import typings.roslib.anon.W
import typings.roslib.anon.X
import typings.roslib.anon.Xml
import typings.roslib.roslibInts.`0`
import typings.roslib.roslibInts.`1`
import typings.roslib.roslibInts.`2`
import typings.roslib.roslibInts.`3`
import typings.roslib.roslibStrings.close
import typings.roslib.roslibStrings.connection
import typings.roslib.roslibStrings.error
import typings.roslib.roslibStrings.feedback
import typings.roslib.roslibStrings.result
import typings.roslib.roslibStrings.socketDotio
import typings.roslib.roslibStrings.status
import typings.roslib.roslibStrings.timeout
import typings.roslib.roslibStrings.websocket
import typings.roslib.roslibStrings.workersocket
import typings.std.Event
import typings.std.RTCDataChannelInit
import typings.std.RTCPeerConnection
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("roslib", "ActionClient")
  @js.native
  open class ActionClient protected () extends StObject {
    /**
      * An actionlib action client.
      *
      * Emits the following events:
      *  * 'timeout' - If a timeout occurred while sending a goal.
      *  * 'status' - The status messages received from the action server.
      *  * 'feedback' - The feedback messages received from the action server.
      *  * 'result' - The result returned from the action server.
      *
      * @param {Object} options
      * @param {Ros} options.ros - The ROSLIB.Ros connection handle.
      * @param {string} options.serverName - The action server name, like '/fibonacci'.
      * @param {string} options.actionName - The action message name, like 'actionlib_tutorials/FibonacciAction'.
      * @param {number} [options.timeout] - The timeout length when connecting to the action server.
      * @param {boolean} [options.omitFeedback] - The flag to indicate whether to omit the feedback channel or not.
      * @param {boolean} [options.omitStatus] - The flag to indicate whether to omit the status channel or not.
      * @param {boolean} [options.omitResult] - The flag to indicate whether to omit the result channel or not.
      */
    def this(options: ActionName) = this()
    
    /**
      * Cancel all goals associated with this ActionClient.
      */
    def cancel(): Unit = js.native
    
    /**
      * Unsubscribe and unadvertise all topics associated with this ActionClient.
      */
    def dispose(): Unit = js.native
  }
  
  @JSImport("roslib", "ActionListener")
  @js.native
  open class ActionListener protected () extends StObject {
    /**
      * An actionlib action listener.
      *
      * Emits the following events:
      *  * 'status' - The status messages received from the action server.
      *  * 'feedback' - The feedback messages received from the action server.
      *  * 'result' - The result returned from the action server.
      *
      * @param {Object} options
      * @param {Ros} options.ros - The ROSLIB.Ros connection handle.
      * @param {string} options.serverName - The action server name, like '/fibonacci'.
      * @param {string} options.actionName - The action message name, like 'actionlib_tutorials/FibonacciAction'.
      */
    def this(options: ServerName) = this()
  }
  
  @JSImport("roslib", "Goal")
  @js.native
  open class Goal protected () extends StObject {
    /**
      * An actionlib goal that is associated with an action server.
      *
      * Emits the following events:
      *  * 'timeout' - If a timeout occurred while sending a goal.
      *
      * @param {Object} options
      * @param {ActionClient} options.actionClient - The ROSLIB.ActionClient to use with this goal.
      * @param {any} options.goalMessage - The JSON object containing the goal for the action server.
      */
    def this(options: typings.roslib.anon.ActionClient) = this()
    
    /**
      * Cancel the current goal.
      */
    def cancel(): Unit = js.native
    
    /**
      * Connect callback functions to goal based events.
      *
      * @param {string} eventName - Name of event ('timeout', 'status', 'feedback', 'result').
      * @param {function} callback - Callback function executed on connected event.
      */
    def on(eventName: timeout | status | feedback | result, callback: js.Function1[/* event */ Any, Unit]): Unit = js.native
    
    /**
      * Send the goal to the action server.
      *
      * @param {number} [timeout] - A timeout length for the goal's result.
      */
    def send(): Unit = js.native
    def send(timeout: Double): Unit = js.native
  }
  
  @JSImport("roslib", "Message")
  @js.native
  open class Message protected () extends StObject {
    /**
      * Message objects are used for publishing and subscribing to and from topics.
      *
      * @param {any} values - An object matching the fields defined in the .msg definition file.
      */
    def this(values: Any) = this()
  }
  
  @JSImport("roslib", "Param")
  @js.native
  open class Param protected () extends StObject {
    /**
      * A ROS parameter.
      *
      * @param {Object} options
      * @param {Ros} options.ros - The ROSLIB.Ros connection handle.
      * @param {string} options.name - The param name, like max_vel_x.
      */
    def this(options: Name) = this()
    
    /**
      * Delete this parameter on the ROS server.
      *
      * @param {function} callback - The callback function.
      */
    def delete(callback: js.Function1[/* response */ Any, Unit]): Unit = js.native
    
    /**
      * Fetch the value of the param.
      *
      * @param {function} callback - Function with the following params:
      * @param {any} callback.value - The value of the param from ROS.
      */
    def get(callback: js.Function1[/* value */ Any, Unit]): Unit = js.native
    
    /**
      * Set the value of the param in ROS.
      *
      * @param {any} value - The value to set param to.
      * @param {function} callback - The callback function.
      */
    def set(value: Any, callback: js.Function1[/* response */ Any, Unit]): Unit = js.native
  }
  
  @JSImport("roslib", "Pose")
  @js.native
  /**
    * A Pose in 3D space. Values are copied into this object.
    *
    * @param {Object} options
    * @param {Vector3Like} options.position - The ROSLIB.Vector3 describing the position.
    * @param {QuaternionLike} options.orientation - The ROSLIB.Quaternion describing the orientation.
    */
  open class Pose () extends StObject {
    def this(options: Orientation) = this()
    
    /**
      * Apply a transform against this pose.
      *
      * @param {Transform} tf - The transform to be applied.
      */
    def applyTransform(tf: Transform): Unit = js.native
    
    /**
      * Compute the inverse of this pose.
      *
      * @returns {Pose} The inverse of the pose.
      */
    def getInverse(): Pose = js.native
    
    /**
      * Multiply this pose with another pose without altering this pose.
      *
      * @returns {Pose} The result of the multiplication.
      */
    def multiply(pose: Pose): Unit = js.native
    
    var orientation: Quaternion = js.native
    
    var position: Vector3 = js.native
  }
  
  @JSImport("roslib", "Quaternion")
  @js.native
  /**
    * A Quaternion.
    *
    * @param {Object} options
    * @param {number} [options.x=0] - The x value.
    * @param {number} [options.y=0] - The y value.
    * @param {number} [options.z=0] - The z value.
    * @param {number} [options.w=1] - The w value.
    */
  open class Quaternion ()
    extends StObject
       with QuaternionLike {
    def this(options: W) = this()
    
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
      *
      * @param {Quaternion} q - The quaternion to multiply with.
      */
    def multiply(q: Quaternion): Unit = js.native
    
    /**
      * Return the norm of this quaternion.
      *
      * @returns {number} The norm of this quaternion.
      */
    def norm(): Double = js.native
    
    /**
      * Perform a normalization on this quaternion.
      */
    def normalize(): Unit = js.native
    
    @JSName("w")
    var w_Quaternion: Double = js.native
    
    // getters
    @JSName("x")
    var x_Quaternion: Double = js.native
    
    @JSName("y")
    var y_Quaternion: Double = js.native
    
    @JSName("z")
    var z_Quaternion: Double = js.native
  }
  
  @JSImport("roslib", "Ros")
  @js.native
  open class Ros protected () extends EventEmitter2 {
    /**
      * Manages connection to the server and all interactions with ROS.
      *
      * Emits the following events:
      *  * 'error' - There was an error with ROS.
      *  * 'connection' - Connected to the WebSocket server.
      *  * 'close' - Disconnected to the WebSocket server.
      *  * &#60;topicName&#62; - A message came from rosbridge with the given topic name.
      *  * &#60;serviceID&#62; - A service response came from rosbridge with the given ID.
      *
      * @param {Object} options
      * @param {string} [options.url] - The WebSocket URL for rosbridge or the node server URL to connect using socket.io (if socket.io exists in the page). Can be specified later with `connect`.
      * @param {boolean} [options.groovyCompatibility=true] - Don't use interfaces that changed after the last groovy release or rosbridge_suite and related tools.
      * @param {string} [options.transportLibrary=websocket] - One of 'websocket', 'workersocket', 'socket.io' or RTCPeerConnection instance controlling how the connection is created in `connect`.
      * @param {Object} [options.transportOptions={}] - The options to use when creating a connection. Currently only used if `transportLibrary` is RTCPeerConnection.
      */
    def this(options: GroovyCompatibility) = this()
    
    /**
      * Send an authorization request to the server.
      *
      * @param {string} mac - MAC (hash) string given by the trusted source.
      * @param {string} client - IP of the client.
      * @param {string} dest - IP of the destination.
      * @param {string} rand - Random string given by the trusted source.
      * @param {any} t - Time of the authorization request.
      * @param {string} level - User level as a string given by the client.
      * @param {Object} end - End time of the client's session.
      */
    def authenticate(mac: String, client: String, dest: String, rand: String, t: Any, level: String, end: Any): Unit = js.native
    
    /**
      * Send the message over the WebSocket, but queue the message up if not yet
      * connected.
      *
      * @param {any} message - The message to be sent.
      */
    def callOnConnection(message: Any): Unit = js.native
    
    /**
      * Disconnect from the WebSocket server.
      */
    def close(): Unit = js.native
    
    /**
      * Connect to the specified WebSocket.
      *
      * @param {string} url - WebSocket URL or RTCDataChannel label for rosbridge.
      */
    def connect(url: String): Unit = js.native
    
    /**
      * Decode a typedef array into a dictionary like `rosmsg show foo/bar`.
      *
      * @param {any[]} defs - Array of type_def dictionary.
      */
    def decodeTypeDefs(defs: js.Array[Any]): Any = js.native
    
    /**
      * Retrieve a list of action servers in ROS as an array of string.
      *
      * @param {function} callback - Function with the following params:
      * @param {string[]} callback.actionservers - Array of action server names.
      * @param {function} [failedCallback] - The callback function when the service call failed with params:
      * @param {string} failedCallback.error - The error message reported by ROS.
      */
    def getActionServers(callback: js.Function1[/* actionservers */ js.Array[String], Unit]): Unit = js.native
    def getActionServers(
      callback: js.Function1[/* actionservers */ js.Array[String], Unit],
      failedCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    
    /**
      * Retrieve the details of a ROS message.
      *
      * @param {string} message - The name of the message type.
      * @param {function} callback - Function with the following params:
      * @param {string} callback.details - An array of the message details.
      * @param {function} [failedCallback] - The callback function when the service call failed with params:
      * @param {string} failedCallback.error - The error message reported by ROS.
      */
    def getMessageDetails(message: String, callback: js.Function1[/* details */ String, Unit]): Unit = js.native
    def getMessageDetails(
      message: String,
      callback: js.Function1[/* details */ String, Unit],
      failedCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    
    /**
      * Retrieve a list of subscribed topics, publishing topics and services of a specific node.
      * <br>
      * These are the parameters if failedCallback is <strong>undefined</strong>.
      *
      * @param {string} node - Name of the node.
      * @param {function} callback - Function with the following params:
      * @param {Object} callback.result - The result object with the following params:
      * @param {string[]} callback.result.subscribing - Array of subscribed topic names.
      * @param {string[]} callback.result.publishing - Array of published topic names.
      * @param {string[]} callback.result.services - Array of service names hosted.
      * @param {function} [failedCallback] - The callback function when the service call failed with params:
      * @param {string} failedCallback.error - The error message reported by ROS.
      */
    // Note: Use type overloading instead to provide better readability of the available function signatures of getNodeDetails
    // tslint:disable-next-line:unified-signatures
    def getNodeDetails(node: String, callback: js.Function1[/* result */ Publishing, Unit]): Unit = js.native
    def getNodeDetails(
      node: String,
      callback: js.Function1[/* result */ Publishing, Unit],
      failedCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    /**
      * Retrieve a list of subscribed topics, publishing topics and services of a specific node.
      * <br>
      * These are the parameters if failedCallback is <strong>defined</strong>.
      *
      * @param {string} node - Name of the node.
      * @param {function} callback - Function with the following params:
      * @param {string[]} callback.subscriptions - Array of subscribed topic names.
      * @param {string[]} callback.publications - Array of published topic names.
      * @param {string[]} callback.services - Array of service names hosted.
      * @param {function} [failedCallback] - The callback function when the service call failed with params:
      * @param {string} failedCallback.error - The error message reported by ROS.
      */
    // Note: Use type overloading instead to provide better readability of the available function signatures of getNodeDetails
    // tslint:disable-next-line:unified-signatures
    def getNodeDetails(
      node: String,
      callback: js.Function3[
          /* subscriptions */ js.Array[String], 
          /* publications */ js.Array[String], 
          /* services */ js.Array[String], 
          Unit
        ]
    ): Unit = js.native
    def getNodeDetails(
      node: String,
      callback: js.Function3[
          /* subscriptions */ js.Array[String], 
          /* publications */ js.Array[String], 
          /* services */ js.Array[String], 
          Unit
        ],
      failedCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    
    /**
      * Retrieve a list of active node names in ROS.
      *
      * @param {function} callback - Function with the following params:
      * @param {string[]} callback.nodes - Array of node names.
      * @param {function} [failedCallback] - The callback function when the service call failed with params:
      * @param {string} failedCallback.error - The error message reported by ROS.
      */
    def getNodes(callback: js.Function1[/* nodes */ js.Array[String], Unit]): Unit = js.native
    def getNodes(
      callback: js.Function1[/* nodes */ js.Array[String], Unit],
      failedCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    
    /**
      * Retrieve a list of parameter names from the ROS Parameter Server.
      *
      * @param {function} callback - Function with the following params:
      * @param {string[]} callback.params - Array of param names.
      * @param {function} [failedCallback] - The callback function when the service call failed with params:
      * @param {string} failedCallback.error - The error message reported by ROS.
      */
    def getParams(callback: js.Function1[/* params */ js.Array[String], Unit]): Unit = js.native
    def getParams(
      callback: js.Function1[/* params */ js.Array[String], Unit],
      failedCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    
    /**
      * Retrieve the details of a ROS service request.
      *
      * @param {string} type - The type of the service.
      * @param {function} callback - Function with the following params:
      * @param {Object} callback.result - The result object with the following params:
      * @param {string[]} callback.result.typedefs - An array containing the details of the service request.
      * @param {function} [failedCallback] - The callback function when the service call failed with params:
      * @param {string} failedCallback.error - The error message reported by ROS.
      */
    def getServiceRequestDetails(`type`: String, callback: js.Function1[/* result */ Typedefs, Unit]): Unit = js.native
    def getServiceRequestDetails(
      `type`: String,
      callback: js.Function1[/* result */ Typedefs, Unit],
      failedCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    
    /**
      * Retrieve the details of a ROS service response.
      *
      * @param {string} type - The type of the service.
      * @param {function} callback - Function with the following params:
      * @param {Object} callback.result - The result object with the following params:
      * @param {string[]} callback.result.typedefs - An array containing the details of the service response.
      * @param {function} [failedCallback] - The callback function when the service call failed with params:
      * @param {string} failedCallback.error - The error message reported by ROS.
      */
    def getServiceResponseDetails(`type`: String, callback: js.Function1[/* result */ Typedefs, Unit]): Unit = js.native
    def getServiceResponseDetails(
      `type`: String,
      callback: js.Function1[/* result */ Typedefs, Unit],
      failedCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    
    /**
      * Retrieve the type of a ROS service.
      *
      * @param {string} service - Name of the service.
      * @param {function} callback - Function with the following params:
      * @param {string} callback.type - The type of the service.
      * @param {function} [failedCallback] - The callback function when the service call failed with params:
      * @param {string} failedCallback.error - The error message reported by ROS.
      */
    def getServiceType(service: String, callback: js.Function1[/* type */ String, Unit]): Unit = js.native
    def getServiceType(
      service: String,
      callback: js.Function1[/* type */ String, Unit],
      failedCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    
    /**
      * Retrieve a list of active service names in ROS.
      *
      * @param {function} callback - Function with the following params:
      * @param {string[]} callback.services - Array of service names.
      * @param {function} [failedCallback] - The callback function when the service call failed with params:
      * @param {string} failedCallback.error - The error message reported by ROS.
      */
    def getServices(callback: js.Function1[/* services */ js.Array[String], Unit]): Unit = js.native
    def getServices(
      callback: js.Function1[/* services */ js.Array[String], Unit],
      failedCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    
    /**
      * Retrieve a list of services in ROS as an array as specific type.
      *
      * @param {string} serviceType - The service type to find.
      * @param {function} callback - Function with the following params:
      * @param {string[]} callback.topics - Array of service names.
      * @param {function} [failedCallback] - The callback function when the service call failed with params:
      * @param {string} failedCallback.error - The error message reported by ROS.
      */
    def getServicesForType(serviceType: String, callback: js.Function1[/* topics */ js.Array[String], Unit]): Unit = js.native
    def getServicesForType(
      serviceType: String,
      callback: js.Function1[/* topics */ js.Array[String], Unit],
      failedCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    
    /**
      * Retrieve the type of a ROS topic.
      *
      * @param {string} topic - Name of the topic.
      * @param {function} callback - Function with the following params:
      * @param {string} callback.type - The type of the topic.
      * @param {function} [failedCallback] - The callback function when the service call failed with params:
      * @param {string} failedCallback.error - The error message reported by ROS.
      */
    def getTopicType(topic: String, callback: js.Function1[/* type */ String, Unit]): Unit = js.native
    def getTopicType(
      topic: String,
      callback: js.Function1[/* type */ String, Unit],
      failedCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    
    /**
      * Retrieve a list of topics in ROS as an array.
      *
      * @param {function} callback - Function with the following params:
      * @param {Object} callback.result - The result object with the following params:
      * @param {string[]} callback.result.topics - Array of topic names.
      * @param {string[]} callback.result.types - Array of message type names.
      * @param {function} [failedCallback] - The callback function when the service call failed with params:
      * @param {string} failedCallback.error - The error message reported by ROS.
      */
    def getTopics(callback: js.Function1[/* result */ Topics, Unit]): Unit = js.native
    def getTopics(
      callback: js.Function1[/* result */ Topics, Unit],
      failedCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    
    /**
      * Retrieve a list of topics and their associated type definitions.
      *
      * @param {function} callback - Function with the following params:
      * @param {Object} callback.result - The result object with the following params:
      * @param {string[]} callback.result.topics - Array of topic names.
      * @param {string[]} callback.result.types - Array of message type names.
      * @param {string[]} callback.result.typedefs_full_text - Array of full definitions of message types, similar to `gendeps --cat`.
      * @param {function} [failedCallback] - The callback function when the service call failed with params:
      * @param {string} failedCallback.error - The error message reported by ROS.
      */
    def getTopicsAndRawTypes(callback: js.Function1[/* result */ Typedefsfulltext, Unit]): Unit = js.native
    def getTopicsAndRawTypes(
      callback: js.Function1[/* result */ Typedefsfulltext, Unit],
      failedCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    
    /**
      * Retrieve a list of topics in ROS as an array of a specific type.
      *
      * @param {string} topicType - The topic type to find.
      * @param {function} callback - Function with the following params:
      * @param {string[]} callback.topics - Array of topic names.
      * @param {function} [failedCallback] - The callback function when the service call failed with params:
      * @param {string} failedCallback.error - The error message reported by ROS.
      */
    def getTopicsForType(topicType: String, callback: js.Function1[/* topics */ js.Array[String], Unit]): Unit = js.native
    def getTopicsForType(
      topicType: String,
      callback: js.Function1[/* topics */ js.Array[String], Unit],
      failedCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    
    val isConnected: Boolean = js.native
    
    def on(eventName: connection | close | error, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    def on(eventName: String, callback: js.Function1[/* event */ Any, Unit]): this.type = js.native
    
    /**
      * Send an encoded message over the WebSocket.
      *
      * @param {any} messageEncoded - The encoded message to be sent.
      */
    def sendEncodedMessage(messageEncoded: Any): Unit = js.native
    
    /**
      * Send a set_level request to the server.
      *
      * @param {string} level - Status level (none, error, warning, info).
      * @param {number} [id] - Operation ID to change status level on.
      */
    def setStatusLevel(level: String): Unit = js.native
    def setStatusLevel(level: String, id: Double): Unit = js.native
    
    val transportLibrary: websocket | workersocket | socketDotio | RTCPeerConnection = js.native
    
    val transportOptions: RTCDataChannelInit | js.Object = js.native
  }
  
  @JSImport("roslib", "Service")
  @js.native
  open class Service[TServiceRequest, TServiceResponse] protected () extends StObject {
    /**
      * A ROS service client.
      *
      * @param {Object} options
      * @param {Ros} options.ros - The ROSLIB.Ros connection handle.
      * @param {string} options.name - The service name, like '/add_two_ints'.
      * @param {string} options.serviceType - The service type, like 'rospy_tutorials/AddTwoInts'.
      */
    def this(data: typings.roslib.anon.Ros) = this()
    
    /**
      * Advertise the service. This turns the Service object from a client
      * into a server. The callback will be called with every request
      * that's made on this service.
      *
      * @param {function} callback - This works similarly to the callback for a C++ service and should take the following params:
      * @param {TServiceRequest} callback.request - The service request.
      * @param {TServiceResponse} callback.response - An empty dictionary. Take care not to overwrite this. Instead, only modify the values within.
      *     It should return true if the service has finished successfully,
      *     i.e., without any fatal errors.
      */
    def advertise(callback: js.Function2[/* request */ TServiceRequest, /* response */ TServiceResponse, Unit]): Unit = js.native
    
    /**
      * Call the service. Returns the service response in the
      * callback. Does nothing if this service is currently advertised.
      *
      * @param {TServiceRequest} request - The ROSLIB.ServiceRequest to send.
      * @param {function} callback - Function with the following params:
      * @param {TServiceResponse} callback.response - The response from the service request.
      * @param {function} [failedCallback] - The callback function when the service call failed with params:
      * @param {string} failedCallback.error - The error message reported by ROS.
      */
    def callService(request: TServiceRequest, callback: js.Function1[/* response */ TServiceResponse, Unit]): Unit = js.native
    def callService(
      request: TServiceRequest,
      callback: js.Function1[/* response */ TServiceResponse, Unit],
      failedCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    
    // getter
    var name: String = js.native
    
    // getter
    var serviceType: String = js.native
    
    /**
      * Unadvertise a previously advertised service.
      */
    def unadvertise(): Unit = js.native
  }
  
  @JSImport("roslib", "ServiceRequest")
  @js.native
  open class ServiceRequest protected () extends StObject {
    /**
      * A ServiceRequest is passed into the service call.
      *
      * @param {any} values - Object matching the fields defined in the .srv definition file.
      */
    def this(values: Any) = this()
  }
  
  @JSImport("roslib", "ServiceResponse")
  @js.native
  open class ServiceResponse protected () extends StObject {
    /**
      * A ServiceResponse is returned from the service call.
      *
      * @param {any} values - Object matching the fields defined in the .srv definition file.
      */
    def this(values: Any) = this()
  }
  
  @JSImport("roslib", "SimpleActionServer")
  @js.native
  open class SimpleActionServer protected () extends StObject {
    /**
      * An actionlib action server client.
      *
      * Emits the following events:
      *  * 'goal' - Goal sent by action client.
      *  * 'cancel' - Action client has canceled the request.
      *
      * @param {Object} options
      * @param {Ros} options.ros - The ROSLIB.Ros connection handle.
      * @param {string} options.serverName - The action server name, like '/fibonacci'.
      * @param {string} options.actionName - The action message name, like 'actionlib_tutorials/FibonacciAction'.
      */
    def this(options: ServerName) = this()
    
    /**
      * Send a feedback message.
      *
      * @param {any} feedback - The feedback to send to the client.
      */
    def sendFeedback(feedback: Any): Unit = js.native
    
    /**
      * Set action state to aborted and return to client.
      *
      * @param {any} result - The result to return to the client.
      */
    def setAborted(result: Any): Unit = js.native
    
    /**
      * Handle case where client requests preemption.
      */
    def setPreempted(): Unit = js.native
    
    /**
      * Set action state to succeeded and return to client.
      *
      * @param {any} result - The result to return to the client.
      */
    def setSucceeded(result: Any): Unit = js.native
  }
  
  @JSImport("roslib", "TFClient")
  @js.native
  open class TFClient protected () extends StObject {
    /**
      * A TF Client that listens to TFs from tf2_web_republisher.
      *
      * @param {Object} options
      * @param {Ros} options.ros - The ROSLIB.Ros connection handle.
      * @param {string} [options.fixedFrame=base_link] - The fixed frame.
      * @param {number} [options.angularThres=2.0] - The angular threshold for the TF republisher.
      * @param {number} [options.transThres=0.01] - The translation threshold for the TF republisher.
      * @param {number} [options.rate=10.0] - The rate for the TF republisher.
      * @param {number} [options.updateDelay=50] - The time (in ms) to wait after a new subscription
      *     to update the TF republisher's list of TFs.
      * @param {number} [options.topicTimeout=2.0] - The timeout parameter for the TF republisher.
      * @param {string} [options.serverName=/tf2_web_republisher] - The name of the tf2_web_republisher server.
      * @param {string} [options.repubServiceName=/republish_tfs] - The name of the republish_tfs service (non groovy compatibility mode only).
      */
    def this(options: AngularThres) = this()
    
    /**
      * Unsubscribe and unadvertise all topics associated with this TFClient.
      */
    def dispose(): Unit = js.native
    
    /**
      * Process the service response and subscribe to the tf republisher
      * topic.
      *
      * @param {any} response - The service response containing the topic name.
      */
    def processResponse(response: Any): Unit = js.native
    
    /**
      * Process the incoming TF message and send them out using the callback
      * functions.
      *
      * @param {any} tf - The TF message from the server.
      */
    def processTFArray(tf: Any): Unit = js.native
    
    /**
      * Subscribe to the given TF frame.
      *
      * @param {string} frameID - The TF frame to subscribe to.
      * @param {function} callback - Function with the following params:
      * @param {Transform} callback.transform - The transform data.
      */
    def subscribe(frameId: String, callback: js.Function1[/* transform */ Transform, Unit]): Unit = js.native
    
    /**
      * Unsubscribe from the given TF frame.
      *
      * @param {string} frameID - The TF frame to unsubscribe from.
      * @param {function} callback - The callback function to remove.
      */
    def unsubscribe(frameId: String, callback: js.Function1[/* transform */ Transform, Unit]): Unit = js.native
    
    /**
      * Create and send a new goal (or service request) to the tf2_web_republisher
      * based on the current list of TFs.
      */
    def updateGoal(): Unit = js.native
  }
  
  @JSImport("roslib", "Topic")
  @js.native
  open class Topic[TMessage] protected () extends EventEmitter2 {
    /**
      * Publish and/or subscribe to a topic in ROS.
      *
      * Emits the following events:
      *  * 'warning' - If there are any warning during the Topic creation.
      *  * 'message' - The message data from rosbridge.
      *
      * @param {Object} options
      * @param {Ros} options.ros - The ROSLIB.Ros connection handle.
      * @param {string} options.name - The topic name, like '/cmd_vel'.
      * @param {string} options.messageType - The message type, like 'std_msgs/String'.
      * @param {string} [options.compression=none] - The type of compression to use, like 'png', 'cbor', or 'cbor-raw'.
      * @param {number} [options.throttle_rate=0] - The rate (in ms in between messages) at which to throttle the topics.
      * @param {number} [options.queue_size=100] - The queue created at bridge side for re-publishing webtopics.
      * @param {boolean} [options.latch=false] - Latch the topic when publishing.
      * @param {number} [options.queue_length=0] - The queue length at bridge side used when subscribing.
      * @param {boolean} [options.reconnect_on_close=true] - The flag to enable resubscription and readvertisement on close event.
      */
    def this(options: Compression) = this()
    
    /**
      * Register as a publisher for the topic.
      */
    def advertise(): Unit = js.native
    
    // getter
    var messageType: String = js.native
    
    // getter
    var name: String = js.native
    
    /**
      * Publish the message.
      *
      * @param {TMessage} message - A ROSLIB.Message object.
      */
    def publish(message: TMessage): Unit = js.native
    
    /**
      * Every time a message is published for the given topic, the callback
      * will be called with the message object.
      *
      * @param {function} callback - Function with the following params:
      * @param {TMessage} callback.message - The published message.
      */
    def subscribe(callback: js.Function1[/* message */ TMessage, Unit]): Unit = js.native
    
    /**
      * Unregister as a publisher for the topic.
      */
    def unadvertise(): Unit = js.native
    
    /**
      * Unregister as a subscriber for the topic. Unsubscribing will stop
      * and remove all subscribe callbacks. To remove a callback, you must
      * explicitly pass the callback function in.
      *
      * @param {function} [callback] - The callback to unregister, if
      *     provided and other listeners are registered the topic won't
      *     unsubscribe, just stop emitting to the passed listener.
      */
    def unsubscribe(): Unit = js.native
    def unsubscribe(callback: js.Function1[/* message */ TMessage, Unit]): Unit = js.native
  }
  
  @JSImport("roslib", "Transform")
  @js.native
  /**
    * A Transform in 3-space. Values are copied into this object.
    *
    * @param {Object} options
    * @param {Vector3Like} options.translation - The ROSLIB.Vector3 describing the translation.
    * @param {QuaternionLike} options.rotation - The ROSLIB.Quaternion describing the rotation.
    */
  open class Transform () extends StObject {
    def this(options: Rotation) = this()
    
    var rotation: Quaternion = js.native
    
    // getters
    var translation: Vector3 = js.native
  }
  
  @JSImport("roslib", "URDF_BOX")
  @js.native
  val URDF_BOX: `1` = js.native
  
  @JSImport("roslib", "URDF_CYLINDER")
  @js.native
  val URDF_CYLINDER: `2` = js.native
  
  @JSImport("roslib", "URDF_MESH")
  @js.native
  val URDF_MESH: `3` = js.native
  
  @JSImport("roslib", "URDF_SPHERE")
  @js.native
  val URDF_SPHERE: `0` = js.native
  
  @JSImport("roslib", "UrdfBox")
  @js.native
  open class UrdfBox protected ()
    extends StObject
       with UrdfGeometry {
    /**
      * A Box element in a URDF.
      *
      * @param {Object} options
      * @param {Node} options.xml - The XML element to parse.
      */
    def this(options: Xml) = this()
    
    var dimension: Vector3 = js.native
    
    var `type`: `1` = js.native
  }
  
  @JSImport("roslib", "UrdfColor")
  @js.native
  open class UrdfColor protected () extends StObject {
    /**
      * A Color element in a URDF.
      *
      * @param {Object} options
      * @param {Node} options.xml - The XML element to parse.
      */
    def this(options: Xml) = this()
    
    var a: Double = js.native
    
    var b: Double = js.native
    
    var g: Double = js.native
    
    var r: Double = js.native
  }
  
  @JSImport("roslib", "UrdfCylinder")
  @js.native
  open class UrdfCylinder protected ()
    extends StObject
       with UrdfGeometry {
    /**
      * A Cylinder element in a URDF.
      *
      * @param {Object} options
      * @param {Node} options.xml - The XML element to parse.
      */
    def this(options: Xml) = this()
    
    var length: Double = js.native
    
    var radius: Double = js.native
    
    var `type`: `2` = js.native
  }
  
  @JSImport("roslib", "UrdfJoint")
  @js.native
  open class UrdfJoint protected () extends StObject {
    /**
      * A Joint element in a URDF.
      *
      * @param {Object} options
      * @param {Node} options.xml - The XML element to parse.
      */
    def this(options: Xml) = this()
    
    var child: String | Null = js.native
    
    var maxval: Double | Null = js.native
    
    var minval: Double | Null = js.native
    
    var name: String = js.native
    
    var parent: String | Null = js.native
    
    var `type`: String = js.native
  }
  
  @JSImport("roslib", "UrdfLink")
  @js.native
  open class UrdfLink protected () extends StObject {
    /**
      * A Link element in a URDF.
      *
      * @param {Object} options
      * @param {Node} options.xml - The XML element to parse.
      */
    def this(options: Xml) = this()
    
    var name: String = js.native
    
    var visuals: js.Array[UrdfVisual] = js.native
  }
  
  @JSImport("roslib", "UrdfMaterial")
  @js.native
  open class UrdfMaterial protected () extends StObject {
    /**
      * A Material element in a URDF.
      *
      * @param {Object} options
      * @param {Node} options.xml - The XML element to parse.
      */
    def this(options: Xml) = this()
    
    def assign(obj: UrdfMaterial): UrdfMaterial = js.native
    
    var color: UrdfColor | Null = js.native
    
    def isLink(): Boolean = js.native
    
    var name: String = js.native
    
    var textureFilename: String | Null = js.native
  }
  
  @JSImport("roslib", "UrdfMesh")
  @js.native
  open class UrdfMesh protected ()
    extends StObject
       with UrdfGeometry {
    /**
      * A Box element in a URDF.
      *
      * @param {Object} options
      * @param {Node} options.xml - The XML element to parse.
      */
    def this(options: Xml) = this()
    
    var filename: String = js.native
    
    var scale: Vector3 | Null = js.native
    
    var `type`: `3` = js.native
  }
  
  @JSImport("roslib", "UrdfModel")
  @js.native
  open class UrdfModel protected () extends StObject {
    /**
      * A URDF Model can be used to parse a given URDF into the appropriate elements.
      *
      * @param {Object} options
      * @param {Node} options.xml - The XML element to parse.
      * @param {string} options.string - The XML element to parse as a string.
      */
    def this(options: typings.roslib.anon.String) = this()
    def this(options: StringString) = this()
    
    var joints: Record[String, UrdfJoint] = js.native
    
    var links: Record[String, UrdfLink] = js.native
    
    var materials: Record[String, UrdfMaterial] = js.native
  }
  
  @JSImport("roslib", "UrdfSphere")
  @js.native
  open class UrdfSphere protected ()
    extends StObject
       with UrdfGeometry {
    /**
      * A Sphere element in a URDF.
      *
      * @param {Object} options
      * @param {Node} options.xml - The XML element to parse.
      */
    def this(options: Xml) = this()
    
    var radius: Double = js.native
    
    var `type`: `0` = js.native
  }
  
  @JSImport("roslib", "UrdfVisual")
  @js.native
  open class UrdfVisual protected () extends StObject {
    /**
      * A Visual element in a URDF.
      *
      * @param {Object} options
      * @param {Node} options.xml - The XML element to parse.
      */
    def this(options: Xml) = this()
    
    var geometry: UrdfGeometry | Null = js.native
    
    var material: UrdfMaterial | Null = js.native
    
    var origin: Pose | Null = js.native
  }
  
  @JSImport("roslib", "Vector3")
  @js.native
  /**
    * A 3D vector.
    *
    * @param {Object} options
    * @param {number} [options.x=0] - The x value.
    * @param {number} [options.y=0] - The y value.
    * @param {number} [options.z=0] - The z value.
    */
  open class Vector3 ()
    extends StObject
       with Vector3Like {
    def this(options: X) = this()
    
    /**
      * Set the values of this vector to the sum of itself and the given vector.
      *
      * @param {Vector3} v - The vector to add with.
      */
    def add(v: Vector3): Unit = js.native
    
    /**
      * Multiply the given Quaternion with this vector.
      *
      * @param {Quaternion} q - The quaternion to multiply with.
      */
    def multiplyQuaternion(q: Quaternion): Unit = js.native
    
    /**
      * Set the values of this vector to the difference of itself and the given vector.
      *
      * @param {Vector3} v - The vector to subtract with.
      */
    def subtract(v: Vector3): Unit = js.native
    
    // getters
    @JSName("x")
    var x_Vector3: Double = js.native
    
    @JSName("y")
    var y_Vector3: Double = js.native
    
    @JSName("z")
    var z_Vector3: Double = js.native
  }
  
  trait QuaternionLike extends StObject {
    
    var w: js.UndefOr[Double | Null] = js.undefined
    
    var x: js.UndefOr[Double | Null] = js.undefined
    
    var y: js.UndefOr[Double | Null] = js.undefined
    
    var z: js.UndefOr[Double | Null] = js.undefined
  }
  object QuaternionLike {
    
    inline def apply(): QuaternionLike = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuaternionLike]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuaternionLike] (val x: Self) extends AnyVal {
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      inline def setWNull: Self = StObject.set(x, "w", null)
      
      inline def setWUndefined: Self = StObject.set(x, "w", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXNull: Self = StObject.set(x, "x", null)
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYNull: Self = StObject.set(x, "y", null)
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      inline def setZNull: Self = StObject.set(x, "z", null)
      
      inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.roslib.mod.UrdfSphere
    - typings.roslib.mod.UrdfBox
    - typings.roslib.mod.UrdfCylinder
    - typings.roslib.mod.UrdfMesh
  */
  trait UrdfGeometry extends StObject
  
  trait Vector3Like extends StObject {
    
    var x: js.UndefOr[Double | Null] = js.undefined
    
    var y: js.UndefOr[Double | Null] = js.undefined
    
    var z: js.UndefOr[Double | Null] = js.undefined
  }
  object Vector3Like {
    
    inline def apply(): Vector3Like = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Vector3Like]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Vector3Like] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXNull: Self = StObject.set(x, "x", null)
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYNull: Self = StObject.set(x, "y", null)
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      inline def setZNull: Self = StObject.set(x, "z", null)
      
      inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
    }
  }
}
