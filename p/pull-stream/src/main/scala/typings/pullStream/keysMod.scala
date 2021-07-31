package typings.pullStream

import typings.pullStream.mod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keysMod {
  
  @scala.inline
  def apply(obj: js.Array[js.Any]): Source[String] = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[Source[String]]
  /**
    * Stream the key names from an object (or array).
    */
  @scala.inline
  def apply(obj: js.Object): Source[String] = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[Source[String]]
  
  @JSImport("pull-stream/sources/keys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
