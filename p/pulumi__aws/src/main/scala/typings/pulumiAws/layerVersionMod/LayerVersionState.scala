package typings.pulumiAws.layerVersionMod

import typings.pulumiPulumi.mod.asset.Archive
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerVersionState extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the Lambda Layer with version.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The path to the function's deployment package within the local filesystem. If defined, The `s3_`-prefixed options cannot be used.
    */
  val code: js.UndefOr[Input[Archive]] = js.native
  
  /**
    * A list of [Runtimes](https://docs.aws.amazon.com/lambda/latest/dg/API_PublishLayerVersion.html#SSS-PublishLayerVersion-request-CompatibleRuntimes) this layer is compatible with. Up to 5 runtimes can be specified.
    */
  val compatibleRuntimes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The date this resource was created.
    */
  val createdDate: js.UndefOr[Input[String]] = js.native
  
  /**
    * Description of what your Lambda Layer does.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the Lambda Layer without version.
    */
  val layerArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * A unique name for your Lambda Layer
    */
  val layerName: js.UndefOr[Input[String]] = js.native
  
  /**
    * License info for your Lambda Layer. See [License Info](https://docs.aws.amazon.com/lambda/latest/dg/API_PublishLayerVersion.html#SSS-PublishLayerVersion-request-LicenseInfo).
    */
  val licenseInfo: js.UndefOr[Input[String]] = js.native
  
  /**
    * The S3 bucket location containing the function's deployment package. Conflicts with `filename`. This bucket must reside in the same AWS region where you are creating the Lambda function.
    */
  val s3Bucket: js.UndefOr[Input[String]] = js.native
  
  /**
    * The S3 key of an object containing the function's deployment package. Conflicts with `filename`.
    */
  val s3Key: js.UndefOr[Input[String]] = js.native
  
  /**
    * The object version containing the function's deployment package. Conflicts with `filename`.
    */
  val s3ObjectVersion: js.UndefOr[Input[String]] = js.native
  
  /**
    * Used to trigger updates. Must be set to a base64-encoded SHA256 hash of the package file specified with either `filename` or `s3Key`. The usual way to set this is `${filebase64sha256("file.zip")}` (this provider 0.11.12 or later) or `${base64sha256(file("file.zip"))}` (this provider 0.11.11 and earlier), where "file.zip" is the local filename of the lambda layer source archive.
    */
  val sourceCodeHash: js.UndefOr[Input[String]] = js.native
  
  /**
    * The size in bytes of the function .zip file.
    */
  val sourceCodeSize: js.UndefOr[Input[Double]] = js.native
  
  /**
    * This Lamba Layer version.
    */
  val version: js.UndefOr[Input[String]] = js.native
}
object LayerVersionState {
  
  @scala.inline
  def apply(): LayerVersionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerVersionState]
  }
  
  @scala.inline
  implicit class LayerVersionStateOps[Self <: LayerVersionState] (val x: Self) extends AnyVal {
    
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
    def setCode(value: Input[Archive]): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setCompatibleRuntimesVarargs(value: Input[String]*): Self = this.set("compatibleRuntimes", js.Array(value :_*))
    
    @scala.inline
    def setCompatibleRuntimes(value: Input[js.Array[Input[String]]]): Self = this.set("compatibleRuntimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompatibleRuntimes: Self = this.set("compatibleRuntimes", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: Input[String]): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDate: Self = this.set("createdDate", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setLayerArn(value: Input[String]): Self = this.set("layerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayerArn: Self = this.set("layerArn", js.undefined)
    
    @scala.inline
    def setLayerName(value: Input[String]): Self = this.set("layerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayerName: Self = this.set("layerName", js.undefined)
    
    @scala.inline
    def setLicenseInfo(value: Input[String]): Self = this.set("licenseInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseInfo: Self = this.set("licenseInfo", js.undefined)
    
    @scala.inline
    def setS3Bucket(value: Input[String]): Self = this.set("s3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Bucket: Self = this.set("s3Bucket", js.undefined)
    
    @scala.inline
    def setS3Key(value: Input[String]): Self = this.set("s3Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Key: Self = this.set("s3Key", js.undefined)
    
    @scala.inline
    def setS3ObjectVersion(value: Input[String]): Self = this.set("s3ObjectVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3ObjectVersion: Self = this.set("s3ObjectVersion", js.undefined)
    
    @scala.inline
    def setSourceCodeHash(value: Input[String]): Self = this.set("sourceCodeHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceCodeHash: Self = this.set("sourceCodeHash", js.undefined)
    
    @scala.inline
    def setSourceCodeSize(value: Input[Double]): Self = this.set("sourceCodeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceCodeSize: Self = this.set("sourceCodeSize", js.undefined)
    
    @scala.inline
    def setVersion(value: Input[String]): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
