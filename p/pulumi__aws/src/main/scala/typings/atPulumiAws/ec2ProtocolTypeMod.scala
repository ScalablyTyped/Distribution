package typings.atPulumiAws

import typings.atPulumiAws.ec2ProtocolTypeMod.ProtocolType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/protocolType", JSImport.Namespace)
@js.native
object ec2ProtocolTypeMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.atPulumiAws.atPulumiAwsStrings.all
    - typings.atPulumiAws.atPulumiAwsStrings.icmp
    - typings.atPulumiAws.atPulumiAwsStrings.tcp
    - typings.atPulumiAws.atPulumiAwsStrings.udp
  */
  trait ProtocolType extends js.Object
  
  val AllProtocols: ProtocolType = js.native
  val ICMPProtocol: ProtocolType = js.native
  val TCPProtocol: ProtocolType = js.native
  val UDPProtocol: ProtocolType = js.native
}

