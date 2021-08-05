package typings.recast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commentsMod {
  
  @JSImport("recast/lib/comments", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attach(comments: js.Array[js.Any], ast: js.Any, lines: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attach")(comments.asInstanceOf[js.Any], ast.asInstanceOf[js.Any], lines.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def printComments(path: js.Any, print: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("printComments")(path.asInstanceOf[js.Any], print.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
