package typings.storybookAddonStoryshots

import typings.storybookAddonStoryshots.anon.PickTestMethodOptionsstor
import typings.storybookAddonStoryshots.anon.Renderer
import typings.storybookAddonStoryshots.storyshotsOptionsMod.StoryshotsTestMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/addon-storyshots/dist/test-bodies", JSImport.Namespace)
@js.native
object testBodiesMod extends js.Object {
  
  def multiSnapshotWithOptions(): StoryshotsTestMethod = js.native
  def multiSnapshotWithOptions(options: js.Object): StoryshotsTestMethod = js.native
  
  val renderOnly: StoryshotsTestMethod = js.native
  
  def renderWithOptions(): StoryshotsTestMethod = js.native
  def renderWithOptions(options: js.Object): StoryshotsTestMethod = js.native
  
  val shallowSnapshot: StoryshotsTestMethod = js.native
  
  val snapshot: SnapshotsWithOptionsReturnType = js.native
  
  def snapshotWithOptions(): SnapshotsWithOptionsReturnType = js.native
  def snapshotWithOptions(options: js.Function): SnapshotsWithOptionsReturnType = js.native
  def snapshotWithOptions(options: Renderer): SnapshotsWithOptionsReturnType = js.native
  
  type SnapshotsWithOptionsReturnType = js.Function1[/* options */ PickTestMethodOptionsstor, js.Any]
}
