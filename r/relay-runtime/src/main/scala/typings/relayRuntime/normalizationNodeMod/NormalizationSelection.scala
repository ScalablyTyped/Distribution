package typings.relayRuntime.normalizationNodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.anon.FragmentName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.normalizationNodeMod.NormalizationCondition
  - typings.relayRuntime.normalizationNodeMod.NormalizationClientExtension
  - typings.relayRuntime.normalizationNodeMod.NormalizationField
  - typings.relayRuntime.normalizationNodeMod.NormalizationHandle
  - typings.relayRuntime.normalizationNodeMod.NormalizationInlineFragment
  - typings.relayRuntime.normalizationNodeMod.NormalizationMatchField
*/
trait NormalizationSelection extends js.Object

object NormalizationSelection {
  @scala.inline
  def NormalizationCondition(
    condition: String,
    kind: String,
    passingValue: Boolean,
    selections: js.Array[NormalizationSelection]
  ): NormalizationSelection = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], passingValue = passingValue.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationSelection]
  }
  @scala.inline
  def NormalizationLinkedField(
    args: js.Array[NormalizationArgument],
    kind: String,
    name: String,
    plural: Boolean,
    selections: js.Array[NormalizationSelection],
    alias: js.UndefOr[Null | String] = js.undefined,
    concreteType: js.UndefOr[Null | String] = js.undefined,
    storageKey: js.UndefOr[Null | String] = js.undefined
  ): NormalizationSelection = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    if (!js.isUndefined(alias)) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(concreteType)) __obj.updateDynamic("concreteType")(concreteType.asInstanceOf[js.Any])
    if (!js.isUndefined(storageKey)) __obj.updateDynamic("storageKey")(storageKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationSelection]
  }
  @scala.inline
  def NormalizationInlineFragment(kind: String, selections: js.Array[NormalizationSelection], `type`: String): NormalizationSelection = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationSelection]
  }
  @scala.inline
  def NormalizationLinkedHandle(
    handle: String,
    key: String,
    kind: String,
    name: String,
    alias: js.UndefOr[Null | String] = js.undefined,
    args: js.UndefOr[Null | js.Array[NormalizationArgument]] = js.undefined,
    filters: js.UndefOr[Null | js.Array[String]] = js.undefined
  ): NormalizationSelection = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(alias)) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(args)) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(filters)) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationSelection]
  }
  @scala.inline
  def NormalizationClientExtension(kind: String, selections: js.Array[NormalizationSelection]): NormalizationSelection = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationSelection]
  }
  @scala.inline
  def NormalizationScalarField(
    kind: String,
    name: String,
    alias: js.UndefOr[Null | String] = js.undefined,
    args: js.UndefOr[Null | js.Array[NormalizationArgument]] = js.undefined,
    storageKey: js.UndefOr[Null | String] = js.undefined
  ): NormalizationSelection = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(alias)) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(args)) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(storageKey)) __obj.updateDynamic("storageKey")(storageKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationSelection]
  }
  @scala.inline
  def NormalizationMatchField(
    args: js.Array[NormalizationArgument],
    kind: String,
    matchesByType: StringDictionary[FragmentName],
    name: String,
    alias: js.UndefOr[Null | String] = js.undefined,
    storageKey: js.UndefOr[Null | String] = js.undefined
  ): NormalizationSelection = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], matchesByType = matchesByType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(alias)) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(storageKey)) __obj.updateDynamic("storageKey")(storageKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationSelection]
  }
  @scala.inline
  def NormalizationScalarHandle(
    handle: String,
    key: String,
    kind: String,
    name: String,
    alias: js.UndefOr[Null | String] = js.undefined,
    args: js.UndefOr[Null | js.Array[NormalizationArgument]] = js.undefined,
    filters: js.UndefOr[Null | js.Array[String]] = js.undefined
  ): NormalizationSelection = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(alias)) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(args)) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(filters)) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationSelection]
  }
}

