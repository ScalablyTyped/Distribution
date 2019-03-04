package typings
package pugLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: java.lang.String
  var dependencies: js.Array[java.lang.String]
}

object Anon_Body {
  @scala.inline
  def apply(body: java.lang.String, dependencies: js.Array[java.lang.String]): Anon_Body = {
    val __obj = js.Dynamic.literal(body = body, dependencies = dependencies)
  
    __obj.asInstanceOf[Anon_Body]
  }
}

