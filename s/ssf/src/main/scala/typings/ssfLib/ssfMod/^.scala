package typings
package ssfLib.ssfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssf", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val version: java.lang.String = js.native
  def format(fmt: java.lang.String, `val`: js.Any): java.lang.String = js.native
  def format(fmt: java.lang.String, `val`: js.Any, opts: js.Any): java.lang.String = js.native
  def format(fmt: scala.Double, `val`: js.Any): java.lang.String = js.native
  def format(fmt: scala.Double, `val`: js.Any, opts: js.Any): java.lang.String = js.native
  def get_table(): SSF$Table = js.native
  def is_date(fmt: java.lang.String): scala.Boolean = js.native
  def load(fmt: java.lang.String): scala.Double = js.native
  def load(fmt: java.lang.String, idx: scala.Double): scala.Double = js.native
  def load_table(tbl: SSF$Table): scala.Unit = js.native
  def parse_date_code(v: scala.Double): SSF$Date = js.native
  def parse_date_code(v: scala.Double, opts: js.Any): SSF$Date = js.native
}

