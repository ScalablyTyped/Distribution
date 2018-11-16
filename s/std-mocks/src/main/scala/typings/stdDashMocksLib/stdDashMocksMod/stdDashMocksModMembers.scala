package typings
package stdDashMocksLib.stdDashMocksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("std-mocks", JSImport.Namespace)
@js.native
object stdDashMocksModMembers extends js.Object {
  def flush(): stdDashMocksLib.Anon_StdoutStderr = js.native
  def flush(opts: Options with stdDashMocksLib.Anon_Stderr): stdDashMocksLib.Anon_StdoutArray = js.native
  @JSName("flush")
  def flush_Anon_StderrArray(opts: Options with stdDashMocksLib.Anon_StdoutFalse): stdDashMocksLib.Anon_StderrArray = js.native
  @JSName("flush")
  def flush_Anon_StdoutStderr(opts: Options): stdDashMocksLib.Anon_StdoutStderr = js.native
  @JSName("flush")
  def flush_Object(opts: Options with stdDashMocksLib.Anon_Stdout): js.Object = js.native
  def restore(): scala.Unit = js.native
  def restore(opts: Options): scala.Unit = js.native
  def use(): scala.Unit = js.native
  def use(opts: Options with stdDashMocksLib.Anon_Print): scala.Unit = js.native
}

