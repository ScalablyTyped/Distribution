package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.MSImmutableForeignTextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForeignTextStyle
  extends StObject
     with AnyObject {
  
  var _class: MSImmutableForeignTextStyle
  
  var libraryID: Uuid
  
  var localSharedStyle: SharedStyle
  
  var missingLibraryFontAcknowledged: js.UndefOr[Boolean] = js.undefined
  
  var remoteStyleID: Uuid
  
  var sourceLibraryName: String
  
  var symbolPrivate: Boolean
}
object ForeignTextStyle {
  
  inline def apply(
    libraryID: Uuid,
    localSharedStyle: SharedStyle,
    remoteStyleID: Uuid,
    sourceLibraryName: String,
    symbolPrivate: Boolean
  ): ForeignTextStyle = {
    val __obj = js.Dynamic.literal(_class = "MSImmutableForeignTextStyle", libraryID = libraryID.asInstanceOf[js.Any], localSharedStyle = localSharedStyle.asInstanceOf[js.Any], remoteStyleID = remoteStyleID.asInstanceOf[js.Any], sourceLibraryName = sourceLibraryName.asInstanceOf[js.Any], symbolPrivate = symbolPrivate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForeignTextStyle]
  }
  
  extension [Self <: ForeignTextStyle](x: Self) {
    
    inline def setLibraryID(value: Uuid): Self = StObject.set(x, "libraryID", value.asInstanceOf[js.Any])
    
    inline def setLocalSharedStyle(value: SharedStyle): Self = StObject.set(x, "localSharedStyle", value.asInstanceOf[js.Any])
    
    inline def setMissingLibraryFontAcknowledged(value: Boolean): Self = StObject.set(x, "missingLibraryFontAcknowledged", value.asInstanceOf[js.Any])
    
    inline def setMissingLibraryFontAcknowledgedUndefined: Self = StObject.set(x, "missingLibraryFontAcknowledged", js.undefined)
    
    inline def setRemoteStyleID(value: Uuid): Self = StObject.set(x, "remoteStyleID", value.asInstanceOf[js.Any])
    
    inline def setSourceLibraryName(value: String): Self = StObject.set(x, "sourceLibraryName", value.asInstanceOf[js.Any])
    
    inline def setSymbolPrivate(value: Boolean): Self = StObject.set(x, "symbolPrivate", value.asInstanceOf[js.Any])
    
    inline def set_class(value: MSImmutableForeignTextStyle): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
