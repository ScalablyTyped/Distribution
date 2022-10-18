package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibSlnMod {
  
  @JSImport("snyk/dist/lib/sln", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parsePathsFromSln(slnFile: Any): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePathsFromSln")(slnFile.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def updateArgs(args: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateArgs")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
