package typings.atStorybookApi

import typings.atStorybookApi.atStorybookApiMod.API
import typings.atStorybookApi.distModulesVersionsMod.SubAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApiHasApiInit extends js.Object {
  var api: SubAPI
  var state: Anon_DismissedVersionNotification
  def init(hasApi: API): js.Promise[Unit]
}

object Anon_ApiHasApiInit {
  @scala.inline
  def apply(api: SubAPI, init: API => js.Promise[Unit], state: Anon_DismissedVersionNotification): Anon_ApiHasApiInit = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], init = js.Any.fromFunction1(init), state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ApiHasApiInit]
  }
}

