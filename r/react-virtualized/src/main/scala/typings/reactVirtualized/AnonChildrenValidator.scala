package typings.reactVirtualized

import typings.react.mod.ReactNode
import typings.react.mod.Validator
import typings.reactVirtualized.esScrollSyncMod.ScrollSyncChildProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildrenValidator extends js.Object {
  var children: Validator[js.Function1[/* props */ ScrollSyncChildProps, ReactNode]]
}

object AnonChildrenValidator {
  @scala.inline
  def apply(children: Validator[js.Function1[/* props */ ScrollSyncChildProps, ReactNode]]): AnonChildrenValidator = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildrenValidator]
  }
}

