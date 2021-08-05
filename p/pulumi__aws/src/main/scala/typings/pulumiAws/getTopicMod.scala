package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getTopicMod {
  
  @JSImport("@pulumi/aws/sns/getTopic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTopic(args: GetTopicArgs): js.Promise[GetTopicResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTopic")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetTopicResult]]
  inline def getTopic(args: GetTopicArgs, opts: InvokeOptions): js.Promise[GetTopicResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTopic")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetTopicResult]]
  
  trait GetTopicArgs extends StObject {
    
    /**
      * The friendly name of the topic to match.
      */
    val name: String
  }
  object GetTopicArgs {
    
    inline def apply(name: String): GetTopicArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetTopicArgs]
    }
    
    extension [Self <: GetTopicArgs](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
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
    
    inline def apply(arn: String, id: String, name: String): GetTopicResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetTopicResult]
    }
    
    extension [Self <: GetTopicResult](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
