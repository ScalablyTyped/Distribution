package typings.pulumiAws

import typings.pulumiAws.enumsEc2Mod.Tenancy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tenancyMod {
  
  @JSImport("@pulumi/aws/ec2/tenancy", "DedicatedTenancy")
  @js.native
  val DedicatedTenancy: Tenancy = js.native
  
  @JSImport("@pulumi/aws/ec2/tenancy", "DefaultTenancy")
  @js.native
  val DefaultTenancy: Tenancy = js.native
  
  object Tenancies {
    
    /** Use Tenancy.Dedicated instead. */
    @JSImport("@pulumi/aws/ec2/tenancy", "Tenancies.DedicatedTenancy")
    @js.native
    val DedicatedTenancy: Tenancy = js.native
    
    /** Use Tenancy.Default instead. */
    @JSImport("@pulumi/aws/ec2/tenancy", "Tenancies.DefaultTenancy")
    @js.native
    val DefaultTenancy: Tenancy = js.native
  }
}
