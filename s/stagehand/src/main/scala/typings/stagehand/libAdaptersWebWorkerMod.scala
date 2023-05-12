package typings.stagehand

import typings.stagehand.libStagehandMod.default
import typings.stagehand.mod.Implementation
import typings.stagehand.mod.MessageEndpoint
import typings.stagehand.mod.Remote
import typings.std.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAdaptersWebWorkerMod {
  
  @JSImport("stagehand/lib/adapters/web-worker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def connect[T](worker: Worker): js.Promise[Remote[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(worker.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Remote[T]]]
  
  inline def endpointForParent(): MessageEndpoint = ^.asInstanceOf[js.Dynamic].applyDynamic("endpointForParent")().asInstanceOf[MessageEndpoint]
  
  inline def endpointForWorker(worker: Worker): MessageEndpoint = ^.asInstanceOf[js.Dynamic].applyDynamic("endpointForWorker")(worker.asInstanceOf[js.Any]).asInstanceOf[MessageEndpoint]
  
  inline def launch[T](implementation: Implementation[T]): js.Promise[default[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("launch")(implementation.asInstanceOf[js.Any]).asInstanceOf[js.Promise[default[T]]]
}
