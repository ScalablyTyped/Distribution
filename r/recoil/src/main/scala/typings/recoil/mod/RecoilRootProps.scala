package typings.recoil.mod

import typings.recoil.anon.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecoilRootProps extends js.Object {
  var initializeState: js.UndefOr[js.Function1[/* options */ Set, Unit]] = js.undefined
}

object RecoilRootProps {
  @scala.inline
  def apply(initializeState: /* options */ Set => Unit = null): RecoilRootProps = {
    val __obj = js.Dynamic.literal()
    if (initializeState != null) __obj.updateDynamic("initializeState")(js.Any.fromFunction1(initializeState))
    __obj.asInstanceOf[RecoilRootProps]
  }
}

