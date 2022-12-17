package typings.reactDevtoolsInline.commonsMod

import typings.reactDevtoolsInline.anon.FiberID
import typings.reactDevtoolsInline.anon.RootID
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-devtools-inline/commons", "ProfilingCache")
@js.native
open class ProfilingCache protected () extends StObject {
  def this(profilerStore: ProfilerStore) = this()
  
  def getCommitTree(param0: RootID): ReturnType[typings.reactDevtoolsInline.commonsMod.getCommitTree] = js.native
  
  def getFiberCommits(param0: FiberID): js.Array[Double] = js.native
  
  def getFlamegraphChartData(options: typings.reactDevtoolsInline.anon.CommitTree): FlamegraphChartData = js.native
  
  def getRankedChartData(options: typings.reactDevtoolsInline.anon.CommitTree): RankedChartData = js.native
  
  def invalidate(): Unit = js.native
}
