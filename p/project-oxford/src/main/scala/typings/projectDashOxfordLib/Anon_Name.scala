package typings
package projectDashOxfordLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: java.lang.String
  var score: scala.Double
}

object Anon_Name {
  @scala.inline
  def apply(name: java.lang.String, score: scala.Double): Anon_Name = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("score")(score)
    __obj.asInstanceOf[Anon_Name]
  }
}

