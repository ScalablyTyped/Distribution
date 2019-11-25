package typings.relayDashRuntime.libUtilReaderNodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayDashRuntime.Anon_FragmentName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.relayDashRuntime.libUtilReaderNodeMod.ReaderCondition
  - typings.relayDashRuntime.libUtilReaderNodeMod.ReaderClientExtension
  - typings.relayDashRuntime.libUtilReaderNodeMod.ReaderField
  - typings.relayDashRuntime.libUtilReaderNodeMod.ReaderFragmentSpread
  - typings.relayDashRuntime.libUtilReaderNodeMod.ReaderInlineFragment
  - typings.relayDashRuntime.libUtilReaderNodeMod.ReaderMatchField
*/
trait ReaderSelection extends js.Object

object ReaderSelection {
  @scala.inline
  def ReaderClientExtension(kind: String, selections: js.Array[ReaderSelection]): ReaderSelection = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReaderSelection]
  }
  @scala.inline
  def ReaderLinkedField(
    args: js.Array[ReaderArgument],
    kind: String,
    name: String,
    plural: Boolean,
    selections: js.Array[ReaderSelection],
    alias: String = null,
    concreteType: String = null,
    storageKey: String = null
  ): ReaderSelection = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (concreteType != null) __obj.updateDynamic("concreteType")(concreteType.asInstanceOf[js.Any])
    if (storageKey != null) __obj.updateDynamic("storageKey")(storageKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderSelection]
  }
  @scala.inline
  def ReaderMatchField(
    kind: String,
    matchesByType: StringDictionary[Anon_FragmentName],
    name: String,
    alias: String = null,
    args: js.Array[ReaderArgument] = null,
    storageKey: String = null
  ): ReaderSelection = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], matchesByType = matchesByType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (storageKey != null) __obj.updateDynamic("storageKey")(storageKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderSelection]
  }
  @scala.inline
  def ReaderCondition(condition: String, kind: String, passingValue: Boolean, selections: js.Array[ReaderSelection]): ReaderSelection = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], passingValue = passingValue.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReaderSelection]
  }
  @scala.inline
  def ReaderInlineFragment(kind: String, selections: js.Array[ReaderSelection], `type`: String): ReaderSelection = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderSelection]
  }
  @scala.inline
  def ReaderScalarField(
    kind: String,
    name: String,
    alias: String = null,
    args: js.Array[ReaderArgument] = null,
    storageKey: String = null
  ): ReaderSelection = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (storageKey != null) __obj.updateDynamic("storageKey")(storageKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderSelection]
  }
  @scala.inline
  def ReaderFragmentSpread(kind: String, name: String, args: js.Array[ReaderArgument] = null): ReaderSelection = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderSelection]
  }
}

