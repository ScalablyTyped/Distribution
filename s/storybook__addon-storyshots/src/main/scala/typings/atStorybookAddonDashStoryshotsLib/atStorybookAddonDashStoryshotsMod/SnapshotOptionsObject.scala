package typings
package atStorybookAddonDashStoryshotsLib.atStorybookAddonDashStoryshotsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotOptionsObject extends js.Object {
  var createNodeMock: js.UndefOr[js.Function1[/* element */ js.Any, _]] = js.undefined
}

object SnapshotOptionsObject {
  @scala.inline
  def apply(createNodeMock: /* element */ js.Any => _ = null): SnapshotOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (createNodeMock != null) __obj.updateDynamic("createNodeMock")(js.Any.fromFunction1(createNodeMock))
    __obj.asInstanceOf[SnapshotOptionsObject]
  }
}

