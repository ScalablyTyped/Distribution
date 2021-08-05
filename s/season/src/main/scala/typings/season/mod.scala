package typings.season

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("season", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isObjectPath(objectPath: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectPath")(objectPath.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def readFile(objectPath: String, callback: js.Function2[/* err */ Error | Null, /* object */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(objectPath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readFile(
    objectPath: String,
    options: ParseOptions,
    callback: js.Function2[/* err */ Error | Null, /* object */ js.Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(objectPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def readFileSync(objectPath: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(objectPath.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def readFileSync(objectPath: String, options: ParseOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(objectPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def resolve(objectPath: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(objectPath.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def setCacheDir(cacheDirectory: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCacheDir")(cacheDirectory.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def stringify(`object`: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def writeFile(objectPath: String, `object`: js.Any, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(objectPath.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeFileSync(objectPath: String, `object`: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(objectPath.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait ParseOptions extends StObject {
    
    var allowDuplicateKeys: js.UndefOr[Boolean] = js.undefined
  }
  object ParseOptions {
    
    inline def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    extension [Self <: ParseOptions](x: Self) {
      
      inline def setAllowDuplicateKeys(value: Boolean): Self = StObject.set(x, "allowDuplicateKeys", value.asInstanceOf[js.Any])
      
      inline def setAllowDuplicateKeysUndefined: Self = StObject.set(x, "allowDuplicateKeys", js.undefined)
    }
  }
}
