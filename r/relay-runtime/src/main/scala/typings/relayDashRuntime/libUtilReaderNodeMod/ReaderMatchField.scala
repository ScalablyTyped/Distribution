package typings.relayDashRuntime.libUtilReaderNodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayDashRuntime.Anon_FragmentName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.relayDashRuntime.libUtilReaderNodeMod.ReaderSelection because Already inherited */ trait ReaderMatchField extends ReaderField {
   // 'MatchField';
  val alias: js.UndefOr[String | Null] = js.undefined
  val args: js.UndefOr[js.Array[ReaderArgument] | Null] = js.undefined
  val kind: String
  val matchesByType: StringDictionary[Anon_FragmentName]
  val name: String
  val storageKey: js.UndefOr[String | Null] = js.undefined
}

object ReaderMatchField {
  @scala.inline
  def apply(
    kind: String,
    matchesByType: StringDictionary[Anon_FragmentName],
    name: String,
    alias: String = null,
    args: js.Array[ReaderArgument] = null,
    storageKey: String = null
  ): ReaderMatchField = {
    val __obj = js.Dynamic.literal(kind = kind, matchesByType = matchesByType, name = name)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (args != null) __obj.updateDynamic("args")(args)
    if (storageKey != null) __obj.updateDynamic("storageKey")(storageKey)
    __obj.asInstanceOf[ReaderMatchField]
  }
}

