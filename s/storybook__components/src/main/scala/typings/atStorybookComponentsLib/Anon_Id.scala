package typings
package atStorybookComponentsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  def onSelect(id: java.lang.String): scala.Unit
}

object Anon_Id {
  @scala.inline
  def apply(onSelect: java.lang.String => scala.Unit): Anon_Id = {
    val __obj = js.Dynamic.literal(onSelect = js.Any.fromFunction1(onSelect))
  
    __obj.asInstanceOf[Anon_Id]
  }
}

