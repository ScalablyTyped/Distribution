package typings
package sqlDashTemplateLib.sqlDashTemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sql-template", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(parts: stdLib.TemplateStringsArray, values: js.Any*): Fragment = js.native
  def insert(table: java.lang.String, values: js.Object): Fragment = js.native
  def insert_bulk(table: java.lang.String, keys: js.Array[java.lang.String], values: js.Array[js.Array[_]]): Fragment = js.native
  def search_blob(search_field: java.lang.String, qs: java.lang.String): Fragment | sqlDashTemplateLib.sqlDashTemplateLibNumbers.`false` = js.native
  def search_blob(search_field: java.lang.String, qs: java.lang.String, main_field: java.lang.String): Fragment | sqlDashTemplateLib.sqlDashTemplateLibNumbers.`false` = js.native
  def search_blob(
    search_field: java.lang.String,
    qs: java.lang.String,
    main_field: java.lang.String,
    LIKE: java.lang.String
  ): Fragment | sqlDashTemplateLib.sqlDashTemplateLibNumbers.`false` = js.native
  def select(table: java.lang.String): Fragment = js.native
  def select(table: java.lang.String, where: js.Any): Fragment = js.native
  def select(table: java.lang.String, where: js.Any, cols: java.lang.String): Fragment = js.native
  def select(table: java.lang.String, where: js.Any, cols: java.lang.String, extra: java.lang.String): Fragment = js.native
  def update(table: java.lang.String, values: js.Object): Fragment = js.native
  def update(table: java.lang.String, values: js.Object, where: js.Any): Fragment = js.native
}

