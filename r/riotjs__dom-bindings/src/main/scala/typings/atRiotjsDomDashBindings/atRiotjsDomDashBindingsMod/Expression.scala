package typings.atRiotjsDomDashBindings.atRiotjsDomDashBindingsMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expression[Scope] extends js.Object {
  var node: HTMLElement
  var `type`: ExpressionType
  var value: js.Any
  def mount(scope: Scope): Expression[_]
  def unmount(scope: Scope): Expression[_]
  def update(scope: Scope): Expression[_]
}

object Expression {
  @scala.inline
  def apply[Scope](
    mount: Scope => Expression[_],
    node: HTMLElement,
    `type`: ExpressionType,
    unmount: Scope => Expression[_],
    update: Scope => Expression[_],
    value: js.Any
  ): Expression[Scope] = {
    val __obj = js.Dynamic.literal(mount = js.Any.fromFunction1(mount), node = node.asInstanceOf[js.Any], unmount = js.Any.fromFunction1(unmount), update = js.Any.fromFunction1(update), value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression[Scope]]
  }
}

