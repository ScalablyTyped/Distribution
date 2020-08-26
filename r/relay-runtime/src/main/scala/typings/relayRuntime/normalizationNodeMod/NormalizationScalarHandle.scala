package typings.relayRuntime.normalizationNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NormalizationScalarHandle extends NormalizationHandle {
   // 'ScalarHandle';
  val alias: js.UndefOr[String | Null] = js.native
  val args: js.UndefOr[js.Array[NormalizationArgument] | Null] = js.native
  val filters: js.UndefOr[js.Array[String] | Null] = js.native
  val handle: String = js.native
  val key: String = js.native
  val kind: String = js.native
  val name: String = js.native
}

object NormalizationScalarHandle {
  @scala.inline
  def apply(handle: String, key: String, kind: String, name: String): NormalizationScalarHandle = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationScalarHandle]
  }
  @scala.inline
  implicit class NormalizationScalarHandleOps[Self <: NormalizationScalarHandle] (val x: Self) extends AnyVal {
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
    def setHandle(value: String): Self = this.set("handle", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    @scala.inline
    def setAliasNull: Self = this.set("alias", null)
    @scala.inline
    def setArgsVarargs(value: NormalizationArgument*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[NormalizationArgument]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setArgsNull: Self = this.set("args", null)
    @scala.inline
    def setFiltersVarargs(value: String*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[String]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setFiltersNull: Self = this.set("filters", null)
  }
  
}

