package typings.stdDashMocks.stdDashMocksMod

import typings.stdDashMocks.Anon_False
import typings.stdDashMocks.Anon_FalseStderr
import typings.stdDashMocks.Anon_FalseStdout
import typings.stdDashMocks.Anon_Print
import typings.stdDashMocks.Anon_Stderr
import typings.stdDashMocks.Anon_StderrStdout
import typings.stdDashMocks.Anon_Stdout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("std-mocks", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def flush(): Anon_StderrStdout = js.native
  def flush(opts: Options with Anon_FalseStderr): Anon_Stdout = js.native
  @JSName("flush")
  def flush_Anon_Stderr(opts: Options with Anon_FalseStdout): Anon_Stderr = js.native
  @JSName("flush")
  def flush_Anon_StderrStdout(opts: Options): Anon_StderrStdout = js.native
  @JSName("flush")
  def flush_Object(opts: Options with Anon_False): js.Object = js.native
  def restore(): Unit = js.native
  def restore(opts: Options): Unit = js.native
  def use(): Unit = js.native
  def use(opts: Options with Anon_Print): Unit = js.native
}

