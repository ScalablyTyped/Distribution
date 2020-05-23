package typings.snykComposerLockfileParser.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposerExtras extends js.Object {
  var `branch-alias`: StringDictionary[String]
}

object ComposerExtras {
  @scala.inline
  def apply(`branch-alias`: StringDictionary[String]): ComposerExtras = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("branch-alias")(`branch-alias`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposerExtras]
  }
}

