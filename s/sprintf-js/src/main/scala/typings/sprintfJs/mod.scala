package typings.sprintfJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sprintf-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def sprintf(format: String, args: js.Any*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sprintf")(format.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def vsprintf(format: String, args: js.Array[js.Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("vsprintf")(format.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
}
