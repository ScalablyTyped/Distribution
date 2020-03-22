package typings.storybookApi.storiesMod

import typings.storybookApi.AnonDictparameterName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryInput extends js.Object {
  var children: js.Array[String]
  var id: StoryId
  var isLeaf: Boolean
  var kind: String
  var name: String
  var parameters: AnonDictparameterName
}

object StoryInput {
  @scala.inline
  def apply(
    children: js.Array[String],
    id: StoryId,
    isLeaf: Boolean,
    kind: String,
    name: String,
    parameters: AnonDictparameterName
  ): StoryInput = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isLeaf = isLeaf.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StoryInput]
  }
}

