package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var key: String
  var propagateAtLaunch: Boolean
  var value: String
}

object Anon_Key {
  @scala.inline
  def apply(key: String, propagateAtLaunch: Boolean, value: String): Anon_Key = {
    val __obj = js.Dynamic.literal(key = key, propagateAtLaunch = propagateAtLaunch, value = value)
  
    __obj.asInstanceOf[Anon_Key]
  }
}

