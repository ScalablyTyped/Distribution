package typings.splashy

import typings.node.Buffer
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("splashy", JSImport.Namespace)
  @js.native
  def apply(source: ImageSource): js.Promise[js.Array[String]] = js.native
  
  type ImageSource = String | HTMLImageElement | Buffer
}
