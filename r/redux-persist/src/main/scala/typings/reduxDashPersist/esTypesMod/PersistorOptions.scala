package typings.reduxDashPersist.esTypesMod

import typings.redux.reduxMod.StoreEnhancer
import typings.redux.reduxMod.StoreEnhancerStoreCreator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistorOptions extends js.Object {
  var enhancer: js.UndefOr[StoreEnhancer[_, js.Object]] = js.undefined
}

object PersistorOptions {
  @scala.inline
  def apply(
    enhancer: /* next */ StoreEnhancerStoreCreator[js.Object, js.Object] => StoreEnhancerStoreCreator[_, js.Object] = null
  ): PersistorOptions = {
    val __obj = js.Dynamic.literal()
    if (enhancer != null) __obj.updateDynamic("enhancer")(js.Any.fromFunction1(enhancer))
    __obj.asInstanceOf[PersistorOptions]
  }
}

