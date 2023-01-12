package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.MSImmutablePatchInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchInfo
  extends StObject
     with AnyObject {
  
  var _class: MSImmutablePatchInfo
  
  var baseVersionID: Uuid
  
  var lastIntegratedPatchID: Uuid
  
  var localPatches: js.Array[FileRef]
  
  var receivedPatches: js.Array[FileRef]
}
object PatchInfo {
  
  inline def apply(
    baseVersionID: Uuid,
    lastIntegratedPatchID: Uuid,
    localPatches: js.Array[FileRef],
    receivedPatches: js.Array[FileRef]
  ): PatchInfo = {
    val __obj = js.Dynamic.literal(_class = "MSImmutablePatchInfo", baseVersionID = baseVersionID.asInstanceOf[js.Any], lastIntegratedPatchID = lastIntegratedPatchID.asInstanceOf[js.Any], localPatches = localPatches.asInstanceOf[js.Any], receivedPatches = receivedPatches.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PatchInfo] (val x: Self) extends AnyVal {
    
    inline def setBaseVersionID(value: Uuid): Self = StObject.set(x, "baseVersionID", value.asInstanceOf[js.Any])
    
    inline def setLastIntegratedPatchID(value: Uuid): Self = StObject.set(x, "lastIntegratedPatchID", value.asInstanceOf[js.Any])
    
    inline def setLocalPatches(value: js.Array[FileRef]): Self = StObject.set(x, "localPatches", value.asInstanceOf[js.Any])
    
    inline def setLocalPatchesVarargs(value: FileRef*): Self = StObject.set(x, "localPatches", js.Array(value*))
    
    inline def setReceivedPatches(value: js.Array[FileRef]): Self = StObject.set(x, "receivedPatches", value.asInstanceOf[js.Any])
    
    inline def setReceivedPatchesVarargs(value: FileRef*): Self = StObject.set(x, "receivedPatches", js.Array(value*))
    
    inline def set_class(value: MSImmutablePatchInfo): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
