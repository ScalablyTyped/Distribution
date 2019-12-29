package typings.stdDashMocks.stdDashMocksMod

import typings.stdDashMocks.Anon_FalseStdout
import typings.stdDashMocks.Anon_Stderr
import typings.stdDashMocks.Anon_StderrStdout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("std-mocks", "flush")
@js.native
object flush extends js.Object {
  def apply(): Anon_StderrStdout = js.native
  def apply(opts: Options with Anon_FalseStdout): Anon_Stderr = js.native
}

