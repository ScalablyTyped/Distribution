package typings.rsocketTypes.anon

import typings.rsocketTypes.reactiveSocketTypesMod.ConnectionStatus
import typings.rsocketTypes.rsocketTypesStrings.NOT_CONNECTED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Kind extends ConnectionStatus {
  var kind: NOT_CONNECTED
}

object Kind {
  @scala.inline
  def apply(kind: NOT_CONNECTED): Kind = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Kind]
  }
}

