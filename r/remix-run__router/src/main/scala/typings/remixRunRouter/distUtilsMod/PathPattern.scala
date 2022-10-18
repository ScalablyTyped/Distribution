package typings.remixRunRouter.distUtilsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPattern[Path /* <: String */] extends StObject {
  
  /**
    * Should be `true` if the static portions of the `path` should be matched in
    * the same case.
    */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Should be `true` if this pattern should match the entire URL pathname.
    */
  var end: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A string to match against a URL pathname. May contain `:id`-style segments
    * to indicate placeholders for dynamic parameters. May also end with `/ *` to
    * indicate matching the rest of the URL pathname.
    */
  var path: Path
}
object PathPattern {
  
  inline def apply[Path /* <: String */](path: Path): PathPattern[Path] = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPattern[Path]]
  }
  
  extension [Self <: PathPattern[?], Path /* <: String */](x: Self & PathPattern[Path]) {
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    inline def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setPath(value: Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
