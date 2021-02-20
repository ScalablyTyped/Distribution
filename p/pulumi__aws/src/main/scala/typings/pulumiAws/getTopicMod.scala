package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getTopicMod {
  
  @JSImport("@pulumi/aws/sns/getTopic", "getTopic")
  @js.native
  def getTopic(args: GetTopicArgs): js.Promise[GetTopicResult] = js.native
  @JSImport("@pulumi/aws/sns/getTopic", "getTopic")
  @js.native
  def getTopic(args: GetTopicArgs, opts: InvokeOptions): js.Promise[GetTopicResult] = js.native
  
  @js.native
  trait GetTopicArgs extends StObject {
    
    /**
      * The friendly name of the topic to match.
      */
    val name: String = js.native
  }
  object GetTopicArgs {
    
    @scala.inline
    def apply(name: String): GetTopicArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetTopicArgs]
    }
    
    @scala.inline
    implicit class GetTopicArgsMutableBuilder[Self <: GetTopicArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetTopicResult extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the found topic, suitable for referencing in other resources that support SNS topics.
      */
    val arn: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val name: String = js.native
  }
  object GetTopicResult {
    
    @scala.inline
    def apply(arn: String, id: String, name: String): GetTopicResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetTopicResult]
    }
    
    @scala.inline
    implicit class GetTopicResultMutableBuilder[Self <: GetTopicResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
