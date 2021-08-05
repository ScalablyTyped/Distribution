package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getLogGroupMod {
  
  @JSImport("@pulumi/aws/cloudwatch/getLogGroup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLogGroup(args: GetLogGroupArgs): js.Promise[GetLogGroupResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLogGroup")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetLogGroupResult]]
  inline def getLogGroup(args: GetLogGroupArgs, opts: InvokeOptions): js.Promise[GetLogGroupResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLogGroup")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetLogGroupResult]]
  
  trait GetLogGroupArgs extends StObject {
    
    /**
      * The name of the Cloudwatch log group
      */
    val name: String
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetLogGroupArgs {
    
    inline def apply(name: String): GetLogGroupArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetLogGroupArgs]
    }
    
    extension [Self <: GetLogGroupArgs](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GetLogGroupResult extends StObject {
    
    /**
      * The ARN of the Cloudwatch log group
      */
    val arn: String
    
    /**
      * The creation time of the log group, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
      */
    val creationTime: Double
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * The ARN of the KMS Key to use when encrypting log data.
      */
    val kmsKeyId: String
    
    val name: String
    
    /**
      * The number of days log events retained in the specified log group.
      */
    val retentionInDays: Double
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: StringDictionary[String]
  }
  object GetLogGroupResult {
    
    inline def apply(
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
    
    extension [Self <: GetLogGroupResult](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setCreationTime(value: Double): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setKmsKeyId(value: String): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRetentionInDays(value: Double): Self = StObject.set(x, "retentionInDays", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
}
