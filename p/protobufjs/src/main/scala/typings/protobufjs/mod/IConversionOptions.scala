package typings.protobufjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConversionOptions extends js.Object {
  /** Sets empty arrays for missing repeated fields even if `defaults=false` */
  var arrays: js.UndefOr[Boolean] = js.undefined
  /**
    * Bytes value conversion type.
    * Valid values are `Array` and (a base64 encoded) `String` (the global types).
    * Defaults to copy the present value, which usually is a Buffer under node and an Uint8Array in the browser.
    */
  var bytes: js.UndefOr[js.Function] = js.undefined
  /** Also sets default values on the resulting object */
  var defaults: js.UndefOr[Boolean] = js.undefined
  /**
    * Enum value conversion type.
    * Only valid value is `String` (the global type).
    * Defaults to copy the present value, which is the numeric id.
    */
  var enums: js.UndefOr[js.Function] = js.undefined
  /** Performs additional JSON compatibility conversions, i.e. NaN and Infinity to strings */
  var json: js.UndefOr[Boolean] = js.undefined
  /**
    * Long conversion type.
    * Valid values are `String` and `Number` (the global types).
    * Defaults to copy the present value, which is a possibly unsafe number without and a {@link Long} with a long library.
    */
  var longs: js.UndefOr[js.Function] = js.undefined
  /** Sets empty objects for missing map fields even if `defaults=false` */
  var objects: js.UndefOr[Boolean] = js.undefined
  /** Includes virtual oneof properties set to the present field's name, if any */
  var oneofs: js.UndefOr[Boolean] = js.undefined
}

object IConversionOptions {
  @scala.inline
  def apply(
    arrays: js.UndefOr[Boolean] = js.undefined,
    bytes: js.Function = null,
    defaults: js.UndefOr[Boolean] = js.undefined,
    enums: js.Function = null,
    json: js.UndefOr[Boolean] = js.undefined,
    longs: js.Function = null,
    objects: js.UndefOr[Boolean] = js.undefined,
    oneofs: js.UndefOr[Boolean] = js.undefined
  ): IConversionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrays)) __obj.updateDynamic("arrays")(arrays.asInstanceOf[js.Any])
    if (bytes != null) __obj.updateDynamic("bytes")(bytes.asInstanceOf[js.Any])
    if (!js.isUndefined(defaults)) __obj.updateDynamic("defaults")(defaults.asInstanceOf[js.Any])
    if (enums != null) __obj.updateDynamic("enums")(enums.asInstanceOf[js.Any])
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (longs != null) __obj.updateDynamic("longs")(longs.asInstanceOf[js.Any])
    if (!js.isUndefined(objects)) __obj.updateDynamic("objects")(objects.asInstanceOf[js.Any])
    if (!js.isUndefined(oneofs)) __obj.updateDynamic("oneofs")(oneofs.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConversionOptions]
  }
}

