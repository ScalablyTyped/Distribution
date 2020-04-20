package typings.rsocketTypes

import typings.rsocketTypes.reactiveSocketTypesMod.ConnectionStatus
import typings.rsocketTypes.rsocketTypesStrings.CLOSED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon2 extends ConnectionStatus {
  var kind: CLOSED
}

object Anon2 {
  @scala.inline
  def apply(kind: CLOSED): Anon2 = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon2]
  }
}

