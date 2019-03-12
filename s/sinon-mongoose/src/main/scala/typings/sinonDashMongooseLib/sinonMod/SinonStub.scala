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
  def apply(chain: java.lang.String => sinonLib.sinonMod.SinonNs.SinonStub): SinonStub = {
    val __obj = js.Dynamic.literal(chain = js.Any.fromFunction1(chain))
  
    __obj.asInstanceOf[SinonStub]
  }
}

