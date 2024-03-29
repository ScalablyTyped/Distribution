package typings.sentryTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typings.sentryTypes.typesContextMod.Contexts
import typings.sentryTypes.typesExtraMod.Extras
import typings.sentryTypes.typesMiscMod.Primitive
import typings.sentryTypes.typesScopeMod._CaptureContext
import typings.sentryTypes.typesSessionMod.RequestSession
import typings.sentryTypes.typesSeverityMod.Severity
import typings.sentryTypes.typesSeverityMod.SeverityLevel
import typings.sentryTypes.typesUserMod.User
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialScopeContext] (val x: Self) extends AnyVal {
    
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
