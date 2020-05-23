package typings.qlik.anon

import typings.qlik.qlikStrings.data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Uses extends js.Object {
  var uses: data
}

object Uses {
  @scala.inline
  def apply(uses: data): Uses = {
    val __obj = js.Dynamic.literal(uses = uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uses]
  }
}

