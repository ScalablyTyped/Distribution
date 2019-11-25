package typings.atStorybookAddonDashActions.distModelsActionDisplayMod

import typings.atStorybookAddonDashActions.Anon_Args
import typings.atStorybookAddonDashActions.distModelsActionOptionsMod.ActionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionDisplay extends js.Object {
  var count: Double
  var data: Anon_Args
  var id: String
  var options: ActionOptions
}

object ActionDisplay {
  @scala.inline
  def apply(count: Double, data: Anon_Args, id: String, options: ActionOptions): ActionDisplay = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionDisplay]
  }
}

