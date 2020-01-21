package typings.rehypeReact.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.rehypeReact.FnA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var components: StringDictionary[ComponentType[_]]
  var createElement: FnA
  var prefix: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(components: StringDictionary[ComponentType[_]], createElement: FnA, prefix: String = null): Options = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], createElement = createElement.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

