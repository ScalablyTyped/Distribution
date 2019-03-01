package typings
package revalidatorLib.RevalidatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISchemas[T]
  extends /* index */ org.scalablytyped.runtime.StringDictionary[ISchema[T] | JSONSchema[T]]

object ISchemas {
  @scala.inline
  def apply[T](
    StringDictionary: /* index */ org.scalablytyped.runtime.StringDictionary[ISchema[T] | JSONSchema[T]] = null
  ): ISchemas[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ISchemas[T]]
  }
}

