package typings.reactDashNative

import typings.reactDashNative.reactDashNativeMod.ViewToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Changed extends js.Object {
  var changed: js.Array[ViewToken]
  var viewableItems: js.Array[ViewToken]
}

object Anon_Changed {
  @scala.inline
  def apply(changed: js.Array[ViewToken], viewableItems: js.Array[ViewToken]): Anon_Changed = {
    val __obj = js.Dynamic.literal(changed = changed, viewableItems = viewableItems)
  
    __obj.asInstanceOf[Anon_Changed]
  }
}

