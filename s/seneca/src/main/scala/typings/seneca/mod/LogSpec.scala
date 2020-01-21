package typings.seneca.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.seneca.senecaStrings.quiet
  - typings.seneca.senecaStrings.silent
  - typings.seneca.senecaStrings.any
  - typings.seneca.senecaStrings.all
  - typings.seneca.senecaStrings.print
  - typings.seneca.senecaStrings.standard
  - typings.seneca.senecaStrings.test
*/
trait LogSpec extends js.Object

object LogSpec {
  @scala.inline
  def all: typings.seneca.senecaStrings.all = this.cast("all")
  @scala.inline
  def any: typings.seneca.senecaStrings.any = this.cast("any")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def print: typings.seneca.senecaStrings.print = this.cast("print")
  @scala.inline
  def quiet: typings.seneca.senecaStrings.quiet = this.cast("quiet")
  @scala.inline
  def silent: typings.seneca.senecaStrings.silent = this.cast("silent")
  @scala.inline
  def standard: typings.seneca.senecaStrings.standard = this.cast("standard")
  @scala.inline
  def test: typings.seneca.senecaStrings.test = this.cast("test")
}

