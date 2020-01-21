package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "OrderSource")
@js.native
class OrderSource () extends js.Object {
  /**
    * The name used to identify the place (physical or digital) that an order originates.
    * If unset, the name defaults to the name of the application that created the order.
    */
  var name: js.UndefOr[String] = js.native
}

