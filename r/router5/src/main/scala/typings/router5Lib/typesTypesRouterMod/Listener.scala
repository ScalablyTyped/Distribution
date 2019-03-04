package typings
package router5Lib.typesTypesRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Listener
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  def next(`val`: js.Any): js.Object
}

object Listener {
  @scala.inline
  def apply(
    next: js.Function1[js.Any, js.Object],
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Listener = {
    val __obj = js.Dynamic.literal(next = next)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Listener]
  }
}

