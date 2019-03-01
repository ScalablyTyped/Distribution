package typings
package slonikLib.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientConfigurationType extends js.Object {
  var captureStackTrace: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An array of [Slonik interceptors](https://github.com/gajus/slonik#slonik-interceptors)
    */
  var interceptors: js.UndefOr[js.Array[InterceptorType]] = js.undefined
  /**
    * An array of [Slonik type parsers](https://github.com/gajus/slonik#slonik-type-parsers)
    */
  var typeParsers: js.UndefOr[js.Array[TypeParserType[_]]] = js.undefined
}

object ClientConfigurationType {
  @scala.inline
  def apply(
    captureStackTrace: js.UndefOr[scala.Boolean] = js.undefined,
    interceptors: js.Array[InterceptorType] = null,
    typeParsers: js.Array[TypeParserType[_]] = null
  ): ClientConfigurationType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(captureStackTrace)) __obj.updateDynamic("captureStackTrace")(captureStackTrace)
    if (interceptors != null) __obj.updateDynamic("interceptors")(interceptors)
    if (typeParsers != null) __obj.updateDynamic("typeParsers")(typeParsers)
    __obj.asInstanceOf[ClientConfigurationType]
  }
}

