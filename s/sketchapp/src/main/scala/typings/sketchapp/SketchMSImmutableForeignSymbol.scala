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
    val __obj = js.Dynamic.literal(_class = _class, libraryID = libraryID, originalMaster = originalMaster, sourceLibraryName = sourceLibraryName, symbolMaster = symbolMaster, symbolPrivate = symbolPrivate)
  
    __obj.asInstanceOf[SketchMSImmutableForeignSymbol]
  }
}

