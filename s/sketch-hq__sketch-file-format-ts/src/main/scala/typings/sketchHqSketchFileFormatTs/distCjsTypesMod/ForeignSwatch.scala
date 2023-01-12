package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.MSImmutableForeignSwatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForeignSwatch
  extends StObject
     with AnyObject {
  
  var _class: MSImmutableForeignSwatch
  
  var do_objectID: Uuid
  
  var libraryID: Uuid
  
  var localSwatch: Swatch
  
  var remoteSwatchID: Uuid
  
  var sourceLibraryName: String
  
  var symbolPrivate: Boolean
}
object ForeignSwatch {
  
  inline def apply(
    do_objectID: Uuid,
    libraryID: Uuid,
    localSwatch: Swatch,
    remoteSwatchID: Uuid,
    sourceLibraryName: String,
    symbolPrivate: Boolean
  ): ForeignSwatch = {
    val __obj = js.Dynamic.literal(_class = "MSImmutableForeignSwatch", do_objectID = do_objectID.asInstanceOf[js.Any], libraryID = libraryID.asInstanceOf[js.Any], localSwatch = localSwatch.asInstanceOf[js.Any], remoteSwatchID = remoteSwatchID.asInstanceOf[js.Any], sourceLibraryName = sourceLibraryName.asInstanceOf[js.Any], symbolPrivate = symbolPrivate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForeignSwatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ForeignSwatch] (val x: Self) extends AnyVal {
    
    inline def setDo_objectID(value: Uuid): Self = StObject.set(x, "do_objectID", value.asInstanceOf[js.Any])
    
    inline def setLibraryID(value: Uuid): Self = StObject.set(x, "libraryID", value.asInstanceOf[js.Any])
    
    inline def setLocalSwatch(value: Swatch): Self = StObject.set(x, "localSwatch", value.asInstanceOf[js.Any])
    
    inline def setRemoteSwatchID(value: Uuid): Self = StObject.set(x, "remoteSwatchID", value.asInstanceOf[js.Any])
    
    inline def setSourceLibraryName(value: String): Self = StObject.set(x, "sourceLibraryName", value.asInstanceOf[js.Any])
    
    inline def setSymbolPrivate(value: Boolean): Self = StObject.set(x, "symbolPrivate", value.asInstanceOf[js.Any])
    
    inline def set_class(value: MSImmutableForeignSwatch): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
