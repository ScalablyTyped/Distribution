package typings.atPulumiAws.ec2transitgatewayMod

import typings.atPulumiAws.ec2transitgatewayGetDirectConnectGatewayAttachmentMod.GetDirectConnectGatewayAttachmentArgs
import typings.atPulumiAws.ec2transitgatewayGetDirectConnectGatewayAttachmentMod.GetDirectConnectGatewayAttachmentResult
import typings.atPulumiAws.ec2transitgatewayGetRouteTableMod.GetRouteTableArgs
import typings.atPulumiAws.ec2transitgatewayGetRouteTableMod.GetRouteTableResult
import typings.atPulumiAws.ec2transitgatewayGetTransitGatewayMod.GetTransitGatewayArgs
import typings.atPulumiAws.ec2transitgatewayGetTransitGatewayMod.GetTransitGatewayResult
import typings.atPulumiAws.ec2transitgatewayGetVpcAttachmentMod.GetVpcAttachmentArgs
import typings.atPulumiAws.ec2transitgatewayGetVpcAttachmentMod.GetVpcAttachmentResult
import typings.atPulumiAws.ec2transitgatewayGetVpnAttachmentMod.GetVpnAttachmentArgs
import typings.atPulumiAws.ec2transitgatewayGetVpnAttachmentMod.GetVpnAttachmentResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2transitgateway", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getDirectConnectGatewayAttachment(args: GetDirectConnectGatewayAttachmentArgs): js.Promise[GetDirectConnectGatewayAttachmentResult] with GetDirectConnectGatewayAttachmentResult = js.native
  def getDirectConnectGatewayAttachment(args: GetDirectConnectGatewayAttachmentArgs, opts: InvokeOptions): js.Promise[GetDirectConnectGatewayAttachmentResult] with GetDirectConnectGatewayAttachmentResult = js.native
  def getRouteTable(): js.Promise[GetRouteTableResult] with GetRouteTableResult = js.native
  def getRouteTable(args: GetRouteTableArgs): js.Promise[GetRouteTableResult] with GetRouteTableResult = js.native
  def getRouteTable(args: GetRouteTableArgs, opts: InvokeOptions): js.Promise[GetRouteTableResult] with GetRouteTableResult = js.native
  def getTransitGateway(): js.Promise[GetTransitGatewayResult] with GetTransitGatewayResult = js.native
  def getTransitGateway(args: GetTransitGatewayArgs): js.Promise[GetTransitGatewayResult] with GetTransitGatewayResult = js.native
  def getTransitGateway(args: GetTransitGatewayArgs, opts: InvokeOptions): js.Promise[GetTransitGatewayResult] with GetTransitGatewayResult = js.native
  def getVpcAttachment(): js.Promise[GetVpcAttachmentResult] with GetVpcAttachmentResult = js.native
  def getVpcAttachment(args: GetVpcAttachmentArgs): js.Promise[GetVpcAttachmentResult] with GetVpcAttachmentResult = js.native
  def getVpcAttachment(args: GetVpcAttachmentArgs, opts: InvokeOptions): js.Promise[GetVpcAttachmentResult] with GetVpcAttachmentResult = js.native
  def getVpnAttachment(args: GetVpnAttachmentArgs): js.Promise[GetVpnAttachmentResult] with GetVpnAttachmentResult = js.native
  def getVpnAttachment(args: GetVpnAttachmentArgs, opts: InvokeOptions): js.Promise[GetVpnAttachmentResult] with GetVpnAttachmentResult = js.native
}

