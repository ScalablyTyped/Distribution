package typings
package atStorybookAddonDashStoryshotsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Context extends js.Object {
  var context: atStorybookAddonDashStoryshotsLib.addonDashStoryshotsMod.StoryContext = js.native
  @JSName("renderShallowTree")
  var renderShallowTree_Original: atStorybookAddonDashStoryshotsLib.addonDashStoryshotsMod.RenderTree = js.native
  @JSName("renderTree")
  var renderTree_Original: atStorybookAddonDashStoryshotsLib.addonDashStoryshotsMod.RenderTree = js.native
  var snapshotFileName: java.lang.String = js.native
  var story: atStorybookReactLib.reactMod.StoryObject = js.native
  def renderShallowTree(
    story: atStorybookReactLib.reactMod.StoryObject,
    context: atStorybookAddonDashStoryshotsLib.addonDashStoryshotsMod.StoryContext
  ): js.UndefOr[scala.Unit | js.Promise[scala.Unit]] = js.native
  def renderShallowTree(
    story: atStorybookReactLib.reactMod.StoryObject,
    context: atStorybookAddonDashStoryshotsLib.addonDashStoryshotsMod.StoryContext,
    options: atStorybookAddonDashStoryshotsLib.addonDashStoryshotsMod.SnapshotOptions
  ): js.UndefOr[scala.Unit | js.Promise[scala.Unit]] = js.native
  def renderTree(
    story: atStorybookReactLib.reactMod.StoryObject,
    context: atStorybookAddonDashStoryshotsLib.addonDashStoryshotsMod.StoryContext
  ): js.UndefOr[scala.Unit | js.Promise[scala.Unit]] = js.native
  def renderTree(
    story: atStorybookReactLib.reactMod.StoryObject,
    context: atStorybookAddonDashStoryshotsLib.addonDashStoryshotsMod.StoryContext,
    options: atStorybookAddonDashStoryshotsLib.addonDashStoryshotsMod.SnapshotOptions
  ): js.UndefOr[scala.Unit | js.Promise[scala.Unit]] = js.native
}

