package typings.season

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("season", "isObjectPath")
  @js.native
  def isObjectPath(objectPath: String): Boolean = js.native
  
  @JSImport("season", "readFile")
  @js.native
  def readFile(objectPath: String, callback: js.Function2[/* err */ Error | Null, /* object */ js.Any, Unit]): Unit = js.native
  @JSImport("season", "readFile")
  @js.native
  def readFile(
    objectPath: String,
    options: ParseOptions,
    callback: js.Function2[/* err */ Error | Null, /* object */ js.Any, Unit]
  ): Unit = js.native
  
  @JSImport("season", "readFileSync")
  @js.native
  def readFileSync(objectPath: String): js.Any = js.native
  @JSImport("season", "readFileSync")
  @js.native
  def readFileSync(objectPath: String, options: ParseOptions): js.Any = js.native
  
  @JSImport("season", "resolve")
  @js.native
  def resolve(objectPath: String): String | Null = js.native
  
  @JSImport("season", "setCacheDir")
  @js.native
  def setCacheDir(cacheDirectory: String): Unit = js.native
  
  @JSImport("season", "stringify")
  @js.native
  def stringify(`object`: js.Any): String = js.native
  
  @JSImport("season", "writeFile")
  @js.native
  def writeFile(objectPath: String, `object`: js.Any, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  
  @JSImport("season", "writeFileSync")
  @js.native
  def writeFileSync(objectPath: String, `object`: js.Any): Unit = js.native
  
  @js.native
  trait ParseOptions extends StObject {
    
    var allowDuplicateKeys: js.UndefOr[Boolean] = js.native
  }
  object ParseOptions {
    
    @scala.inline
    def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit class ParseOptionsMutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowDuplicateKeys(value: Boolean): Self = StObject.set(x, "allowDuplicateKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowDuplicateKeysUndefined: Self = StObject.set(x, "allowDuplicateKeys", js.undefined)
    }
  }
}
