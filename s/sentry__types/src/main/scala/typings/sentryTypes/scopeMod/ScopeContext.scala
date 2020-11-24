package typings.sentryTypes.scopeMod

import org.scalablytyped.runtime.StringDictionary
import typings.sentryTypes.contextMod.Contexts
import typings.sentryTypes.extraMod.Extras
import typings.sentryTypes.severityMod.Severity
import typings.sentryTypes.userMod.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScopeContext extends js.Object {
  
  var contexts: Contexts = js.native
  
  var extra: Extras = js.native
  
  var fingerprint: js.Array[String] = js.native
  
  var level: Severity = js.native
  
  var tags: StringDictionary[String] = js.native
  
  var user: User = js.native
}
object ScopeContext {
  
  @scala.inline
  def apply(
    contexts: Contexts,
    extra: Extras,
    fingerprint: js.Array[String],
    level: Severity,
    tags: StringDictionary[String],
    user: User
  ): ScopeContext = {
    val __obj = js.Dynamic.literal(contexts = contexts.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopeContext]
  }
  
  @scala.inline
  implicit class ScopeContextOps[Self <: ScopeContext] (val x: Self) extends AnyVal {
    
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
    def setExtra(value: Extras): Self = this.set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprintVarargs(value: String*): Self = this.set("fingerprint", js.Array(value :_*))
    
    @scala.inline
    def setFingerprint(value: js.Array[String]): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Severity): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: User): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
