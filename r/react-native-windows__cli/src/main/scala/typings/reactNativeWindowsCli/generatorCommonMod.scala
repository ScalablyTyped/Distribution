package typings.reactNativeWindowsCli

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generatorCommonMod {
  
  @JSImport("@react-native-windows/cli/lib-commonjs/generator-common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def copyAndReplaceAll(
    srcPath: String,
    destPath: String,
    relativeDestDir: String,
    replacements: Replacements,
    alwaysOverwrite: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyAndReplaceAll")(srcPath.asInstanceOf[js.Any], destPath.asInstanceOf[js.Any], relativeDestDir.asInstanceOf[js.Any], replacements.asInstanceOf[js.Any], alwaysOverwrite.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def copyAndReplaceWithChangedCallback(srcPath: String, destRoot: String, relativeDestPath: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyAndReplaceWithChangedCallback")(srcPath.asInstanceOf[js.Any], destRoot.asInstanceOf[js.Any], relativeDestPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def copyAndReplaceWithChangedCallback(
    srcPath: String,
    destRoot: String,
    relativeDestPath: String,
    replacements: Unit,
    alwaysOverwrite: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyAndReplaceWithChangedCallback")(srcPath.asInstanceOf[js.Any], destRoot.asInstanceOf[js.Any], relativeDestPath.asInstanceOf[js.Any], replacements.asInstanceOf[js.Any], alwaysOverwrite.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def copyAndReplaceWithChangedCallback(srcPath: String, destRoot: String, relativeDestPath: String, replacements: Record[String, String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyAndReplaceWithChangedCallback")(srcPath.asInstanceOf[js.Any], destRoot.asInstanceOf[js.Any], relativeDestPath.asInstanceOf[js.Any], replacements.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def copyAndReplaceWithChangedCallback(
    srcPath: String,
    destRoot: String,
    relativeDestPath: String,
    replacements: Record[String, String],
    alwaysOverwrite: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyAndReplaceWithChangedCallback")(srcPath.asInstanceOf[js.Any], destRoot.asInstanceOf[js.Any], relativeDestPath.asInstanceOf[js.Any], replacements.asInstanceOf[js.Any], alwaysOverwrite.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def createDir(destPath: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createDir")(destPath.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def resolveContents(srcPath: String, replacements: Replacements): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveContents")(srcPath.asInstanceOf[js.Any], replacements.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Replacements
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var regExpPatternsToRemove: js.UndefOr[js.Array[RegExp]] = js.undefined
    
    var useMustache: js.UndefOr[Boolean] = js.undefined
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
