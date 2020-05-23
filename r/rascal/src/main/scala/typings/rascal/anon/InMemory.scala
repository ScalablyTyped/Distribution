package typings.rascal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InMemory extends js.Object {
  var inMemory: Size
}

object InMemory {
  @scala.inline
  def apply(inMemory: Size): InMemory = {
    val __obj = js.Dynamic.literal(inMemory = inMemory.asInstanceOf[js.Any])
    __obj.asInstanceOf[InMemory]
  }
}

