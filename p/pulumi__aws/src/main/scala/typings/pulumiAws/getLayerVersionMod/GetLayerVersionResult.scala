package typings.pulumiAws.getLayerVersionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLayerVersionResult extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the Lambda Layer with version.
    */
  val arn: String = js.native
  
  val compatibleRuntime: js.UndefOr[String] = js.native
  
  /**
    * A list of [Runtimes](https://docs.aws.amazon.com/lambda/latest/dg/API_GetLayerVersion.html#SSS-GetLayerVersion-response-CompatibleRuntimes) the specific Lambda Layer version is compatible with.
    */
  val compatibleRuntimes: js.Array[String] = js.native
  
  /**
    * The date this resource was created.
    */
  val createdDate: String = js.native
  
  /**
    * Description of the specific Lambda Layer version.
    */
  val description: String = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the Lambda Layer without version.
    */
  val layerArn: String = js.native
  
  val layerName: String = js.native
  
  /**
    * License info associated with the specific Lambda Layer version.
    */
  val licenseInfo: String = js.native
  
  /**
    * Base64-encoded representation of raw SHA-256 sum of the zip file.
    */
  val sourceCodeHash: String = js.native
  
  /**
    * The size in bytes of the function .zip file.
    */
  val sourceCodeSize: Double = js.native
  
  /**
    * This Lamba Layer version.
    */
  val version: Double = js.native
}
object GetLayerVersionResult {
  
  @scala.inline
  def apply(
    arn: String,
    compatibleRuntimes: js.Array[String],
    createdDate: String,
    description: String,
    id: String,
    layerArn: String,
    layerName: String,
    licenseInfo: String,
    sourceCodeHash: String,
    sourceCodeSize: Double,
    version: Double
  ): GetLayerVersionResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], compatibleRuntimes = compatibleRuntimes.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], layerArn = layerArn.asInstanceOf[js.Any], layerName = layerName.asInstanceOf[js.Any], licenseInfo = licenseInfo.asInstanceOf[js.Any], sourceCodeHash = sourceCodeHash.asInstanceOf[js.Any], sourceCodeSize = sourceCodeSize.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLayerVersionResult]
  }
  
  @scala.inline
  implicit class GetLayerVersionResultOps[Self <: GetLayerVersionResult] (val x: Self) extends AnyVal {
    
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompatibleRuntimesVarargs(value: String*): Self = this.set("compatibleRuntimes", js.Array(value :_*))
    
    @scala.inline
    def setCompatibleRuntimes(value: js.Array[String]): Self = this.set("compatibleRuntimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDate(value: String): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerArn(value: String): Self = this.set("layerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerName(value: String): Self = this.set("layerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseInfo(value: String): Self = this.set("licenseInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCodeHash(value: String): Self = this.set("sourceCodeHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCodeSize(value: Double): Self = this.set("sourceCodeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompatibleRuntime(value: String): Self = this.set("compatibleRuntime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompatibleRuntime: Self = this.set("compatibleRuntime", js.undefined)
  }
}
