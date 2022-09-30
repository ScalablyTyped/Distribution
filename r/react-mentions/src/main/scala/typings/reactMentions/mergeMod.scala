package typings.reactMentions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeMod {
  
  @JSImport("react-mentions/lib/utils/merge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def merge(target: js.Object, sources: js.Object*): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(scala.List(target.asInstanceOf[js.Any]).`++`(sources.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Object]
}
