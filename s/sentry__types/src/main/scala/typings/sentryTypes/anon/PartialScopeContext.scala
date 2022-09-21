package typings.sentryTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typings.sentryTypes.contextMod.Contexts
import typings.sentryTypes.extraMod.Extras
import typings.sentryTypes.miscMod.Primitive
import typings.sentryTypes.scopeMod._CaptureContext
import typings.sentryTypes.sessionMod.RequestSession
import typings.sentryTypes.severityMod.Severity
import typings.sentryTypes.severityMod.SeverityLevel
import typings.sentryTypes.userMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@sentry/types.@sentry/types/types/scope.ScopeContext> */
trait PartialScopeContext
  extends StObject
     with _CaptureContext {
  
  var contexts: js.UndefOr[Contexts] = js.undefined
  
  var extra: js.UndefOr[Extras] = js.undefined
  
  var fingerprint: js.UndefOr[js.Array[String]] = js.undefined
  
  var level: js.UndefOr[Severity | SeverityLevel] = js.undefined
  
  var requestSession: js.UndefOr[RequestSession] = js.undefined
  
  var tags: js.UndefOr[StringDictionary[Primitive]] = js.undefined
  
  var user: js.UndefOr[User] = js.undefined
}
object PartialScopeContext {
  
  inline def apply(): PartialScopeContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialScopeContext]
  }
  
  extension [Self <: PartialScopeContext](x: Self) {
    
    inline def setContexts(value: Contexts): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    inline def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
    
    inline def setExtra(value: Extras): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    inline def setFingerprint(value: js.Array[String]): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setFingerprintVarargs(value: String*): Self = StObject.set(x, "fingerprint", js.Array(value*))
    
    inline def setLevel(value: Severity | SeverityLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setRequestSession(value: RequestSession): Self = StObject.set(x, "requestSession", value.asInstanceOf[js.Any])
    
    inline def setRequestSessionUndefined: Self = StObject.set(x, "requestSession", js.undefined)
    
    inline def setTags(value: StringDictionary[Primitive]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
