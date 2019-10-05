package typings.atPulumiAws

import typings.atPulumiAws.albIpAddressTypeMod.IpAddressType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/alb/ipAddressType", JSImport.Namespace)
@js.native
object albIpAddressTypeMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.atPulumiAws.atPulumiAwsStrings.ipv4
    - typings.atPulumiAws.atPulumiAwsStrings.dualstack
  */
  trait IpAddressType extends js.Object
  
  val Dualstack: IpAddressType = js.native
  val Ipv4: IpAddressType = js.native
}

