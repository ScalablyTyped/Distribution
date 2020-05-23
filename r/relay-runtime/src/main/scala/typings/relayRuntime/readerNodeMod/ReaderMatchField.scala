package typings.relayRuntime.readerNodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.anon.FragmentName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.relayRuntime.readerNodeMod.ReaderSelection because Already inherited */ trait ReaderMatchField extends ReaderField {
   // 'MatchField';
  val alias: js.UndefOr[String | Null] = js.undefined
  val args: js.UndefOr[js.Array[ReaderArgument] | Null] = js.undefined
  val kind: String
  val matchesByType: StringDictionary[FragmentName]
  val name: String
  val storageKey: js.UndefOr[String | Null] = js.undefined
}

object ReaderMatchField {
  @scala.inline
  def apply(
    kind: String,
    matchesByType: StringDictionary[FragmentName],
    name: String,
    alias: js.UndefOr[Null | String] = js.undefined,
    args: js.UndefOr[Null | js.Array[ReaderArgument]] = js.undefined,
    storageKey: js.UndefOr[Null | String] = js.undefined
  ): ReaderMatchField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], matchesByType = matchesByType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(alias)) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(args)) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(storageKey)) __obj.updateDynamic("storageKey")(storageKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderMatchField]
  }
}

