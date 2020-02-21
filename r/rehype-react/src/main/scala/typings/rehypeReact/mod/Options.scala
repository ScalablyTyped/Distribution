package typings.rehypeReact.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.rehypeReact.AnonChildren
import typings.rehypeReact.FnA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var Fragment: js.UndefOr[ComponentType[AnonChildren]] = js.undefined
  var components: js.UndefOr[StringDictionary[ComponentType[_]]] = js.undefined
  var createElement: FnA
  var prefix: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    createElement: FnA,
    Fragment: ComponentType[AnonChildren] = null,
    components: StringDictionary[ComponentType[_]] = null,
    prefix: String = null
  ): Options = {
    val __obj = js.Dynamic.literal(createElement = createElement.asInstanceOf[js.Any])
    if (Fragment != null) __obj.updateDynamic("Fragment")(Fragment.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

