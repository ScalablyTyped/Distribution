package typings.rehypeDashReact.rehypeDashReactMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ComponentType
import typings.rehypeDashReact.Fn_A
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var components: StringDictionary[ComponentType[_]]
  var createElement: Fn_A
  var prefix: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(components: StringDictionary[ComponentType[_]], createElement: Fn_A, prefix: String = null): Options = {
    val __obj = js.Dynamic.literal(components = components, createElement = createElement)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[Options]
  }
}

