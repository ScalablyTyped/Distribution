package typings.atStorybookApi

import typings.atStorybookApi.distModulesAddonsMod.SubAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApiState extends js.Object {
  var api: SubAPI
  var state: Anon_Addons
}

object Anon_ApiState {
  @scala.inline
  def apply(api: SubAPI, state: Anon_Addons): Anon_ApiState = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ApiState]
  }
}

