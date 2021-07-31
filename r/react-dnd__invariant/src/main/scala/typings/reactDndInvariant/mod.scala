package typings.reactDndInvariant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-dnd/invariant", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def invariant(condition: js.Any, format: String, args: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(condition.asInstanceOf[js.Any], format.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
