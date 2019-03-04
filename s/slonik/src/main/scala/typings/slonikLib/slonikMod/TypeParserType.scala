package typings
package slonikLib.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeParserType[T] extends js.Object {
  /**
    * Value of "pg_type"."typname" (e.g. "int8", "timestamp", "timestamptz")
    */
  var name: java.lang.String
  def parse(value: java.lang.String): T
}

object TypeParserType {
  @scala.inline
  def apply[T](name: java.lang.String, parse: js.Function1[java.lang.String, T]): TypeParserType[T] = {
    val __obj = js.Dynamic.literal(name = name, parse = parse)
  
    __obj.asInstanceOf[TypeParserType[T]]
  }
}

