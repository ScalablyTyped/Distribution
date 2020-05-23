package typings.rsocketTypes.anon

import typings.rsocketTypes.reactiveSocketTypesMod.ConnectionStatus
import typings.rsocketTypes.rsocketTypesStrings.CONNECTING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0` extends ConnectionStatus {
  var kind: CONNECTING
}

object `0` {
  @scala.inline
  def apply(kind: CONNECTING): `0` = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
}

