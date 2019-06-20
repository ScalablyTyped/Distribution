package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- relayDashRuntimeLib.relayDashRuntimeMod.ReaderSelection because Already inherited */ trait ReaderMatchField extends ReaderField {
   // 'MatchField';
  val alias: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  val args: js.UndefOr[js.Array[ReaderArgument] | scala.Null] = js.undefined
  val kind: java.lang.String
  val matchesByType: org.scalablytyped.runtime.StringDictionary[relayDashRuntimeLib.Anon_FragmentName]
  val name: java.lang.String
  val storageKey: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object ReaderMatchField {
  @scala.inline
  def apply(
    kind: java.lang.String,
    matchesByType: org.scalablytyped.runtime.StringDictionary[relayDashRuntimeLib.Anon_FragmentName],
    name: java.lang.String,
    alias: java.lang.String = null,
    args: js.Array[ReaderArgument] = null,
    storageKey: java.lang.String = null
  ): ReaderMatchField = {
    val __obj = js.Dynamic.literal(kind = kind, matchesByType = matchesByType, name = name)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (args != null) __obj.updateDynamic("args")(args)
    if (storageKey != null) __obj.updateDynamic("storageKey")(storageKey)
    __obj.asInstanceOf[ReaderMatchField]
  }
}

