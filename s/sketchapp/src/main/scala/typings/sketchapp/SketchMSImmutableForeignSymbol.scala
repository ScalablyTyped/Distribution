package typings.sketchapp

import typings.sketchapp.sketchappStrings.MSImmutableForeignSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSImmutableForeignSymbol extends js.Object {
  var _class: MSImmutableForeignSymbol = js.native
  var libraryID: String = js.native
  var originalMaster: SketchMSSymbolMasterLayer = js.native
  var sourceLibraryName: String = js.native
  var symbolMaster: SketchMSSymbolMasterLayer = js.native
  var symbolPrivate: Boolean = js.native
}

object SketchMSImmutableForeignSymbol {
  @scala.inline
  def apply(
    _class: MSImmutableForeignSymbol,
    libraryID: String,
    originalMaster: SketchMSSymbolMasterLayer,
    sourceLibraryName: String,
    symbolMaster: SketchMSSymbolMasterLayer,
    symbolPrivate: Boolean
  ): SketchMSImmutableForeignSymbol = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], libraryID = libraryID.asInstanceOf[js.Any], originalMaster = originalMaster.asInstanceOf[js.Any], sourceLibraryName = sourceLibraryName.asInstanceOf[js.Any], symbolMaster = symbolMaster.asInstanceOf[js.Any], symbolPrivate = symbolPrivate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSImmutableForeignSymbol]
  }
  @scala.inline
  implicit class SketchMSImmutableForeignSymbolOps[Self <: SketchMSImmutableForeignSymbol] (val x: Self) extends AnyVal {
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
    def set_class(value: MSImmutableForeignSymbol): Self = this.set("_class", value.asInstanceOf[js.Any])
    @scala.inline
    def setLibraryID(value: String): Self = this.set("libraryID", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalMaster(value: SketchMSSymbolMasterLayer): Self = this.set("originalMaster", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceLibraryName(value: String): Self = this.set("sourceLibraryName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSymbolMaster(value: SketchMSSymbolMasterLayer): Self = this.set("symbolMaster", value.asInstanceOf[js.Any])
    @scala.inline
    def setSymbolPrivate(value: Boolean): Self = this.set("symbolPrivate", value.asInstanceOf[js.Any])
  }
  
}

