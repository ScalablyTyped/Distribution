package typings.sqlQueryIdentifier

import typings.sqlQueryIdentifier.libDefinesMod.ExecutionType
import typings.sqlQueryIdentifier.libDefinesMod.IdentifyOptions
import typings.sqlQueryIdentifier.libDefinesMod.IdentifyResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sql-query-identifier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getExecutionType(command: String): ExecutionType = ^.asInstanceOf[js.Dynamic].applyDynamic("getExecutionType")(command.asInstanceOf[js.Any]).asInstanceOf[ExecutionType]
  
  inline def identify(query: String): js.Array[IdentifyResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("identify")(query.asInstanceOf[js.Any]).asInstanceOf[js.Array[IdentifyResult]]
  inline def identify(query: String, options: IdentifyOptions): js.Array[IdentifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("identify")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[IdentifyResult]]
}
