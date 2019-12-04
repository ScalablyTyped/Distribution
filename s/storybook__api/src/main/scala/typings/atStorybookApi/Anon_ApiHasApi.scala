package typings.atStorybookApi

import typings.atStorybookApi.atStorybookApiMod.API
import typings.atStorybookApi.distModulesShortcutsMod.SubAPI
import typings.atStorybookApi.distModulesShortcutsMod.SubState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApiHasApi extends js.Object {
  var api: SubAPI
  var state: SubState
  def init(hasApi: API): Unit
}

object Anon_ApiHasApi {
  @scala.inline
  def apply(api: SubAPI, init: API => Unit, state: SubState): Anon_ApiHasApi = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], init = js.Any.fromFunction1(init), state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ApiHasApi]
  }
}

