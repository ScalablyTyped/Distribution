package typings.router5.typesTypesRouterMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Listener
  extends /* key */ StringDictionary[js.Any] {
  def next(`val`: js.Any): js.Object
}

object Listener {
  @scala.inline
  def apply(next: js.Any => js.Object, StringDictionary: /* key */ StringDictionary[js.Any] = null): Listener = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction1(next))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Listener]
  }
}

