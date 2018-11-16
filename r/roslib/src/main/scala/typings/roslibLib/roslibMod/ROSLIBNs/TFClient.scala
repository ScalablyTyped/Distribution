package typings
package roslibLib.roslibMod.ROSLIBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TFClient extends js.Object {
  /**
           * Unsubscribe and unadvertise all topics associated with this TFClient.
           */
  def dispose(): scala.Unit = js.native
  /**
           * Process the service response and subscribe to the tf republisher topic.
           *
           * @param response - the service response containing the topic name
           */
  def processResponse(response: js.Any): scala.Unit = js.native
  /**
           * Process the incoming TF message and send them out using the callback functions
           * @param tf - the TF message from the server
           */
  def processTfArray(tf: js.Any): scala.Unit = js.native
  /**
           * Subscribe to the given TF frame.
           * @param frameId - the TF frame to subscribe to
           * @param callback - function with params:
           *  * transform - the transform data
           */
  def subscribe(frameId: java.lang.String, callback: js.Function1[/* transform */ Transform, scala.Unit]): scala.Unit = js.native
  /**
           * Unsubscribe from the given TF frame.
           *
           * @param frameId - the TF frame to unsubscribe from
           * @param callback - the callback function to remove
           */
  def unsubscribe(frameId: java.lang.String): scala.Unit = js.native
  /**
           * Unsubscribe from the given TF frame.
           *
           * @param frameId - the TF frame to unsubscribe from
           * @param callback - the callback function to remove
           */
  def unsubscribe(frameId: java.lang.String, callback: js.Function1[/* transform */ Transform, scala.Unit]): scala.Unit = js.native
  /**
           * Create and send a new goal (or service request) to the tf2_web_republisher based on the current list of TFs.
           */
  def updateGoal(): scala.Unit = js.native
}

