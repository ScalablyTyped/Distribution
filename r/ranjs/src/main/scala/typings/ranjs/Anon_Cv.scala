package typings.ranjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cv extends js.Object {
  var cv: Double
  var mean: Double
  var std: Double
}

object Anon_Cv {
  @scala.inline
  def apply(cv: Double, mean: Double, std: Double): Anon_Cv = {
    val __obj = js.Dynamic.literal(cv = cv, mean = mean, std = std)
  
    __obj.asInstanceOf[Anon_Cv]
  }
}

