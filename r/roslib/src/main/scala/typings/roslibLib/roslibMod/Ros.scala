package typings
package roslibLib.roslibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roslib", "Ros")
@js.native
class Ros protected ()
  extends roslibLib.roslibMod.ROSLIBNs.Ros {
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
  		 *   * url (optional) - the WebSocket URL for rosbridge (can be specified later with `connect`)
  		 */
  def this(options: roslibLib.Anon_Url) = this()
}

