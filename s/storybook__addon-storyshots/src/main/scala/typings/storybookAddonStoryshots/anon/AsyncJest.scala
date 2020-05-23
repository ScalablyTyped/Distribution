package typings.storybookAddonStoryshots.anon

import typings.std.RegExp
import typings.storybookAddonStoryshots.stories2SnapsConverterMod.Stories2SnapsConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncJest extends js.Object {
  var asyncJest: Boolean = js.native
  var integrityOptions: Boolean | Absolute = js.native
  var snapshotSerializers: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.SnapshotSerializerPlugin */ _
  ] = js.native
  var stories2snapsConverter: Stories2SnapsConverter = js.native
  var storyKindRegex: String | RegExp = js.native
  var storyNameRegex: String | RegExp = js.native
  var suite: String = js.native
  def testMethod(
    story: js.Any,
    context: js.Any,
    renderTree: typings.storybookAddonStoryshots.frameworksLoaderMod.RenderTree
  ): js.Any = js.native
  def testMethod(
    story: js.Any,
    context: js.Any,
    renderTree: typings.storybookAddonStoryshots.frameworksLoaderMod.RenderTree,
    options: js.Any
  ): js.Any = js.native
}

