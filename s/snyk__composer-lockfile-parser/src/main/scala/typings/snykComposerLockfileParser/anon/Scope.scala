package typings.snykComposerLockfileParser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scope extends js.Object {
  var scope: js.UndefOr[typings.snykComposerLockfileParser.typesMod.Scope] = js.undefined
}

object Scope {
  @scala.inline
  def apply(scope: typings.snykComposerLockfileParser.typesMod.Scope = null): Scope = {
    val __obj = js.Dynamic.literal()
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scope]
  }
}

