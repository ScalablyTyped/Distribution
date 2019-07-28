package typings.radius.radiusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link https://github.com/retailnext/node-radius#radiusencodeargs} for more info.
  **/
trait EncodeArgs extends js.Object {
  var add_message_authenticator: js.UndefOr[Boolean] = js.undefined
  /**
    * This can be an object: { attribute_name: attribute_value, ... }, 
    * an array within an array: [ [ attribute_name, attribute_value ], ... ],
    * or if you haven't loaded a dictionary for the attributes: [ [ attribute_id, Buffer ], ... ].
    * 
    * Tag field-attributes can be specified like so: [ [ attribute_name, tag_number, attribute_value ] ... ]
    **/
  var attributes: js.UndefOr[js.Any] = js.undefined
  var code: String
  var identifier: js.UndefOr[Double] = js.undefined
  var secret: String
}

object EncodeArgs {
  @scala.inline
  def apply(
    code: String,
    secret: String,
    add_message_authenticator: js.UndefOr[Boolean] = js.undefined,
    attributes: js.Any = null,
    identifier: Int | Double = null
  ): EncodeArgs = {
    val __obj = js.Dynamic.literal(code = code, secret = secret)
    if (!js.isUndefined(add_message_authenticator)) __obj.updateDynamic("add_message_authenticator")(add_message_authenticator)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodeArgs]
  }
}

