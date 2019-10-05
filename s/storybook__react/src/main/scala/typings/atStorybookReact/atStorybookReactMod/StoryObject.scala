package typings.atStorybookReact.atStorybookReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryObject extends js.Object {
  var name: String
  var render: RenderFunction
}

object StoryObject {
  @scala.inline
  def apply(name: String, render: () => Renderable | js.Array[Renderable]): StoryObject = {
    val __obj = js.Dynamic.literal(name = name, render = js.Any.fromFunction0(render))
  
    __obj.asInstanceOf[StoryObject]
  }
}

