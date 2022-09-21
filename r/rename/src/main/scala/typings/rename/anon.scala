package typings.rename

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<rename.rename.ParsedFileObject> */
  trait PartialParsedFileObject extends StObject {
    
    var basename: js.UndefOr[String] = js.undefined
    
    var dirname: js.UndefOr[String] = js.undefined
    
    var extname: js.UndefOr[String] = js.undefined
    
    var origin: js.UndefOr[String] = js.undefined
  }
  object PartialParsedFileObject {
    
    inline def apply(): PartialParsedFileObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialParsedFileObject]
    }
    
    extension [Self <: PartialParsedFileObject](x: Self) {
      
      inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      inline def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      inline def setDirname(value: String): Self = StObject.set(x, "dirname", value.asInstanceOf[js.Any])
      
      inline def setDirnameUndefined: Self = StObject.set(x, "dirname", js.undefined)
      
      inline def setExtname(value: String): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
      
      inline def setExtnameUndefined: Self = StObject.set(x, "extname", js.undefined)
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    }
  }
}
