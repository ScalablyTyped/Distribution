package typings.stagehand

import typings.node.childProcessMod.ChildProcess
import typings.stagehand.libStagehandMod.default
import typings.stagehand.mod.Implementation
import typings.stagehand.mod.MessageEndpoint
import typings.stagehand.mod.Remote
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAdaptersChildProcessMod {
  
  @JSImport("stagehand/lib/adapters/child-process", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def connect[T](child: ChildProcess): js.Promise[Remote[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(child.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Remote[T]]]
  
  inline def endpointForChildProcess(child: ChildProcess): MessageEndpoint = ^.asInstanceOf[js.Dynamic].applyDynamic("endpointForChildProcess")(child.asInstanceOf[js.Any]).asInstanceOf[MessageEndpoint]
  
  inline def endpointForParentProcess(): MessageEndpoint = ^.asInstanceOf[js.Dynamic].applyDynamic("endpointForParentProcess")().asInstanceOf[MessageEndpoint]
  
  inline def launch[T](handler: Implementation[T]): js.Promise[default[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("launch")(handler.asInstanceOf[js.Any]).asInstanceOf[js.Promise[default[T]]]
}
