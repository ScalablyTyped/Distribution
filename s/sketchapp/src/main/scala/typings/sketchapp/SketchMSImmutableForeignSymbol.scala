package typings.sketchapp

import typings.sketchapp.sketchappStrings.MSImmutableForeignSymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSImmutableForeignSymbol extends StObject {
  
  var _class: MSImmutableForeignSymbol
  
  var libraryID: String
  
  var originalMaster: SketchMSSymbolMasterLayer
  
  var sourceLibraryName: String
  
  var symbolMaster: SketchMSSymbolMasterLayer
  
  var symbolPrivate: Boolean
}
object SketchMSImmutableForeignSymbol {
  
  inline def apply(
    libraryID: String,
    originalMaster: SketchMSSymbolMasterLayer,
    sourceLibraryName: String,
    symbolMaster: SketchMSSymbolMasterLayer,
    symbolPrivate: Boolean
  ): SketchMSImmutableForeignSymbol = {
    val __obj = js.Dynamic.literal(_class = "MSImmutableForeignSymbol", libraryID = libraryID.asInstanceOf[js.Any], originalMaster = originalMaster.asInstanceOf[js.Any], sourceLibraryName = sourceLibraryName.asInstanceOf[js.Any], symbolMaster = symbolMaster.asInstanceOf[js.Any], symbolPrivate = symbolPrivate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSImmutableForeignSymbol]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SketchMSImmutableForeignSymbol] (val x: Self) extends AnyVal {
    
    inline def setLibraryID(value: String): Self = StObject.set(x, "libraryID", value.asInstanceOf[js.Any])
    
    inline def setOriginalMaster(value: SketchMSSymbolMasterLayer): Self = StObject.set(x, "originalMaster", value.asInstanceOf[js.Any])
    
    inline def setSourceLibraryName(value: String): Self = StObject.set(x, "sourceLibraryName", value.asInstanceOf[js.Any])
    
    inline def setSymbolMaster(value: SketchMSSymbolMasterLayer): Self = StObject.set(x, "symbolMaster", value.asInstanceOf[js.Any])
    
    inline def setSymbolPrivate(value: Boolean): Self = StObject.set(x, "symbolPrivate", value.asInstanceOf[js.Any])
    
    inline def set_class(value: MSImmutableForeignSymbol): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
