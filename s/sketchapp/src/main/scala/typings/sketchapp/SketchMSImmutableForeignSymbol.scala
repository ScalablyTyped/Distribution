package typings.sketchapp

import typings.sketchapp.sketchappStrings.MSImmutableForeignSymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSImmutableForeignSymbol extends StObject {
  
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
  implicit class SketchMSImmutableForeignSymbolMutableBuilder[Self <: SketchMSImmutableForeignSymbol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLibraryID(value: String): Self = StObject.set(x, "libraryID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalMaster(value: SketchMSSymbolMasterLayer): Self = StObject.set(x, "originalMaster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceLibraryName(value: String): Self = StObject.set(x, "sourceLibraryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolMaster(value: SketchMSSymbolMasterLayer): Self = StObject.set(x, "symbolMaster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolPrivate(value: Boolean): Self = StObject.set(x, "symbolPrivate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_class(value: MSImmutableForeignSymbol): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
