package typings.sentryTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typings.sentryTypes.contextMod.Contexts
import typings.sentryTypes.extraMod.Extras
import typings.sentryTypes.scopeMod._CaptureContext
import typings.sentryTypes.severityMod.Severity
import typings.sentryTypes.userMod.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@sentry/types.@sentry/types/dist/scope.ScopeContext> */
@js.native
trait PartialScopeContext extends _CaptureContext {
  
  var contexts: js.UndefOr[Contexts] = js.native
  
  var extra: js.UndefOr[Extras] = js.native
  
  var fingerprint: js.UndefOr[js.Array[String]] = js.native
  
  var level: js.UndefOr[Severity] = js.native
  
  var tags: js.UndefOr[StringDictionary[String]] = js.native
  
  var user: js.UndefOr[User] = js.native
}
object PartialScopeContext {
  
  @scala.inline
  def apply(): PartialScopeContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialScopeContext]
  }
  
  @scala.inline
  implicit class PartialScopeContextOps[Self <: PartialScopeContext] (val x: Self) extends AnyVal {
    
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
    def setContexts(value: Contexts): Self = this.set("contexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContexts: Self = this.set("contexts", js.undefined)
    
    @scala.inline
    def setExtra(value: Extras): Self = this.set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    
    @scala.inline
    def setFingerprintVarargs(value: String*): Self = this.set("fingerprint", js.Array(value :_*))
    
    @scala.inline
    def setFingerprint(value: js.Array[String]): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    
    @scala.inline
    def setLevel(value: Severity): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setUser(value: User): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
