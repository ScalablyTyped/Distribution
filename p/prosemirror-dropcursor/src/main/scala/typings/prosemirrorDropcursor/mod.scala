package typings.prosemirrorDropcursor

import typings.prosemirrorDropcursor.anon.Color
import typings.prosemirrorState.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prosemirror-dropcursor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def dropCursor(): Plugin[js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("dropCursor")().asInstanceOf[Plugin[js.Any, js.Any]]
  @scala.inline
  def dropCursor(options: Color): Plugin[js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("dropCursor")(options.asInstanceOf[js.Any]).asInstanceOf[Plugin[js.Any, js.Any]]
}
