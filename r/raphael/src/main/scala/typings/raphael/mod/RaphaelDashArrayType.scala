package typings.raphael.mod

import typings.raphael.raphaelStrings.`-_`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.raphael.raphaelStrings._empty
  - typings.raphael.raphaelStrings.`-_`
  - typings.raphael.raphaelStrings.Dot
  - typings.raphael.raphaelStrings.`-Dot`
  - typings.raphael.raphaelStrings.`-DotDot`
  - typings.raphael.raphaelStrings.`Dot `
  - typings.raphael.raphaelStrings.`- `
  - typings.raphael.raphaelStrings.`--`
  - typings.raphael.raphaelStrings.`- Dot`
  - typings.raphael.raphaelStrings.`--Dot`
  - typings.raphael.raphaelStrings.`--DotDot`
*/
trait RaphaelDashArrayType extends js.Object

object RaphaelDashArrayType {
  @scala.inline
  def `- `: typings.raphael.raphaelStrings.`- ` = this.cast("- ")
  @scala.inline
  def `- Dot`: typings.raphael.raphaelStrings.`- Dot` = this.cast("- .")
  @scala.inline
  def `--`: typings.raphael.raphaelStrings.`--` = this.cast("--")
  @scala.inline
  def `--Dot`: typings.raphael.raphaelStrings.`--Dot` = this.cast("--.")
  @scala.inline
  def `--DotDot`: typings.raphael.raphaelStrings.`--DotDot` = this.cast("--..")
  @scala.inline
  def `-Dot`: typings.raphael.raphaelStrings.`-Dot` = this.cast("-.")
  @scala.inline
  def `-DotDot`: typings.raphael.raphaelStrings.`-DotDot` = this.cast("-..")
  @scala.inline
  def Dot: typings.raphael.raphaelStrings.Dot = this.cast(".")
  @scala.inline
  def `Dot `: typings.raphael.raphaelStrings.`Dot ` = this.cast(". ")
  @scala.inline
  def _dash: `-_` = this.cast("-")
  @scala.inline
  def _empty: typings.raphael.raphaelStrings._empty = this.cast("")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

