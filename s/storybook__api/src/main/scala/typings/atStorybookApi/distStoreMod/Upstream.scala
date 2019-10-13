package typings.atStorybookApi.distStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Upstream extends js.Object {
  var getState: GetState
  var setState: SetState
}

object Upstream {
  @scala.inline
  def apply(
    getState: () => /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify State */ js.Any,
    setState: (/* a */ js.Any, /* b */ js.Any) => js.Any
  ): Upstream = {
    val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState), setState = js.Any.fromFunction2(setState))
  
    __obj.asInstanceOf[Upstream]
  }
}

