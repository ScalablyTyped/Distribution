package typings.spdxExpressionParse

import typings.spdxExpressionParse.spdxExpressionParseBooleans.`true`
import typings.spdxExpressionParse.spdxExpressionParseStrings.DOCUMENTREF
import typings.spdxExpressionParse.spdxExpressionParseStrings.EXCEPTION
import typings.spdxExpressionParse.spdxExpressionParseStrings.LICENSE
import typings.spdxExpressionParse.spdxExpressionParseStrings.LICENSEREF
import typings.spdxExpressionParse.spdxExpressionParseStrings.OPERATOR
import typings.spdxExpressionParse.spdxExpressionParseStrings.and
import typings.spdxExpressionParse.spdxExpressionParseStrings.or
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(source: String): Info = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[Info]
  
  @JSImport("spdx-expression-parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ConjunctionInfo
    extends StObject
       with Info {
    
    var conjunction: and | or
    
    var left: LicenseInfo | ConjunctionInfo
    
    var right: LicenseInfo | ConjunctionInfo
  }
  object ConjunctionInfo {
    
    inline def apply(conjunction: and | or, left: LicenseInfo | ConjunctionInfo, right: LicenseInfo | ConjunctionInfo): ConjunctionInfo = {
      val __obj = js.Dynamic.literal(conjunction = conjunction.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConjunctionInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConjunctionInfo] (val x: Self) extends AnyVal {
      
      inline def setConjunction(value: and | or): Self = StObject.set(x, "conjunction", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: LicenseInfo | ConjunctionInfo): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: LicenseInfo | ConjunctionInfo): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.spdxExpressionParse.mod.LicenseInfo
    - typings.spdxExpressionParse.mod.ConjunctionInfo
  */
  trait Info extends StObject
  object Info {
    
    inline def ConjunctionInfo(
      conjunction: and | or,
      left: LicenseInfo | typings.spdxExpressionParse.mod.ConjunctionInfo,
      right: LicenseInfo | typings.spdxExpressionParse.mod.ConjunctionInfo
    ): typings.spdxExpressionParse.mod.ConjunctionInfo = {
      val __obj = js.Dynamic.literal(conjunction = conjunction.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.spdxExpressionParse.mod.ConjunctionInfo]
    }
    
    inline def LicenseInfo(license: String): typings.spdxExpressionParse.mod.LicenseInfo = {
      val __obj = js.Dynamic.literal(license = license.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.spdxExpressionParse.mod.LicenseInfo]
    }
  }
  
  trait LicenseInfo
    extends StObject
       with Info {
    
    var license: String
    
    var plus: js.UndefOr[`true`] = js.undefined
  }
  object LicenseInfo {
    
    inline def apply(license: String): LicenseInfo = {
      val __obj = js.Dynamic.literal(license = license.asInstanceOf[js.Any])
      __obj.asInstanceOf[LicenseInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LicenseInfo] (val x: Self) extends AnyVal {
      
      inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
      
      inline def setPlus(value: `true`): Self = StObject.set(x, "plus", value.asInstanceOf[js.Any])
      
      inline def setPlusUndefined: Self = StObject.set(x, "plus", js.undefined)
    }
  }
  
  trait Token extends StObject {
    
    var string: String
    
    var `type`: OPERATOR | LICENSE | DOCUMENTREF | LICENSEREF | EXCEPTION
  }
  object Token {
    
    inline def apply(string: String, `type`: OPERATOR | LICENSE | DOCUMENTREF | LICENSEREF | EXCEPTION): Token = {
      val __obj = js.Dynamic.literal(string = string.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
      
      inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setType(value: OPERATOR | LICENSE | DOCUMENTREF | LICENSEREF | EXCEPTION): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
