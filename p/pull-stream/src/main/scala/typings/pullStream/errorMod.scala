package typings.pullStream

import typings.pullStream.mod.EndOrError
import typings.pullStream.mod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMod {
  
  /**
    * Create a stream with no contents (it just ends immediately).
    */
  @scala.inline
  def apply(err: EndOrError): Source[scala.Nothing] = ^.asInstanceOf[js.Dynamic].apply(err.asInstanceOf[js.Any]).asInstanceOf[Source[scala.Nothing]]
  
  @JSImport("pull-stream/sources/error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
