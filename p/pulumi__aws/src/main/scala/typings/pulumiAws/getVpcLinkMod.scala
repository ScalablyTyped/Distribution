package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getVpcLinkMod {
  
  @JSImport("@pulumi/aws/apigateway/getVpcLink", "getVpcLink")
  @js.native
  def getVpcLink(args: GetVpcLinkArgs): js.Promise[GetVpcLinkResult] = js.native
  @JSImport("@pulumi/aws/apigateway/getVpcLink", "getVpcLink")
  @js.native
  def getVpcLink(args: GetVpcLinkArgs, opts: InvokeOptions): js.Promise[GetVpcLinkResult] = js.native
  
  @js.native
  trait GetVpcLinkArgs extends StObject {
    
    /**
      * The name of the API Gateway VPC Link to look up. If no API Gateway VPC Link is found with this name, an error will be returned.
      * If multiple API Gateway VPC Links are found with this name, an error will be returned.
      */
    val name: String = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetVpcLinkArgs {
    
    @scala.inline
    def apply(name: String): GetVpcLinkArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetVpcLinkArgs]
    }
    
    @scala.inline
    implicit class GetVpcLinkArgsMutableBuilder[Self <: GetVpcLinkArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetVpcLinkResult extends StObject {
    
    /**
      * The description of the VPC link.
      */
    val description: String = js.native
    
    /**
      * Set to the ID of the found API Gateway VPC Link.
      */
    val id: String = js.native
    
    val name: String = js.native
    
    /**
      * The status of the VPC link.
      */
    val status: String = js.native
    
    /**
      * The status message of the VPC link.
      */
    val statusMessage: String = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: StringDictionary[String] = js.native
    
    /**
      * The list of network load balancer arns in the VPC targeted by the VPC link. Currently AWS only supports 1 target.
      */
    val targetArns: js.Array[String] = js.native
  }
  object GetVpcLinkResult {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class GetVpcLinkResultMutableBuilder[Self <: GetVpcLinkResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetArns(value: js.Array[String]): Self = StObject.set(x, "targetArns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetArnsVarargs(value: String*): Self = StObject.set(x, "targetArns", js.Array(value :_*))
    }
  }
}
