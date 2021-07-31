package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.dynamodb.GetTableServerSideEncryption
import typings.pulumiAws.outputMod.dynamodb.GetTableAttribute
import typings.pulumiAws.outputMod.dynamodb.GetTableGlobalSecondaryIndex
import typings.pulumiAws.outputMod.dynamodb.GetTableLocalSecondaryIndex
import typings.pulumiAws.outputMod.dynamodb.GetTablePointInTimeRecovery
import typings.pulumiAws.outputMod.dynamodb.GetTableReplica
import typings.pulumiAws.outputMod.dynamodb.GetTableTtl
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getTableMod {
  
  @JSImport("@pulumi/aws/dynamodb/getTable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getTable(args: GetTableArgs): js.Promise[GetTableResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTable")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetTableResult]]
  @scala.inline
  def getTable(args: GetTableArgs, opts: InvokeOptions): js.Promise[GetTableResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTable")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetTableResult]]
  
  trait GetTableArgs extends StObject {
    
    /**
      * The name of the DynamoDB table.
      */
    val name: String
    
    val serverSideEncryption: js.UndefOr[GetTableServerSideEncryption] = js.undefined
    
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetTableArgs {
    
    @scala.inline
    def apply(name: String): GetTableArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetTableArgs]
    }
    
    @scala.inline
    implicit class GetTableArgsMutableBuilder[Self <: GetTableArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerSideEncryption(value: GetTableServerSideEncryption): Self = StObject.set(x, "serverSideEncryption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerSideEncryptionUndefined: Self = StObject.set(x, "serverSideEncryption", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GetTableResult extends StObject {
    
    val arn: String
    
    val attributes: js.Array[GetTableAttribute]
    
    val billingMode: String
    
    val globalSecondaryIndexes: js.Array[GetTableGlobalSecondaryIndex]
    
    val hashKey: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val localSecondaryIndexes: js.Array[GetTableLocalSecondaryIndex]
    
    val name: String
    
    val pointInTimeRecovery: GetTablePointInTimeRecovery
    
    val rangeKey: String
    
    val readCapacity: Double
    
    val replicas: js.Array[GetTableReplica]
    
    val serverSideEncryption: typings.pulumiAws.outputMod.dynamodb.GetTableServerSideEncryption
    
    val streamArn: String
    
    val streamEnabled: Boolean
    
    val streamLabel: String
    
    val streamViewType: String
    
    val tags: StringDictionary[String]
    
    val ttl: GetTableTtl
    
    val writeCapacity: Double
  }
  object GetTableResult {
    
    @scala.inline
    def apply(
      arn: String,
      attributes: js.Array[GetTableAttribute],
      billingMode: String,
      globalSecondaryIndexes: js.Array[GetTableGlobalSecondaryIndex],
      hashKey: String,
      id: String,
      localSecondaryIndexes: js.Array[GetTableLocalSecondaryIndex],
      name: String,
      pointInTimeRecovery: GetTablePointInTimeRecovery,
      rangeKey: String,
      readCapacity: Double,
      replicas: js.Array[GetTableReplica],
      serverSideEncryption: typings.pulumiAws.outputMod.dynamodb.GetTableServerSideEncryption,
      streamArn: String,
      streamEnabled: Boolean,
      streamLabel: String,
      streamViewType: String,
      tags: StringDictionary[String],
      ttl: GetTableTtl,
      writeCapacity: Double
    ): GetTableResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], billingMode = billingMode.asInstanceOf[js.Any], globalSecondaryIndexes = globalSecondaryIndexes.asInstanceOf[js.Any], hashKey = hashKey.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], localSecondaryIndexes = localSecondaryIndexes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pointInTimeRecovery = pointInTimeRecovery.asInstanceOf[js.Any], rangeKey = rangeKey.asInstanceOf[js.Any], readCapacity = readCapacity.asInstanceOf[js.Any], replicas = replicas.asInstanceOf[js.Any], serverSideEncryption = serverSideEncryption.asInstanceOf[js.Any], streamArn = streamArn.asInstanceOf[js.Any], streamEnabled = streamEnabled.asInstanceOf[js.Any], streamLabel = streamLabel.asInstanceOf[js.Any], streamViewType = streamViewType.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any], writeCapacity = writeCapacity.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetTableResult]
    }
    
    @scala.inline
    implicit class GetTableResultMutableBuilder[Self <: GetTableResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributes(value: js.Array[GetTableAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesVarargs(value: GetTableAttribute*): Self = StObject.set(x, "attributes", js.Array(value :_*))
      
      @scala.inline
      def setBillingMode(value: String): Self = StObject.set(x, "billingMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalSecondaryIndexes(value: js.Array[GetTableGlobalSecondaryIndex]): Self = StObject.set(x, "globalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalSecondaryIndexesVarargs(value: GetTableGlobalSecondaryIndex*): Self = StObject.set(x, "globalSecondaryIndexes", js.Array(value :_*))
      
      @scala.inline
      def setHashKey(value: String): Self = StObject.set(x, "hashKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalSecondaryIndexes(value: js.Array[GetTableLocalSecondaryIndex]): Self = StObject.set(x, "localSecondaryIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalSecondaryIndexesVarargs(value: GetTableLocalSecondaryIndex*): Self = StObject.set(x, "localSecondaryIndexes", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointInTimeRecovery(value: GetTablePointInTimeRecovery): Self = StObject.set(x, "pointInTimeRecovery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeKey(value: String): Self = StObject.set(x, "rangeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadCapacity(value: Double): Self = StObject.set(x, "readCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicas(value: js.Array[GetTableReplica]): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicasVarargs(value: GetTableReplica*): Self = StObject.set(x, "replicas", js.Array(value :_*))
      
      @scala.inline
      def setServerSideEncryption(value: typings.pulumiAws.outputMod.dynamodb.GetTableServerSideEncryption): Self = StObject.set(x, "serverSideEncryption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamArn(value: String): Self = StObject.set(x, "streamArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamEnabled(value: Boolean): Self = StObject.set(x, "streamEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamLabel(value: String): Self = StObject.set(x, "streamLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamViewType(value: String): Self = StObject.set(x, "streamViewType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtl(value: GetTableTtl): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteCapacity(value: Double): Self = StObject.set(x, "writeCapacity", value.asInstanceOf[js.Any])
    }
  }
}
