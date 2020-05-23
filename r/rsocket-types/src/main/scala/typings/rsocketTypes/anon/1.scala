package typings.rsocketTypes.anon

import typings.rsocketTypes.reactiveSocketTypesMod.ConnectionStatus
import typings.rsocketTypes.rsocketTypesStrings.CONNECTED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1` extends ConnectionStatus {
  var kind: CONNECTED
}

object `1` {
  @scala.inline
  def apply(kind: CONNECTED): `1` = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
}

