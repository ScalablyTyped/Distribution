package typings.slackWinston.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("slack-winston", "Format")
@js.native
class Format () extends js.Object {
  def this(opts: js.Object) = this()
  
  var options: js.UndefOr[js.Object] = js.native
  
  def transform(info: TransformableInfo): TransformableInfo | Boolean = js.native
  def transform(info: TransformableInfo, opts: js.Any): TransformableInfo | Boolean = js.native
}
