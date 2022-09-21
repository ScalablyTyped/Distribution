package typings.pusherJs

import typings.pusherJs.dependencyLoaderMod.default
import typings.pusherJs.scriptReceiverFactoryMod.ScriptReceiverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dependenciesMod {
  
  @JSImport("pusher-js/types/src/runtimes/web/dom/dependencies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pusher-js/types/src/runtimes/web/dom/dependencies", "Dependencies")
  @js.native
  def Dependencies: default = js.native
  
  @JSImport("pusher-js/types/src/runtimes/web/dom/dependencies", "DependenciesReceivers")
  @js.native
  def DependenciesReceivers: ScriptReceiverFactory = js.native
  inline def DependenciesReceivers_=(x: ScriptReceiverFactory): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DependenciesReceivers")(x.asInstanceOf[js.Any])
  
  inline def Dependencies_=(x: default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Dependencies")(x.asInstanceOf[js.Any])
}
