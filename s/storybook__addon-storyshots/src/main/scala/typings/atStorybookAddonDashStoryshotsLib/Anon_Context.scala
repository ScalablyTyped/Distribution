package typings
package atStorybookAddonDashStoryshotsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context extends js.Object {
  var context: atStorybookAddonDashStoryshotsLib.atStorybookAddonDashStoryshotsMod.StoryContext
  var renderShallowTree: atStorybookAddonDashStoryshotsLib.atStorybookAddonDashStoryshotsMod.RenderTree
  var renderTree: atStorybookAddonDashStoryshotsLib.atStorybookAddonDashStoryshotsMod.RenderTree
  var snapshotFileName: java.lang.String
  var story: atStorybookReactLib.atStorybookReactMod.StoryObject
}

object Anon_Context {
  @scala.inline
  def apply(
    context: atStorybookAddonDashStoryshotsLib.atStorybookAddonDashStoryshotsMod.StoryContext,
    renderShallowTree: atStorybookAddonDashStoryshotsLib.atStorybookAddonDashStoryshotsMod.RenderTree,
    renderTree: atStorybookAddonDashStoryshotsLib.atStorybookAddonDashStoryshotsMod.RenderTree,
    snapshotFileName: java.lang.String,
    story: atStorybookReactLib.atStorybookReactMod.StoryObject
  ): Anon_Context = {
    val __obj = js.Dynamic.literal(context = context, renderShallowTree = renderShallowTree, renderTree = renderTree, snapshotFileName = snapshotFileName, story = story)
  
    __obj.asInstanceOf[Anon_Context]
  }
}

