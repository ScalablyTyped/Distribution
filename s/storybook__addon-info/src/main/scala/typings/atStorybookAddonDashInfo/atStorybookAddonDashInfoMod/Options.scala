package typings.atStorybookAddonDashInfo.atStorybookAddonDashInfoMod

import org.scalablytyped.runtime.StringDictionary
import typings.atStorybookAddonDashInfo.atStorybookAddonDashInfoNumbers.`false`
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var TableComponent: js.UndefOr[ComponentType[TableComponentOptionProps]] = js.undefined
  var components: js.UndefOr[StringDictionary[ComponentType[_]]] = js.undefined
  var excludedPropTypes: js.UndefOr[js.Array[String]] = js.undefined
  var header: js.UndefOr[Boolean] = js.undefined
  var `inline`: js.UndefOr[Boolean] = js.undefined
  /**
    * @deprecated "marksyConf" option has been renamed to "components"
    */
  var marksyConf: js.UndefOr[js.Object] = js.undefined
  var maxPropArrayLength: js.UndefOr[Double] = js.undefined
  var maxPropObjectKeys: js.UndefOr[Double] = js.undefined
  var maxPropStringLength: js.UndefOr[Double] = js.undefined
  var maxPropsIntoLine: js.UndefOr[Double] = js.undefined
  var propTables: js.UndefOr[js.Array[ComponentType[_]] | `false`] = js.undefined
  var propTablesExclude: js.UndefOr[js.Array[ComponentType[_]]] = js.undefined
  var source: js.UndefOr[Boolean] = js.undefined
  var styles: js.UndefOr[js.Object] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    TableComponent: ComponentType[TableComponentOptionProps] = null,
    components: StringDictionary[ComponentType[_]] = null,
    excludedPropTypes: js.Array[String] = null,
    header: js.UndefOr[Boolean] = js.undefined,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    marksyConf: js.Object = null,
    maxPropArrayLength: Int | Double = null,
    maxPropObjectKeys: Int | Double = null,
    maxPropStringLength: Int | Double = null,
    maxPropsIntoLine: Int | Double = null,
    propTables: js.Array[ComponentType[_]] | `false` = null,
    propTablesExclude: js.Array[ComponentType[_]] = null,
    source: js.UndefOr[Boolean] = js.undefined,
    styles: js.Object = null,
    text: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (TableComponent != null) __obj.updateDynamic("TableComponent")(TableComponent.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components)
    if (excludedPropTypes != null) __obj.updateDynamic("excludedPropTypes")(excludedPropTypes)
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (marksyConf != null) __obj.updateDynamic("marksyConf")(marksyConf)
    if (maxPropArrayLength != null) __obj.updateDynamic("maxPropArrayLength")(maxPropArrayLength.asInstanceOf[js.Any])
    if (maxPropObjectKeys != null) __obj.updateDynamic("maxPropObjectKeys")(maxPropObjectKeys.asInstanceOf[js.Any])
    if (maxPropStringLength != null) __obj.updateDynamic("maxPropStringLength")(maxPropStringLength.asInstanceOf[js.Any])
    if (maxPropsIntoLine != null) __obj.updateDynamic("maxPropsIntoLine")(maxPropsIntoLine.asInstanceOf[js.Any])
    if (propTables != null) __obj.updateDynamic("propTables")(propTables.asInstanceOf[js.Any])
    if (propTablesExclude != null) __obj.updateDynamic("propTablesExclude")(propTablesExclude)
    if (!js.isUndefined(source)) __obj.updateDynamic("source")(source)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Options]
  }
}

