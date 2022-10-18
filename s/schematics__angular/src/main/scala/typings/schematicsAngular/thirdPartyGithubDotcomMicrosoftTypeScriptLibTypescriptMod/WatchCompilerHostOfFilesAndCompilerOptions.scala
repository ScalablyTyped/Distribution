package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Host to create watch with root files and options
  */
@js.native
trait WatchCompilerHostOfFilesAndCompilerOptions[T /* <: BuilderProgram */]
  extends StObject
     with WatchCompilerHost[T] {
  
  /** Compiler options */
  var options: CompilerOptions = js.native
  
  /** Project References */
  var projectReferences: js.UndefOr[js.Array[ProjectReference]] = js.native
  
  /** root files to use to generate program */
  var rootFiles: js.Array[java.lang.String] = js.native
  
  var watchOptions: js.UndefOr[WatchOptions] = js.native
}
