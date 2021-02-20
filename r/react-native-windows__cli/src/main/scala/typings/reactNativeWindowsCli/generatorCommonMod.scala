package typings.reactNativeWindowsCli

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generatorCommonMod {
  
  @JSImport("@react-native-windows/cli/lib-commonjs/generator-common", "copyAndReplaceAll")
  @js.native
  def copyAndReplaceAll(
    srcPath: String,
    destPath: String,
    relativeDestDir: String,
    replacements: Replacements,
    alwaysOverwrite: Boolean
  ): js.Promise[Unit] = js.native
  
  @JSImport("@react-native-windows/cli/lib-commonjs/generator-common", "copyAndReplaceWithChangedCallback")
  @js.native
  def copyAndReplaceWithChangedCallback(srcPath: String, destRoot: String, relativeDestPath: String): js.Promise[Unit] = js.native
  @JSImport("@react-native-windows/cli/lib-commonjs/generator-common", "copyAndReplaceWithChangedCallback")
  @js.native
  def copyAndReplaceWithChangedCallback(
    srcPath: String,
    destRoot: String,
    relativeDestPath: String,
    replacements: js.UndefOr[scala.Nothing],
    alwaysOverwrite: Boolean
  ): js.Promise[Unit] = js.native
  @JSImport("@react-native-windows/cli/lib-commonjs/generator-common", "copyAndReplaceWithChangedCallback")
  @js.native
  def copyAndReplaceWithChangedCallback(srcPath: String, destRoot: String, relativeDestPath: String, replacements: Record[String, String]): js.Promise[Unit] = js.native
  @JSImport("@react-native-windows/cli/lib-commonjs/generator-common", "copyAndReplaceWithChangedCallback")
  @js.native
  def copyAndReplaceWithChangedCallback(
    srcPath: String,
    destRoot: String,
    relativeDestPath: String,
    replacements: Record[String, String],
    alwaysOverwrite: Boolean
  ): js.Promise[Unit] = js.native
  
  @JSImport("@react-native-windows/cli/lib-commonjs/generator-common", "createDir")
  @js.native
  def createDir(destPath: String): Unit = js.native
  
  @JSImport("@react-native-windows/cli/lib-commonjs/generator-common", "resolveContents")
  @js.native
  def resolveContents(srcPath: String, replacements: Replacements): String = js.native
  
  @js.native
  trait Replacements
    extends /* key */ StringDictionary[js.Any] {
    
    var regExpPatternsToRemove: js.UndefOr[js.Array[RegExp]] = js.native
    
    var useMustache: js.UndefOr[Boolean] = js.native
  }
  object Replacements {
    
    @scala.inline
    def apply(): Replacements = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Replacements]
    }
    
    @scala.inline
    implicit class ReplacementsMutableBuilder[Self <: Replacements] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegExpPatternsToRemove(value: js.Array[RegExp]): Self = StObject.set(x, "regExpPatternsToRemove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegExpPatternsToRemoveUndefined: Self = StObject.set(x, "regExpPatternsToRemove", js.undefined)
      
      @scala.inline
      def setRegExpPatternsToRemoveVarargs(value: RegExp*): Self = StObject.set(x, "regExpPatternsToRemove", js.Array(value :_*))
      
      @scala.inline
      def setUseMustache(value: Boolean): Self = StObject.set(x, "useMustache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseMustacheUndefined: Self = StObject.set(x, "useMustache", js.undefined)
    }
  }
}
