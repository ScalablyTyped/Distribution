package typings.revalidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Revalidator {
  import org.scalablytyped.runtime.StringDictionary

  type ISchemas[T] = StringDictionary[ISchema[T] | JSONSchema[T]]
}
