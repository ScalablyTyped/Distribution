package typings
package sequelizeLib.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeferrableInitiallyDeferred extends DeferrableAbstract {
  /**
    * A property that will defer constraints checks to the end of transactions.
    */
  def apply(): DeferrableInitiallyDeferred = js.native
}

