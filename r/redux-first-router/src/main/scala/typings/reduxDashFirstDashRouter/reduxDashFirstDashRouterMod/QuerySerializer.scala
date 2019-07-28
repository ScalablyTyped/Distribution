package typings.reduxDashFirstDashRouter.reduxDashFirstDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuerySerializer extends js.Object {
  def parse(queryString: String): js.Object
  def stringify(params: Params): String
}

object QuerySerializer {
  @scala.inline
  def apply(parse: String => js.Object, stringify: Params => String): QuerySerializer = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), stringify = js.Any.fromFunction1(stringify))
  
    __obj.asInstanceOf[QuerySerializer]
  }
}

