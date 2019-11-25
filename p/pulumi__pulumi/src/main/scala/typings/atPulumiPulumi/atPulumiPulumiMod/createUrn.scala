package typings.atPulumiPulumi.atPulumiPulumiMod

import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.URN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi", "createUrn")
@js.native
object createUrn extends js.Object {
  def apply(name: Input[String], `type`: Input[String]): typings.atPulumiPulumi.outputMod.Output[String] = js.native
  def apply(name: Input[String], `type`: Input[String], parent: Input[URN]): typings.atPulumiPulumi.outputMod.Output[String] = js.native
  def apply(name: Input[String], `type`: Input[String], parent: Input[URN], project: String): typings.atPulumiPulumi.outputMod.Output[String] = js.native
  def apply(name: Input[String], `type`: Input[String], parent: Input[URN], project: String, stack: String): typings.atPulumiPulumi.outputMod.Output[String] = js.native
  def apply(name: Input[String], `type`: Input[String], parent: typings.atPulumiPulumi.resourceMod.Resource): typings.atPulumiPulumi.outputMod.Output[String] = js.native
  def apply(
    name: Input[String],
    `type`: Input[String],
    parent: typings.atPulumiPulumi.resourceMod.Resource,
    project: String
  ): typings.atPulumiPulumi.outputMod.Output[String] = js.native
  def apply(
    name: Input[String],
    `type`: Input[String],
    parent: typings.atPulumiPulumi.resourceMod.Resource,
    project: String,
    stack: String
  ): typings.atPulumiPulumi.outputMod.Output[String] = js.native
}

