package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getStreamMod {
  
  @JSImport("@pulumi/aws/kinesis/getStream", "getStream")
  @js.native
  def getStream(args: GetStreamArgs): js.Promise[GetStreamResult] = js.native
  @JSImport("@pulumi/aws/kinesis/getStream", "getStream")
  @js.native
  def getStream(args: GetStreamArgs, opts: InvokeOptions): js.Promise[GetStreamResult] = js.native
  
  @js.native
  trait GetStreamArgs extends StObject {
    
    /**
      * The name of the Kinesis Stream.
      */
    val name: String = js.native
    
    /**
      * A map of tags to assigned to the stream.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetStreamArgs {
    
    @scala.inline
    def apply(name: String): GetStreamArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetStreamArgs]
    }
    
    @scala.inline
    implicit class GetStreamArgsMutableBuilder[Self <: GetStreamArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetStreamResult extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the Kinesis Stream (same as id).
      */
    val arn: String = js.native
    
    /**
      * The list of shard ids in the CLOSED state. See [Shard State](https://docs.aws.amazon.com/streams/latest/dev/kinesis-using-sdk-java-after-resharding.html#kinesis-using-sdk-java-resharding-data-routing) for more.
      */
    val closedShards: js.Array[String] = js.native
    
    /**
      * The approximate UNIX timestamp that the stream was created.
      */
    val creationTimestamp: Double = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * The name of the Kinesis Stream.
      */
    val name: String = js.native
    
    /**
      * The list of shard ids in the OPEN state. See [Shard State](https://docs.aws.amazon.com/streams/latest/dev/kinesis-using-sdk-java-after-resharding.html#kinesis-using-sdk-java-resharding-data-routing) for more.
      */
    val openShards: js.Array[String] = js.native
    
    /**
      * Length of time (in hours) data records are accessible after they are added to the stream.
      */
    val retentionPeriod: Double = js.native
    
    /**
      * A list of shard-level CloudWatch metrics which are enabled for the stream. See [Monitoring with CloudWatch](https://docs.aws.amazon.com/streams/latest/dev/monitoring-with-cloudwatch.html) for more.
      */
    val shardLevelMetrics: js.Array[String] = js.native
    
    /**
      * The current status of the stream. The stream status is one of CREATING, DELETING, ACTIVE, or UPDATING.
      */
    val status: String = js.native
    
    /**
      * A map of tags to assigned to the stream.
      */
    val tags: StringDictionary[String] = js.native
  }
  object GetStreamResult {
    
    @scala.inline
    def apply(
      arn: String,
      closedShards: js.Array[String],
      creationTimestamp: Double,
      id: String,
      name: String,
      openShards: js.Array[String],
      retentionPeriod: Double,
      shardLevelMetrics: js.Array[String],
      status: String,
      tags: StringDictionary[String]
    ): GetStreamResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], closedShards = closedShards.asInstanceOf[js.Any], creationTimestamp = creationTimestamp.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], openShards = openShards.asInstanceOf[js.Any], retentionPeriod = retentionPeriod.asInstanceOf[js.Any], shardLevelMetrics = shardLevelMetrics.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetStreamResult]
    }
    
    @scala.inline
    implicit class GetStreamResultMutableBuilder[Self <: GetStreamResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosedShards(value: js.Array[String]): Self = StObject.set(x, "closedShards", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosedShardsVarargs(value: String*): Self = StObject.set(x, "closedShards", js.Array(value :_*))
      
      @scala.inline
      def setCreationTimestamp(value: Double): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenShards(value: js.Array[String]): Self = StObject.set(x, "openShards", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenShardsVarargs(value: String*): Self = StObject.set(x, "openShards", js.Array(value :_*))
      
      @scala.inline
      def setRetentionPeriod(value: Double): Self = StObject.set(x, "retentionPeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShardLevelMetrics(value: js.Array[String]): Self = StObject.set(x, "shardLevelMetrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShardLevelMetricsVarargs(value: String*): Self = StObject.set(x, "shardLevelMetrics", js.Array(value :_*))
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
}
