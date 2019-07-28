package typings.stellarDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Publickey extends js.Object {
  var public_key: String
  var weight: Double
}

object Anon_Publickey {
  @scala.inline
  def apply(public_key: String, weight: Double): Anon_Publickey = {
    val __obj = js.Dynamic.literal(public_key = public_key, weight = weight)
  
    __obj.asInstanceOf[Anon_Publickey]
  }
}

