package typings.storybookApi.storiesMod

import typings.storybookApi.AnonFilename
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @storybook/api.@storybook/api/dist/modules/stories.StoryInput & @storybook/api.@storybook/api/dist/modules/stories.Group */
trait Story extends js.Object {
  var children: js.Array[String] with js.Array[StoryId]
  var depth: Double
  var id: StoryId
  var isComponent: Boolean
  var isLeaf: Boolean
  var isRoot: Boolean
  var kind: String
  var name: String
  var parameters: AnonFilename
  var parent: StoryId
}

object Story {
  @scala.inline
  def apply(
    children: js.Array[String] with js.Array[StoryId],
    depth: Double,
    id: StoryId,
    isComponent: Boolean,
    isLeaf: Boolean,
    isRoot: Boolean,
    kind: String,
    name: String,
    parameters: AnonFilename,
    parent: StoryId
  ): Story = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isComponent = isComponent.asInstanceOf[js.Any], isLeaf = isLeaf.asInstanceOf[js.Any], isRoot = isRoot.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Story]
  }
}

