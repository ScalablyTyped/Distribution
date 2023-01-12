package typings.shiki.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single token with color, and optionally with explanation.
  *
  * For example:
  *
  * {
  *   "content": "shiki",
  *   "color": "#D8DEE9",
  *   "explanation": [
  *     {
  *       "content": "shiki",
  *       "scopes": [
  *         {
  *           "scopeName": "source.js",
  *           "themeMatches": []
  *         },
  *         {
  *           "scopeName": "meta.objectliteral.js",
  *           "themeMatches": []
  *         },
  *         {
  *           "scopeName": "meta.object.member.js",
  *           "themeMatches": []
  *         },
  *         {
  *           "scopeName": "meta.array.literal.js",
  *           "themeMatches": []
  *         },
  *         {
  *           "scopeName": "variable.other.object.js",
  *           "themeMatches": [
  *             {
  *               "name": "Variable",
  *               "scope": "variable.other",
  *               "settings": {
  *                 "foreground": "#D8DEE9"
  *               }
  *             },
  *             {
  *               "name": "[JavaScript] Variable Other Object",
  *               "scope": "source.js variable.other.object",
  *               "settings": {
  *                 "foreground": "#D8DEE9"
  *               }
  *             }
  *           ]
  *         }
  *       ]
  *     }
  *   ]
  * }
  *
  */
trait IThemedToken extends StObject {
  
  /**
    * 6 or 8 digit hex code representation of the token's color
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * The content of the token
    */
  var content: String
  
  /**
    * Explanation of
    *
    * - token text's matching scopes
    * - reason that token text is given a color (one matching scope matches a rule (scope -> color) in the theme)
    */
  var explanation: js.UndefOr[js.Array[IThemedTokenExplanation]] = js.undefined
  
  /**
    * Font style of token. Can be None/Italic/Bold/Underline
    */
  var fontStyle: js.UndefOr[FontStyle] = js.undefined
}
object IThemedToken {
  
  inline def apply(content: String): IThemedToken = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThemedToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IThemedToken] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setExplanation(value: js.Array[IThemedTokenExplanation]): Self = StObject.set(x, "explanation", value.asInstanceOf[js.Any])
    
    inline def setExplanationUndefined: Self = StObject.set(x, "explanation", js.undefined)
    
    inline def setExplanationVarargs(value: IThemedTokenExplanation*): Self = StObject.set(x, "explanation", js.Array(value*))
    
    inline def setFontStyle(value: FontStyle): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
  }
}
