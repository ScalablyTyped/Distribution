package typings.pulumiPulumi

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debuggableMod {
  
  @JSImport("@pulumi/pulumi/runtime/debuggable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def leakedPromises(): js.Tuple2[Set[js.Promise[js.Any]], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("leakedPromises")().asInstanceOf[js.Tuple2[Set[js.Promise[js.Any]], String]]
  
  inline def promiseDebugString(p: js.Promise[js.Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("promiseDebugString")(p.asInstanceOf[js.Any]).asInstanceOf[String]
}
