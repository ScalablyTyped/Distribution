package typings.relayDashRuntime.relayDashRuntimeMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayDashRuntime.Anon_FragmentName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.relayDashRuntime.relayDashRuntimeMod.NormalizationSelection because Already inherited */ trait NormalizationMatchField extends NormalizationField {
   // 'MatchField';
  val alias: js.UndefOr[String | Null] = js.undefined
  val args: js.Array[NormalizationArgument]
  val kind: String
  val matchesByType: StringDictionary[Anon_FragmentName]
  val name: String
  val storageKey: js.UndefOr[String | Null] = js.undefined
}

object NormalizationMatchField {
  @scala.inline
  def apply(
    args: js.Array[NormalizationArgument],
    kind: String,
    matchesByType: StringDictionary[Anon_FragmentName],
    name: String,
    alias: String = null,
    storageKey: String = null
  ): NormalizationMatchField = {
    val __obj = js.Dynamic.literal(args = args, kind = kind, matchesByType = matchesByType, name = name)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (storageKey != null) __obj.updateDynamic("storageKey")(storageKey)
    __obj.asInstanceOf[NormalizationMatchField]
  }
}

