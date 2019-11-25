package typings.selectize

import typings.selectize.Selectize.IApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLElement extends js.Object {
  var selectize: IApi[_, _]
}

object HTMLElement {
  @scala.inline
  def apply(selectize: IApi[_, _]): HTMLElement = {
    val __obj = js.Dynamic.literal(selectize = selectize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HTMLElement]
  }
}

