package typings.atStorybookApi

import typings.atStorybookApi.atStorybookApiMod.API
import typings.atStorybookApi.atStorybookApiMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Api extends js.Object {
  var api: API
  var state: State
}

object Anon_Api {
  @scala.inline
  def apply(api: API, state: State): Anon_Api = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Api]
  }
}

