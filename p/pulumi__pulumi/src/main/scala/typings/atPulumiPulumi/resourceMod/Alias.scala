package typings.atPulumiPulumi.resourceMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alias extends js.Object {
  /**
    * The previous name of the resource.  If not provided, the current name of the resource is
    * used.
    */
  var name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The previous parent of the resource.  If not provided (i.e. `{ name: "foo" }`), the current
    * parent of the resource is used (`opts.parent` if provided, else the implicit stack resource
    * parent).
    *
    * To specify no original parent, use `{ parent: pulumi.rootStackResource }`.
    */
  var parent: js.UndefOr[Resource | Input[URN]] = js.undefined
  /**
    * The previous project of the resource. If not provided, defaults to `pulumi.getProject()`.
    */
  var project: js.UndefOr[Input[String]] = js.undefined
  /**
    * The previous stack of the resource.  If not provided, defaults to `pulumi.getStack()`.
    */
  var stack: js.UndefOr[Input[String]] = js.undefined
  /**
    * The previous type of the resource.  If not provided, the current type of the resource is used.
    */
  var `type`: js.UndefOr[Input[String]] = js.undefined
}

object Alias {
  @scala.inline
  def apply(
    name: Input[String] = null,
    parent: Resource | Input[URN] = null,
    project: Input[String] = null,
    stack: Input[String] = null,
    `type`: Input[String] = null
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

