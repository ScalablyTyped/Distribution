package typings.pulumiAws.nfsLocationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.datasync.NfsLocationOnPremConfig
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NfsLocationArgs extends js.Object {
  
  /**
    * Configuration block containing information for connecting to the NFS File System.
    */
  val onPremConfig: Input[NfsLocationOnPremConfig] = js.native
  
  /**
    * Specifies the IP address or DNS name of the NFS server. The DataSync Agent(s) use this to mount the NFS server.
    */
  val serverHostname: Input[String] = js.native
  
  /**
    * Subdirectory to perform actions as source or destination. Should be exported by the NFS server.
    */
  val subdirectory: Input[String] = js.native
  
  /**
    * Key-value pairs of resource tags to assign to the DataSync Location.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object NfsLocationArgs {
  
  @scala.inline
  def apply(
    onPremConfig: Input[NfsLocationOnPremConfig],
    serverHostname: Input[String],
    subdirectory: Input[String]
  ): NfsLocationArgs = {
    val __obj = js.Dynamic.literal(onPremConfig = onPremConfig.asInstanceOf[js.Any], serverHostname = serverHostname.asInstanceOf[js.Any], subdirectory = subdirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[NfsLocationArgs]
  }
  
  @scala.inline
  implicit class NfsLocationArgsOps[Self <: NfsLocationArgs] (val x: Self) extends AnyVal {
    
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
    def setOnPremConfig(value: Input[NfsLocationOnPremConfig]): Self = this.set("onPremConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerHostname(value: Input[String]): Self = this.set("serverHostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubdirectory(value: Input[String]): Self = this.set("subdirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
