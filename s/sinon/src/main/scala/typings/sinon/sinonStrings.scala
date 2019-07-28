package typings.sinon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object sinonStrings {
  @js.native
  sealed trait SinonSandbox extends js.Object
  
  @js.native
  sealed trait SinonStubbedInstance extends js.Object
  
  @scala.inline
  def SinonSandbox: SinonSandbox = "SinonSandbox".asInstanceOf[SinonSandbox]
  @scala.inline
  def SinonStubbedInstance: SinonStubbedInstance = "SinonStubbedInstance".asInstanceOf[SinonStubbedInstance]
}

