package typings.primereact

import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FormData extends js.Object {
  var formData: js.Any
  var xhr: XMLHttpRequest
}

object Anon_FormData {
  @scala.inline
  def apply(formData: js.Any, xhr: XMLHttpRequest): Anon_FormData = {
    val __obj = js.Dynamic.literal(formData = formData, xhr = xhr)
  
    __obj.asInstanceOf[Anon_FormData]
  }
}

