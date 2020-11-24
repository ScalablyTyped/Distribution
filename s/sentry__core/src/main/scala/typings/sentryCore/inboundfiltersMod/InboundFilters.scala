package typings.sentryCore.inboundfiltersMod

import typings.sentryCore.anon.PartialInboundFiltersOpti
import typings.sentryTypes.integrationMod.Integration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/core/dist/integrations/inboundfilters", "InboundFilters")
@js.native
class InboundFilters () extends Integration {
  def this(_options: PartialInboundFiltersOpti) = this()
  
  /** JSDoc */
  var _getEventFilterUrl: js.Any = js.native
  
  /** JSDoc */
  var _getPossibleEventMessages: js.Any = js.native
  
  /** JSDoc */
  var _isAllowedUrl: js.Any = js.native
  
  /** JSDoc */
  var _isDeniedUrl: js.Any = js.native
  
  /** JSDoc */
  var _isIgnoredError: js.Any = js.native
  
  /** JSDoc */
  var _isSentryError: js.Any = js.native
  
  /** JSDoc */
  var _mergeOptions: js.Any = js.native
  
  val _options: js.Any = js.native
  
  /** JSDoc */
  var _shouldDropEvent: js.Any = js.native
  
  /**
    * @inheritDoc
    */
  def setupOnce(): Unit = js.native
}
/* static members */
@JSImport("@sentry/core/dist/integrations/inboundfilters", "InboundFilters")
@js.native
object InboundFilters extends js.Object {
  
  /**
    * @inheritDoc
    */
  var id: String = js.native
}
