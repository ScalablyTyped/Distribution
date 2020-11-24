package typings.pulumiAws

import typings.pulumiAws.pulumiAwsStrings.application
import typings.pulumiAws.pulumiAwsStrings.dualstack
import typings.pulumiAws.pulumiAwsStrings.ipv4
import typings.pulumiAws.pulumiAwsStrings.network
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/types/enums/alb", JSImport.Namespace)
@js.native
object enumsAlbMod extends js.Object {
  
  /* Inlined { readonly Ipv4 :'ipv4',  readonly Dualstack :'dualstack'}[keyof { readonly Ipv4 :'ipv4',  readonly Dualstack :'dualstack'}] */
  /* Rewritten from type alias, can be one of: 
    - typings.pulumiAws.pulumiAwsStrings.ipv4
    - typings.pulumiAws.pulumiAwsStrings.dualstack
  */
  trait IpAddressType extends js.Object
  @js.native
  object IpAddressType extends js.Object {
    
    val Dualstack: dualstack = js.native
    
    val Ipv4: ipv4 = js.native
  }
  
  /* Inlined { readonly Application :'application',  readonly Network :'network'}[keyof { readonly Application :'application',  readonly Network :'network'}] */
  /* Rewritten from type alias, can be one of: 
    - typings.pulumiAws.pulumiAwsStrings.application
    - typings.pulumiAws.pulumiAwsStrings.network
  */
  trait LoadBalancerType extends js.Object
  @js.native
  object LoadBalancerType extends js.Object {
    
    val Application: application = js.native
    
    val Network: network = js.native
  }
}
