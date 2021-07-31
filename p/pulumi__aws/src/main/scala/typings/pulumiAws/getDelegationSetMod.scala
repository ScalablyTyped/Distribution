package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getDelegationSetMod {
  
  @JSImport("@pulumi/aws/route53/getDelegationSet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getDelegationSet(args: GetDelegationSetArgs): js.Promise[GetDelegationSetResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDelegationSet")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetDelegationSetResult]]
  @scala.inline
  def getDelegationSet(args: GetDelegationSetArgs, opts: InvokeOptions): js.Promise[GetDelegationSetResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDelegationSet")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetDelegationSetResult]]
  
  trait GetDelegationSetArgs extends StObject {
    
    /**
      * The Hosted Zone id of the desired delegation set.
      */
    val id: String
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
  
  trait GetDelegationSetResult extends StObject {
    
    val callerReference: String
    
    val id: String
    
    val nameServers: js.Array[String]
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
