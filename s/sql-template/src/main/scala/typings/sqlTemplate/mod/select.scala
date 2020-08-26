package typings.sqlTemplate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sql-template", "select")
@js.native
object select extends js.Object {
  def apply(table: String): Fragment = js.native
  def apply(table: String, where: js.UndefOr[scala.Nothing], cols: js.UndefOr[scala.Nothing], extra: String): Fragment = js.native
  def apply(table: String, where: js.UndefOr[scala.Nothing], cols: String): Fragment = js.native
  def apply(table: String, where: js.UndefOr[scala.Nothing], cols: String, extra: String): Fragment = js.native
  def apply(table: String, where: js.Any): Fragment = js.native
  def apply(table: String, where: js.Any, cols: js.UndefOr[scala.Nothing], extra: String): Fragment = js.native
  def apply(table: String, where: js.Any, cols: String): Fragment = js.native
  def apply(table: String, where: js.Any, cols: String, extra: String): Fragment = js.native
}

