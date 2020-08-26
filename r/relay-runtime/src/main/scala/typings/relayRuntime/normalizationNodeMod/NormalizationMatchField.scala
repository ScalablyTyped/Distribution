package typings.relayRuntime.normalizationNodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.anon.FragmentName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NormalizationMatchField extends NormalizationField {
   // 'MatchField';
  val alias: js.UndefOr[String | Null] = js.native
  val args: js.Array[NormalizationArgument] = js.native
  val kind: String = js.native
  val matchesByType: StringDictionary[FragmentName] = js.native
  val name: String = js.native
  val storageKey: js.UndefOr[String | Null] = js.native
}

object NormalizationMatchField {
  @scala.inline
  def apply(
    args: js.Array[NormalizationArgument],
    kind: String,
    matchesByType: StringDictionary[FragmentName],
    name: String
  ): NormalizationMatchField = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], matchesByType = matchesByType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationMatchField]
  }
  @scala.inline
  implicit class NormalizationMatchFieldOps[Self <: NormalizationMatchField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArgsVarargs(value: NormalizationArgument*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[NormalizationArgument]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatchesByType(value: StringDictionary[FragmentName]): Self = this.set("matchesByType", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    @scala.inline
    def setAliasNull: Self = this.set("alias", null)
    @scala.inline
    def setStorageKey(value: String): Self = this.set("storageKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageKey: Self = this.set("storageKey", js.undefined)
    @scala.inline
    def setStorageKeyNull: Self = this.set("storageKey", null)
  }
  
}

