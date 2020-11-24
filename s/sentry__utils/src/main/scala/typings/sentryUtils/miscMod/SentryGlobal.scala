package typings.sentryUtils.miscMod

import typings.sentryUtils.anon.GlobalEventProcessors
import typings.sentryUtils.anon.Id
import typings.sentryUtils.anon.Integrations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Internal */
@js.native
trait SentryGlobal extends js.Object {
  
  var SENTRY_DSN: js.UndefOr[String] = js.native
  
  var SENTRY_ENVIRONMENT: js.UndefOr[String] = js.native
  
  var SENTRY_RELEASE: js.UndefOr[Id] = js.native
  
  var Sentry: js.UndefOr[Integrations] = js.native
  
  var __SENTRY__ : GlobalEventProcessors = js.native
}
object SentryGlobal {
  
  @scala.inline
  def apply(__SENTRY__ : GlobalEventProcessors): SentryGlobal = {
    val __obj = js.Dynamic.literal(__SENTRY__ = __SENTRY__.asInstanceOf[js.Any])
    __obj.asInstanceOf[SentryGlobal]
  }
  
  @scala.inline
  implicit class SentryGlobalOps[Self <: SentryGlobal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set__SENTRY__(value: GlobalEventProcessors): Self = this.set("__SENTRY__", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSENTRY_DSN(value: String): Self = this.set("SENTRY_DSN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSENTRY_DSN: Self = this.set("SENTRY_DSN", js.undefined)
    
    @scala.inline
    def setSENTRY_ENVIRONMENT(value: String): Self = this.set("SENTRY_ENVIRONMENT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSENTRY_ENVIRONMENT: Self = this.set("SENTRY_ENVIRONMENT", js.undefined)
    
    @scala.inline
    def setSENTRY_RELEASE(value: Id): Self = this.set("SENTRY_RELEASE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSENTRY_RELEASE: Self = this.set("SENTRY_RELEASE", js.undefined)
    
    @scala.inline
    def setSentry(value: Integrations): Self = this.set("Sentry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentry: Self = this.set("Sentry", js.undefined)
  }
}
