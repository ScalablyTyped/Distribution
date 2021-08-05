package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getQueueMod {
  
  @JSImport("@pulumi/aws/sqs/getQueue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getQueue(args: GetQueueArgs): js.Promise[GetQueueResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getQueue")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetQueueResult]]
  inline def getQueue(args: GetQueueArgs, opts: InvokeOptions): js.Promise[GetQueueResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getQueue")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetQueueResult]]
  
  trait GetQueueArgs extends StObject {
    
    /**
      * The name of the queue to match.
      */
    val name: String
    
    /**
      * A map of tags for the resource.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetQueueArgs {
    
    inline def apply(name: String): GetQueueArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetQueueArgs]
    }
    
    extension [Self <: GetQueueArgs](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GetQueueResult extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the queue.
      */
    val arn: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val name: String
    
    /**
      * A map of tags for the resource.
      */
    val tags: StringDictionary[String]
    
    /**
      * The URL of the queue.
      */
    val url: String
  }
  object GetQueueResult {
    
    inline def apply(arn: String, id: String, name: String, tags: StringDictionary[String], url: String): GetQueueResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetQueueResult]
    }
    
    extension [Self <: GetQueueResult](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
