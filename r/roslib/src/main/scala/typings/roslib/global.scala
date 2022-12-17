package typings.roslib

import typings.roslib.anon.ActionName
import typings.roslib.anon.AngularThres
import typings.roslib.anon.Compression
import typings.roslib.anon.GroovyCompatibility
import typings.roslib.anon.Name
import typings.roslib.anon.Orientation
import typings.roslib.anon.Rotation
import typings.roslib.anon.ServerName
import typings.roslib.anon.String
import typings.roslib.anon.StringString
import typings.roslib.anon.W
import typings.roslib.anon.X
import typings.roslib.anon.Xml
import typings.roslib.roslibInts.`0`
import typings.roslib.roslibInts.`1`
import typings.roslib.roslibInts.`2`
import typings.roslib.roslibInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ROSLIB {
    
    @JSGlobal("ROSLIB.ActionClient")
    @js.native
    open class ActionClient protected ()
      extends typings.roslib.mod.ActionClient {
      /**
        * An actionlib action client.
        *
        * Emits the following events:
        *  * 'timeout' - If a timeout occurred while sending a goal.
        *  * 'status' - The status messages received from the action server.
        *  * 'feedback' - The feedback messages received from the action server.
        *  * 'result' - The result returned from the action server.
        *
        * @constructor
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
    }
    
    @JSGlobal("ROSLIB.ActionListener")
    @js.native
    open class ActionListener protected ()
      extends typings.roslib.mod.ActionListener {
      /**
        * An actionlib action listener.
        *
        * Emits the following events:
        *  * 'status' - The status messages received from the action server.
        *  * 'feedback' - The feedback messages received from the action server.
        *  * 'result' - The result returned from the action server.
        *
        * @constructor
        * @param {Object} options
        * @param {Ros} options.ros - The ROSLIB.Ros connection handle.
        * @param {string} options.serverName - The action server name, like '/fibonacci'.
        * @param {string} options.actionName - The action message name, like 'actionlib_tutorials/FibonacciAction'.
        */
      def this(options: ServerName) = this()
    }
    
    @JSGlobal("ROSLIB.Goal")
    @js.native
    open class Goal protected ()
      extends typings.roslib.mod.Goal {
      /**
        * An actionlib goal that is associated with an action server.
        *
        * Emits the following events:
        *  * 'timeout' - If a timeout occurred while sending a goal.
        *
        * @constructor
        * @param {Object} options
        * @param {ActionClient} options.actionClient - The ROSLIB.ActionClient to use with this goal.
        * @param {any} options.goalMessage - The JSON object containing the goal for the action server.
        */
      def this(options: typings.roslib.anon.ActionClient) = this()
    }
    
    @JSGlobal("ROSLIB.Message")
    @js.native
    open class Message protected ()
      extends typings.roslib.mod.Message {
      /**
        * Message objects are used for publishing and subscribing to and from topics.
        *
        * @constructor
        * @param {any} values - An object matching the fields defined in the .msg definition file.
        */
      def this(values: Any) = this()
    }
    
    @JSGlobal("ROSLIB.Param")
    @js.native
    open class Param protected ()
      extends typings.roslib.mod.Param {
      /**
        * A ROS parameter.
        *
        * @constructor
        * @param {Object} options
        * @param {Ros} options.ros - The ROSLIB.Ros connection handle.
        * @param {string} options.name - The param name, like max_vel_x.
        */
      def this(options: Name) = this()
    }
    
    @JSGlobal("ROSLIB.Pose")
    @js.native
    /**
      * A Pose in 3D space. Values are copied into this object.
      *
      * @constructor
      * @param {Object} options
      * @param {Vector3Like} options.position - The ROSLIB.Vector3 describing the position.
      * @param {QuaternionLike} options.orientation - The ROSLIB.Quaternion describing the orientation.
      */
    open class Pose ()
      extends typings.roslib.mod.Pose {
      def this(options: Orientation) = this()
    }
    
    @JSGlobal("ROSLIB.Quaternion")
    @js.native
    /**
      * A Quaternion.
      *
      * @constructor
      * @param {Object} options
      * @param {number} [options.x=0] - The x value.
      * @param {number} [options.y=0] - The y value.
      * @param {number} [options.z=0] - The z value.
      * @param {number} [options.w=1] - The w value.
      */
    open class Quaternion ()
      extends typings.roslib.mod.Quaternion {
      def this(options: W) = this()
    }
    
    @JSGlobal("ROSLIB.Ros")
    @js.native
    open class Ros protected ()
      extends typings.roslib.mod.Ros {
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
        * @constructor
        * @param {Object} options
        * @param {string} [options.url] - The WebSocket URL for rosbridge or the node server URL to connect using socket.io (if socket.io exists in the page). Can be specified later with `connect`.
        * @param {boolean} [options.groovyCompatibility=true] - Don't use interfaces that changed after the last groovy release or rosbridge_suite and related tools.
        * @param {string} [options.transportLibrary=websocket] - One of 'websocket', 'workersocket', 'socket.io' or RTCPeerConnection instance controlling how the connection is created in `connect`.
        * @param {Object} [options.transportOptions={}] - The options to use when creating a connection. Currently only used if `transportLibrary` is RTCPeerConnection.
        */
      def this(options: GroovyCompatibility) = this()
    }
    
    @JSGlobal("ROSLIB.Service")
    @js.native
    open class Service[TServiceRequest, TServiceResponse] protected ()
      extends typings.roslib.mod.Service[TServiceRequest, TServiceResponse] {
      /**
        * A ROS service client.
        *
        * @constructor
        * @param {Object} options
        * @param {Ros} options.ros - The ROSLIB.Ros connection handle.
        * @param {string} options.name - The service name, like '/add_two_ints'.
        * @param {string} options.serviceType - The service type, like 'rospy_tutorials/AddTwoInts'.
        */
      def this(data: typings.roslib.anon.Ros) = this()
    }
    
    @JSGlobal("ROSLIB.ServiceRequest")
    @js.native
    open class ServiceRequest protected ()
      extends typings.roslib.mod.ServiceRequest {
      /**
        * A ServiceRequest is passed into the service call.
        *
        * @constructor
        * @param {any} values - Object matching the fields defined in the .srv definition file.
        */
      def this(values: Any) = this()
    }
    
    @JSGlobal("ROSLIB.ServiceResponse")
    @js.native
    open class ServiceResponse protected ()
      extends typings.roslib.mod.ServiceResponse {
      /**
        * A ServiceResponse is returned from the service call.
        *
        * @constructor
        * @param {any} values - Object matching the fields defined in the .srv definition file.
        */
      def this(values: Any) = this()
    }
    
    @JSGlobal("ROSLIB.SimpleActionServer")
    @js.native
    open class SimpleActionServer protected ()
      extends typings.roslib.mod.SimpleActionServer {
      /**
        * An actionlib action server client.
        *
        * Emits the following events:
        *  * 'goal' - Goal sent by action client.
        *  * 'cancel' - Action client has canceled the request.
        *
        * @constructor
        * @param {Object} options
        * @param {Ros} options.ros - The ROSLIB.Ros connection handle.
        * @param {string} options.serverName - The action server name, like '/fibonacci'.
        * @param {string} options.actionName - The action message name, like 'actionlib_tutorials/FibonacciAction'.
        */
      def this(options: ServerName) = this()
    }
    
    @JSGlobal("ROSLIB.TFClient")
    @js.native
    open class TFClient protected ()
      extends typings.roslib.mod.TFClient {
      /**
        * A TF Client that listens to TFs from tf2_web_republisher.
        *
        * @constructor
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
    }
    
    @JSGlobal("ROSLIB.Topic")
    @js.native
    open class Topic[TMessage] protected ()
      extends typings.roslib.mod.Topic[TMessage] {
      /**
        * Publish and/or subscribe to a topic in ROS.
        *
        * Emits the following events:
        *  * 'warning' - If there are any warning during the Topic creation.
        *  * 'message' - The message data from rosbridge.
        *
        * @constructor
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
    }
    
    @JSGlobal("ROSLIB.Transform")
    @js.native
    /**
      * A Transform in 3-space. Values are copied into this object.
      *
      * @constructor
      * @param {Object} options
      * @param {Vector3Like} options.translation - The ROSLIB.Vector3 describing the translation.
      * @param {QuaternionLike} options.rotation - The ROSLIB.Quaternion describing the rotation.
      */
    open class Transform ()
      extends typings.roslib.mod.Transform {
      def this(options: Rotation) = this()
    }
    
    @JSGlobal("ROSLIB.URDF_BOX")
    @js.native
    val URDF_BOX: `1` = js.native
    
    @JSGlobal("ROSLIB.URDF_CYLINDER")
    @js.native
    val URDF_CYLINDER: `2` = js.native
    
    @JSGlobal("ROSLIB.URDF_MESH")
    @js.native
    val URDF_MESH: `3` = js.native
    
    @JSGlobal("ROSLIB.URDF_SPHERE")
    @js.native
    val URDF_SPHERE: `0` = js.native
    
    @JSGlobal("ROSLIB.UrdfBox")
    @js.native
    open class UrdfBox protected ()
      extends typings.roslib.mod.UrdfBox {
      /**
        * A Box element in a URDF.
        *
        * @constructor
        * @param {Object} options
        * @param {Node} options.xml - The XML element to parse.
        */
      def this(options: Xml) = this()
    }
    
    @JSGlobal("ROSLIB.UrdfColor")
    @js.native
    open class UrdfColor protected ()
      extends typings.roslib.mod.UrdfColor {
      /**
        * A Color element in a URDF.
        *
        * @constructor
        * @param {Object} options
        * @param {Node} options.xml - The XML element to parse.
        */
      def this(options: Xml) = this()
    }
    
    @JSGlobal("ROSLIB.UrdfCylinder")
    @js.native
    open class UrdfCylinder protected ()
      extends typings.roslib.mod.UrdfCylinder {
      /**
        * A Cylinder element in a URDF.
        *
        * @constructor
        * @param {Object} options
        * @param {Node} options.xml - The XML element to parse.
        */
      def this(options: Xml) = this()
    }
    
    @JSGlobal("ROSLIB.UrdfJoint")
    @js.native
    open class UrdfJoint protected ()
      extends typings.roslib.mod.UrdfJoint {
      /**
        * A Joint element in a URDF.
        *
        * @constructor
        * @param {Object} options
        * @param {Node} options.xml - The XML element to parse.
        */
      def this(options: Xml) = this()
    }
    
    @JSGlobal("ROSLIB.UrdfLink")
    @js.native
    open class UrdfLink protected ()
      extends typings.roslib.mod.UrdfLink {
      /**
        * A Link element in a URDF.
        *
        * @constructor
        * @param {Object} options
        * @param {Node} options.xml - The XML element to parse.
        */
      def this(options: Xml) = this()
    }
    
    @JSGlobal("ROSLIB.UrdfMaterial")
    @js.native
    open class UrdfMaterial protected ()
      extends typings.roslib.mod.UrdfMaterial {
      /**
        * A Material element in a URDF.
        *
        * @constructor
        * @param {Object} options
        * @param {Node} options.xml - The XML element to parse.
        */
      def this(options: Xml) = this()
    }
    
    @JSGlobal("ROSLIB.UrdfMesh")
    @js.native
    open class UrdfMesh protected ()
      extends typings.roslib.mod.UrdfMesh {
      /**
        * A Box element in a URDF.
        *
        * @constructor
        * @param {Object} options
        * @param {Node} options.xml - The XML element to parse.
        */
      def this(options: Xml) = this()
    }
    
    @JSGlobal("ROSLIB.UrdfModel")
    @js.native
    open class UrdfModel protected ()
      extends typings.roslib.mod.UrdfModel {
      /**
        * A URDF Model can be used to parse a given URDF into the appropriate elements.
        *
        * @constructor
        * @param {Object} options
        * @param {Node} options.xml - The XML element to parse.
        * @param {string} options.string - The XML element to parse as a string.
        */
      def this(options: String) = this()
      def this(options: StringString) = this()
    }
    
    @JSGlobal("ROSLIB.UrdfSphere")
    @js.native
    open class UrdfSphere protected ()
      extends typings.roslib.mod.UrdfSphere {
      /**
        * A Sphere element in a URDF.
        *
        * @constructor
        * @param {Object} options
        * @param {Node} options.xml - The XML element to parse.
        */
      def this(options: Xml) = this()
    }
    
    @JSGlobal("ROSLIB.UrdfVisual")
    @js.native
    open class UrdfVisual protected ()
      extends typings.roslib.mod.UrdfVisual {
      /**
        * A Visual element in a URDF.
        *
        * @constructor
        * @param {Object} options
        * @param {Node} options.xml - The XML element to parse.
        */
      def this(options: Xml) = this()
    }
    
    @JSGlobal("ROSLIB.Vector3")
    @js.native
    /**
      * A 3D vector.
      *
      * @constructor
      * @param {Object} options
      * @param {number} [options.x=0] - The x value.
      * @param {number} [options.y=0] - The y value.
      * @param {number} [options.z=0] - The z value.
      */
    open class Vector3 ()
      extends typings.roslib.mod.Vector3 {
      def this(options: X) = this()
    }
  }
}
