package typings.atPulumiAws

import typings.atPulumiAws.ec2TenancyMod.Tenancy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/tenancy", JSImport.Namespace)
@js.native
object ec2TenancyMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.atPulumiAws.atPulumiAwsStrings.default
    - typings.atPulumiAws.atPulumiAwsStrings.dedicated
  */
  trait Tenancy extends js.Object
  
  val DedicatedTenancy: Tenancy = js.native
  val DefaultTenancy: Tenancy = js.native
  @js.native
  object Tenancies extends js.Object {
    val DedicatedTenancy: Tenancy = js.native
    val DefaultTenancy: Tenancy = js.native
  }
  
}

