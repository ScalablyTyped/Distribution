package typings
package rehypeDashReactLib.rehypeDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var components: org.scalablytyped.runtime.StringDictionary[reactLib.reactMod.ComponentType[_]]
  var createElement: rehypeDashReactLib.Fn_A
  var prefix: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    components: org.scalablytyped.runtime.StringDictionary[reactLib.reactMod.ComponentType[_]],
    createElement: rehypeDashReactLib.Fn_A,
    prefix: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal(components = components, createElement = createElement)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[Options]
  }
}

