package typings.pulumiPulumi.resourceMod

import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/resource", "createUrn")
@js.native
object createUrn extends js.Object {
  def apply(name: Input[String], `type`: Input[String]): Output_[String] = js.native
  def apply(
    name: Input[String],
    `type`: Input[String],
    parent: js.UndefOr[Input[URN]],
    project: js.UndefOr[scala.Nothing],
    stack: String
  ): Output_[String] = js.native
  def apply(name: Input[String], `type`: Input[String], parent: js.UndefOr[Input[URN]], project: String): Output_[String] = js.native
  def apply(
    name: Input[String],
    `type`: Input[String],
    parent: js.UndefOr[Input[URN]],
    project: String,
    stack: String
  ): Output_[String] = js.native
  def apply(name: Input[String], `type`: Input[String], parent: Input[URN]): Output_[String] = js.native
  def apply(name: Input[String], `type`: Input[String], parent: Resource): Output_[String] = js.native
  def apply(
    name: Input[String],
    `type`: Input[String],
    parent: Resource,
    project: js.UndefOr[scala.Nothing],
    stack: String
  ): Output_[String] = js.native
  def apply(name: Input[String], `type`: Input[String], parent: Resource, project: String): Output_[String] = js.native
  def apply(name: Input[String], `type`: Input[String], parent: Resource, project: String, stack: String): Output_[String] = js.native
}

