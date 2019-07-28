package typings.reduxDashPersist.esTypesMod

import typings.redux.reduxMod.StoreEnhancer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistorOptions extends js.Object {
  var enhancer: js.UndefOr[StoreEnhancer[_, js.Object]] = js.undefined
}

object PersistorOptions {
  @scala.inline
  def apply(enhancer: StoreEnhancer[_, js.Object] = null): PersistorOptions = {
    val __obj = js.Dynamic.literal()
    if (enhancer != null) __obj.updateDynamic("enhancer")(enhancer)
    __obj.asInstanceOf[PersistorOptions]
  }
}

