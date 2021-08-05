package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getVpcLinkMod {
  
  @JSImport("@pulumi/aws/apigateway/getVpcLink", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getVpcLink(args: GetVpcLinkArgs): js.Promise[GetVpcLinkResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVpcLink")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetVpcLinkResult]]
  inline def getVpcLink(args: GetVpcLinkArgs, opts: InvokeOptions): js.Promise[GetVpcLinkResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getVpcLink")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetVpcLinkResult]]
  
  trait GetVpcLinkArgs extends StObject {
    
    /**
      * The name of the API Gateway VPC Link to look up. If no API Gateway VPC Link is found with this name, an error will be returned.
      * If multiple API Gateway VPC Links are found with this name, an error will be returned.
      */
    val name: String
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetVpcLinkArgs {
    
    inline def apply(name: String): GetVpcLinkArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetVpcLinkArgs]
    }
    
    extension [Self <: GetVpcLinkArgs](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GetVpcLinkResult extends StObject {
    
    /**
      * The description of the VPC link.
      */
    val description: String
    
    /**
      * Set to the ID of the found API Gateway VPC Link.
      */
    val id: String
    
    val name: String
    
    /**
      * The status of the VPC link.
      */
    val status: String
    
    /**
      * The status message of the VPC link.
      */
    val statusMessage: String
    
    /**
      * Key-value map of resource tags
      */
    val tags: StringDictionary[String]
    
    /**
      * The list of network load balancer arns in the VPC targeted by the VPC link. Currently AWS only supports 1 target.
      */
    val targetArns: js.Array[String]
  }
  object GetVpcLinkResult {
    
    inline def apply(
      description: String,
      id: String,
      name: String,
      status: String,
      statusMessage: String,
      tags: StringDictionary[String],
      targetArns: js.Array[String]
    ): GetVpcLinkResult = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], targetArns = targetArns.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetVpcLinkResult]
    }
    
    extension [Self <: GetVpcLinkResult](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTargetArns(value: js.Array[String]): Self = StObject.set(x, "targetArns", value.asInstanceOf[js.Any])
      
      inline def setTargetArnsVarargs(value: String*): Self = StObject.set(x, "targetArns", js.Array(value :_*))
    }
  }
}
