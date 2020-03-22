package typings.stdMocks.mod

import typings.stdMocks.AnonStderr
import typings.stdMocks.AnonStderrStdout
import typings.stdMocks.AnonStdout
import typings.stdMocks.Optionsstderrfalse
import typings.stdMocks.Optionsstdoutfalse
import typings.stdMocks.Optionsstdoutfalsestderrf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("std-mocks", "flush")
@js.native
object flush extends js.Object {
  def apply(): AnonStderrStdout = js.native
  def apply(opts: Optionsstderrfalse): AnonStdout = js.native
  def apply(opts: Optionsstdoutfalse): AnonStderr = js.native
  def apply(opts: Optionsstdoutfalsestderrf): js.Object = js.native
  def apply(opts: Options): AnonStderrStdout = js.native
}

