package typings.reactPopper.mod

import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceChildrenProps extends js.Object {
  // React refs are supposed to be contravariant (allows a more general type to be passed rather than a more specific one)
  // However, Typescript currently can't infer that fact for refs
  // See https://github.com/microsoft/TypeScript/issues/30748 for more information
  var ref: Ref[_]
}

object ReferenceChildrenProps {
  @scala.inline
  def apply(ref: Ref[_] = null): ReferenceChildrenProps = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceChildrenProps]
  }
}

