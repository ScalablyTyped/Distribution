package typings.storybookAddonStoryshots

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-storyshots/dist/test-bodies", JSImport.Namespace)
@js.native
object testBodiesMod extends js.Object {
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

