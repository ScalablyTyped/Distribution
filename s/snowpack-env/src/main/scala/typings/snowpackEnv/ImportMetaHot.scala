package typings.snowpackEnv

import typings.snowpackEnv.anon.Deps
import typings.snowpackEnv.anon.Module
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportMetaHot extends StObject {
  
  /** Accept the HMR update. */
  def accept(): Unit = js.native
  def accept(callback: js.Function1[/* update */ Module, Unit]): Unit = js.native
  /** Accept the HMR update with dependencies update. */
  def accept(dependencies: js.Array[String], callback: js.Function1[/* update */ Deps, Unit]): Unit = js.native
  
  /** See https://github.com/pikapkg/esm-hmr#importmetahotdata */
  var data: js.Any = js.native
  
  /** Mark this module as HMR incompatible, always reload the page. */
  def decline(): Unit = js.native
  
  /** Cleanup side-effects before load the newer version of this module. */
  def dispose(callback: js.Function0[Unit]): Unit = js.native
  
  /** Mark the HMR as invalidated to reload the whole page. */
  def invalidate(): Unit = js.native
}
