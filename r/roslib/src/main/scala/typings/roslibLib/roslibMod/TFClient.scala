package typings
package roslibLib.roslibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roslib", "TFClient")
@js.native
class TFClient protected ()
  extends roslibLib.roslibMod.ROSLIBNs.TFClient {
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
  def this(options: roslibLib.Anon_Rate) = this()
}

