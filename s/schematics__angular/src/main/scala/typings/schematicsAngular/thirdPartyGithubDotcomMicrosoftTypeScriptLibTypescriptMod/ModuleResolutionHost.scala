package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleResolutionHost extends StObject {
  
  var directoryExists: js.UndefOr[js.Function1[/* directoryName */ java.lang.String, Boolean]] = js.undefined
  
  def fileExists(fileName: java.lang.String): Boolean
  
  var getCurrentDirectory: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  var getDirectories: js.UndefOr[js.Function1[/* path */ java.lang.String, js.Array[java.lang.String]]] = js.undefined
  
  def readFile(fileName: java.lang.String): js.UndefOr[java.lang.String]
  
  /**
    * Resolve a symbolic link.
    * @see https://nodejs.org/api/fs.html#fs_fs_realpathsync_path_options
    */
  var realpath: js.UndefOr[js.Function1[/* path */ java.lang.String, java.lang.String]] = js.undefined
  
  var trace: js.UndefOr[js.Function1[/* s */ java.lang.String, Unit]] = js.undefined
  
  var useCaseSensitiveFileNames: js.UndefOr[Boolean | js.Function0[Boolean]] = js.undefined
}
object ModuleResolutionHost {
  
  inline def apply(
    fileExists: java.lang.String => Boolean,
    readFile: java.lang.String => js.UndefOr[java.lang.String]
  ): ModuleResolutionHost = {
    val __obj = js.Dynamic.literal(fileExists = js.Any.fromFunction1(fileExists), readFile = js.Any.fromFunction1(readFile))
    __obj.asInstanceOf[ModuleResolutionHost]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModuleResolutionHost] (val x: Self) extends AnyVal {
    
    inline def setDirectoryExists(value: /* directoryName */ java.lang.String => Boolean): Self = StObject.set(x, "directoryExists", js.Any.fromFunction1(value))
    
    inline def setDirectoryExistsUndefined: Self = StObject.set(x, "directoryExists", js.undefined)
    
    inline def setFileExists(value: java.lang.String => Boolean): Self = StObject.set(x, "fileExists", js.Any.fromFunction1(value))
    
    inline def setGetCurrentDirectory(value: () => java.lang.String): Self = StObject.set(x, "getCurrentDirectory", js.Any.fromFunction0(value))
    
    inline def setGetCurrentDirectoryUndefined: Self = StObject.set(x, "getCurrentDirectory", js.undefined)
    
    inline def setGetDirectories(value: /* path */ java.lang.String => js.Array[java.lang.String]): Self = StObject.set(x, "getDirectories", js.Any.fromFunction1(value))
    
    inline def setGetDirectoriesUndefined: Self = StObject.set(x, "getDirectories", js.undefined)
    
    inline def setReadFile(value: java.lang.String => js.UndefOr[java.lang.String]): Self = StObject.set(x, "readFile", js.Any.fromFunction1(value))
    
    inline def setRealpath(value: /* path */ java.lang.String => java.lang.String): Self = StObject.set(x, "realpath", js.Any.fromFunction1(value))
    
    inline def setRealpathUndefined: Self = StObject.set(x, "realpath", js.undefined)
    
    inline def setTrace(value: /* s */ java.lang.String => Unit): Self = StObject.set(x, "trace", js.Any.fromFunction1(value))
    
    inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
    
    inline def setUseCaseSensitiveFileNames(value: Boolean | js.Function0[Boolean]): Self = StObject.set(x, "useCaseSensitiveFileNames", value.asInstanceOf[js.Any])
    
    inline def setUseCaseSensitiveFileNamesFunction0(value: () => Boolean): Self = StObject.set(x, "useCaseSensitiveFileNames", js.Any.fromFunction0(value))
    
    inline def setUseCaseSensitiveFileNamesUndefined: Self = StObject.set(x, "useCaseSensitiveFileNames", js.undefined)
  }
}
