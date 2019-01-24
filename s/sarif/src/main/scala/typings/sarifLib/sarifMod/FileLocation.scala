package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileLocation extends js.Object {
  /**
    * Key/value pairs that provide additional information about the file location.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * A string containing a valid relative or absolute URI.
    */
  var uri: java.lang.String
  /**
    * A string which indirectly specifies the absolute URI with respect to which a relative URI in the "uri"
    * property is interpreted.
    */
  var uriBaseId: js.UndefOr[java.lang.String] = js.undefined
}

