package typings.storybookAddonStoryshots.stories2SnapsConverterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stories2SnapsConverterOptions extends js.Object {
  var snapshotExtension: String
  var snapshotsDirName: String
  var storiesExtensions: js.Array[String]
}

object Stories2SnapsConverterOptions {
  @scala.inline
  def apply(snapshotExtension: String, snapshotsDirName: String, storiesExtensions: js.Array[String]): Stories2SnapsConverterOptions = {
    val __obj = js.Dynamic.literal(snapshotExtension = snapshotExtension.asInstanceOf[js.Any], snapshotsDirName = snapshotsDirName.asInstanceOf[js.Any], storiesExtensions = storiesExtensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stories2SnapsConverterOptions]
  }
}

