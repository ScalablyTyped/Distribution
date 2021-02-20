package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getLogGroupMod {
  
  @JSImport("@pulumi/aws/cloudwatch/getLogGroup", "getLogGroup")
  @js.native
  def getLogGroup(args: GetLogGroupArgs): js.Promise[GetLogGroupResult] = js.native
  @JSImport("@pulumi/aws/cloudwatch/getLogGroup", "getLogGroup")
  @js.native
  def getLogGroup(args: GetLogGroupArgs, opts: InvokeOptions): js.Promise[GetLogGroupResult] = js.native
  
  @js.native
  trait GetLogGroupArgs extends StObject {
    
    /**
      * The name of the Cloudwatch log group
      */
    val name: String = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetLogGroupArgs {
    
    @scala.inline
    def apply(name: String): GetLogGroupArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetLogGroupArgs]
    }
    
    @scala.inline
    implicit class GetLogGroupArgsMutableBuilder[Self <: GetLogGroupArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetLogGroupResult extends StObject {
    
    /**
      * The ARN of the Cloudwatch log group
      */
    val arn: String = js.native
    
    /**
      * The creation time of the log group, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
      */
    val creationTime: Double = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * The ARN of the KMS Key to use when encrypting log data.
      */
    val kmsKeyId: String = js.native
    
    val name: String = js.native
    
    /**
      * The number of days log events retained in the specified log group.
      */
    val retentionInDays: Double = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: StringDictionary[String] = js.native
  }
  object GetLogGroupResult {
    
    @scala.inline
    def apply(
      arn: String,
      creationTime: Double,
      id: String,
      kmsKeyId: String,
      name: String,
      retentionInDays: Double,
      tags: StringDictionary[String]
    ): GetLogGroupResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], creationTime = creationTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], retentionInDays = retentionInDays.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetLogGroupResult]
    }
    
    @scala.inline
    implicit class GetLogGroupResultMutableBuilder[Self <: GetLogGroupResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationTime(value: Double): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyId(value: String): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetentionInDays(value: Double): Self = StObject.set(x, "retentionInDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
}
