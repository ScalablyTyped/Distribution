package typings.reactNavigationStack.maskedViewNativeMod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.ComponentProps</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RNCMaskedView * / any> & {  children  :react.react.ReactElement} */
trait Props extends js.Object {
  var children: ReactElement
}

object Props {
  @scala.inline
  def apply(children: ReactElement): Props = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Props]
  }
}

