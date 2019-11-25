package typings.relayDashRuntime.libUtilNormalizationNodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayDashRuntime.Anon_FragmentName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.relayDashRuntime.libUtilNormalizationNodeMod.NormalizationCondition
  - typings.relayDashRuntime.libUtilNormalizationNodeMod.NormalizationClientExtension
  - typings.relayDashRuntime.libUtilNormalizationNodeMod.NormalizationField
  - typings.relayDashRuntime.libUtilNormalizationNodeMod.NormalizationHandle
  - typings.relayDashRuntime.libUtilNormalizationNodeMod.NormalizationInlineFragment
  - typings.relayDashRuntime.libUtilNormalizationNodeMod.NormalizationMatchField
*/
trait NormalizationSelection extends js.Object

object NormalizationSelection {
  @scala.inline
  def NormalizationScalarHandle(
    handle: String,
    key: String,
    kind: String,
    name: String,
    alias: String = null,
    args: js.Array[NormalizationArgument] = null,
    filters: js.Array[String] = null
  ): NormalizationSelection = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationSelection]
  }
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
    alias: String = null,
    concreteType: String = null,
    storageKey: String = null
  ): NormalizationSelection = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (concreteType != null) __obj.updateDynamic("concreteType")(concreteType.asInstanceOf[js.Any])
    if (storageKey != null) __obj.updateDynamic("storageKey")(storageKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationSelection]
  }
  @scala.inline
  def NormalizationClientExtension(kind: String, selections: js.Array[NormalizationSelection]): NormalizationSelection = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NormalizationSelection]
  }
  @scala.inline
  def NormalizationInlineFragment(kind: String, selections: js.Array[NormalizationSelection], `type`: String): NormalizationSelection = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationSelection]
  }
  @scala.inline
  def NormalizationScalarField(
    kind: String,
    name: String,
    alias: String = null,
    args: js.Array[NormalizationArgument] = null,
    storageKey: String = null
  ): NormalizationSelection = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (storageKey != null) __obj.updateDynamic("storageKey")(storageKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationSelection]
  }
  @scala.inline
  def NormalizationMatchField(
    args: js.Array[NormalizationArgument],
    kind: String,
    matchesByType: StringDictionary[Anon_FragmentName],
    name: String,
    alias: String = null,
    storageKey: String = null
  ): NormalizationSelection = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], matchesByType = matchesByType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (storageKey != null) __obj.updateDynamic("storageKey")(storageKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationSelection]
  }
  @scala.inline
  def NormalizationLinkedHandle(
    handle: String,
    key: String,
    kind: String,
    name: String,
    alias: String = null,
    args: js.Array[NormalizationArgument] = null,
    filters: js.Array[String] = null
  ): NormalizationSelection = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationSelection]
  }
}

