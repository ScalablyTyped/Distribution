package typings.relayRuntime.normalizationNodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.anon.FragmentName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.relayRuntime.normalizationNodeMod.NormalizationSelection because Already inherited */ trait NormalizationMatchField extends NormalizationField {
   // 'MatchField';
  val alias: js.UndefOr[String | Null] = js.undefined
  val args: js.Array[NormalizationArgument]
  val kind: String
  val matchesByType: StringDictionary[FragmentName]
  val name: String
  val storageKey: js.UndefOr[String | Null] = js.undefined
}

object NormalizationMatchField {
  @scala.inline
  def apply(
    args: js.Array[NormalizationArgument],
    kind: String,
    matchesByType: StringDictionary[FragmentName],
    name: String,
    alias: js.UndefOr[Null | String] = js.undefined,
    storageKey: js.UndefOr[Null | String] = js.undefined
  ): NormalizationMatchField = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], matchesByType = matchesByType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(alias)) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(storageKey)) __obj.updateDynamic("storageKey")(storageKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationMatchField]
  }
}

