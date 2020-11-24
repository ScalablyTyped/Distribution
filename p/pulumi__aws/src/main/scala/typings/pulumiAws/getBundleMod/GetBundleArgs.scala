package typings.pulumiAws.getBundleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBundleArgs extends js.Object {
  
  /**
    * The ID of the bundle.
    */
  val bundleId: js.UndefOr[String] = js.native
  
  /**
    * The name of the bundle. You cannot combine this parameter with `bundleId`.
    */
  val name: js.UndefOr[String] = js.native
  
  /**
    * The owner of the bundles. You have to leave it blank for own bundles. You cannot combine this parameter with `bundleId`.
    */
  val owner: js.UndefOr[String] = js.native
}
object GetBundleArgs {
  
  @scala.inline
  def apply(): GetBundleArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBundleArgs]
  }
  
  @scala.inline
  implicit class GetBundleArgsOps[Self <: GetBundleArgs] (val x: Self) extends AnyVal {
    
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
    def setBundleId(value: String): Self = this.set("bundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBundleId: Self = this.set("bundleId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
}
