package typings.roarr

import typings.roarr.typesMod.LogWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createNodeWriterMod {
  
  @JSImport("roarr/dist/src/factories/createNodeWriter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createNodeWriter(): LogWriter = ^.asInstanceOf[js.Dynamic].applyDynamic("createNodeWriter")().asInstanceOf[LogWriter]
}
