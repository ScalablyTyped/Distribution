package typings.pulumiAws.buildMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.gamelift.BuildStorageLocation
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildState extends js.Object {
  
  /**
    * Gamelift Build ARN.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Name of the build
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Operating system that the game server binaries are built to run on. e.g. `WINDOWS_2012` or `AMAZON_LINUX`.
    */
  val operatingSystem: js.UndefOr[Input[String]] = js.native
  
  /**
    * Information indicating where your game build files are stored. See below.
    */
  val storageLocation: js.UndefOr[Input[BuildStorageLocation]] = js.native
  
  /**
    * Key-value map of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Version that is associated with this build.
    */
  val version: js.UndefOr[Input[String]] = js.native
}
object BuildState {
  
  @scala.inline
  def apply(): BuildState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildState]
  }
  
  @scala.inline
  implicit class BuildStateOps[Self <: BuildState] (val x: Self) extends AnyVal {
    
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
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOperatingSystem(value: Input[String]): Self = this.set("operatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperatingSystem: Self = this.set("operatingSystem", js.undefined)
    
    @scala.inline
    def setStorageLocation(value: Input[BuildStorageLocation]): Self = this.set("storageLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageLocation: Self = this.set("storageLocation", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setVersion(value: Input[String]): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
