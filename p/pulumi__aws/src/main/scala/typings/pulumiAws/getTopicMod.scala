package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getTopicMod {
  
  @JSImport("@pulumi/aws/sns/getTopic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getTopic(args: GetTopicArgs): js.Promise[GetTopicResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTopic")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetTopicResult]]
  @scala.inline
  def getTopic(args: GetTopicArgs, opts: InvokeOptions): js.Promise[GetTopicResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTopic")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetTopicResult]]
  
  trait GetTopicArgs extends StObject {
    
    /**
      * The friendly name of the topic to match.
      */
    val name: String
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
  
  trait GetTopicResult extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the found topic, suitable for referencing in other resources that support SNS topics.
      */
    val arn: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val name: String
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
