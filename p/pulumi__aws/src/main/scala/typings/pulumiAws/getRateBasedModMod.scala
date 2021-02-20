package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getRateBasedModMod {
  
  @JSImport("@pulumi/aws/wafregional/getRateBasedMod", "getRateBasedMod")
  @js.native
  def getRateBasedMod(args: GetRateBasedModArgs): js.Promise[GetRateBasedModResult] = js.native
  @JSImport("@pulumi/aws/wafregional/getRateBasedMod", "getRateBasedMod")
  @js.native
  def getRateBasedMod(args: GetRateBasedModArgs, opts: InvokeOptions): js.Promise[GetRateBasedModResult] = js.native
  
  @js.native
  trait GetRateBasedModArgs extends StObject {
    
    /**
      * The name of the WAF Regional rate based rule.
      */
    val name: String = js.native
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
  
  @js.native
  trait GetRateBasedModResult extends StObject {
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val name: String = js.native
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
