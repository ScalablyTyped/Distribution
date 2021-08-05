package typings.rename

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(filepath: String, transformer: Transformer): FilePath = (^.asInstanceOf[js.Dynamic].apply(filepath.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any])).asInstanceOf[FilePath]
  inline def apply(filepath: FileObject, transformer: Transformer): FilePath = (^.asInstanceOf[js.Dynamic].apply(filepath.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any])).asInstanceOf[FilePath]
  
  @JSImport("rename", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(filename: String): FileObject = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(filename.asInstanceOf[js.Any]).asInstanceOf[FileObject]
  
  inline def stringify(obj: FileObject): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait FileObject extends StObject {
    
    var basename: js.UndefOr[String] = js.undefined
    
    // using package's terminology
    var dirname: js.UndefOr[String] = js.undefined
    
    var extname: js.UndefOr[String] = js.undefined
    
    var hash: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
  }
  object FileObject {
    
    inline def apply(): FileObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileObject]
    }
    
    extension [Self <: FileObject](x: Self) {
      
      inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      inline def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      inline def setDirname(value: String): Self = StObject.set(x, "dirname", value.asInstanceOf[js.Any])
      
      inline def setDirnameUndefined: Self = StObject.set(x, "dirname", js.undefined)
      
      inline def setExtname(value: String): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
      
      inline def setExtnameUndefined: Self = StObject.set(x, "extname", js.undefined)
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  type FilePath = String | Specification
  
  trait Specification extends StObject {
    
    var basename: js.UndefOr[String] = js.undefined
    
    var dirname: js.UndefOr[String] = js.undefined
    
    var extname: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var suffix: js.UndefOr[String] = js.undefined
  }
  object Specification {
    
    inline def apply(): Specification = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Specification]
    }
    
    extension [Self <: Specification](x: Self) {
      
      inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      inline def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      inline def setDirname(value: String): Self = StObject.set(x, "dirname", value.asInstanceOf[js.Any])
      
      inline def setDirnameUndefined: Self = StObject.set(x, "dirname", js.undefined)
      
      inline def setExtname(value: String): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
      
      inline def setExtnameUndefined: Self = StObject.set(x, "extname", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
  
  type Transformer = (js.Function1[/* spec */ FileObject, FilePath]) | FilePath
}
