package typings.pulumiAws.locationFsxWindowsMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationFsxWindowsState extends js.Object {
  
  /**
    * Amazon Resource Name (ARN) of the DataSync Location.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The time that the FSx for Windows location was created.
    */
  val creationTime: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the Windows domain that the FSx for Windows server belongs to.
    */
  val domain: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the FSx for Windows file system.
    */
  val fsxFilesystemArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The password of the user who has the permissions to access files and folders in the FSx for Windows file system.
    */
  val password: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Windows file system.
    */
  val securityGroupArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * Subdirectory to perform actions as source or destination.
    */
  val subdirectory: js.UndefOr[Input[String]] = js.native
  
  /**
    * Key-value pairs of resource tags to assign to the DataSync Location.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The URL of the FSx for Windows location that was described.
    */
  val uri: js.UndefOr[Input[String]] = js.native
  
  /**
    * The user who has the permissions to access files and folders in the FSx for Windows file system.
    */
  val user: js.UndefOr[Input[String]] = js.native
}
object LocationFsxWindowsState {
  
  @scala.inline
  def apply(): LocationFsxWindowsState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationFsxWindowsState]
  }
  
  @scala.inline
  implicit class LocationFsxWindowsStateOps[Self <: LocationFsxWindowsState] (val x: Self) extends AnyVal {
    
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
    def setCreationTime(value: Input[String]): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    
    @scala.inline
    def setDomain(value: Input[String]): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setFsxFilesystemArn(value: Input[String]): Self = this.set("fsxFilesystemArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFsxFilesystemArn: Self = this.set("fsxFilesystemArn", js.undefined)
    
    @scala.inline
    def setPassword(value: Input[String]): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setSecurityGroupArnsVarargs(value: Input[String]*): Self = this.set("securityGroupArns", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupArns(value: Input[js.Array[Input[String]]]): Self = this.set("securityGroupArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroupArns: Self = this.set("securityGroupArns", js.undefined)
    
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
    
    @scala.inline
    def setUser(value: Input[String]): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
