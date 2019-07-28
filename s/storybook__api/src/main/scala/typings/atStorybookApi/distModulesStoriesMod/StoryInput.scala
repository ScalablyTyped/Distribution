package typings.atStorybookApi.distModulesStoriesMod

import typings.atStorybookApi.Anon_Filename
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryInput extends js.Object {
  var children: js.Array[String]
  var id: StoryId
  var isLeaf: Boolean
  var kind: String
  var name: String
  var parameters: Anon_Filename
}

object StoryInput {
  @scala.inline
  def apply(
    children: js.Array[String],
    id: StoryId,
    isLeaf: Boolean,
    kind: String,
    name: String,
    parameters: Anon_Filename
  ): StoryInput = {
    val __obj = js.Dynamic.literal(children = children, id = id, isLeaf = isLeaf, kind = kind, name = name, parameters = parameters)
  
    __obj.asInstanceOf[StoryInput]
  }
}

