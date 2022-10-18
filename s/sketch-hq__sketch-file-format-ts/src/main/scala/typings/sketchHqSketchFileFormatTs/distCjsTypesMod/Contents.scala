package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import typings.sketchHqSketchFileFormatTs.anon.Assets
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contents extends StObject {
  
  var document: Assets
  
  var meta: Meta
  
  var user: User
  
  var workspace: js.UndefOr[Workspace] = js.undefined
}
object Contents {
  
  inline def apply(document: Assets, meta: Meta, user: User): Contents = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contents]
  }
  
  extension [Self <: Contents](x: Self) {
    
    inline def setDocument(value: Assets): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setWorkspace(value: Workspace): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceUndefined: Self = StObject.set(x, "workspace", js.undefined)
  }
}
