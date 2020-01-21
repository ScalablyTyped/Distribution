package typings.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.slonik.slonikStrings.Lessthansign
  - typings.slonik.slonikStrings.Greaterthansign
  - typings.slonik.slonikStrings.LessthansignEqualssign
  - typings.slonik.slonikStrings.GreaterthansignEqualssign
  - typings.slonik.slonikStrings.Equalssign
  - typings.slonik.slonikStrings.LessthansignGreaterthansign
  - typings.slonik.slonikStrings.ExclamationmarkEqualssign
*/
trait ComparisonOperatorType extends js.Object

object ComparisonOperatorType {
  @scala.inline
  def Equalssign: typings.slonik.slonikStrings.Equalssign = this.cast("=")
  @scala.inline
  def ExclamationmarkEqualssign: typings.slonik.slonikStrings.ExclamationmarkEqualssign = this.cast("!=")
  @scala.inline
  def Greaterthansign: typings.slonik.slonikStrings.Greaterthansign = this.cast(">")
  @scala.inline
  def GreaterthansignEqualssign: typings.slonik.slonikStrings.GreaterthansignEqualssign = this.cast(">=")
  @scala.inline
  def Lessthansign: typings.slonik.slonikStrings.Lessthansign = this.cast("<")
  @scala.inline
  def LessthansignEqualssign: typings.slonik.slonikStrings.LessthansignEqualssign = this.cast("<=")
  @scala.inline
  def LessthansignGreaterthansign: typings.slonik.slonikStrings.LessthansignGreaterthansign = this.cast("<>")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

