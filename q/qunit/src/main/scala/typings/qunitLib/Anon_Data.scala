package typings
package qunitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var maxDepth: scala.Double
  def parse(data: js.Any): java.lang.String
}

object Anon_Data {
  @scala.inline
  def apply(maxDepth: scala.Double, parse: js.Function1[js.Any, java.lang.String]): Anon_Data = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("maxDepth")(maxDepth)
    __obj.updateDynamic("parse")(parse)
    __obj.asInstanceOf[Anon_Data]
  }
}

