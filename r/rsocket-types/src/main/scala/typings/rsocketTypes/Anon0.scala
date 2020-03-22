package typings.rsocketTypes

import typings.rsocketTypes.reactiveSocketTypesMod.ConnectionStatus
import typings.rsocketTypes.rsocketTypesStrings.CONNECTING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0 extends ConnectionStatus {
  var kind: CONNECTING
}

object Anon0 {
  @scala.inline
  def apply(kind: CONNECTING): Anon0 = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon0]
  }
}

