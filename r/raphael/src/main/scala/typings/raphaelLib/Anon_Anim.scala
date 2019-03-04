package typings
package raphaelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Anim extends js.Object {
  var anim: RaphaelAnimation
  var status: scala.Double
}

object Anon_Anim {
  @scala.inline
  def apply(anim: RaphaelAnimation, status: scala.Double): Anon_Anim = {
    val __obj = js.Dynamic.literal(anim = anim, status = status)
  
    __obj.asInstanceOf[Anon_Anim]
  }
}

