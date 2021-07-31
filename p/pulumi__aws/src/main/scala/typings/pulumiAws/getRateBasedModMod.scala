package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getRateBasedModMod {
  
  @JSImport("@pulumi/aws/wafregional/getRateBasedMod", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getRateBasedMod(args: GetRateBasedModArgs): js.Promise[GetRateBasedModResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRateBasedMod")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetRateBasedModResult]]
  @scala.inline
  def getRateBasedMod(args: GetRateBasedModArgs, opts: InvokeOptions): js.Promise[GetRateBasedModResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRateBasedMod")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetRateBasedModResult]]
  
  trait GetRateBasedModArgs extends StObject {
    
    /**
      * The name of the WAF Regional rate based rule.
      */
    val name: String
  }
  object GetRateBasedModArgs {
    
    @scala.inline
    def apply(name: String): GetRateBasedModArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRateBasedModArgs]
    }
    
    @scala.inline
    implicit class GetRateBasedModArgsMutableBuilder[Self <: GetRateBasedModArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetRateBasedModResult extends StObject {
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val name: String
  }
  object GetRateBasedModResult {
    
    @scala.inline
    def apply(id: String, name: String): GetRateBasedModResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRateBasedModResult]
    }
    
    @scala.inline
    implicit class GetRateBasedModResultMutableBuilder[Self <: GetRateBasedModResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
