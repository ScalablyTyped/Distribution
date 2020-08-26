package typings.scBroker.scbrokerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SCBrokerOptions
  extends /* additionalOptions */ StringDictionary[js.Any] {
  // An ID to associate with this specific instance of SC
  // this may be useful if you are running an SC app on multiple
  // hosts - You can access the instanceId from the Broker object
  // (inside brokerController) - If you don't provide an instanceId,
  // SC will generate a random one (UUID v4)
  var instanceId: js.UndefOr[String] = js.native
  // In milliseconds, the timeout for calling res(err, data) when
  // your sendToWorker, sendToBroker or sendToMaster (IPC) call
  // expects an ACK response from the other process
  // (when callback is provided)
  var ipcAckTimeout: js.UndefOr[Double] = js.native
  // A key which various SC processes will use to interact with
  // scBroker broker processes securely, defaults to a 256 bits
  // cryptographically random hex string
  var secretKey: js.UndefOr[String] = js.native
}

object SCBrokerOptions {
  @scala.inline
  def apply(): SCBrokerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SCBrokerOptions]
  }
  @scala.inline
  implicit class SCBrokerOptionsOps[Self <: SCBrokerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInstanceId(value: String): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("instanceId", js.undefined)
    @scala.inline
    def setIpcAckTimeout(value: Double): Self = this.set("ipcAckTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpcAckTimeout: Self = this.set("ipcAckTimeout", js.undefined)
    @scala.inline
    def setSecretKey(value: String): Self = this.set("secretKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecretKey: Self = this.set("secretKey", js.undefined)
  }
  
}

