package typings.sinon.mod

import typings.sinonjsFakeTimers.anon.Now
import typings.sinonjsFakeTimers.mod.InstalledMethods
import typings.sinonjsFakeTimers.mod.NodeClock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.sinonjsFakeTimers.mod.GlobalTimers because Already inherited
- typings.sinonjsFakeTimers.mod.Clock because Already inherited
- typings.sinonjsFakeTimers.mod.FakeClock because Already inherited
- typings.sinonjsFakeTimers.mod.BrowserClock because var conflicts: Date_Original, loopLimit, now. Inlined performance */ @js.native
trait SinonFakeTimers
  extends StObject
     with InstalledMethods
     with NodeClock {
  
  /**
    * Mimics performance.now().
    */
  var performance: Now = js.native
  
  /**
    * Restore the faked methods.
    * Call in e.g. tearDown.
    */
  def restore(): Unit = js.native
}
