package typings.riot.riotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RiotComponentShell[P, S] extends js.Object {
  val css: js.UndefOr[String] = js.undefined
  val exports: js.UndefOr[js.Function0[(RiotComponentExport[P, S]) | js.Object]] = js.undefined
  val name: js.UndefOr[String] = js.undefined
  // TODO: add the @riotjs/dom-bindings types
  def template(): js.Any
}

object RiotComponentShell {
  @scala.inline
  def apply[P, S](
    template: () => js.Any,
    css: String = null,
    exports: () => (RiotComponentExport[P, S]) | js.Object = null,
    name: String = null
  ): RiotComponentShell[P, S] = {
    val __obj = js.Dynamic.literal(template = js.Any.fromFunction0(template))
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (exports != null) __obj.updateDynamic("exports")(js.Any.fromFunction0(exports))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RiotComponentShell[P, S]]
  }
}

