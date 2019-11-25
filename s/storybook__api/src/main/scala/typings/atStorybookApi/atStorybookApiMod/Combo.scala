package typings.atStorybookApi.atStorybookApiMod

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
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Combo]
  }
}

