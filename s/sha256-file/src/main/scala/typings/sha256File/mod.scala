package typings.sha256File

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(filename: String): String = ^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(filename: String, callback: CallbackFunction): Unit = (^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("sha256-file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type CallbackFunction = js.Function2[/* error */ Error | Null, /* sum */ String, Unit]
}
