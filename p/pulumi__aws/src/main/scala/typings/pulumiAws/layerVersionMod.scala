package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.mod.asset.Archive
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerVersionMod {
  
  @JSImport("@pulumi/aws/lambda/layerVersion", "LayerVersion")
  @js.native
  class LayerVersion protected () extends CustomResource {
    /**
      * Create a LayerVersion resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LayerVersionArgs) = this()
    def this(name: String, args: LayerVersionArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name (ARN) of the Lambda Layer with version.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The path to the function's deployment package within the local filesystem. If defined, The `s3_`-prefixed options cannot be used.
      */
    val code: Output_[js.UndefOr[Archive]] = js.native
    
    /**
      * A list of [Runtimes](https://docs.aws.amazon.com/lambda/latest/dg/API_PublishLayerVersion.html#SSS-PublishLayerVersion-request-CompatibleRuntimes) this layer is compatible with. Up to 5 runtimes can be specified.
      */
    val compatibleRuntimes: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The date this resource was created.
      */
    val createdDate: Output_[String] = js.native
    
    /**
      * Description of what your Lambda Layer does.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the Lambda Layer without version.
      */
    val layerArn: Output_[String] = js.native
    
    /**
      * A unique name for your Lambda Layer
      */
    val layerName: Output_[String] = js.native
    
    /**
      * License info for your Lambda Layer. See [License Info](https://docs.aws.amazon.com/lambda/latest/dg/API_PublishLayerVersion.html#SSS-PublishLayerVersion-request-LicenseInfo).
      */
    val licenseInfo: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The S3 bucket location containing the function's deployment package. Conflicts with `filename`. This bucket must reside in the same AWS region where you are creating the Lambda function.
      */
    val s3Bucket: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The S3 key of an object containing the function's deployment package. Conflicts with `filename`.
      */
    val s3Key: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The object version containing the function's deployment package. Conflicts with `filename`.
      */
    val s3ObjectVersion: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Used to trigger updates. Must be set to a base64-encoded SHA256 hash of the package file specified with either `filename` or `s3Key`. The usual way to set this is `${filebase64sha256("file.zip")}` (this provider 0.11.12 or later) or `${base64sha256(file("file.zip"))}` (this provider 0.11.11 and earlier), where "file.zip" is the local filename of the lambda layer source archive.
      */
    val sourceCodeHash: Output_[String] = js.native
    
    /**
      * The size in bytes of the function .zip file.
      */
    val sourceCodeSize: Output_[Double] = js.native
    
    /**
      * This Lamba Layer version.
      */
    val version: Output_[String] = js.native
  }
  /* static members */
  object LayerVersion {
    
    @JSImport("@pulumi/aws/lambda/layerVersion", "LayerVersion")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing LayerVersion resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): LayerVersion = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[LayerVersion]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): LayerVersion = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[LayerVersion]
    @scala.inline
    def get(name: String, id: Input[ID], state: LayerVersionState): LayerVersion = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[LayerVersion]
    @scala.inline
    def get(name: String, id: Input[ID], state: LayerVersionState, opts: CustomResourceOptions): LayerVersion = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[LayerVersion]
    
    /**
      * Returns true if the given object is an instance of LayerVersion.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/layerVersion.LayerVersion */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/lambda/layerVersion.LayerVersion */ Boolean]
  }
  
  trait LayerVersionArgs extends StObject {
    
    /**
      * The path to the function's deployment package within the local filesystem. If defined, The `s3_`-prefixed options cannot be used.
      */
    val code: js.UndefOr[Input[Archive]] = js.undefined
    
    /**
      * A list of [Runtimes](https://docs.aws.amazon.com/lambda/latest/dg/API_PublishLayerVersion.html#SSS-PublishLayerVersion-request-CompatibleRuntimes) this layer is compatible with. Up to 5 runtimes can be specified.
      */
    val compatibleRuntimes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Description of what your Lambda Layer does.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A unique name for your Lambda Layer
      */
    val layerName: Input[String]
    
    /**
      * License info for your Lambda Layer. See [License Info](https://docs.aws.amazon.com/lambda/latest/dg/API_PublishLayerVersion.html#SSS-PublishLayerVersion-request-LicenseInfo).
      */
    val licenseInfo: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The S3 bucket location containing the function's deployment package. Conflicts with `filename`. This bucket must reside in the same AWS region where you are creating the Lambda function.
      */
    val s3Bucket: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The S3 key of an object containing the function's deployment package. Conflicts with `filename`.
      */
    val s3Key: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The object version containing the function's deployment package. Conflicts with `filename`.
      */
    val s3ObjectVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Used to trigger updates. Must be set to a base64-encoded SHA256 hash of the package file specified with either `filename` or `s3Key`. The usual way to set this is `${filebase64sha256("file.zip")}` (this provider 0.11.12 or later) or `${base64sha256(file("file.zip"))}` (this provider 0.11.11 and earlier), where "file.zip" is the local filename of the lambda layer source archive.
      */
    val sourceCodeHash: js.UndefOr[Input[String]] = js.undefined
  }
  object LayerVersionArgs {
    
    @scala.inline
    def apply(layerName: Input[String]): LayerVersionArgs = {
      val __obj = js.Dynamic.literal(layerName = layerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayerVersionArgs]
    }
    
    @scala.inline
    implicit class LayerVersionArgsMutableBuilder[Self <: LayerVersionArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Input[Archive]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setCompatibleRuntimes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "compatibleRuntimes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompatibleRuntimesUndefined: Self = StObject.set(x, "compatibleRuntimes", js.undefined)
      
      @scala.inline
      def setCompatibleRuntimesVarargs(value: Input[String]*): Self = StObject.set(x, "compatibleRuntimes", js.Array(value :_*))
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setLayerName(value: Input[String]): Self = StObject.set(x, "layerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseInfo(value: Input[String]): Self = StObject.set(x, "licenseInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseInfoUndefined: Self = StObject.set(x, "licenseInfo", js.undefined)
      
      @scala.inline
      def setS3Bucket(value: Input[String]): Self = StObject.set(x, "s3Bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3BucketUndefined: Self = StObject.set(x, "s3Bucket", js.undefined)
      
      @scala.inline
      def setS3Key(value: Input[String]): Self = StObject.set(x, "s3Key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3KeyUndefined: Self = StObject.set(x, "s3Key", js.undefined)
      
      @scala.inline
      def setS3ObjectVersion(value: Input[String]): Self = StObject.set(x, "s3ObjectVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3ObjectVersionUndefined: Self = StObject.set(x, "s3ObjectVersion", js.undefined)
      
      @scala.inline
      def setSourceCodeHash(value: Input[String]): Self = StObject.set(x, "sourceCodeHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceCodeHashUndefined: Self = StObject.set(x, "sourceCodeHash", js.undefined)
    }
  }
  
  trait LayerVersionState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the Lambda Layer with version.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The path to the function's deployment package within the local filesystem. If defined, The `s3_`-prefixed options cannot be used.
      */
    val code: js.UndefOr[Input[Archive]] = js.undefined
    
    /**
      * A list of [Runtimes](https://docs.aws.amazon.com/lambda/latest/dg/API_PublishLayerVersion.html#SSS-PublishLayerVersion-request-CompatibleRuntimes) this layer is compatible with. Up to 5 runtimes can be specified.
      */
    val compatibleRuntimes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The date this resource was created.
      */
    val createdDate: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Description of what your Lambda Layer does.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of the Lambda Layer without version.
      */
    val layerArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A unique name for your Lambda Layer
      */
    val layerName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * License info for your Lambda Layer. See [License Info](https://docs.aws.amazon.com/lambda/latest/dg/API_PublishLayerVersion.html#SSS-PublishLayerVersion-request-LicenseInfo).
      */
    val licenseInfo: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The S3 bucket location containing the function's deployment package. Conflicts with `filename`. This bucket must reside in the same AWS region where you are creating the Lambda function.
      */
    val s3Bucket: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The S3 key of an object containing the function's deployment package. Conflicts with `filename`.
      */
    val s3Key: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The object version containing the function's deployment package. Conflicts with `filename`.
      */
    val s3ObjectVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Used to trigger updates. Must be set to a base64-encoded SHA256 hash of the package file specified with either `filename` or `s3Key`. The usual way to set this is `${filebase64sha256("file.zip")}` (this provider 0.11.12 or later) or `${base64sha256(file("file.zip"))}` (this provider 0.11.11 and earlier), where "file.zip" is the local filename of the lambda layer source archive.
      */
    val sourceCodeHash: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The size in bytes of the function .zip file.
      */
    val sourceCodeSize: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * This Lamba Layer version.
      */
    val version: js.UndefOr[Input[String]] = js.undefined
  }
  object LayerVersionState {
    
    @scala.inline
    def apply(): LayerVersionState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayerVersionState]
    }
    
    @scala.inline
    implicit class LayerVersionStateMutableBuilder[Self <: LayerVersionState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setCode(value: Input[Archive]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setCompatibleRuntimes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "compatibleRuntimes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompatibleRuntimesUndefined: Self = StObject.set(x, "compatibleRuntimes", js.undefined)
      
      @scala.inline
      def setCompatibleRuntimesVarargs(value: Input[String]*): Self = StObject.set(x, "compatibleRuntimes", js.Array(value :_*))
      
      @scala.inline
      def setCreatedDate(value: Input[String]): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setLayerArn(value: Input[String]): Self = StObject.set(x, "layerArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayerArnUndefined: Self = StObject.set(x, "layerArn", js.undefined)
      
      @scala.inline
      def setLayerName(value: Input[String]): Self = StObject.set(x, "layerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayerNameUndefined: Self = StObject.set(x, "layerName", js.undefined)
      
      @scala.inline
      def setLicenseInfo(value: Input[String]): Self = StObject.set(x, "licenseInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseInfoUndefined: Self = StObject.set(x, "licenseInfo", js.undefined)
      
      @scala.inline
      def setS3Bucket(value: Input[String]): Self = StObject.set(x, "s3Bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3BucketUndefined: Self = StObject.set(x, "s3Bucket", js.undefined)
      
      @scala.inline
      def setS3Key(value: Input[String]): Self = StObject.set(x, "s3Key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3KeyUndefined: Self = StObject.set(x, "s3Key", js.undefined)
      
      @scala.inline
      def setS3ObjectVersion(value: Input[String]): Self = StObject.set(x, "s3ObjectVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3ObjectVersionUndefined: Self = StObject.set(x, "s3ObjectVersion", js.undefined)
      
      @scala.inline
      def setSourceCodeHash(value: Input[String]): Self = StObject.set(x, "sourceCodeHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceCodeHashUndefined: Self = StObject.set(x, "sourceCodeHash", js.undefined)
      
      @scala.inline
      def setSourceCodeSize(value: Input[Double]): Self = StObject.set(x, "sourceCodeSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceCodeSizeUndefined: Self = StObject.set(x, "sourceCodeSize", js.undefined)
      
      @scala.inline
      def setVersion(value: Input[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
