package typings.atStorybookAddonDashStoryshots

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-storyshots/dist/test-bodies", JSImport.Namespace)
@js.native
object distTestDashBodiesMod extends js.Object {
  def multiSnapshotWithOptions(): js.Function1[
    /* hasStoryContextRenderTreeStories2snapsConverter */ Anon_ContextRenderTree, 
    Unit | js.Promise[Unit]
  ] = js.native
  def multiSnapshotWithOptions(options: js.Object): js.Function1[
    /* hasStoryContextRenderTreeStories2snapsConverter */ Anon_ContextRenderTree, 
    Unit | js.Promise[Unit]
  ] = js.native
  def renderOnly(hasStoryContextRenderTree: Anon_ContextRenderTreeStory): js.Any = js.native
  def renderWithOptions(): js.Function1[/* hasStoryContextRenderTree */ Anon_ContextRenderTreeStory, _] = js.native
  def renderWithOptions(options: js.Object): js.Function1[/* hasStoryContextRenderTree */ Anon_ContextRenderTreeStory, _] = js.native
  def shallowSnapshot(hasStoryContextRenderShallowTreeOptions: Anon_ContextOptions): Unit = js.native
  def snapshot(hasStoryContextRenderTreeSnapshotFileName: Anon_Context): Unit | js.Promise[Unit] = js.native
  def snapshotWithOptions(): js.Function1[
    /* hasStoryContextRenderTreeSnapshotFileName */ Anon_Context, 
    Unit | js.Promise[Unit]
  ] = js.native
  def snapshotWithOptions(options: js.Function): js.Function1[
    /* hasStoryContextRenderTreeSnapshotFileName */ Anon_Context, 
    Unit | js.Promise[Unit]
  ] = js.native
  def snapshotWithOptions(options: Anon_Renderer): js.Function1[
    /* hasStoryContextRenderTreeSnapshotFileName */ Anon_Context, 
    Unit | js.Promise[Unit]
  ] = js.native
}

