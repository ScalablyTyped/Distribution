package typings
package atPulumiPulumiLib.resourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alias extends js.Object {
  /**
    * The previous name of the resource.  If not provided, the current name of the resource is used.
    */
  var name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The previous parent of the resource.  If not provided, the current parent of the resource is used
    * (`opts.parent` if provided, else the implicit stack resource parent).
    */
  var parent: js.UndefOr[Resource | atPulumiPulumiLib.outputMod.Input[URN]] = js.undefined
  /**
    * The previous project of the resource. If not provided, defaults to `pulumi.getProject()`.
    */
  var project: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The previous stack of the resource.  If not provided, defaults to `pulumi.getStack()`.
    */
  var stack: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The previous type of the resource.  If not provided, the current type of the resource is used.
    */
  var `type`: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Alias {
  @scala.inline
  def apply(
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    parent: Resource | atPulumiPulumiLib.outputMod.Input[URN] = null,
    project: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    stack: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Alias = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alias]
  }
}

