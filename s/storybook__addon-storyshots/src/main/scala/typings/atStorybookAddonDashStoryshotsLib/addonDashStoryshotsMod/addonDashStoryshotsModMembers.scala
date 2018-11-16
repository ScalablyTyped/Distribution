package typings
package atStorybookAddonDashStoryshotsLib.addonDashStoryshotsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-storyshots", JSImport.Namespace)
@js.native
object addonDashStoryshotsModMembers extends js.Object {
  val renderOnly: Test = js.native
  val shallowSnapshot: Test = js.native
  val snapshot: Test = js.native
  def default[Rendered](options: InitOptions[Rendered]): scala.Unit = js.native
  def getSnapshotFileName(context: StoryContext): java.lang.String = js.native
  def imageSnapshot(): Test = js.native
  def imageSnapshot(options: atStorybookAddonDashStoryshotsLib.Anon_GetGotoOptions): Test = js.native
  def multiSnapshotWithOptions(options: SnapshotOptions): Test = js.native
  def snapshotWithOptions(options: SnapshotOptions): Test = js.native
}

