package typings.reactDashJsonschemaDashForm

import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var content: ReactElement
  var disabled: Boolean
  var name: String
  var readonly: Boolean
}

object Anon_Content {
  @scala.inline
  def apply(content: ReactElement, disabled: Boolean, name: String, readonly: Boolean): Anon_Content = {
    val __obj = js.Dynamic.literal(content = content, disabled = disabled, name = name, readonly = readonly)
  
    __obj.asInstanceOf[Anon_Content]
  }
}

