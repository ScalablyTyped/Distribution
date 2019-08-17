package typings.revalidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RevalidatorNs {
  import org.scalablytyped.runtime.StringDictionary

  type ISchemas[T] = StringDictionary[ISchema[T] | JSONSchema[T]]
}
