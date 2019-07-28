package typings.sqlDashTemplate.sqlDashTemplateMod

import typings.sqlDashTemplate.sqlDashTemplateNumbers.`false`
import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sql-template", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(parts: TemplateStringsArray, values: js.Any*): Fragment = js.native
  def insert(table: String, values: js.Object): Fragment = js.native
  def insert_bulk(table: String, keys: js.Array[String], values: js.Array[js.Array[_]]): Fragment = js.native
  def search_blob(search_field: String, qs: String): Fragment | `false` = js.native
  def search_blob(search_field: String, qs: String, main_field: String): Fragment | `false` = js.native
  def search_blob(search_field: String, qs: String, main_field: String, LIKE: String): Fragment | `false` = js.native
  def select(table: String): Fragment = js.native
  def select(table: String, where: js.Any): Fragment = js.native
  def select(table: String, where: js.Any, cols: String): Fragment = js.native
  def select(table: String, where: js.Any, cols: String, extra: String): Fragment = js.native
  def update(table: String, values: js.Object): Fragment = js.native
  def update(table: String, values: js.Object, where: js.Any): Fragment = js.native
}

