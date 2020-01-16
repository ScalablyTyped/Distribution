package typings.atStorybookAddonDashStoryshots

import typings.atStorybookAddonDashStoryshots.distFrameworksLoaderMod.RenderTree
import typings.atStorybookAddonDashStoryshots.distStories2SnapsConverterMod.Stories2SnapsConverter
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AsyncJest extends js.Object {
  var asyncJest: Boolean = js.native
  var integrityOptions: Boolean | Anon_Absolute = js.native
  var snapshotSerializers: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.SnapshotSerializerPlugin */ _
  ] = js.native
  var stories2snapsConverter: Stories2SnapsConverter = js.native
  var storyKindRegex: String | RegExp = js.native
  var storyNameRegex: String | RegExp = js.native
  var suite: String = js.native
  def testMethod(story: js.Any, context: js.Any, renderTree: RenderTree): js.Any = js.native
  def testMethod(story: js.Any, context: js.Any, renderTree: RenderTree, options: js.Any): js.Any = js.native
}

