package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentRange
  extends StObject
     with TextRange {
  
  var hasTrailingNewLine: js.UndefOr[Boolean] = js.undefined
  
  var kind: CommentKind
}
object CommentRange {
  
  inline def apply(end: Double, kind: CommentKind, pos: Double): CommentRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommentRange] (val x: Self) extends AnyVal {
    
    inline def setHasTrailingNewLine(value: Boolean): Self = StObject.set(x, "hasTrailingNewLine", value.asInstanceOf[js.Any])
    
    inline def setHasTrailingNewLineUndefined: Self = StObject.set(x, "hasTrailingNewLine", js.undefined)
    
    inline def setKind(value: CommentKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
