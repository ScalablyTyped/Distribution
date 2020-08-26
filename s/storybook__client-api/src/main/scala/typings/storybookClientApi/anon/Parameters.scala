package typings.storybookClientApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parameters extends js.Object {
  var parameters: js.Any = js.native
  var story: js.Any = js.native
}

object Parameters {
  @scala.inline
  def apply(parameters: js.Any, story: js.Any): Parameters = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters]
  }
  @scala.inline
  implicit class ParametersOps[Self <: Parameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParameters(value: js.Any): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setStory(value: js.Any): Self = this.set("story", value.asInstanceOf[js.Any])
  }
  
}

