package typings
package sqlDashTemplateLib.sqlDashTemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sql-template", JSImport.Namespace)
@js.native
object sqlDashTemplateModMembers extends js.Object {
  def apply(parts: stdLib.TemplateStringsArray, values: js.Any*): sqlDashTemplateLib.sqlDashTemplateMod.SQLNs.Fragment = js.native
  def insert(table: java.lang.String, values: js.Object): sqlDashTemplateLib.sqlDashTemplateMod.SQLNs.Fragment = js.native
  def insert_bulk(table: java.lang.String, keys: js.Array[java.lang.String], values: js.Array[js.Array[_]]): sqlDashTemplateLib.sqlDashTemplateMod.SQLNs.Fragment = js.native
  def search_blob(search_field: java.lang.String, qs: java.lang.String): sqlDashTemplateLib.sqlDashTemplateMod.SQLNs.Fragment | sqlDashTemplateLib.sqlDashTemplateLibNumbers.`false` = js.native
  def search_blob(search_field: java.lang.String, qs: java.lang.String, main_field: java.lang.String): sqlDashTemplateLib.sqlDashTemplateMod.SQLNs.Fragment | sqlDashTemplateLib.sqlDashTemplateLibNumbers.`false` = js.native
  def search_blob(
    search_field: java.lang.String,
    qs: java.lang.String,
    main_field: java.lang.String,
    LIKE: java.lang.String
  ): sqlDashTemplateLib.sqlDashTemplateMod.SQLNs.Fragment | sqlDashTemplateLib.sqlDashTemplateLibNumbers.`false` = js.native
  def select(table: java.lang.String): sqlDashTemplateLib.sqlDashTemplateMod.SQLNs.Fragment = js.native
  def select(table: java.lang.String, where: js.Any): sqlDashTemplateLib.sqlDashTemplateMod.SQLNs.Fragment = js.native
  def select(table: java.lang.String, where: js.Any, cols: java.lang.String): sqlDashTemplateLib.sqlDashTemplateMod.SQLNs.Fragment = js.native
  def select(table: java.lang.String, where: js.Any, cols: java.lang.String, extra: java.lang.String): sqlDashTemplateLib.sqlDashTemplateMod.SQLNs.Fragment = js.native
  def update(table: java.lang.String, values: js.Object): sqlDashTemplateLib.sqlDashTemplateMod.SQLNs.Fragment = js.native
  def update(table: java.lang.String, values: js.Object, where: js.Any): sqlDashTemplateLib.sqlDashTemplateMod.SQLNs.Fragment = js.native
}

