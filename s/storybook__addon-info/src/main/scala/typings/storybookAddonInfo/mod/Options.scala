package typings.storybookAddonInfo.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.storybookAddonInfo.storybookAddonInfoBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var TableComponent: js.UndefOr[ComponentType[TableComponentOptionProps]] = js.native
  var components: js.UndefOr[StringDictionary[ComponentType[_]]] = js.native
  var excludedPropTypes: js.UndefOr[js.Array[String]] = js.native
  var header: js.UndefOr[Boolean] = js.native
  var `inline`: js.UndefOr[Boolean] = js.native
  /**
    * @deprecated "marksyConf" option has been renamed to "components"
    */
  var marksyConf: js.UndefOr[js.Object] = js.native
  var maxPropArrayLength: js.UndefOr[Double] = js.native
  var maxPropObjectKeys: js.UndefOr[Double] = js.native
  var maxPropStringLength: js.UndefOr[Double] = js.native
  var maxPropsIntoLine: js.UndefOr[Double] = js.native
  var propTables: js.UndefOr[js.Array[ComponentType[_]] | `false`] = js.native
  var propTablesExclude: js.UndefOr[js.Array[ComponentType[_]]] = js.native
  var source: js.UndefOr[Boolean] = js.native
  var styles: js.UndefOr[js.Object] = js.native
  var text: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setTableComponent(value: ComponentType[TableComponentOptionProps]): Self = this.set("TableComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableComponent: Self = this.set("TableComponent", js.undefined)
    @scala.inline
    def setComponents(value: StringDictionary[ComponentType[_]]): Self = this.set("components", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponents: Self = this.set("components", js.undefined)
    @scala.inline
    def setExcludedPropTypesVarargs(value: String*): Self = this.set("excludedPropTypes", js.Array(value :_*))
    @scala.inline
    def setExcludedPropTypes(value: js.Array[String]): Self = this.set("excludedPropTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludedPropTypes: Self = this.set("excludedPropTypes", js.undefined)
    @scala.inline
    def setHeader(value: Boolean): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    @scala.inline
    def setMarksyConf(value: js.Object): Self = this.set("marksyConf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarksyConf: Self = this.set("marksyConf", js.undefined)
    @scala.inline
    def setMaxPropArrayLength(value: Double): Self = this.set("maxPropArrayLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxPropArrayLength: Self = this.set("maxPropArrayLength", js.undefined)
    @scala.inline
    def setMaxPropObjectKeys(value: Double): Self = this.set("maxPropObjectKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxPropObjectKeys: Self = this.set("maxPropObjectKeys", js.undefined)
    @scala.inline
    def setMaxPropStringLength(value: Double): Self = this.set("maxPropStringLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxPropStringLength: Self = this.set("maxPropStringLength", js.undefined)
    @scala.inline
    def setMaxPropsIntoLine(value: Double): Self = this.set("maxPropsIntoLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxPropsIntoLine: Self = this.set("maxPropsIntoLine", js.undefined)
    @scala.inline
    def setPropTablesVarargs(value: ComponentType[js.Any]*): Self = this.set("propTables", js.Array(value :_*))
    @scala.inline
    def setPropTables(value: js.Array[ComponentType[_]] | `false`): Self = this.set("propTables", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePropTables: Self = this.set("propTables", js.undefined)
    @scala.inline
    def setPropTablesExcludeVarargs(value: ComponentType[js.Any]*): Self = this.set("propTablesExclude", js.Array(value :_*))
    @scala.inline
    def setPropTablesExclude(value: js.Array[ComponentType[_]]): Self = this.set("propTablesExclude", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePropTablesExclude: Self = this.set("propTablesExclude", js.undefined)
    @scala.inline
    def setSource(value: Boolean): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setStyles(value: js.Object): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

