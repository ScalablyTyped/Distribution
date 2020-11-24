package typings.protractor.mod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request to switch to a frame could not be satisfied because the frame
  * could not be found.
  */
@JSImport("protractor", "error.NoSuchFrameError")
@js.native
class NoSuchFrameError ()
  extends typings.seleniumWebdriver.mod.error.NoSuchFrameError {
  def this(message: String) = this()
}
