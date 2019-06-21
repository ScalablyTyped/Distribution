package typings
package atPulumiPulumiLib.resourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/resource", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val rootStackResource: Resource = js.native
  def createUrn(
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def createUrn(
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    parent: atPulumiPulumiLib.outputMod.Input[URN]
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def createUrn(
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    parent: atPulumiPulumiLib.outputMod.Input[URN],
    project: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def createUrn(
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    parent: atPulumiPulumiLib.outputMod.Input[URN],
    project: java.lang.String,
    stack: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def createUrn(
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    parent: Resource
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def createUrn(
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    parent: Resource,
    project: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def createUrn(
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    parent: Resource,
    project: java.lang.String,
    stack: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

