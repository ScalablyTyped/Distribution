package typings.splitArrayStream

import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("split-array-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def split(array: js.Array[js.Object], stream: Transform): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(array.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
}
