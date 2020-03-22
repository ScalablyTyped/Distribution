package typings.rascal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInMemory extends js.Object {
  var inMemory: AnonSize
}

object AnonInMemory {
  @scala.inline
  def apply(inMemory: AnonSize): AnonInMemory = {
    val __obj = js.Dynamic.literal(inMemory = inMemory.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInMemory]
  }
}

