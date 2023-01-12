package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.MSImmutableForeignSymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForeignSymbol
  extends StObject
     with AnyObject {
  
  var _class: MSImmutableForeignSymbol
  
  var do_objectID: Uuid
  
  var libraryID: Uuid
  
  var missingLibraryFontAcknowledged: js.UndefOr[Boolean] = js.undefined
  
  var originalMaster: SymbolMaster
  
  var sourceLibraryName: String
  
  var symbolMaster: SymbolMaster
  
  var symbolPrivate: Boolean
}
object ForeignSymbol {
  
  inline def apply(
    do_objectID: Uuid,
    libraryID: Uuid,
    originalMaster: SymbolMaster,
    sourceLibraryName: String,
    symbolMaster: SymbolMaster,
    symbolPrivate: Boolean
  ): ForeignSymbol = {
    val __obj = js.Dynamic.literal(_class = "MSImmutableForeignSymbol", do_objectID = do_objectID.asInstanceOf[js.Any], libraryID = libraryID.asInstanceOf[js.Any], originalMaster = originalMaster.asInstanceOf[js.Any], sourceLibraryName = sourceLibraryName.asInstanceOf[js.Any], symbolMaster = symbolMaster.asInstanceOf[js.Any], symbolPrivate = symbolPrivate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForeignSymbol]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ForeignSymbol] (val x: Self) extends AnyVal {
    
    inline def setDo_objectID(value: Uuid): Self = StObject.set(x, "do_objectID", value.asInstanceOf[js.Any])
    
    inline def setLibraryID(value: Uuid): Self = StObject.set(x, "libraryID", value.asInstanceOf[js.Any])
    
    inline def setMissingLibraryFontAcknowledged(value: Boolean): Self = StObject.set(x, "missingLibraryFontAcknowledged", value.asInstanceOf[js.Any])
    
    inline def setMissingLibraryFontAcknowledgedUndefined: Self = StObject.set(x, "missingLibraryFontAcknowledged", js.undefined)
    
    inline def setOriginalMaster(value: SymbolMaster): Self = StObject.set(x, "originalMaster", value.asInstanceOf[js.Any])
    
    inline def setSourceLibraryName(value: String): Self = StObject.set(x, "sourceLibraryName", value.asInstanceOf[js.Any])
    
    inline def setSymbolMaster(value: SymbolMaster): Self = StObject.set(x, "symbolMaster", value.asInstanceOf[js.Any])
    
    inline def setSymbolPrivate(value: Boolean): Self = StObject.set(x, "symbolPrivate", value.asInstanceOf[js.Any])
    
    inline def set_class(value: MSImmutableForeignSymbol): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
