package typings
package atStorybookReactLib.atStorybookReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryObject extends js.Object {
  var name: java.lang.String
  var render: RenderFunction
}

object StoryObject {
  @scala.inline
  def apply(name: java.lang.String, render: RenderFunction): StoryObject = {
    val __obj = js.Dynamic.literal(name = name, render = render)
  
    __obj.asInstanceOf[StoryObject]
  }
}

