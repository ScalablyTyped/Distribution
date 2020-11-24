package typings.pulumiAws.amiFromInstanceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.AmiFromInstanceEbsBlockDevice
import typings.pulumiAws.inputMod.ec2.AmiFromInstanceEphemeralBlockDevice
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AmiFromInstanceArgs extends js.Object {
  
  /**
    * A longer, human-readable description for the AMI.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * Nested block describing an EBS block device that should be
    * attached to created instances. The structure of this block is described below.
    */
  val ebsBlockDevices: js.UndefOr[Input[js.Array[Input[AmiFromInstanceEbsBlockDevice]]]] = js.native
  
  /**
    * Nested block describing an ephemeral block device that
    * should be attached to created instances. The structure of this block is described below.
    */
  val ephemeralBlockDevices: js.UndefOr[Input[js.Array[Input[AmiFromInstanceEphemeralBlockDevice]]]] = js.native
  
  /**
    * A region-unique name for the AMI.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Boolean that overrides the behavior of stopping
    * the instance before snapshotting. This is risky since it may cause a snapshot of an
    * inconsistent filesystem state, but can be used to avoid downtime if the user otherwise
    * guarantees that no filesystem writes will be underway at the time of snapshot.
    */
  val snapshotWithoutReboot: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The id of the instance to use as the basis of the AMI.
    */
  val sourceInstanceId: Input[String] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object AmiFromInstanceArgs {
  
  @scala.inline
  def apply(sourceInstanceId: Input[String]): AmiFromInstanceArgs = {
    val __obj = js.Dynamic.literal(sourceInstanceId = sourceInstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmiFromInstanceArgs]
  }
  
  @scala.inline
  implicit class AmiFromInstanceArgsOps[Self <: AmiFromInstanceArgs] (val x: Self) extends AnyVal {
    
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
    def setSourceInstanceId(value: Input[String]): Self = this.set("sourceInstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEbsBlockDevicesVarargs(value: Input[AmiFromInstanceEbsBlockDevice]*): Self = this.set("ebsBlockDevices", js.Array(value :_*))
    
    @scala.inline
    def setEbsBlockDevices(value: Input[js.Array[Input[AmiFromInstanceEbsBlockDevice]]]): Self = this.set("ebsBlockDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEbsBlockDevices: Self = this.set("ebsBlockDevices", js.undefined)
    
    @scala.inline
    def setEphemeralBlockDevicesVarargs(value: Input[AmiFromInstanceEphemeralBlockDevice]*): Self = this.set("ephemeralBlockDevices", js.Array(value :_*))
    
    @scala.inline
    def setEphemeralBlockDevices(value: Input[js.Array[Input[AmiFromInstanceEphemeralBlockDevice]]]): Self = this.set("ephemeralBlockDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEphemeralBlockDevices: Self = this.set("ephemeralBlockDevices", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSnapshotWithoutReboot(value: Input[Boolean]): Self = this.set("snapshotWithoutReboot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotWithoutReboot: Self = this.set("snapshotWithoutReboot", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
