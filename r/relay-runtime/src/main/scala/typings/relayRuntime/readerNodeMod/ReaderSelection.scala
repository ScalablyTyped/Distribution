package typings.relayRuntime.readerNodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.anon.FragmentName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.readerNodeMod.ReaderCondition
  - typings.relayRuntime.readerNodeMod.ReaderClientExtension
  - typings.relayRuntime.readerNodeMod.ReaderField
  - typings.relayRuntime.readerNodeMod.ReaderFragmentSpread
  - typings.relayRuntime.readerNodeMod.ReaderInlineFragment
  - typings.relayRuntime.readerNodeMod.ReaderMatchField
*/
trait ReaderSelection extends js.Object

object ReaderSelection {
  @scala.inline
  def ReaderLinkedField(
    args: js.Array[ReaderArgument],
    kind: String,
    name: String,
    plural: Boolean,
    selections: js.Array[ReaderSelection],
    alias: js.UndefOr[Null | String] = js.undefined,
    concreteType: js.UndefOr[Null | String] = js.undefined,
    storageKey: js.UndefOr[Null | String] = js.undefined
  ): ReaderSelection = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    if (!js.isUndefined(alias)) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(concreteType)) __obj.updateDynamic("concreteType")(concreteType.asInstanceOf[js.Any])
    if (!js.isUndefined(storageKey)) __obj.updateDynamic("storageKey")(storageKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderSelection]
  }
  @scala.inline
  def ReaderScalarField(
    kind: String,
    name: String,
    alias: js.UndefOr[Null | String] = js.undefined,
    args: js.UndefOr[Null | js.Array[ReaderArgument]] = js.undefined,
    storageKey: js.UndefOr[Null | String] = js.undefined
  ): ReaderSelection = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(alias)) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(args)) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(storageKey)) __obj.updateDynamic("storageKey")(storageKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderSelection]
  }
  @scala.inline
  def ReaderInlineFragment(
    kind: String,
    selections: js.Array[ReaderSelection],
    `type`: String,
    abstractKey: js.UndefOr[Null | String] = js.undefined
  ): ReaderSelection = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(abstractKey)) __obj.updateDynamic("abstractKey")(abstractKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderSelection]
  }
  @scala.inline
  def ReaderCondition(condition: String, kind: String, passingValue: Boolean, selections: js.Array[ReaderSelection]): ReaderSelection = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], passingValue = passingValue.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderSelection]
  }
  @scala.inline
  def ReaderMatchField(
    kind: String,
    matchesByType: StringDictionary[FragmentName],
    name: String,
    alias: js.UndefOr[Null | String] = js.undefined,
    args: js.UndefOr[Null | js.Array[ReaderArgument]] = js.undefined,
    storageKey: js.UndefOr[Null | String] = js.undefined
  ): ReaderSelection = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], matchesByType = matchesByType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(alias)) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(args)) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(storageKey)) __obj.updateDynamic("storageKey")(storageKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderSelection]
  }
  @scala.inline
  def ReaderClientExtension(kind: String, selections: js.Array[ReaderSelection]): ReaderSelection = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderSelection]
  }
  @scala.inline
  def ReaderFragmentSpread(kind: String, name: String, args: js.UndefOr[Null | js.Array[ReaderArgument]] = js.undefined): ReaderSelection = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(args)) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderSelection]
  }
}

