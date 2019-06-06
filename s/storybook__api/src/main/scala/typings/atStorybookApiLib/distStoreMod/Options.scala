package typings
package atStorybookApiLib.distStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var persistence: atStorybookApiLib.atStorybookApiLibStrings.none | atStorybookApiLib.atStorybookApiLibStrings.session | java.lang.String
}

object Options {
  @scala.inline
  def apply(
    persistence: atStorybookApiLib.atStorybookApiLibStrings.none | atStorybookApiLib.atStorybookApiLibStrings.session | java.lang.String
  ): Options = {
    val __obj = js.Dynamic.literal(persistence = persistence.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

