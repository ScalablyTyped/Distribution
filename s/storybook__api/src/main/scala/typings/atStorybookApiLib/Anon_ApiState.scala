package typings
package atStorybookApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApiState extends js.Object {
  var api: atStorybookApiLib.distModulesAddonsMod.SubAPI
  var state: Anon_SelectedPanel
}

object Anon_ApiState {
  @scala.inline
  def apply(api: atStorybookApiLib.distModulesAddonsMod.SubAPI, state: Anon_SelectedPanel): Anon_ApiState = {
    val __obj = js.Dynamic.literal(api = api, state = state)
  
    __obj.asInstanceOf[Anon_ApiState]
  }
}

