package typings.pulumiAws.nfsLocationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.datasync.NfsLocationOnPremConfig
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NfsLocationState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the DataSync Location.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration block containing information for connecting to the NFS File System.
    */
  val onPremConfig: js.UndefOr[Input[NfsLocationOnPremConfig]] = js.native
  /**
    * Specifies the IP address or DNS name of the NFS server. The DataSync Agent(s) use this to mount the NFS server.
    */
  val serverHostname: js.UndefOr[Input[String]] = js.native
  /**
    * Subdirectory to perform actions as source or destination. Should be exported by the NFS server.
    */
  val subdirectory: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value pairs of resource tags to assign to the DataSync Location.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  val uri: js.UndefOr[Input[String]] = js.native
}

object NfsLocationState {
  @scala.inline
  def apply(): NfsLocationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NfsLocationState]
  }
  @scala.inline
  implicit class NfsLocationStateOps[Self <: NfsLocationState] (val x: Self) extends AnyVal {
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setOnPremConfig(value: Input[NfsLocationOnPremConfig]): Self = this.set("onPremConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPremConfig: Self = this.set("onPremConfig", js.undefined)
    @scala.inline
    def setServerHostname(value: Input[String]): Self = this.set("serverHostname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerHostname: Self = this.set("serverHostname", js.undefined)
    @scala.inline
    def setSubdirectory(value: Input[String]): Self = this.set("subdirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubdirectory: Self = this.set("subdirectory", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setUri(value: Input[String]): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
  
}

