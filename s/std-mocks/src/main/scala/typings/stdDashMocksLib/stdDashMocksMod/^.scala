package typings
package stdDashMocksLib.stdDashMocksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("std-mocks", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def flush(): stdDashMocksLib.Anon_StderrStdout = js.native
  def flush(opts: stdDashMocksLib.stdDashMocksMod.Options with stdDashMocksLib.Anon_FalseStdout): stdDashMocksLib.Anon_Stderr = js.native
  @JSName("flush")
  def flush_Anon_StderrStdout(opts: stdDashMocksLib.stdDashMocksMod.Options): stdDashMocksLib.Anon_StderrStdout = js.native
  @JSName("flush")
  def flush_Anon_Stdout(opts: stdDashMocksLib.stdDashMocksMod.Options with stdDashMocksLib.Anon_FalseStderr): stdDashMocksLib.Anon_Stdout = js.native
  @JSName("flush")
  def flush_Object(opts: stdDashMocksLib.stdDashMocksMod.Options with stdDashMocksLib.Anon_False): js.Object = js.native
  def restore(): scala.Unit = js.native
  def restore(opts: stdDashMocksLib.stdDashMocksMod.Options): scala.Unit = js.native
  def use(): scala.Unit = js.native
  def use(opts: stdDashMocksLib.stdDashMocksMod.Options with stdDashMocksLib.Anon_Print): scala.Unit = js.native
}

