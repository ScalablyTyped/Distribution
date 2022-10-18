package typings.seleniumWebdriver.mod

import typings.seleniumWebdriver.anon.Async
import typings.seleniumWebdriver.anon.AsyncBoolean
import typings.seleniumWebdriver.anon.Bridge
import typings.seleniumWebdriver.libCommandMod.Executor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("selenium-webdriver", "Actions")
@js.native
open class Actions protected ()
  extends typings.seleniumWebdriver.libInputMod.Actions {
  // region Constructors
  def this(executor: Executor) = this()
  def this(executor: Executor, options: Async) = this()
  def this(executor: Executor, options: AsyncBoolean) = this()
  def this(executor: Executor, options: Bridge) = this()
}
