package typings.pulumiAws

import typings.pulumiAws.pulumiAwsStrings.application
import typings.pulumiAws.pulumiAwsStrings.dualstack
import typings.pulumiAws.pulumiAwsStrings.ipv4
import typings.pulumiAws.pulumiAwsStrings.network
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enumsAlbMod {
  
  /* Inlined { readonly Ipv4 :'ipv4',  readonly Dualstack :'dualstack'}[keyof { readonly Ipv4 :'ipv4',  readonly Dualstack :'dualstack'}] */
  /* Rewritten from type alias, can be one of: 
    - typings.pulumiAws.pulumiAwsStrings.ipv4
    - typings.pulumiAws.pulumiAwsStrings.dualstack
  */
  trait IpAddressType extends StObject
  object IpAddressType {
    
    @JSImport("@pulumi/aws/types/enums/alb", "IpAddressType.Dualstack")
    @js.native
    val Dualstack: dualstack = js.native
    
    @JSImport("@pulumi/aws/types/enums/alb", "IpAddressType.Ipv4")
    @js.native
    val Ipv4: ipv4 = js.native
  }
  
  /* Inlined { readonly Application :'application',  readonly Network :'network'}[keyof { readonly Application :'application',  readonly Network :'network'}] */
  /* Rewritten from type alias, can be one of: 
    - typings.pulumiAws.pulumiAwsStrings.application
    - typings.pulumiAws.pulumiAwsStrings.network
  */
  trait LoadBalancerType extends StObject
  object LoadBalancerType {
    
    @JSImport("@pulumi/aws/types/enums/alb", "LoadBalancerType.Application")
    @js.native
    val Application: application = js.native
    
    @JSImport("@pulumi/aws/types/enums/alb", "LoadBalancerType.Network")
    @js.native
    val Network: network = js.native
  }
}
