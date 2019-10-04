package typings.atStorybookPreact.atStorybookPreactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryObject extends js.Object {
  var name: String
  var render: RenderFunction
}

object StoryObject {
  @scala.inline
  def apply(name: String, render: RenderFunction): StoryObject = {
    val __obj = js.Dynamic.literal(name = name, render = render)
  
    __obj.asInstanceOf[StoryObject]
  }
}

