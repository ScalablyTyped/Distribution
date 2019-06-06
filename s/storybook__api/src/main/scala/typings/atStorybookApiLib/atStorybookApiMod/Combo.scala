package typings
package atStorybookApiLib.atStorybookApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Combo extends js.Object {
  var api: API
  var state: State
}

object Combo {
  @scala.inline
  def apply(api: API, state: State): Combo = {
    val __obj = js.Dynamic.literal(api = api, state = state)
  
    __obj.asInstanceOf[Combo]
  }
}

