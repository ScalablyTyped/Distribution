package typings.snykDockerPlugin.extractorTypesMod

import typings.node.Buffer
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtractAction extends js.Object {
  var actionName: String
  var callback: js.UndefOr[ExtractCallback] = js.undefined
  def filePathMatches(filePath: String): Boolean
}

object ExtractAction {
  @scala.inline
  def apply(
    actionName: String,
    filePathMatches: String => Boolean,
    callback: /* dataStream */ Readable => js.Promise[String | Buffer] = null
  ): ExtractAction = {
    val __obj = js.Dynamic.literal(actionName = actionName.asInstanceOf[js.Any], filePathMatches = js.Any.fromFunction1(filePathMatches))
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    __obj.asInstanceOf[ExtractAction]
  }
}

