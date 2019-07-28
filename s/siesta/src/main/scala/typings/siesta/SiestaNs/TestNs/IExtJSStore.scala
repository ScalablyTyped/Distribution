package typings.siesta.SiestaNs.TestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @mixin
  */
@js.native
trait IExtJSStore extends js.Object {
  def isStoreEmpty(store: js.Any): Unit = js.native
  def isStoreEmpty(store: js.Any, description: String): Unit = js.native
  def loadStoresAndThen(args: js.Any*): Unit = js.native
  def waitForStoresToLoad(args: js.Any*): Unit = js.native
}

