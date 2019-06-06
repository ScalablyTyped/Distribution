package typings
package atStorybookApiLib.distModulesStoriesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryInput extends js.Object {
  var children: js.Array[java.lang.String]
  var id: StoryId
  var isLeaf: scala.Boolean
  var kind: java.lang.String
  var name: java.lang.String
  var parameters: atStorybookApiLib.Anon_Filename
}

object StoryInput {
  @scala.inline
  def apply(
    children: js.Array[java.lang.String],
    id: StoryId,
    isLeaf: scala.Boolean,
    kind: java.lang.String,
    name: java.lang.String,
    parameters: atStorybookApiLib.Anon_Filename
  ): StoryInput = {
    val __obj = js.Dynamic.literal(children = children, id = id, isLeaf = isLeaf, kind = kind, name = name, parameters = parameters)
  
    __obj.asInstanceOf[StoryInput]
  }
}

