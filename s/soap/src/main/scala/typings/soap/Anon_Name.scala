package typings.soap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name[T] extends js.Object {
  var name: T
  var prefix: String
}

object Anon_Name {
  @scala.inline
  def apply[T](name: T, prefix: String): Anon_Name[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Name[T]]
  }
}

