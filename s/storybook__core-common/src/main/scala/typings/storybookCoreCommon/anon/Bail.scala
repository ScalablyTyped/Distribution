package typings.storybookCoreCommon.anon

import typings.node.processMod.global.NodeJS.HRTime
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bail[Stats] extends StObject {
  
  def bail(): js.Promise[Unit] = js.native
  def bail(e: js.Error): js.Promise[Unit] = js.native
  
  var stats: Stats = js.native
  
  var totalTime: ReturnType[HRTime] = js.native
}
