package typings.atStorybookAddonDashStoryshots

import typings.atStorybookAddonDashStoryshots.atStorybookAddonDashStoryshotsMod.RenderTree
import typings.atStorybookAddonDashStoryshots.atStorybookAddonDashStoryshotsMod.StoryContext
import typings.atStorybookReact.atStorybookReactMod.StoryObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context extends js.Object {
  var context: StoryContext
  var renderShallowTree: RenderTree
  var renderTree: RenderTree
  var snapshotFileName: String
  var story: StoryObject
}

object Anon_Context {
  @scala.inline
  def apply(
    context: StoryContext,
    renderShallowTree: RenderTree,
    renderTree: RenderTree,
    snapshotFileName: String,
    story: StoryObject
  ): Anon_Context = {
    val __obj = js.Dynamic.literal(context = context, renderShallowTree = renderShallowTree, renderTree = renderTree, snapshotFileName = snapshotFileName, story = story)
  
    __obj.asInstanceOf[Anon_Context]
  }
}

