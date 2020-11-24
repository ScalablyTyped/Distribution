package typings.pulumiAws.getTableMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.dynamodb.GetTableAttribute
import typings.pulumiAws.outputMod.dynamodb.GetTableGlobalSecondaryIndex
import typings.pulumiAws.outputMod.dynamodb.GetTableLocalSecondaryIndex
import typings.pulumiAws.outputMod.dynamodb.GetTablePointInTimeRecovery
import typings.pulumiAws.outputMod.dynamodb.GetTableReplica
import typings.pulumiAws.outputMod.dynamodb.GetTableServerSideEncryption
import typings.pulumiAws.outputMod.dynamodb.GetTableTtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTableResult extends js.Object {
  
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
  
  val serverSideEncryption: GetTableServerSideEncryption = js.native
  
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
    serverSideEncryption: GetTableServerSideEncryption,
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
  implicit class GetTableResultOps[Self <: GetTableResult] (val x: Self) extends AnyVal {
    
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
    def setAttributesVarargs(value: GetTableAttribute*): Self = this.set("attributes", js.Array(value :_*))
    
    @scala.inline
    def setAttributes(value: js.Array[GetTableAttribute]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingMode(value: String): Self = this.set("billingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalSecondaryIndexesVarargs(value: GetTableGlobalSecondaryIndex*): Self = this.set("globalSecondaryIndexes", js.Array(value :_*))
    
    @scala.inline
    def setGlobalSecondaryIndexes(value: js.Array[GetTableGlobalSecondaryIndex]): Self = this.set("globalSecondaryIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashKey(value: String): Self = this.set("hashKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalSecondaryIndexesVarargs(value: GetTableLocalSecondaryIndex*): Self = this.set("localSecondaryIndexes", js.Array(value :_*))
    
    @scala.inline
    def setLocalSecondaryIndexes(value: js.Array[GetTableLocalSecondaryIndex]): Self = this.set("localSecondaryIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointInTimeRecovery(value: GetTablePointInTimeRecovery): Self = this.set("pointInTimeRecovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeKey(value: String): Self = this.set("rangeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadCapacity(value: Double): Self = this.set("readCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicasVarargs(value: GetTableReplica*): Self = this.set("replicas", js.Array(value :_*))
    
    @scala.inline
    def setReplicas(value: js.Array[GetTableReplica]): Self = this.set("replicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerSideEncryption(value: GetTableServerSideEncryption): Self = this.set("serverSideEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamArn(value: String): Self = this.set("streamArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamEnabled(value: Boolean): Self = this.set("streamEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamLabel(value: String): Self = this.set("streamLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamViewType(value: String): Self = this.set("streamViewType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtl(value: GetTableTtl): Self = this.set("ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteCapacity(value: Double): Self = this.set("writeCapacity", value.asInstanceOf[js.Any])
  }
}
