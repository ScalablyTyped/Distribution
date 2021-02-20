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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getTableMod {
  
  @JSImport("@pulumi/aws/dynamodb/getTable", "getTable")
  @js.native
  def getTable(args: GetTableArgs): js.Promise[GetTableResult] = js.native
  @JSImport("@pulumi/aws/dynamodb/getTable", "getTable")
  @js.native
  def getTable(args: GetTableArgs, opts: InvokeOptions): js.Promise[GetTableResult] = js.native
  
  @js.native
  trait GetTableArgs extends StObject {
    
    /**
      * The name of the DynamoDB table.
      */
    val name: String = js.native
    
    val serverSideEncryption: js.UndefOr[GetTableServerSideEncryption] = js.native
    
    val tags: js.UndefOr[StringDictionary[String]] = js.native
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
  
  @js.native
  trait GetTableResult extends StObject {
    
    val arn: String = js.native
    
    val attributes: js.Array[GetTableAttribute] = js.native
    
    val billingMode: String = js.native
    
    val globalSecondaryIndexes: js.Array[GetTableGlobalSecondaryIndex] = js.native
    
    val hashKey: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val localSecondaryIndexes: js.Array[GetTableLocalSecondaryIndex] = js.native
    
    val name: String = js.native
    
    val pointInTimeRecovery: GetTablePointInTimeRecovery = js.native
    
    val rangeKey: String = js.native
    
    val readCapacity: Double = js.native
    
    val replicas: js.Array[GetTableReplica] = js.native
    
    val serverSideEncryption: typings.pulumiAws.outputMod.dynamodb.GetTableServerSideEncryption = js.native
    
    val streamArn: String = js.native
    
    val streamEnabled: Boolean = js.native
    
    val streamLabel: String = js.native
    
    val streamViewType: String = js.native
    
    val tags: StringDictionary[String] = js.native
    
    val ttl: GetTableTtl = js.native
    
    val writeCapacity: Double = js.native
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
