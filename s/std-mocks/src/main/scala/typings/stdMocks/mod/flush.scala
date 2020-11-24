package typings.stdMocks.mod

import typings.stdMocks.anon.Optionsstderrfalse
import typings.stdMocks.anon.Optionsstdoutfalse
import typings.stdMocks.anon.Optionsstdoutfalsestderrf
import typings.stdMocks.anon.Stderr
import typings.stdMocks.anon.StderrStdout
import typings.stdMocks.anon.Stdout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("std-mocks", "flush")
@js.native
object flush extends js.Object {
  
  def apply(): StderrStdout = js.native
  def apply(opts: Optionsstderrfalse): Stdout = js.native
  def apply(opts: Optionsstdoutfalse): Stderr = js.native
  def apply(opts: Optionsstdoutfalsestderrf): js.Object = js.native
  def apply(opts: Options): StderrStdout = js.native
}
