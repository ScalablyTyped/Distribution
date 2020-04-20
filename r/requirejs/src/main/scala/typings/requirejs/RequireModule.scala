package typings.requirejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// todo: not sure what to do with this guy
trait RequireModule extends js.Object {
  /**
  	*
  	**/
  def config(): js.Object
}

object RequireModule {
  @scala.inline
  def apply(config: () => js.Object): RequireModule = {
    val __obj = js.Dynamic.literal(config = js.Any.fromFunction0(config))
    __obj.asInstanceOf[RequireModule]
  }
}

