package typings.pulumiAws

import typings.pulumiAws.enumsEc2Mod.Tenancy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2/tenancy", JSImport.Namespace)
@js.native
object tenancyMod extends js.Object {
  
  val DedicatedTenancy: Tenancy = js.native
  
  val DefaultTenancy: Tenancy = js.native
  
  @js.native
  object Tenancies extends js.Object {
    
    /** Use Tenancy.Dedicated instead. */
    val DedicatedTenancy: Tenancy = js.native
    
    /** Use Tenancy.Default instead. */
    val DefaultTenancy: Tenancy = js.native
  }
}
