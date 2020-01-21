package typings.storybookAddonStoryshots

import typings.std.Partial
import typings.storybookAddonStoryshots.stories2SnapsConverterMod.Stories2SnapsConverterOptions
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
    def this(options: Partial[Stories2SnapsConverterOptions]) = this()
  }
  
  def default(): Unit = js.native
  def default(options: StoryshotsOptions): Unit = js.native
  def multiSnapshotWithOptions(): js.Function1[
    /* hasStoryContextRenderTreeStories2snapsConverter */ AnonContextRenderTree, 
    Unit | js.Promise[Unit]
  ] = js.native
  def multiSnapshotWithOptions(options: js.Object): js.Function1[
    /* hasStoryContextRenderTreeStories2snapsConverter */ AnonContextRenderTree, 
    Unit | js.Promise[Unit]
  ] = js.native
  def renderOnly(hasStoryContextRenderTree: AnonContextRenderTreeStory): js.Any = js.native
  def renderWithOptions(): js.Function1[/* hasStoryContextRenderTree */ AnonContextRenderTreeStory, _] = js.native
  def renderWithOptions(options: js.Object): js.Function1[/* hasStoryContextRenderTree */ AnonContextRenderTreeStory, _] = js.native
  def shallowSnapshot(hasStoryContextRenderShallowTreeOptions: AnonContextOptions): Unit = js.native
  def snapshot(hasStoryContextRenderTreeSnapshotFileName: AnonContext): Unit | js.Promise[Unit] = js.native
  def snapshotWithOptions(): js.Function1[
    /* hasStoryContextRenderTreeSnapshotFileName */ AnonContext, 
    Unit | js.Promise[Unit]
  ] = js.native
  def snapshotWithOptions(options: js.Function): js.Function1[
    /* hasStoryContextRenderTreeSnapshotFileName */ AnonContext, 
    Unit | js.Promise[Unit]
  ] = js.native
  def snapshotWithOptions(options: AnonRenderer): js.Function1[
    /* hasStoryContextRenderTreeSnapshotFileName */ AnonContext, 
    Unit | js.Promise[Unit]
  ] = js.native
}

