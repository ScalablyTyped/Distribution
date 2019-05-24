package typings
package soapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name[T] extends js.Object {
  var name: T
  var prefix: java.lang.String
}

object Anon_Name {
  @scala.inline
  def apply[T](name: T, prefix: java.lang.String): Anon_Name[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], prefix = prefix)
  
    __obj.asInstanceOf[Anon_Name[T]]
  }
}

