package typings.atStorybookAddonDashStoryshots.atStorybookAddonDashStoryshotsMod

import typings.atStorybookAddonDashStoryshots.Anon_Kind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageSnapshotOptions extends js.Object {
  var context: Anon_Kind
  var url: String
}

object ImageSnapshotOptions {
  @scala.inline
  def apply(context: Anon_Kind, url: String): ImageSnapshotOptions = {
    val __obj = js.Dynamic.literal(context = context, url = url)
  
    __obj.asInstanceOf[ImageSnapshotOptions]
  }
}

