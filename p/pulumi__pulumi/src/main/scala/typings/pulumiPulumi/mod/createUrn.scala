package typings.pulumiPulumi.mod

import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.URN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi", "createUrn")
@js.native
object createUrn extends js.Object {
  def apply(name: Input[String], `type`: Input[String]): typings.pulumiPulumi.outputMod.Output_[String] = js.native
  def apply(name: Input[String], `type`: Input[String], parent: Input[URN]): typings.pulumiPulumi.outputMod.Output_[String] = js.native
  def apply(name: Input[String], `type`: Input[String], parent: Input[URN], project: String): typings.pulumiPulumi.outputMod.Output_[String] = js.native
  def apply(name: Input[String], `type`: Input[String], parent: Input[URN], project: String, stack: String): typings.pulumiPulumi.outputMod.Output_[String] = js.native
  def apply(name: Input[String], `type`: Input[String], parent: typings.pulumiPulumi.resourceMod.Resource): typings.pulumiPulumi.outputMod.Output_[String] = js.native
  def apply(
    name: Input[String],
    `type`: Input[String],
    parent: typings.pulumiPulumi.resourceMod.Resource,
    project: String
  ): typings.pulumiPulumi.outputMod.Output_[String] = js.native
  def apply(
    name: Input[String],
    `type`: Input[String],
    parent: typings.pulumiPulumi.resourceMod.Resource,
    project: String,
    stack: String
  ): typings.pulumiPulumi.outputMod.Output_[String] = js.native
}

