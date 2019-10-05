package typings.sinonDashMongoose.sinonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinonStub extends js.Object {
  /**
    * When called, the stub will create a new stub to represent a mongoose chained function.
    */
  def chain(name: String): SinonStub
}

object SinonStub {
  @scala.inline
  def apply(chain: String => SinonStub): SinonStub = {
    val __obj = js.Dynamic.literal(chain = js.Any.fromFunction1(chain))
  
    __obj.asInstanceOf[SinonStub]
  }
}

