package typings.pulumiAws.userDefinedFunctionMod

import typings.pulumiAws.inputMod.glue.UserDefinedFunctionResourceUri
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserDefinedFunctionArgs extends js.Object {
  
  /**
    * ID of the Glue Catalog to create the function in. If omitted, this defaults to the AWS Account ID.
    */
  val catalogId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Java class that contains the function code.
    */
  val className: Input[String] = js.native
  
  /**
    * The name of the Database to create the Function.
    */
  val databaseName: Input[String] = js.native
  
  /**
    * The name of the function.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The owner of the function.
    */
  val ownerName: Input[String] = js.native
  
  /**
    * The owner type. can be one of `USER`, `ROLE`, and `GROUP`.
    */
  val ownerType: Input[String] = js.native
  
  /**
    * The configuration block for Resource URIs. See resource uris below for more details.
    */
  val resourceUris: js.UndefOr[Input[js.Array[Input[UserDefinedFunctionResourceUri]]]] = js.native
}
object UserDefinedFunctionArgs {
  
  @scala.inline
  def apply(
    className: Input[String],
    databaseName: Input[String],
    ownerName: Input[String],
    ownerType: Input[String]
  ): UserDefinedFunctionArgs = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], databaseName = databaseName.asInstanceOf[js.Any], ownerName = ownerName.asInstanceOf[js.Any], ownerType = ownerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDefinedFunctionArgs]
  }
  
  @scala.inline
  implicit class UserDefinedFunctionArgsOps[Self <: UserDefinedFunctionArgs] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: Input[String]): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseName(value: Input[String]): Self = this.set("databaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerName(value: Input[String]): Self = this.set("ownerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerType(value: Input[String]): Self = this.set("ownerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogId(value: Input[String]): Self = this.set("catalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCatalogId: Self = this.set("catalogId", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setResourceUrisVarargs(value: Input[UserDefinedFunctionResourceUri]*): Self = this.set("resourceUris", js.Array(value :_*))
    
    @scala.inline
    def setResourceUris(value: Input[js.Array[Input[UserDefinedFunctionResourceUri]]]): Self = this.set("resourceUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceUris: Self = this.set("resourceUris", js.undefined)
  }
}
