package typings.prosemirrorDropcursor

import typings.prosemirrorDropcursor.anon.Class
import typings.prosemirrorState.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prosemirror-dropcursor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dropCursor(): Plugin[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("dropCursor")().asInstanceOf[Plugin[Any]]
  inline def dropCursor(options: Class): Plugin[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("dropCursor")(options.asInstanceOf[js.Any]).asInstanceOf[Plugin[Any]]
}
