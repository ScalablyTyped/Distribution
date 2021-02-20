package typings.pulumiAws

import typings.pulumiAws.arnMod.ARN
import typings.pulumiAws.enumsLambdaMod.Runtime
import typings.pulumiAws.iamMod.Role
import typings.pulumiAws.lambdaMixinsMod.Context
import typings.pulumiAws.serverlessFunctionMod.Handler
import typings.pulumiAws.serverlessFunctionMod.HandlerFactory
import typings.pulumiPulumi.codePathsMod.CodePathOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ApproximateCreationDateTime extends StObject {
    
    var ApproximateCreationDateTime: Double = js.native
    
    var Keys: Record[String, _] = js.native
    
    var NewImage: js.UndefOr[Record[String, _]] = js.native
    
    var OldImage: js.UndefOr[Record[String, _]] = js.native
    
    var SequenceNumber: String = js.native
    
    var SizeBytes: Double = js.native
    
    var StreamViewType: String = js.native
  }
  object ApproximateCreationDateTime {
    
    @scala.inline
    def apply(
      ApproximateCreationDateTime: Double,
      Keys: Record[String, _],
      SequenceNumber: String,
      SizeBytes: Double,
      StreamViewType: String
    ): ApproximateCreationDateTime = {
      val __obj = js.Dynamic.literal(ApproximateCreationDateTime = ApproximateCreationDateTime.asInstanceOf[js.Any], Keys = Keys.asInstanceOf[js.Any], SequenceNumber = SequenceNumber.asInstanceOf[js.Any], SizeBytes = SizeBytes.asInstanceOf[js.Any], StreamViewType = StreamViewType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApproximateCreationDateTime]
    }
    
    @scala.inline
    implicit class ApproximateCreationDateTimeMutableBuilder[Self <: ApproximateCreationDateTime] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApproximateCreationDateTime(value: Double): Self = StObject.set(x, "ApproximateCreationDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeys(value: Record[String, _]): Self = StObject.set(x, "Keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewImage(value: Record[String, _]): Self = StObject.set(x, "NewImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewImageUndefined: Self = StObject.set(x, "NewImage", js.undefined)
      
      @scala.inline
      def setOldImage(value: Record[String, _]): Self = StObject.set(x, "OldImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldImageUndefined: Self = StObject.set(x, "OldImage", js.undefined)
      
      @scala.inline
      def setSequenceNumber(value: String): Self = StObject.set(x, "SequenceNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeBytes(value: Double): Self = StObject.set(x, "SizeBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamViewType(value: String): Self = StObject.set(x, "StreamViewType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ApproximateFirstReceiveTimestamp extends StObject {
    
    var ApproximateFirstReceiveTimestamp: String = js.native
    
    var ApproximateReceiveCount: String = js.native
    
    var SenderId: String = js.native
    
    var SentTimestamp: String = js.native
  }
  object ApproximateFirstReceiveTimestamp {
    
    @scala.inline
    def apply(
      ApproximateFirstReceiveTimestamp: String,
      ApproximateReceiveCount: String,
      SenderId: String,
      SentTimestamp: String
    ): ApproximateFirstReceiveTimestamp = {
      val __obj = js.Dynamic.literal(ApproximateFirstReceiveTimestamp = ApproximateFirstReceiveTimestamp.asInstanceOf[js.Any], ApproximateReceiveCount = ApproximateReceiveCount.asInstanceOf[js.Any], SenderId = SenderId.asInstanceOf[js.Any], SentTimestamp = SentTimestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApproximateFirstReceiveTimestamp]
    }
    
    @scala.inline
    implicit class ApproximateFirstReceiveTimestampMutableBuilder[Self <: ApproximateFirstReceiveTimestamp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApproximateFirstReceiveTimestamp(value: String): Self = StObject.set(x, "ApproximateFirstReceiveTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApproximateReceiveCount(value: String): Self = StObject.set(x, "ApproximateReceiveCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSenderId(value: String): Self = StObject.set(x, "SenderId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSentTimestamp(value: String): Self = StObject.set(x, "SentTimestamp", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Arn extends StObject {
    
    var arn: String = js.native
    
    var name: String = js.native
    
    var ownerIdentity: PrincipalIdString = js.native
  }
  object Arn {
    
    @scala.inline
    def apply(arn: String, name: String, ownerIdentity: PrincipalIdString): Arn = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ownerIdentity = ownerIdentity.asInstanceOf[js.Any])
      __obj.asInstanceOf[Arn]
    }
    
    @scala.inline
    implicit class ArnMutableBuilder[Self <: Arn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerIdentity(value: PrincipalIdString): Self = StObject.set(x, "ownerIdentity", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Bucket extends StObject {
    
    var bucket: Arn = js.native
    
    var configurationId: String = js.native
    
    var `object`: ETag = js.native
    
    var s3SchemaVersion: String = js.native
  }
  object Bucket {
    
    @scala.inline
    def apply(bucket: Arn, configurationId: String, `object`: ETag, s3SchemaVersion: String): Bucket = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], configurationId = configurationId.asInstanceOf[js.Any], s3SchemaVersion = s3SchemaVersion.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bucket]
    }
    
    @scala.inline
    implicit class BucketMutableBuilder[Self <: Bucket] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucket(value: Arn): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigurationId(value: String): Self = StObject.set(x, "configurationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: ETag): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3SchemaVersion(value: String): Self = StObject.set(x, "s3SchemaVersion", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Code extends StObject {
    
    /**
      * Not allowed when creating an aws.serverless.Function.  The [code] will be generated from the
      * passed in JavaScript callback.
      */
    var code: js.UndefOr[scala.Nothing] = js.native
    
    /**
      * Options to control which paths/packages should be included or excluded in the zip file containing
      * the code for the AWS lambda.
      */
    var codePathOptions: js.UndefOr[CodePathOptions] = js.native
    
    /**
      * Not allowed when creating an aws.serverless.Function.  The [code] will be generated from the
      * passed in JavaScript callback.
      */
    var handler: js.UndefOr[scala.Nothing] = js.native
    
    /**
      * A list of IAM policy ARNs to attach to the Function.  Will be used if [role] is not provide.
      * If neither [role] nor [policies] is provided, a default policy of [iam.AWSLambdaFullAccess]
      * will be used instead.
      */
    var policies: js.UndefOr[js.Array[ARN]] = js.native
    
    /**
      * A pre-created role to use for the Function. If not provided, [policies] will be used.
      */
    var role: js.UndefOr[Role] = js.native
    
    /**
      * The Lambda runtime to use.  If not provided, will default to [NodeJS8d10Runtime]
      */
    var runtime: js.UndefOr[Runtime] = js.native
  }
  object Code {
    
    @scala.inline
    def apply(): Code = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Code]
    }
    
    @scala.inline
    implicit class CodeMutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCodePathOptions(value: CodePathOptions): Self = StObject.set(x, "codePathOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodePathOptionsUndefined: Self = StObject.set(x, "codePathOptions", js.undefined)
      
      @scala.inline
      def setPolicies(value: js.Array[ARN]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
      
      @scala.inline
      def setPoliciesVarargs(value: ARN*): Self = StObject.set(x, "policies", js.Array(value :_*))
      
      @scala.inline
      def setRole(value: Role): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setRuntime(value: Runtime): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    }
  }
  
  @js.native
  trait Data extends StObject {
    
    var data: String = js.native
  }
  object Data {
    
    @scala.inline
    def apply(data: String): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ETag extends StObject {
    
    var eTag: String = js.native
    
    var key: String = js.native
    
    var sequencer: String = js.native
    
    var size: Double = js.native
    
    var versionId: js.UndefOr[String] = js.native
  }
  object ETag {
    
    @scala.inline
    def apply(eTag: String, key: String, sequencer: String, size: Double): ETag = {
      val __obj = js.Dynamic.literal(eTag = eTag.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], sequencer = sequencer.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[ETag]
    }
    
    @scala.inline
    implicit class ETagMutableBuilder[Self <: ETag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setETag(value: String): Self = StObject.set(x, "eTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequencer(value: String): Self = StObject.set(x, "sequencer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
    }
  }
  
  @js.native
  trait ExcludePackages extends StObject {
    
    /**
      * The packages relative to the program folder to not include the Lambda upload. This can be
      * used to override the default serialization logic that includes all packages referenced by
      * project.json (except @pulumi packages).  Default is `[]`.
      *
      * @deprecated Use [codePathOptions] instead.
      */
    var excludePackages: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * @deprecated use [callbackFactory] instead.
      */
    var factoryFunc: js.UndefOr[HandlerFactory] = js.native
    
    /**
      * @deprecated use [callback] instead.
      */
    var func: js.UndefOr[Handler] = js.native
    
    /**
      * The packages relative to the program folder to include in the Lambda upload.  The version of
      * the package installed in the program folder and it's dependencies will all be included.
      * Default is `[]`.
      *
      * @deprecated Use [codePathOptions] instead.
      */
    var includePackages: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * The paths relative to the program folder to include in the Lambda upload.  Default is `[]`.
      *
      * @deprecated Use [codePathOptions] instead.
      */
    var includePaths: js.UndefOr[js.Array[String]] = js.native
  }
  object ExcludePackages {
    
    @scala.inline
    def apply(): ExcludePackages = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExcludePackages]
    }
    
    @scala.inline
    implicit class ExcludePackagesMutableBuilder[Self <: ExcludePackages] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExcludePackages(value: js.Array[String]): Self = StObject.set(x, "excludePackages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludePackagesUndefined: Self = StObject.set(x, "excludePackages", js.undefined)
      
      @scala.inline
      def setExcludePackagesVarargs(value: String*): Self = StObject.set(x, "excludePackages", js.Array(value :_*))
      
      @scala.inline
      def setFactoryFunc(value: () => Handler): Self = StObject.set(x, "factoryFunc", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFactoryFuncUndefined: Self = StObject.set(x, "factoryFunc", js.undefined)
      
      @scala.inline
      def setFunc(
        value: (js.Any, /* context */ Context, /* callback */ js.Function2[/* error */ js.UndefOr[js.Any], /* result */ js.UndefOr[js.Any], Unit]) => js.Promise[js.Any] | Unit
      ): Self = StObject.set(x, "func", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFuncUndefined: Self = StObject.set(x, "func", js.undefined)
      
      @scala.inline
      def setIncludePackages(value: js.Array[String]): Self = StObject.set(x, "includePackages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludePackagesUndefined: Self = StObject.set(x, "includePackages", js.undefined)
      
      @scala.inline
      def setIncludePackagesVarargs(value: String*): Self = StObject.set(x, "includePackages", js.Array(value :_*))
      
      @scala.inline
      def setIncludePaths(value: js.Array[String]): Self = StObject.set(x, "includePaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludePathsUndefined: Self = StObject.set(x, "includePaths", js.undefined)
      
      @scala.inline
      def setIncludePathsVarargs(value: String*): Self = StObject.set(x, "includePaths", js.Array(value :_*))
    }
  }
  
  @js.native
  trait KinesisSchemaVersion extends StObject {
    
    var data: String = js.native
    
    var kinesisSchemaVersion: String = js.native
    
    var partitionKey: String = js.native
    
    var sequenceNumber: String = js.native
  }
  object KinesisSchemaVersion {
    
    @scala.inline
    def apply(data: String, kinesisSchemaVersion: String, partitionKey: String, sequenceNumber: String): KinesisSchemaVersion = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], kinesisSchemaVersion = kinesisSchemaVersion.asInstanceOf[js.Any], partitionKey = partitionKey.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[KinesisSchemaVersion]
    }
    
    @scala.inline
    implicit class KinesisSchemaVersionMutableBuilder[Self <: KinesisSchemaVersion] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKinesisSchemaVersion(value: String): Self = StObject.set(x, "kinesisSchemaVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartitionKey(value: String): Self = StObject.set(x, "partitionKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequenceNumber(value: String): Self = StObject.set(x, "sequenceNumber", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PrincipalId extends StObject {
    
    var PrincipalId: String = js.native
    
    var Type: String = js.native
  }
  object PrincipalId {
    
    @scala.inline
    def apply(PrincipalId: String, Type: String): PrincipalId = {
      val __obj = js.Dynamic.literal(PrincipalId = PrincipalId.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrincipalId]
    }
    
    @scala.inline
    implicit class PrincipalIdMutableBuilder[Self <: PrincipalId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrincipalId(value: String): Self = StObject.set(x, "PrincipalId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PrincipalIdString extends StObject {
    
    var principalId: String = js.native
  }
  object PrincipalIdString {
    
    @scala.inline
    def apply(principalId: String): PrincipalIdString = {
      val __obj = js.Dynamic.literal(principalId = principalId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrincipalIdString]
    }
    
    @scala.inline
    implicit class PrincipalIdStringMutableBuilder[Self <: PrincipalIdString] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrincipalId(value: String): Self = StObject.set(x, "principalId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SourceIPAddress extends StObject {
    
    var sourceIPAddress: String = js.native
  }
  object SourceIPAddress {
    
    @scala.inline
    def apply(sourceIPAddress: String): SourceIPAddress = {
      val __obj = js.Dynamic.literal(sourceIPAddress = sourceIPAddress.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceIPAddress]
    }
    
    @scala.inline
    implicit class SourceIPAddressMutableBuilder[Self <: SourceIPAddress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSourceIPAddress(value: String): Self = StObject.set(x, "sourceIPAddress", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Xamzid2 extends StObject {
    
    var `x-amz-id-2`: String = js.native
    
    var `x-amz-request-id`: String = js.native
  }
  object Xamzid2 {
    
    @scala.inline
    def apply(`x-amz-id-2`: String, `x-amz-request-id`: String): Xamzid2 = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("x-amz-id-2")(`x-amz-id-2`.asInstanceOf[js.Any])
      __obj.updateDynamic("x-amz-request-id")(`x-amz-request-id`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Xamzid2]
    }
    
    @scala.inline
    implicit class Xamzid2MutableBuilder[Self <: Xamzid2] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setX-amz-id-2`(value: String): Self = StObject.set(x, "x-amz-id-2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setX-amz-request-id`(value: String): Self = StObject.set(x, "x-amz-request-id", value.asInstanceOf[js.Any])
    }
  }
}
