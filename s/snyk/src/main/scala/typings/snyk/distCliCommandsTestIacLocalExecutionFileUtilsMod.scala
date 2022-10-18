package typings.snyk

import typings.node.NodeJS.ReadableStream
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsTestIacLocalExecutionFileUtilsMod {
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/file-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeCustomRulesBundleChecksum(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeCustomRulesBundleChecksum")().asInstanceOf[js.UndefOr[String]]
  
  inline def createIacDir(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createIacDir")().asInstanceOf[Unit]
  
  inline def extractBundle(response: ReadableStream): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractBundle")(response.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def isValidBundle(wasmPath: String, dataPath: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidBundle")(wasmPath.asInstanceOf[js.Any], dataPath.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def makeFileAndDirectoryGenerator(): Generator[Any, Unit, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeFileAndDirectoryGenerator")().asInstanceOf[Generator[Any, Unit, Any]]
  inline def makeFileAndDirectoryGenerator(root: String): Generator[Any, Unit, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeFileAndDirectoryGenerator")(root.asInstanceOf[js.Any]).asInstanceOf[Generator[Any, Unit, Any]]
  inline def makeFileAndDirectoryGenerator(root: String, maxDepth: Double): Generator[Any, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeFileAndDirectoryGenerator")(root.asInstanceOf[js.Any], maxDepth.asInstanceOf[js.Any])).asInstanceOf[Generator[Any, Unit, Any]]
  inline def makeFileAndDirectoryGenerator(root: Unit, maxDepth: Double): Generator[Any, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeFileAndDirectoryGenerator")(root.asInstanceOf[js.Any], maxDepth.asInstanceOf[js.Any])).asInstanceOf[Generator[Any, Unit, Any]]
}
