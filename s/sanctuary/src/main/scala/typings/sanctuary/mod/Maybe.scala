package typings.sanctuary.mod

import typings.sanctuary.AnonSanctuaryMaybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Maybe[A] extends js.Object {
  var constructor: AnonSanctuaryMaybe
}

object Maybe {
  @scala.inline
  def apply[A](constructor: AnonSanctuaryMaybe): Maybe[A] = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Maybe[A]]
  }
}

