package typings.sketchapp

import typings.sketchapp.sketchappStrings.MSImmutableForeignSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSImmutableForeignSymbol extends js.Object {
  var _class: MSImmutableForeignSymbol
  var libraryID: String
  var originalMaster: SketchMSSymbolMasterLayer
  var sourceLibraryName: String
  var symbolMaster: SketchMSSymbolMasterLayer
  var symbolPrivate: Boolean
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
}

