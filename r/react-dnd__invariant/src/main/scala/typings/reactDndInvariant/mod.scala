package typings.reactDndInvariant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-dnd/invariant", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def invariant(condition: Any, format: String, args: Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("invariant")((List(condition.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
}
