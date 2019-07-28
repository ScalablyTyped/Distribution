package typings.atStorybookComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  def onSelect(id: String): Unit
}

object Anon_Id {
  @scala.inline
  def apply(onSelect: String => Unit): Anon_Id = {
    val __obj = js.Dynamic.literal(onSelect = js.Any.fromFunction1(onSelect))
  
    __obj.asInstanceOf[Anon_Id]
  }
}

