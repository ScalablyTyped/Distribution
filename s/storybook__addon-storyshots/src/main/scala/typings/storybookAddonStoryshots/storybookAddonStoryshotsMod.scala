package typings.storybookAddonStoryshots

import typings.storybookAddonStoryshots.anon.Context
import typings.storybookAddonStoryshots.anon.Options
import typings.storybookAddonStoryshots.anon.PartialStories2SnapsConve
import typings.storybookAddonStoryshots.anon.RenderTree
import typings.storybookAddonStoryshots.anon.Renderer
import typings.storybookAddonStoryshots.anon.Story
import typings.storybookAddonStoryshots.storyshotsOptionsMod.StoryshotsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-storyshots", JSImport.Namespace)
@js.native
object storybookAddonStoryshotsMod extends js.Object {
  @js.native
  class Stories2SnapsConverter ()
    extends typings.storybookAddonStoryshots.stories2SnapsConverterMod.Stories2SnapsConverter {
    def this(options: PartialStories2SnapsConve) = this()
  }
  
  def default(): Unit = js.native
  def default(options: StoryshotsOptions): Unit = js.native
  def multiSnapshotWithOptions(): js.Function1[
    /* hasStoryContextRenderTreeStories2snapsConverter */ RenderTree, 
    Unit | js.Promise[Unit]
  ] = js.native
  def multiSnapshotWithOptions(options: js.Object): js.Function1[
    /* hasStoryContextRenderTreeStories2snapsConverter */ RenderTree, 
    Unit | js.Promise[Unit]
  ] = js.native
  def renderOnly(hasStoryContextRenderTree: Story): js.Any = js.native
  def renderWithOptions(): js.Function1[/* hasStoryContextRenderTree */ Story, _] = js.native
  def renderWithOptions(options: js.Object): js.Function1[/* hasStoryContextRenderTree */ Story, _] = js.native
  def shallowSnapshot(hasStoryContextRenderShallowTreeOptions: Options): Unit = js.native
  def snapshot(hasStoryContextRenderTreeSnapshotFileName: Context): Unit | js.Promise[Unit] = js.native
  def snapshotWithOptions(): js.Function1[/* hasStoryContextRenderTreeSnapshotFileName */ Context, Unit | js.Promise[Unit]] = js.native
  def snapshotWithOptions(options: js.Function): js.Function1[/* hasStoryContextRenderTreeSnapshotFileName */ Context, Unit | js.Promise[Unit]] = js.native
  def snapshotWithOptions(options: Renderer): js.Function1[/* hasStoryContextRenderTreeSnapshotFileName */ Context, Unit | js.Promise[Unit]] = js.native
}

