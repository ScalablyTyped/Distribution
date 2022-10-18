package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.MSImmutableForeignLayerStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForeignLayerStyle
  extends StObject
     with AnyObject {
  
  var _class: MSImmutableForeignLayerStyle
  
  var do_objectID: Uuid
  
  var libraryID: Uuid
  
  var localSharedStyle: SharedStyle
  
  var remoteStyleID: Uuid
  
  var sourceLibraryName: String
  
  var symbolPrivate: Boolean
}
object ForeignLayerStyle {
  
  inline def apply(
    do_objectID: Uuid,
    libraryID: Uuid,
    localSharedStyle: SharedStyle,
    remoteStyleID: Uuid,
    sourceLibraryName: String,
    symbolPrivate: Boolean
  ): ForeignLayerStyle = {
    val __obj = js.Dynamic.literal(_class = "MSImmutableForeignLayerStyle", do_objectID = do_objectID.asInstanceOf[js.Any], libraryID = libraryID.asInstanceOf[js.Any], localSharedStyle = localSharedStyle.asInstanceOf[js.Any], remoteStyleID = remoteStyleID.asInstanceOf[js.Any], sourceLibraryName = sourceLibraryName.asInstanceOf[js.Any], symbolPrivate = symbolPrivate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForeignLayerStyle]
  }
  
  extension [Self <: ForeignLayerStyle](x: Self) {
    
    inline def setDo_objectID(value: Uuid): Self = StObject.set(x, "do_objectID", value.asInstanceOf[js.Any])
    
    inline def setLibraryID(value: Uuid): Self = StObject.set(x, "libraryID", value.asInstanceOf[js.Any])
    
    inline def setLocalSharedStyle(value: SharedStyle): Self = StObject.set(x, "localSharedStyle", value.asInstanceOf[js.Any])
    
    inline def setRemoteStyleID(value: Uuid): Self = StObject.set(x, "remoteStyleID", value.asInstanceOf[js.Any])
    
    inline def setSourceLibraryName(value: String): Self = StObject.set(x, "sourceLibraryName", value.asInstanceOf[js.Any])
    
    inline def setSymbolPrivate(value: Boolean): Self = StObject.set(x, "symbolPrivate", value.asInstanceOf[js.Any])
    
    inline def set_class(value: MSImmutableForeignLayerStyle): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
