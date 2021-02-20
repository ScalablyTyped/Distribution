package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getDelegationSetMod {
  
  @JSImport("@pulumi/aws/route53/getDelegationSet", "getDelegationSet")
  @js.native
  def getDelegationSet(args: GetDelegationSetArgs): js.Promise[GetDelegationSetResult] = js.native
  @JSImport("@pulumi/aws/route53/getDelegationSet", "getDelegationSet")
  @js.native
  def getDelegationSet(args: GetDelegationSetArgs, opts: InvokeOptions): js.Promise[GetDelegationSetResult] = js.native
  
  @js.native
  trait GetDelegationSetArgs extends StObject {
    
    /**
      * The Hosted Zone id of the desired delegation set.
      */
    val id: String = js.native
  }
  object GetDelegationSetArgs {
    
    @scala.inline
    def apply(id: String): GetDelegationSetArgs = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDelegationSetArgs]
    }
    
    @scala.inline
    implicit class GetDelegationSetArgsMutableBuilder[Self <: GetDelegationSetArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetDelegationSetResult extends StObject {
    
    val callerReference: String = js.native
    
    val id: String = js.native
    
    val nameServers: js.Array[String] = js.native
  }
  object GetDelegationSetResult {
    
    @scala.inline
    def apply(callerReference: String, id: String, nameServers: js.Array[String]): GetDelegationSetResult = {
      val __obj = js.Dynamic.literal(callerReference = callerReference.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], nameServers = nameServers.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDelegationSetResult]
    }
    
    @scala.inline
    implicit class GetDelegationSetResultMutableBuilder[Self <: GetDelegationSetResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallerReference(value: String): Self = StObject.set(x, "callerReference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameServers(value: js.Array[String]): Self = StObject.set(x, "nameServers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameServersVarargs(value: String*): Self = StObject.set(x, "nameServers", js.Array(value :_*))
    }
  }
}
