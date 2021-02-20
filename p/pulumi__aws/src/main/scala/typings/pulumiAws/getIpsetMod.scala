package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getIpsetMod {
  
  @JSImport("@pulumi/aws/wafregional/getIpset", "getIpset")
  @js.native
  def getIpset(args: GetIpsetArgs): js.Promise[GetIpsetResult] = js.native
  @JSImport("@pulumi/aws/wafregional/getIpset", "getIpset")
  @js.native
  def getIpset(args: GetIpsetArgs, opts: InvokeOptions): js.Promise[GetIpsetResult] = js.native
  
  @js.native
  trait GetIpsetArgs extends StObject {
    
    /**
      * The name of the WAF Regional IP set.
      */
    val name: String = js.native
  }
  object GetIpsetArgs {
    
    @scala.inline
    def apply(name: String): GetIpsetArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetIpsetArgs]
    }
    
    @scala.inline
    implicit class GetIpsetArgsMutableBuilder[Self <: GetIpsetArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetIpsetResult extends StObject {
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val name: String = js.native
  }
  object GetIpsetResult {
    
    @scala.inline
    def apply(id: String, name: String): GetIpsetResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetIpsetResult]
    }
    
    @scala.inline
    implicit class GetIpsetResultMutableBuilder[Self <: GetIpsetResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
