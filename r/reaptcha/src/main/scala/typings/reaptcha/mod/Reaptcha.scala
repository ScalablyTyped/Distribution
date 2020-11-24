package typings.reaptcha.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reaptcha
  extends Component[ReaptchaProps, js.Object, js.Any] {
  
  def execute(): js.Promise[Unit] = js.native
  
  def getResponse(): js.Promise[String] = js.native
  
  def renderExplicitly(): js.Promise[Unit] = js.native
  
  def reset(): js.Promise[Unit] = js.native
}
