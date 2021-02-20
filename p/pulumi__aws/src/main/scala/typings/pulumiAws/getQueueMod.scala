package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getQueueMod {
  
  @JSImport("@pulumi/aws/sqs/getQueue", "getQueue")
  @js.native
  def getQueue(args: GetQueueArgs): js.Promise[GetQueueResult] = js.native
  @JSImport("@pulumi/aws/sqs/getQueue", "getQueue")
  @js.native
  def getQueue(args: GetQueueArgs, opts: InvokeOptions): js.Promise[GetQueueResult] = js.native
  
  @js.native
  trait GetQueueArgs extends StObject {
    
    /**
      * The name of the queue to match.
      */
    val name: String = js.native
    
    /**
      * A map of tags for the resource.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetQueueArgs {
    
    @scala.inline
    def apply(name: String): GetQueueArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetQueueArgs]
    }
    
    @scala.inline
    implicit class GetQueueArgsMutableBuilder[Self <: GetQueueArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetQueueResult extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the queue.
      */
    val arn: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val name: String = js.native
    
    /**
      * A map of tags for the resource.
      */
    val tags: StringDictionary[String] = js.native
    
    /**
      * The URL of the queue.
      */
    val url: String = js.native
  }
  object GetQueueResult {
    
    @scala.inline
    def apply(arn: String, id: String, name: String, tags: StringDictionary[String], url: String): GetQueueResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetQueueResult]
    }
    
    @scala.inline
    implicit class GetQueueResultMutableBuilder[Self <: GetQueueResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
