package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- relayDashRuntimeLib.relayDashRuntimeMod.NormalizationSelection because Already inherited */ trait NormalizationMatchField extends NormalizationField {
   // 'MatchField';
  val alias: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  val args: js.Array[NormalizationArgument]
  val kind: java.lang.String
  val matchesByType: org.scalablytyped.runtime.StringDictionary[relayDashRuntimeLib.Anon_FragmentName]
  val name: java.lang.String
  val storageKey: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object NormalizationMatchField {
  @scala.inline
  def apply(
    args: js.Array[NormalizationArgument],
    kind: java.lang.String,
    matchesByType: org.scalablytyped.runtime.StringDictionary[relayDashRuntimeLib.Anon_FragmentName],
    name: java.lang.String,
    alias: java.lang.String = null,
    storageKey: java.lang.String = null
  ): NormalizationMatchField = {
    val __obj = js.Dynamic.literal(args = args, kind = kind, matchesByType = matchesByType, name = name)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (storageKey != null) __obj.updateDynamic("storageKey")(storageKey)
    __obj.asInstanceOf[NormalizationMatchField]
  }
}

