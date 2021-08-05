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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ApproximateCreationDateTime extends StObject {
    
    var ApproximateCreationDateTime: Double
    
    var Keys: Record[String, js.Any]
    
    var NewImage: js.UndefOr[Record[String, js.Any]] = js.undefined
    
    var OldImage: js.UndefOr[Record[String, js.Any]] = js.undefined
    
    var SequenceNumber: String
    
    var SizeBytes: Double
    
    var StreamViewType: String
  }
  object ApproximateCreationDateTime {
    
    inline def apply(
      ApproximateCreationDateTime: Double,
      Keys: Record[String, js.Any],
      SequenceNumber: String,
      SizeBytes: Double,
      StreamViewType: String
    ): ApproximateCreationDateTime = {
      val __obj = js.Dynamic.literal(ApproximateCreationDateTime = ApproximateCreationDateTime.asInstanceOf[js.Any], Keys = Keys.asInstanceOf[js.Any], SequenceNumber = SequenceNumber.asInstanceOf[js.Any], SizeBytes = SizeBytes.asInstanceOf[js.Any], StreamViewType = StreamViewType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApproximateCreationDateTime]
    }
    
    extension [Self <: ApproximateCreationDateTime](x: Self) {
      
      inline def setApproximateCreationDateTime(value: Double): Self = StObject.set(x, "ApproximateCreationDateTime", value.asInstanceOf[js.Any])
      
      inline def setKeys(value: Record[String, js.Any]): Self = StObject.set(x, "Keys", value.asInstanceOf[js.Any])
      
      inline def setNewImage(value: Record[String, js.Any]): Self = StObject.set(x, "NewImage", value.asInstanceOf[js.Any])
      
      inline def setNewImageUndefined: Self = StObject.set(x, "NewImage", js.undefined)
      
      inline def setOldImage(value: Record[String, js.Any]): Self = StObject.set(x, "OldImage", value.asInstanceOf[js.Any])
      
      inline def setOldImageUndefined: Self = StObject.set(x, "OldImage", js.undefined)
      
      inline def setSequenceNumber(value: String): Self = StObject.set(x, "SequenceNumber", value.asInstanceOf[js.Any])
      
      inline def setSizeBytes(value: Double): Self = StObject.set(x, "SizeBytes", value.asInstanceOf[js.Any])
      
      inline def setStreamViewType(value: String): Self = StObject.set(x, "StreamViewType", value.asInstanceOf[js.Any])
    }
  }
  
  trait ApproximateFirstReceiveTimestamp extends StObject {
    
    var ApproximateFirstReceiveTimestamp: String
    
    var ApproximateReceiveCount: String
    
    var SenderId: String
    
    var SentTimestamp: String
  }
  object ApproximateFirstReceiveTimestamp {
    
    inline def apply(
      ApproximateFirstReceiveTimestamp: String,
      ApproximateReceiveCount: String,
      SenderId: String,
      SentTimestamp: String
    ): ApproximateFirstReceiveTimestamp = {
      val __obj = js.Dynamic.literal(ApproximateFirstReceiveTimestamp = ApproximateFirstReceiveTimestamp.asInstanceOf[js.Any], ApproximateReceiveCount = ApproximateReceiveCount.asInstanceOf[js.Any], SenderId = SenderId.asInstanceOf[js.Any], SentTimestamp = SentTimestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApproximateFirstReceiveTimestamp]
    }
    
    extension [Self <: ApproximateFirstReceiveTimestamp](x: Self) {
      
      inline def setApproximateFirstReceiveTimestamp(value: String): Self = StObject.set(x, "ApproximateFirstReceiveTimestamp", value.asInstanceOf[js.Any])
      
      inline def setApproximateReceiveCount(value: String): Self = StObject.set(x, "ApproximateReceiveCount", value.asInstanceOf[js.Any])
      
      inline def setSenderId(value: String): Self = StObject.set(x, "SenderId", value.asInstanceOf[js.Any])
      
      inline def setSentTimestamp(value: String): Self = StObject.set(x, "SentTimestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait Arn extends StObject {
    
    var arn: String
    
    var name: String
    
    var ownerIdentity: PrincipalIdString
  }
  object Arn {
    
    inline def apply(arn: String, name: String, ownerIdentity: PrincipalIdString): Arn = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ownerIdentity = ownerIdentity.asInstanceOf[js.Any])
      __obj.asInstanceOf[Arn]
    }
    
    extension [Self <: Arn](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOwnerIdentity(value: PrincipalIdString): Self = StObject.set(x, "ownerIdentity", value.asInstanceOf[js.Any])
    }
  }
  
  trait Bucket extends StObject {
    
    var bucket: Arn
    
    var configurationId: String
    
    var `object`: ETag
    
    var s3SchemaVersion: String
  }
  object Bucket {
    
    inline def apply(bucket: Arn, configurationId: String, `object`: ETag, s3SchemaVersion: String): Bucket = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], configurationId = configurationId.asInstanceOf[js.Any], s3SchemaVersion = s3SchemaVersion.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bucket]
    }
    
    extension [Self <: Bucket](x: Self) {
      
      inline def setBucket(value: Arn): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      inline def setConfigurationId(value: String): Self = StObject.set(x, "configurationId", value.asInstanceOf[js.Any])
      
      inline def setObject(value: ETag): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setS3SchemaVersion(value: String): Self = StObject.set(x, "s3SchemaVersion", value.asInstanceOf[js.Any])
    }
  }
  
  trait Code extends StObject {
    
    /**
      * Not allowed when creating an aws.serverless.Function.  The [code] will be generated from the
      * passed in JavaScript callback.
      */
    var code: js.UndefOr[scala.Nothing] = js.undefined
    
    /**
      * Options to control which paths/packages should be included or excluded in the zip file containing
      * the code for the AWS lambda.
      */
    var codePathOptions: js.UndefOr[CodePathOptions] = js.undefined
    
    /**
      * Not allowed when creating an aws.serverless.Function.  The [code] will be generated from the
      * passed in JavaScript callback.
      */
    var handler: js.UndefOr[scala.Nothing] = js.undefined
    
    /**
      * A list of IAM policy ARNs to attach to the Function.  Will be used if [role] is not provide.
      * If neither [role] nor [policies] is provided, a default policy of [iam.AWSLambdaFullAccess]
      * will be used instead.
      */
    var policies: js.UndefOr[js.Array[ARN]] = js.undefined
    
    /**
      * A pre-created role to use for the Function. If not provided, [policies] will be used.
      */
    var role: js.UndefOr[Role] = js.undefined
    
    /**
      * The Lambda runtime to use.  If not provided, will default to [NodeJS8d10Runtime]
      */
    var runtime: js.UndefOr[Runtime] = js.undefined
  }
  object Code {
    
    inline def apply(): Code = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Code]
    }
    
    extension [Self <: Code](x: Self) {
      
      inline def setCodePathOptions(value: CodePathOptions): Self = StObject.set(x, "codePathOptions", value.asInstanceOf[js.Any])
      
      inline def setCodePathOptionsUndefined: Self = StObject.set(x, "codePathOptions", js.undefined)
      
      inline def setPolicies(value: js.Array[ARN]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
      
      inline def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
      
      inline def setPoliciesVarargs(value: ARN*): Self = StObject.set(x, "policies", js.Array(value :_*))
      
      inline def setRole(value: Role): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setRuntime(value: Runtime): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    }
  }
  
  trait Data extends StObject {
    
    var data: String
  }
  object Data {
    
    inline def apply(data: String): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  trait ETag extends StObject {
    
    var eTag: String
    
    var key: String
    
    var sequencer: String
    
    var size: Double
    
    var versionId: js.UndefOr[String] = js.undefined
  }
  object ETag {
    
    inline def apply(eTag: String, key: String, sequencer: String, size: Double): ETag = {
      val __obj = js.Dynamic.literal(eTag = eTag.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], sequencer = sequencer.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[ETag]
    }
    
    extension [Self <: ETag](x: Self) {
      
      inline def setETag(value: String): Self = StObject.set(x, "eTag", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setSequencer(value: String): Self = StObject.set(x, "sequencer", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
      
      inline def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
    }
  }
  
  trait ExcludePackages extends StObject {
    
    /**
      * The packages relative to the program folder to not include the Lambda upload. This can be
      * used to override the default serialization logic that includes all packages referenced by
      * project.json (except @pulumi packages).  Default is `[]`.
      *
      * @deprecated Use [codePathOptions] instead.
      */
    var excludePackages: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * @deprecated use [callbackFactory] instead.
      */
    var factoryFunc: js.UndefOr[HandlerFactory] = js.undefined
    
    /**
      * @deprecated use [callback] instead.
      */
    var func: js.UndefOr[Handler] = js.undefined
    
    /**
      * The packages relative to the program folder to include in the Lambda upload.  The version of
      * the package installed in the program folder and it's dependencies will all be included.
      * Default is `[]`.
      *
      * @deprecated Use [codePathOptions] instead.
      */
    var includePackages: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The paths relative to the program folder to include in the Lambda upload.  Default is `[]`.
      *
      * @deprecated Use [codePathOptions] instead.
      */
    var includePaths: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ExcludePackages {
    
    inline def apply(): ExcludePackages = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExcludePackages]
    }
    
    extension [Self <: ExcludePackages](x: Self) {
      
      inline def setExcludePackages(value: js.Array[String]): Self = StObject.set(x, "excludePackages", value.asInstanceOf[js.Any])
      
      inline def setExcludePackagesUndefined: Self = StObject.set(x, "excludePackages", js.undefined)
      
      inline def setExcludePackagesVarargs(value: String*): Self = StObject.set(x, "excludePackages", js.Array(value :_*))
      
      inline def setFactoryFunc(value: () => Handler): Self = StObject.set(x, "factoryFunc", js.Any.fromFunction0(value))
      
      inline def setFactoryFuncUndefined: Self = StObject.set(x, "factoryFunc", js.undefined)
      
      inline def setFunc(
        value: (js.Any, /* context */ Context, /* callback */ js.Function2[/* error */ js.UndefOr[js.Any], /* result */ js.UndefOr[js.Any], Unit]) => js.Promise[js.Any] | Unit
      ): Self = StObject.set(x, "func", js.Any.fromFunction3(value))
      
      inline def setFuncUndefined: Self = StObject.set(x, "func", js.undefined)
      
      inline def setIncludePackages(value: js.Array[String]): Self = StObject.set(x, "includePackages", value.asInstanceOf[js.Any])
      
      inline def setIncludePackagesUndefined: Self = StObject.set(x, "includePackages", js.undefined)
      
      inline def setIncludePackagesVarargs(value: String*): Self = StObject.set(x, "includePackages", js.Array(value :_*))
      
      inline def setIncludePaths(value: js.Array[String]): Self = StObject.set(x, "includePaths", value.asInstanceOf[js.Any])
      
      inline def setIncludePathsUndefined: Self = StObject.set(x, "includePaths", js.undefined)
      
      inline def setIncludePathsVarargs(value: String*): Self = StObject.set(x, "includePaths", js.Array(value :_*))
    }
  }
  
  trait KinesisSchemaVersion extends StObject {
    
    var data: String
    
    var kinesisSchemaVersion: String
    
    var partitionKey: String
    
    var sequenceNumber: String
  }
  object KinesisSchemaVersion {
    
    inline def apply(data: String, kinesisSchemaVersion: String, partitionKey: String, sequenceNumber: String): KinesisSchemaVersion = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], kinesisSchemaVersion = kinesisSchemaVersion.asInstanceOf[js.Any], partitionKey = partitionKey.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[KinesisSchemaVersion]
    }
    
    extension [Self <: KinesisSchemaVersion](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setKinesisSchemaVersion(value: String): Self = StObject.set(x, "kinesisSchemaVersion", value.asInstanceOf[js.Any])
      
      inline def setPartitionKey(value: String): Self = StObject.set(x, "partitionKey", value.asInstanceOf[js.Any])
      
      inline def setSequenceNumber(value: String): Self = StObject.set(x, "sequenceNumber", value.asInstanceOf[js.Any])
    }
  }
  
  trait PrincipalId extends StObject {
    
    var PrincipalId: String
    
    var Type: String
  }
  object PrincipalId {
    
    inline def apply(PrincipalId: String, Type: String): PrincipalId = {
      val __obj = js.Dynamic.literal(PrincipalId = PrincipalId.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrincipalId]
    }
    
    extension [Self <: PrincipalId](x: Self) {
      
      inline def setPrincipalId(value: String): Self = StObject.set(x, "PrincipalId", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
  
  trait PrincipalIdString extends StObject {
    
    var principalId: String
  }
  object PrincipalIdString {
    
    inline def apply(principalId: String): PrincipalIdString = {
      val __obj = js.Dynamic.literal(principalId = principalId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrincipalIdString]
    }
    
    extension [Self <: PrincipalIdString](x: Self) {
      
      inline def setPrincipalId(value: String): Self = StObject.set(x, "principalId", value.asInstanceOf[js.Any])
    }
  }
  
  trait SourceIPAddress extends StObject {
    
    var sourceIPAddress: String
  }
  object SourceIPAddress {
    
    inline def apply(sourceIPAddress: String): SourceIPAddress = {
      val __obj = js.Dynamic.literal(sourceIPAddress = sourceIPAddress.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceIPAddress]
    }
    
    extension [Self <: SourceIPAddress](x: Self) {
      
      inline def setSourceIPAddress(value: String): Self = StObject.set(x, "sourceIPAddress", value.asInstanceOf[js.Any])
    }
  }
  
  trait Xamzid2 extends StObject {
    
    var `x-amz-id-2`: String
    
    var `x-amz-request-id`: String
  }
  object Xamzid2 {
    
    inline def apply(`x-amz-id-2`: String, `x-amz-request-id`: String): Xamzid2 = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("x-amz-id-2")(`x-amz-id-2`.asInstanceOf[js.Any])
      __obj.updateDynamic("x-amz-request-id")(`x-amz-request-id`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Xamzid2]
    }
    
    extension [Self <: Xamzid2](x: Self) {
      
      inline def `setX-amz-id-2`(value: String): Self = StObject.set(x, "x-amz-id-2", value.asInstanceOf[js.Any])
      
      inline def `setX-amz-request-id`(value: String): Self = StObject.set(x, "x-amz-request-id", value.asInstanceOf[js.Any])
    }
  }
}
