package typings.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeParserType[T] extends js.Object {
  /**
    * Value of "pg_type"."typname" (e.g. "int8", "timestamp", "timestamptz")
    */
  var name: String = js.native
  def parse(value: String): T = js.native
}

object TypeParserType {
  @scala.inline
  def apply[T](name: String, parse: String => T): TypeParserType[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse))
    __obj.asInstanceOf[TypeParserType[T]]
  }
  @scala.inline
  implicit class TypeParserTypeOps[Self <: TypeParserType[_], T] (val x: Self with TypeParserType[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParse(value: String => T): Self = this.set("parse", js.Any.fromFunction1(value))
  }
  
}

