package typings.sanctuary.mod

import typings.sanctuary.AnonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Maybe[A] extends js.Object {
  var constructor: AnonType
}

object Maybe {
  @scala.inline
  def apply[A](constructor: AnonType): Maybe[A] = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Maybe[A]]
  }
}

