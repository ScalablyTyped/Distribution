package typings.pulumiAws.outputMod.codebuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebhookFilterGroupFilter extends StObject {
  
  /**
    * If set to `true`, the specified filter does *not* trigger a build. Defaults to `false`.
    */
  var excludeMatchedPattern: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For a filter that uses `EVENT` type, a comma-separated string that specifies one event: `PUSH`, `PULL_REQUEST_CREATED`, `PULL_REQUEST_UPDATED`, `PULL_REQUEST_REOPENED`. `PULL_REQUEST_MERGED` works with GitHub & GitHub Enterprise only. For a filter that uses any of the other filter types, a regular expression.
    */
  var pattern: String
  
  /**
    * The webhook filter group's type. Valid values for this parameter are: `EVENT`, `BASE_REF`, `HEAD_REF`, `ACTOR_ACCOUNT_ID`, `FILE_PATH`, `COMMIT_MESSAGE`. At least one filter group must specify `EVENT` as its type.
    */
  var `type`: String
}
object WebhookFilterGroupFilter {
  
  inline def apply(pattern: String, `type`: String): WebhookFilterGroupFilter = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookFilterGroupFilter]
  }
  
  extension [Self <: WebhookFilterGroupFilter](x: Self) {
    
    inline def setExcludeMatchedPattern(value: Boolean): Self = StObject.set(x, "excludeMatchedPattern", value.asInstanceOf[js.Any])
    
    inline def setExcludeMatchedPatternUndefined: Self = StObject.set(x, "excludeMatchedPattern", js.undefined)
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
