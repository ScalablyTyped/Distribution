package typings.ssf.ssfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssf", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val version: String = js.native
  def format(fmt: String, `val`: js.Any): String = js.native
  def format(fmt: String, `val`: js.Any, opts: js.Any): String = js.native
  def format(fmt: Double, `val`: js.Any): String = js.native
  def format(fmt: Double, `val`: js.Any, opts: js.Any): String = js.native
  def get_table(): SSF$Table = js.native
  def is_date(fmt: String): Boolean = js.native
  def load(fmt: String): Double = js.native
  def load(fmt: String, idx: Double): Double = js.native
  def load_table(tbl: SSF$Table): Unit = js.native
  def parse_date_code(v: Double): SSF$Date = js.native
  def parse_date_code(v: Double, opts: js.Any): SSF$Date = js.native
}

