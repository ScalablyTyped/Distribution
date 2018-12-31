package typings
package radiusLib.radiusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link https://github.com/retailnext/node-radius#radiusencodeargs} for more info.
  **/
trait EncodeArgs extends js.Object {
  var add_message_authenticator: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This can be an object: { attribute_name: attribute_value, ... }, 
    * an array within an array: [ [ attribute_name, attribute_value ], ... ],
    * or if you haven't loaded a dictionary for the attributes: [ [ attribute_id, Buffer ], ... ].
    * 
    * Tag field-attributes can be specified like so: [ [ attribute_name, tag_number, attribute_value ] ... ]
    **/
  var attributes: js.UndefOr[js.Any] = js.undefined
  var code: java.lang.String
  var identifier: js.UndefOr[scala.Double] = js.undefined
  var secret: java.lang.String
}

