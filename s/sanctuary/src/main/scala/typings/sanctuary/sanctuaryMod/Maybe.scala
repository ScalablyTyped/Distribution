package typings.sanctuary.sanctuaryMod

import typings.sanctuary.Anon_SanctuaryMaybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Maybe[A] extends js.Object {
  var constructor: Anon_SanctuaryMaybe
}

object Maybe {
  @scala.inline
  def apply[A](constructor: Anon_SanctuaryMaybe): Maybe[A] = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Maybe[A]]
  }
}

