package typings.seleniumWebdriver.mod

import typings.seleniumWebdriver.AnonAsync
import typings.seleniumWebdriver.AnonAsyncBoolean
import typings.seleniumWebdriver.AnonBridge
import typings.seleniumWebdriver.commandMod.Executor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver", "Actions")
@js.native
class Actions protected ()
  extends typings.seleniumWebdriver.inputMod.Actions {
  // region Constructors
  def this(executor: Executor) = this()
  def this(executor: Executor, options: AnonAsync) = this()
  def this(executor: Executor, options: AnonAsyncBoolean) = this()
  def this(executor: Executor, options: AnonBridge) = this()
}

