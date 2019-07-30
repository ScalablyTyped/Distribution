package typings.atPulumiPulumi.resourceMod

import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/resource", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val rootStackResource: Resource = js.native
  def createUrn(name: Input[String], `type`: Input[String]): Output[String] = js.native
  def createUrn(name: Input[String], `type`: Input[String], parent: Input[URN]): Output[String] = js.native
  def createUrn(name: Input[String], `type`: Input[String], parent: Input[URN], project: String): Output[String] = js.native
  def createUrn(name: Input[String], `type`: Input[String], parent: Input[URN], project: String, stack: String): Output[String] = js.native
  def createUrn(name: Input[String], `type`: Input[String], parent: Resource): Output[String] = js.native
  def createUrn(name: Input[String], `type`: Input[String], parent: Resource, project: String): Output[String] = js.native
  def createUrn(name: Input[String], `type`: Input[String], parent: Resource, project: String, stack: String): Output[String] = js.native
  def mergeOptions(): CustomResourceOptions = js.native
  def mergeOptions(opts1: js.UndefOr[scala.Nothing], opts2: ComponentResourceOptions): ComponentResourceOptions = js.native
  def mergeOptions(opts1: js.UndefOr[scala.Nothing], opts2: CustomResourceOptions): CustomResourceOptions = js.native
  def mergeOptions(opts1: js.UndefOr[scala.Nothing], opts2: ResourceOptions): ResourceOptions = js.native
  def mergeOptions(opts1: ComponentResourceOptions): ComponentResourceOptions = js.native
  def mergeOptions(opts1: ComponentResourceOptions, opts2: ComponentResourceOptions): ComponentResourceOptions = js.native
  def mergeOptions(opts1: CustomResourceOptions): CustomResourceOptions = js.native
  def mergeOptions(opts1: CustomResourceOptions, opts2: CustomResourceOptions): CustomResourceOptions = js.native
  def mergeOptions(opts1: ResourceOptions): ResourceOptions = js.native
  def mergeOptions(opts1: ResourceOptions, opts2: ResourceOptions): ResourceOptions = js.native
  @JSName("mergeOptions")
  def mergeOptions_ComponentResourceOptions(): ComponentResourceOptions = js.native
  @JSName("mergeOptions")
  def mergeOptions_ResourceOptions(): ResourceOptions = js.native
}

