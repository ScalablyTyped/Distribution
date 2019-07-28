package typings.revalidator

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RevalidatorNs {
  type ISchemas[T] = StringDictionary[ISchema[T] | JSONSchema[T]]
}
