package typings
package atStorybookAddonDashInfoLib.atStorybookAddonDashInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var TableComponent: js.UndefOr[
    reactLib.reactMod.ReactNs.ComponentType[atStorybookAddonDashInfoLib.Anon_PropDefinitions]
  ] = js.undefined
  var components: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[reactLib.reactMod.ReactNs.ComponentType[_]]
  ] = js.undefined
  var excludedPropTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var header: js.UndefOr[scala.Boolean] = js.undefined
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  var marksyConf: js.UndefOr[js.Object] = js.undefined
  var maxPropArrayLength: js.UndefOr[scala.Double] = js.undefined
  var maxPropObjectKeys: js.UndefOr[scala.Double] = js.undefined
  var maxPropStringLength: js.UndefOr[scala.Double] = js.undefined
  var maxPropsIntoLine: js.UndefOr[scala.Double] = js.undefined
  var propTables: js.UndefOr[
    js.Array[reactLib.reactMod.ReactNs.ComponentType[_]] | atStorybookAddonDashInfoLib.atStorybookAddonDashInfoLibNumbers.`false`
  ] = js.undefined
  var propTablesExclude: js.UndefOr[js.Array[reactLib.reactMod.ReactNs.ComponentType[_]]] = js.undefined
  var source: js.UndefOr[scala.Boolean] = js.undefined
  var styles: js.UndefOr[js.Object] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    TableComponent: reactLib.reactMod.ReactNs.ComponentType[atStorybookAddonDashInfoLib.Anon_PropDefinitions] = null,
    components: org.scalablytyped.runtime.StringDictionary[reactLib.reactMod.ReactNs.ComponentType[_]] = null,
    excludedPropTypes: js.Array[java.lang.String] = null,
    header: js.UndefOr[scala.Boolean] = js.undefined,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    marksyConf: js.Object = null,
    maxPropArrayLength: scala.Int | scala.Double = null,
    maxPropObjectKeys: scala.Int | scala.Double = null,
    maxPropStringLength: scala.Int | scala.Double = null,
    maxPropsIntoLine: scala.Int | scala.Double = null,
    propTables: js.Array[reactLib.reactMod.ReactNs.ComponentType[_]] | atStorybookAddonDashInfoLib.atStorybookAddonDashInfoLibNumbers.`false` = null,
    propTablesExclude: js.Array[reactLib.reactMod.ReactNs.ComponentType[_]] = null,
    source: js.UndefOr[scala.Boolean] = js.undefined,
    styles: js.Object = null,
    text: java.lang.String = null
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

