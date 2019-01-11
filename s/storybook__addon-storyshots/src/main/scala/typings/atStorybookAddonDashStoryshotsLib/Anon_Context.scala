package typings
package atStorybookAddonDashStoryshotsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Context extends js.Object {
  var context: atStorybookAddonDashStoryshotsLib.atStorybookAddonDashStoryshotsMod.StoryContext = js.native
  @JSName("renderShallowTree")
  var renderShallowTree_Original: atStorybookAddonDashStoryshotsLib.atStorybookAddonDashStoryshotsMod.RenderTree = js.native
  @JSName("renderTree")
  var renderTree_Original: atStorybookAddonDashStoryshotsLib.atStorybookAddonDashStoryshotsMod.RenderTree = js.native
  var snapshotFileName: java.lang.String = js.native
  var story: atStorybookReactLib.atStorybookReactMod.StoryObject = js.native
  def renderShallowTree(
    story: atStorybookReactLib.atStorybookReactMod.StoryObject,
    context: atStorybookAddonDashStoryshotsLib.atStorybookAddonDashStoryshotsMod.StoryContext
  ): js.UndefOr[scala.Unit | js.Promise[scala.Unit]] = js.native
  def renderShallowTree(
    story: atStorybookReactLib.atStorybookReactMod.StoryObject,
    context: atStorybookAddonDashStoryshotsLib.atStorybookAddonDashStoryshotsMod.StoryContext,
    options: atStorybookAddonDashStoryshotsLib.atStorybookAddonDashStoryshotsMod.SnapshotOptions
  ): js.UndefOr[scala.Unit | js.Promise[scala.Unit]] = js.native
  def renderTree(
    story: atStorybookReactLib.atStorybookReactMod.StoryObject,
    context: atStorybookAddonDashStoryshotsLib.atStorybookAddonDashStoryshotsMod.StoryContext
  ): js.UndefOr[scala.Unit | js.Promise[scala.Unit]] = js.native
  def renderTree(
    story: atStorybookReactLib.atStorybookReactMod.StoryObject,
    context: atStorybookAddonDashStoryshotsLib.atStorybookAddonDashStoryshotsMod.StoryContext,
    options: atStorybookAddonDashStoryshotsLib.atStorybookAddonDashStoryshotsMod.SnapshotOptions
  ): js.UndefOr[scala.Unit | js.Promise[scala.Unit]] = js.native
}

