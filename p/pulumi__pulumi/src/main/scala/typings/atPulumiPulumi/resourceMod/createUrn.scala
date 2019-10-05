package typings.atPulumiPulumi.resourceMod

import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/resource", "createUrn")
@js.native
object createUrn extends js.Object {
  def apply(name: Input[String], `type`: Input[String]): Output[String] = js.native
  def apply(name: Input[String], `type`: Input[String], parent: Input[URN]): Output[String] = js.native
  def apply(name: Input[String], `type`: Input[String], parent: Input[URN], project: String): Output[String] = js.native
  def apply(name: Input[String], `type`: Input[String], parent: Input[URN], project: String, stack: String): Output[String] = js.native
  def apply(name: Input[String], `type`: Input[String], parent: Resource): Output[String] = js.native
  def apply(name: Input[String], `type`: Input[String], parent: Resource, project: String): Output[String] = js.native
  def apply(name: Input[String], `type`: Input[String], parent: Resource, project: String, stack: String): Output[String] = js.native
}

