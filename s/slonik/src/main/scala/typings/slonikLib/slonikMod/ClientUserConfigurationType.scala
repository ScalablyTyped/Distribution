package typings
package slonikLib.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientUserConfigurationType[T] extends js.Object {
  /**
    * An array of [Slonik interceptors](https://github.com/gajus/slonik#slonik-interceptors)
    */
  var interceptors: js.UndefOr[js.Array[InterceptorType]] = js.undefined
  /**
    * An array of [Slonik type parsers](https://github.com/gajus/slonik#slonik-type-parsers)
    */
  var typeParsers: js.UndefOr[js.Array[TypeParserType[_]]] = js.undefined
}

object ClientUserConfigurationType {
  @scala.inline
  def apply[T](interceptors: js.Array[InterceptorType] = null, typeParsers: js.Array[TypeParserType[_]] = null): ClientUserConfigurationType[T] = {
    val __obj = js.Dynamic.literal()
    if (interceptors != null) __obj.updateDynamic("interceptors")(interceptors)
    if (typeParsers != null) __obj.updateDynamic("typeParsers")(typeParsers)
    __obj.asInstanceOf[ClientUserConfigurationType[T]]
  }
}

