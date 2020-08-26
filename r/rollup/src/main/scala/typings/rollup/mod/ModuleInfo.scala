package typings.rollup.mod

import typings.rollup.rollupStrings.`no-treeshake`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleInfo extends js.Object {
  var dynamicImporters: js.Array[String] = js.native
  var dynamicallyImportedIds: js.Array[String] = js.native
  var hasModuleSideEffects: Boolean | `no-treeshake` = js.native
  var id: String = js.native
  var implicitlyLoadedAfterOneOf: js.Array[String] = js.native
  var implicitlyLoadedBefore: js.Array[String] = js.native
  var importedIds: js.Array[String] = js.native
  var importers: js.Array[String] = js.native
  var isEntry: Boolean = js.native
  var isExternal: Boolean = js.native
}

object ModuleInfo {
  @scala.inline
  def apply(
    dynamicImporters: js.Array[String],
    dynamicallyImportedIds: js.Array[String],
    hasModuleSideEffects: Boolean | `no-treeshake`,
    id: String,
    implicitlyLoadedAfterOneOf: js.Array[String],
    implicitlyLoadedBefore: js.Array[String],
    importedIds: js.Array[String],
    importers: js.Array[String],
    isEntry: Boolean,
    isExternal: Boolean
  ): ModuleInfo = {
    val __obj = js.Dynamic.literal(dynamicImporters = dynamicImporters.asInstanceOf[js.Any], dynamicallyImportedIds = dynamicallyImportedIds.asInstanceOf[js.Any], hasModuleSideEffects = hasModuleSideEffects.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], implicitlyLoadedAfterOneOf = implicitlyLoadedAfterOneOf.asInstanceOf[js.Any], implicitlyLoadedBefore = implicitlyLoadedBefore.asInstanceOf[js.Any], importedIds = importedIds.asInstanceOf[js.Any], importers = importers.asInstanceOf[js.Any], isEntry = isEntry.asInstanceOf[js.Any], isExternal = isExternal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleInfo]
  }
  @scala.inline
  implicit class ModuleInfoOps[Self <: ModuleInfo] (val x: Self) extends AnyVal {
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
    def setDynamicImportersVarargs(value: String*): Self = this.set("dynamicImporters", js.Array(value :_*))
    @scala.inline
    def setDynamicImporters(value: js.Array[String]): Self = this.set("dynamicImporters", value.asInstanceOf[js.Any])
    @scala.inline
    def setDynamicallyImportedIdsVarargs(value: String*): Self = this.set("dynamicallyImportedIds", js.Array(value :_*))
    @scala.inline
    def setDynamicallyImportedIds(value: js.Array[String]): Self = this.set("dynamicallyImportedIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasModuleSideEffects(value: Boolean | `no-treeshake`): Self = this.set("hasModuleSideEffects", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setImplicitlyLoadedAfterOneOfVarargs(value: String*): Self = this.set("implicitlyLoadedAfterOneOf", js.Array(value :_*))
    @scala.inline
    def setImplicitlyLoadedAfterOneOf(value: js.Array[String]): Self = this.set("implicitlyLoadedAfterOneOf", value.asInstanceOf[js.Any])
    @scala.inline
    def setImplicitlyLoadedBeforeVarargs(value: String*): Self = this.set("implicitlyLoadedBefore", js.Array(value :_*))
    @scala.inline
    def setImplicitlyLoadedBefore(value: js.Array[String]): Self = this.set("implicitlyLoadedBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def setImportedIdsVarargs(value: String*): Self = this.set("importedIds", js.Array(value :_*))
    @scala.inline
    def setImportedIds(value: js.Array[String]): Self = this.set("importedIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setImportersVarargs(value: String*): Self = this.set("importers", js.Array(value :_*))
    @scala.inline
    def setImporters(value: js.Array[String]): Self = this.set("importers", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsEntry(value: Boolean): Self = this.set("isEntry", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsExternal(value: Boolean): Self = this.set("isExternal", value.asInstanceOf[js.Any])
  }
  
}

