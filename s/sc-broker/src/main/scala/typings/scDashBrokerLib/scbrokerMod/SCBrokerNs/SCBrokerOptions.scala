package typings
package scDashBrokerLib.scbrokerMod.SCBrokerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SCBrokerOptions
  extends /* additionalOptions */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  // An ID to associate with this specific instance of SC
  // this may be useful if you are running an SC app on multiple
  // hosts - You can access the instanceId from the Broker object
  // (inside brokerController) - If you don't provide an instanceId,
  // SC will generate a random one (UUID v4)
  var instanceId: js.UndefOr[java.lang.String] = js.undefined
  // In milliseconds, the timeout for calling res(err, data) when
  // your sendToWorker, sendToBroker or sendToMaster (IPC) call
  // expects an ACK response from the other process
  // (when callback is provided)
  var ipcAckTimeout: js.UndefOr[scala.Double] = js.undefined
  // A key which various SC processes will use to interact with
  // scBroker broker processes securely, defaults to a 256 bits
  // cryptographically random hex string
  var secretKey: js.UndefOr[java.lang.String] = js.undefined
}

object SCBrokerOptions {
  @scala.inline
  def apply(
    StringDictionary: /* additionalOptions */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    instanceId: java.lang.String = null,
    ipcAckTimeout: scala.Int | scala.Double = null,
    secretKey: java.lang.String = null
  ): SCBrokerOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId)
    if (ipcAckTimeout != null) __obj.updateDynamic("ipcAckTimeout")(ipcAckTimeout.asInstanceOf[js.Any])
    if (secretKey != null) __obj.updateDynamic("secretKey")(secretKey)
    __obj.asInstanceOf[SCBrokerOptions]
  }
}

