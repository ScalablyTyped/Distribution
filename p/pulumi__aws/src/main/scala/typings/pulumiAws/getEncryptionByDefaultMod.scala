package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getEncryptionByDefaultMod {
  
  @JSImport("@pulumi/aws/ebs/getEncryptionByDefault", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEncryptionByDefault(): js.Promise[GetEncryptionByDefaultResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEncryptionByDefault")().asInstanceOf[js.Promise[GetEncryptionByDefaultResult]]
  inline def getEncryptionByDefault(opts: InvokeOptions): js.Promise[GetEncryptionByDefaultResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEncryptionByDefault")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetEncryptionByDefaultResult]]
  
  trait GetEncryptionByDefaultResult extends StObject {
    
    /**
      * Whether or not default EBS encryption is enabled. Returns as `true` or `false`.
      */
    val enabled: Boolean
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
  }
  object GetEncryptionByDefaultResult {
    
    inline def apply(enabled: Boolean, id: String): GetEncryptionByDefaultResult = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetEncryptionByDefaultResult]
    }
    
    extension [Self <: GetEncryptionByDefaultResult](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
