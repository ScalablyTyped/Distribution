package typings
package sinonDashMongooseLib.sinonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinonStub extends js.Object {
  /**
    * When called, the stub will create a new stub to represent a mongoose chained function.
    */
  def chain(name: java.lang.String): sinonLib.sinonMod.SinonNs.SinonStub
}

object SinonStub {
  @scala.inline
  def apply(chain: js.Function1[java.lang.String, sinonLib.sinonMod.SinonNs.SinonStub]): SinonStub = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("chain")(chain)
    __obj.asInstanceOf[SinonStub]
  }
}

