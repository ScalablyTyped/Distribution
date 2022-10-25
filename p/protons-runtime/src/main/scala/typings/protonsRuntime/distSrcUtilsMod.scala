package typings.protonsRuntime

import typings.protonsRuntime.mod.Reader_
import typings.protonsRuntime.mod.Writer_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsMod {
  
  @JSImport("protons-runtime/dist/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def reader(buf: js.typedarray.Uint8Array): Reader_ = ^.asInstanceOf[js.Dynamic].applyDynamic("reader")(buf.asInstanceOf[js.Any]).asInstanceOf[Reader_]
  
  inline def writer(): Writer_ = ^.asInstanceOf[js.Dynamic].applyDynamic("writer")().asInstanceOf[Writer_]
}
