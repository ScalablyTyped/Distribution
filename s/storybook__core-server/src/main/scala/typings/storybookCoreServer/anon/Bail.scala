package typings.storybookCoreServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bail extends StObject {
  
  def bail(): js.Promise[Unit] = js.native
  def bail(e: js.Error): js.Promise[Unit] = js.native
  
  var stats: Any = js.native
  
  var totalTime: js.Tuple2[Double, Double] = js.native
}
