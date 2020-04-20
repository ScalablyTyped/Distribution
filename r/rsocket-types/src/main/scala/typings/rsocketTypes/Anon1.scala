package typings.rsocketTypes

import typings.rsocketTypes.reactiveSocketTypesMod.ConnectionStatus
import typings.rsocketTypes.rsocketTypesStrings.CONNECTED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1 extends ConnectionStatus {
  var kind: CONNECTED
}

object Anon1 {
  @scala.inline
  def apply(kind: CONNECTED): Anon1 = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon1]
  }
}

