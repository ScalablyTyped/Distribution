package typings.storybookCoreCommon.distTs3Dot9TypesMod

import typings.storybookCoreCommon.anon.Bail
import typings.storybookCoreCommon.anon.Router
import typings.storybookCoreCommon.anon.StartTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Builder[Config, Stats] extends StObject {
  
  def bail(): js.Promise[Unit] = js.native
  def bail(e: js.Error): js.Promise[Unit] = js.native
  
  def build(arg: StartTime): js.Promise[Unit | Stats] = js.native
  
  var corePresets: js.UndefOr[js.Array[String]] = js.native
  
  def getConfig(options: Options): js.Promise[Config] = js.native
  
  var overridePresets: js.UndefOr[js.Array[String]] = js.native
  
  def start(args: Router): js.Promise[Unit | Bail[Stats]] = js.native
}
