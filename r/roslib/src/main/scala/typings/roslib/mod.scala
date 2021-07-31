package typings.roslib

import typings.roslib.anon.ActionName
import typings.roslib.anon.AngularThres
import typings.roslib.anon.Compression
import typings.roslib.anon.GroovyCompatibility
import typings.roslib.anon.Name
import typings.roslib.anon.Orientation
import typings.roslib.anon.Rotation
import typings.roslib.anon.StringString
import typings.roslib.anon.Topics
import typings.roslib.anon.W
import typings.roslib.anon.X
import typings.roslib.anon.Xml
import typings.roslib.roslibNumbers.`0`
import typings.roslib.roslibNumbers.`1`
import typings.roslib.roslibNumbers.`2`
import typings.roslib.roslibNumbers.`3`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("roslib", "ActionClient")
  @js.native
  class ActionClient protected () extends StObject {
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
    def this(options: ActionName) = this()
    
    /**
      * Cancel all goals associated with this ActionClient.
      */
    def cancel(): Unit = js.native
  }
  
  @JSImport("roslib", "Goal")
  @js.native
  class Goal protected () extends StObject {
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
    def this(options: typings.roslib.anon.ActionClient) = this()
    
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
  
  @JSImport("roslib", "Message")
  @js.native
  class Message protected () extends StObject {
    /**
      * Message objects are used for publishing and subscribing to and from topics.
      *
      * @constructor
      * @param values - object matching the fields defined in the .msg definition file
      */
    def this(values: js.Any) = this()
  }
  
  @JSImport("roslib", "Param")
  @js.native
  class Param protected () extends StObject {
    /**
      * A ROS parameter.
      *
      * @constructor
      * @param options - possible keys include:
      *   * ros - the ROSLIB.Ros connection handle
      *   * name - the param name, like max_vel_x
      */
    def this(options: Name) = this()
    
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
  
  @JSImport("roslib", "Pose")
  @js.native
  /**
    * A Pose in 3D space. Values are copied into this object.
    *
    *  @constructor
    *  @param options - object with following keys:
    *   * position - the Vector3 describing the position
    *   * orientation - the ROSLIB.Quaternion describing the orientation
    */
  class Pose () extends StObject {
    def this(options: Orientation) = this()
    
    /**
      * Apply a transform against this pose.
      *
      * @param tf the transform
      */
    def applyTransform(tf: Transform): Unit = js.native
    
    var orientation: Quaternion = js.native
    
    var position: Vector3 = js.native
  }
  
  @JSImport("roslib", "Quaternion")
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
  class Quaternion ()
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
  class Ros protected () extends StObject {
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
      * Retrieves a detail of ROS service request.
      *
      * @param service name of service:
      * @param callback - function with params:
      *   * type - String of the service type
      * @param failedCallback - the callback function when the service call failed (optional). Params:
      *   * error - the error message reported by ROS
      */
    def getServiceRequestDetails(service: String, callback: js.Function1[/* type */ String, Unit]): Unit = js.native
    def getServiceRequestDetails(
      service: String,
      callback: js.Function1[/* type */ String, Unit],
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
      *   * types - Array of message type names
      * @param failedCallback - the callback function when the service call failed (optional). Params:
      *   * error - the error message reported by ROS
      */
    def getTopics(callback: js.Function1[/* topics */ Topics, Unit]): Unit = js.native
    def getTopics(
      callback: js.Function1[/* topics */ Topics, Unit],
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
  
  @JSImport("roslib", "Service")
  @js.native
  class Service protected () extends StObject {
    /**
      * A ROS service client.
      *
      * @constructor
      * @params options - possible keys include:
      *   * ros - the ROSLIB.Ros connection handle
      *   * name - the service name, like /add_two_ints
      *   * serviceType - the service type, like 'rospy_tutorials/AddTwoInts'
      */
    def this(data: typings.roslib.anon.Ros) = this()
    
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
    
    // getter
    var name: String = js.native
    
    // getter
    var serviceType: String = js.native
    
    /**
      * Unadvertise a previously advertised service
      */
    def unadvertise(): Unit = js.native
  }
  
  @JSImport("roslib", "ServiceRequest")
  @js.native
  /**
    * A ServiceRequest is passed into the service call.
    *
    * @constructor
    * @param values - object matching the fields defined in the .srv definition file
    */
  class ServiceRequest () extends StObject {
    def this(values: js.Any) = this()
  }
  
  @JSImport("roslib", "ServiceResponse")
  @js.native
  /**
    * A ServiceResponse is returned from the service call.
    *
    * @constructor
    * @param values - object matching the fields defined in the .srv definition file
    */
  class ServiceResponse () extends StObject {
    def this(values: js.Any) = this()
  }
  
  @JSImport("roslib", "TFClient")
  @js.native
  class TFClient protected () extends StObject {
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
    def this(options: AngularThres) = this()
    
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
  
  @JSImport("roslib", "Topic")
  @js.native
  class Topic protected () extends StObject {
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
    def this(options: Compression) = this()
    
    /**
      * Registers as a publisher for the topic.
      */
    def advertise(): Unit = js.native
    
    // getter
    var messageType: String = js.native
    
    // getter
    var name: String = js.native
    
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
  
  @JSImport("roslib", "Transform")
  @js.native
  /**
    * A Transform in 3-space. Values are copied into this object.
    *
    * @constructor
    * @param options - object with following keys:
    *   * translation - the Vector3 describing the translation
    *   * rotation - the ROSLIB.Quaternion describing the rotation
    */
  class Transform () extends StObject {
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
  class UrdfBox protected ()
    extends StObject
       with UrdfGeometry {
    /**
      * A Box element in a URDF.
      *
      * @constructor
      * @param options - object with following keys:
      *  * xml - the XML element to parse
      */
    def this(options: Xml) = this()
    
    var dimension: Vector3 = js.native
    
    var `type`: `1` = js.native
  }
  
  @JSImport("roslib", "UrdfColor")
  @js.native
  class UrdfColor protected () extends StObject {
    /**
      * A Color element in a URDF.
      *
      * @constructor
      * @param options - object with following keys:
      *  * xml - the XML element to parse
      */
    def this(options: Xml) = this()
    
    var a: Double = js.native
    
    var b: Double = js.native
    
    var g: Double = js.native
    
    var r: Double = js.native
  }
  
  @JSImport("roslib", "UrdfCylinder")
  @js.native
  class UrdfCylinder protected ()
    extends StObject
       with UrdfGeometry {
    /**
      * A Cylinder element in a URDF.
      *
      * @constructor
      * @param options - object with following keys:
      *  * xml - the XML element to parse
      */
    def this(options: Xml) = this()
    
    var length: Double = js.native
    
    var radius: Double = js.native
    
    var `type`: `2` = js.native
  }
  
  @JSImport("roslib", "UrdfJoint")
  @js.native
  class UrdfJoint protected () extends StObject {
    /**
      * A Joint element in a URDF.
      *
      * @constructor
      * @param options - object with following keys:
      *  * xml - the XML element to parse
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
  class UrdfLink protected () extends StObject {
    /**
      * A Link element in a URDF.
      *
      * @constructor
      * @param options - object with following keys:
      *  * xml - the XML element to parse
      */
    def this(options: Xml) = this()
    
    var name: String = js.native
    
    var visuals: js.Array[UrdfVisual] = js.native
  }
  
  @JSImport("roslib", "UrdfMaterial")
  @js.native
  class UrdfMaterial protected () extends StObject {
    /**
      * A Material element in a URDF.
      *
      * @constructor
      * @param options - object with following keys:
      *  * xml - the XML element to parse
      */
    def this(options: Xml) = this()
    
    var color: UrdfColor | Null = js.native
    
    def isLink(): Boolean = js.native
    
    var name: String = js.native
    
    var textureFilename: String | Null = js.native
  }
  
  @JSImport("roslib", "UrdfMesh")
  @js.native
  class UrdfMesh protected ()
    extends StObject
       with UrdfGeometry {
    /**
      * A Box element in a URDF.
      *
      * @constructor
      * @param options - object with following keys:
      *  * xml - the XML element to parse
      */
    def this(options: Xml) = this()
    
    var filename: String = js.native
    
    var scale: Vector3 | Null = js.native
    
    var `type`: `3` = js.native
  }
  
  @JSImport("roslib", "UrdfModel")
  @js.native
  class UrdfModel protected () extends StObject {
    /**
      * A URDF Model can be used to parse a given URDF into the appropriate elements.
      *
      * @constructor
      * @param options - object with following keys:
      *  * xml - the XML element to parse
      *  * string - the XML element to parse as a string
      */
    def this(options: typings.roslib.anon.String) = this()
    def this(options: StringString) = this()
    
    var joints: Record[String, UrdfJoint] = js.native
    
    var links: Record[String, UrdfLink] = js.native
    
    var materials: Record[String, UrdfMaterial] = js.native
  }
  
  @JSImport("roslib", "UrdfSphere")
  @js.native
  class UrdfSphere protected ()
    extends StObject
       with UrdfGeometry {
    /**
      * A Sphere element in a URDF.
      *
      * @constructor
      * @param options - object with following keys:
      *  * xml - the XML element to parse
      */
    def this(options: Xml) = this()
    
    var radius: Double = js.native
    
    var `type`: `0` = js.native
  }
  
  @JSImport("roslib", "UrdfVisual")
  @js.native
  class UrdfVisual protected () extends StObject {
    /**
      * A Visual element in a URDF.
      *
      * @constructor
      * @param options - object with following keys:
      *  * xml - the XML element to parse
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
    * @constructor
    * @param options - object with following keys:
    *   * x - the x value
    *   * y - the y value
    *   * z - the z value
    */
  class Vector3 ()
    extends StObject
       with Vector3Like {
    def this(options: X) = this()
    
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
    
    @scala.inline
    def apply(): QuaternionLike = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuaternionLike]
    }
    
    @scala.inline
    implicit class QuaternionLikeMutableBuilder[Self <: QuaternionLike] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWNull: Self = StObject.set(x, "w", null)
      
      @scala.inline
      def setWUndefined: Self = StObject.set(x, "w", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXNull: Self = StObject.set(x, "x", null)
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYNull: Self = StObject.set(x, "y", null)
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      @scala.inline
      def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZNull: Self = StObject.set(x, "z", null)
      
      @scala.inline
      def setZUndefined: Self = StObject.set(x, "z", js.undefined)
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
    
    @scala.inline
    def apply(): Vector3Like = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Vector3Like]
    }
    
    @scala.inline
    implicit class Vector3LikeMutableBuilder[Self <: Vector3Like] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXNull: Self = StObject.set(x, "x", null)
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYNull: Self = StObject.set(x, "y", null)
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      @scala.inline
      def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZNull: Self = StObject.set(x, "z", null)
      
      @scala.inline
      def setZUndefined: Self = StObject.set(x, "z", js.undefined)
    }
  }
}
