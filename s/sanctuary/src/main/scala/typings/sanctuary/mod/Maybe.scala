package typings.sanctuary.mod

import typings.sanctuary.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Maybe[A] extends js.Object {
  var constructor: Type
}

object Maybe {
  @scala.inline
  def apply[A](constructor: Type): Maybe[A] = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Maybe[A]]
  }
}

