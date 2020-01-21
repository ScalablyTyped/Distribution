package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "SourceApplication")
@js.native
class SourceApplication () extends js.Object {
  /**
    * Read-only Square ID assigned to the application. Only used for [Product](#type-product) type `EXTERNAL_API`.
    */
  var application_id: js.UndefOr[String] = js.native
  /**
    * Read-only display name assigned to the application (e.g. "Custom Application", "Square POS 4.74 for Android").
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Read-only [Product](#type-product) type for the application. See [Product](#type-product) for possible values.
    */
  var product: js.UndefOr[ProductSourceType] = js.native
}

