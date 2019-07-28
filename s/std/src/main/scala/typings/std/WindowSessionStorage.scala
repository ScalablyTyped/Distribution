package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowSessionStorage extends js.Object {
  val sessionStorage: Storage
}

object WindowSessionStorage {
  @scala.inline
  def apply(sessionStorage: Storage): WindowSessionStorage = {
    val __obj = js.Dynamic.literal(sessionStorage = sessionStorage)
  
    __obj.asInstanceOf[WindowSessionStorage]
  }
}

