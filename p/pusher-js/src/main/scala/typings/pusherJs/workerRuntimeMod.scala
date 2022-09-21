package typings.pusherJs

import org.scalablytyped.runtime.Shortcut
import typings.pusherJs.interfaceMod.Runtime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workerRuntimeMod extends Shortcut {
  
  @JSImport("pusher-js/types/src/runtimes/worker/runtime", JSImport.Default)
  @js.native
  val default: Runtime = js.native
  
  type _To = Runtime
  
  /* This means you don't have to write `default`, but can instead just say `workerRuntimeMod.foo` */
  override def _to: Runtime = default
}
