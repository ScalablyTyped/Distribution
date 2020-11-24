package typings.sentryBrowser.trycatchMod

import typings.sentryBrowser.anon.PartialTryCatchOptions
import typings.sentryTypes.integrationMod.Integration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/browser/dist/integrations/trycatch", "TryCatch")
@js.native
/**
  * @inheritDoc
  */
class TryCatch () extends Integration {
  def this(options: PartialTryCatchOptions) = this()
  
  /** JSDoc */
  val _options: js.Any = js.native
  
  /** JSDoc */
  var _wrapEventTarget: js.Any = js.native
  
  /** JSDoc */
  var _wrapRAF: js.Any = js.native
  
  /** JSDoc */
  var _wrapTimeFunction: js.Any = js.native
  
  /** JSDoc */
  var _wrapXHR: js.Any = js.native
  
  /**
    * Wrap timer functions and event targets to catch errors
    * and provide better metadata.
    */
  def setupOnce(): Unit = js.native
}
/* static members */
@JSImport("@sentry/browser/dist/integrations/trycatch", "TryCatch")
@js.native
object TryCatch extends js.Object {
  
  /**
    * @inheritDoc
    */
  var id: String = js.native
}
