package typings.shipitDashCli.shipitDashCliMod

import typings.node.fsMod.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var environment: String
  var stderr: WriteStream
  var stdout: WriteStream
}

object Options {
  @scala.inline
  def apply(environment: String, stderr: WriteStream, stdout: WriteStream): Options = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

