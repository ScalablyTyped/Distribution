package typings.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeParserType[T] extends js.Object {
  /**
    * Value of "pg_type"."typname" (e.g. "int8", "timestamp", "timestamptz")
    */
  var name: String
  def parse(value: String): T
}

object TypeParserType {
  @scala.inline
  def apply[T](name: String, parse: String => T): TypeParserType[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse))
    __obj.asInstanceOf[TypeParserType[T]]
  }
}

