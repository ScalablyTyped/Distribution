package typings.pulumiAws.getOrderableDbInstanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOrderableDbInstanceArgs extends js.Object {
  
  /**
    * DB engine. Default: `docdb`
    */
  val engine: js.UndefOr[String] = js.native
  
  /**
    * Version of the DB engine.
    */
  val engineVersion: js.UndefOr[String] = js.native
  
  /**
    * DB instance class. Examples of classes are `db.r5.12xlarge`, `db.r5.24xlarge`, `db.r5.2xlarge`, `db.r5.4xlarge`, `db.r5.large`, `db.r5.xlarge`, and `db.t3.medium`. (Conflicts with `preferredInstanceClasses`.)
    */
  val instanceClass: js.UndefOr[String] = js.native
  
  /**
    * License model. Default: `na`
    */
  val licenseModel: js.UndefOr[String] = js.native
  
  /**
    * Ordered list of preferred DocumentDB DB instance classes. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned. (Conflicts with `instanceClass`.)
    */
  val preferredInstanceClasses: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Enable to show only VPC.
    */
  val vpc: js.UndefOr[Boolean] = js.native
}
object GetOrderableDbInstanceArgs {
  
  @scala.inline
  def apply(): GetOrderableDbInstanceArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOrderableDbInstanceArgs]
  }
  
  @scala.inline
  implicit class GetOrderableDbInstanceArgsOps[Self <: GetOrderableDbInstanceArgs] (val x: Self) extends AnyVal {
    
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
    def setEngine(value: String): Self = this.set("engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngine: Self = this.set("engine", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("engineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineVersion: Self = this.set("engineVersion", js.undefined)
    
    @scala.inline
    def setInstanceClass(value: String): Self = this.set("instanceClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceClass: Self = this.set("instanceClass", js.undefined)
    
    @scala.inline
    def setLicenseModel(value: String): Self = this.set("licenseModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseModel: Self = this.set("licenseModel", js.undefined)
    
    @scala.inline
    def setPreferredInstanceClassesVarargs(value: String*): Self = this.set("preferredInstanceClasses", js.Array(value :_*))
    
    @scala.inline
    def setPreferredInstanceClasses(value: js.Array[String]): Self = this.set("preferredInstanceClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredInstanceClasses: Self = this.set("preferredInstanceClasses", js.undefined)
    
    @scala.inline
    def setVpc(value: Boolean): Self = this.set("vpc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpc: Self = this.set("vpc", js.undefined)
  }
}
