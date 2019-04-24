package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_File extends js.Object {
  var file: js.UndefOr[Anon_Path] = js.undefined
}

object Anon_File {
  @scala.inline
  def apply(file: Anon_Path = null): Anon_File = {
    val __obj = js.Dynamic.literal()
    if (file != null) __obj.updateDynamic("file")(file)
    __obj.asInstanceOf[Anon_File]
  }
}

