package typings.pulumiAws.locationFsxWindowsMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationFsxWindowsArgs extends js.Object {
  
  /**
    * The name of the Windows domain that the FSx for Windows server belongs to.
    */
  val domain: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the FSx for Windows file system.
    */
  val fsxFilesystemArn: Input[String] = js.native
  
  /**
    * The password of the user who has the permissions to access files and folders in the FSx for Windows file system.
    */
  val password: Input[String] = js.native
  
  /**
    * The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Windows file system.
    */
  val securityGroupArns: Input[js.Array[Input[String]]] = js.native
  
  /**
    * Subdirectory to perform actions as source or destination.
    */
  val subdirectory: js.UndefOr[Input[String]] = js.native
  
  /**
    * Key-value pairs of resource tags to assign to the DataSync Location.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The user who has the permissions to access files and folders in the FSx for Windows file system.
    */
  val user: Input[String] = js.native
}
object LocationFsxWindowsArgs {
  
  @scala.inline
  def apply(
    fsxFilesystemArn: Input[String],
    password: Input[String],
    securityGroupArns: Input[js.Array[Input[String]]],
    user: Input[String]
  ): LocationFsxWindowsArgs = {
    val __obj = js.Dynamic.literal(fsxFilesystemArn = fsxFilesystemArn.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], securityGroupArns = securityGroupArns.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationFsxWindowsArgs]
  }
  
  @scala.inline
  implicit class LocationFsxWindowsArgsOps[Self <: LocationFsxWindowsArgs] (val x: Self) extends AnyVal {
    
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
    def setFsxFilesystemArn(value: Input[String]): Self = this.set("fsxFilesystemArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: Input[String]): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupArnsVarargs(value: Input[String]*): Self = this.set("securityGroupArns", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupArns(value: Input[js.Array[Input[String]]]): Self = this.set("securityGroupArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: Input[String]): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomain(value: Input[String]): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setSubdirectory(value: Input[String]): Self = this.set("subdirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubdirectory: Self = this.set("subdirectory", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
