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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("spdx-expression-parse", JSImport.Namespace)
  @js.native
  def apply(source: String): Info = js.native
  
  @js.native
  trait ConjuctionInfo extends Info {
    
    var conjunction: and | or = js.native
    
    var left: LicenseInfo | ConjuctionInfo = js.native
    
    var right: LicenseInfo | ConjuctionInfo = js.native
  }
  object ConjuctionInfo {
    
    @scala.inline
    def apply(conjunction: and | or, left: LicenseInfo | ConjuctionInfo, right: LicenseInfo | ConjuctionInfo): ConjuctionInfo = {
      val __obj = js.Dynamic.literal(conjunction = conjunction.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConjuctionInfo]
    }
    
    @scala.inline
    implicit class ConjuctionInfoMutableBuilder[Self <: ConjuctionInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConjunction(value: and | or): Self = StObject.set(x, "conjunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: LicenseInfo | ConjuctionInfo): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: LicenseInfo | ConjuctionInfo): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.spdxExpressionParse.mod.LicenseInfo
    - typings.spdxExpressionParse.mod.ConjuctionInfo
  */
  trait Info extends StObject
  object Info {
    
    @scala.inline
    def ConjuctionInfo(
      conjunction: and | or,
      left: LicenseInfo | typings.spdxExpressionParse.mod.ConjuctionInfo,
      right: LicenseInfo | typings.spdxExpressionParse.mod.ConjuctionInfo
    ): typings.spdxExpressionParse.mod.ConjuctionInfo = {
      val __obj = js.Dynamic.literal(conjunction = conjunction.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.spdxExpressionParse.mod.ConjuctionInfo]
    }
    
    @scala.inline
    def LicenseInfo(license: String): typings.spdxExpressionParse.mod.LicenseInfo = {
      val __obj = js.Dynamic.literal(license = license.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.spdxExpressionParse.mod.LicenseInfo]
    }
  }
  
  @js.native
  trait LicenseInfo extends Info {
    
    var license: String = js.native
    
    var plus: js.UndefOr[`true`] = js.native
  }
  object LicenseInfo {
    
    @scala.inline
    def apply(license: String): LicenseInfo = {
      val __obj = js.Dynamic.literal(license = license.asInstanceOf[js.Any])
      __obj.asInstanceOf[LicenseInfo]
    }
    
    @scala.inline
    implicit class LicenseInfoMutableBuilder[Self <: LicenseInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlus(value: `true`): Self = StObject.set(x, "plus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlusUndefined: Self = StObject.set(x, "plus", js.undefined)
    }
  }
  
  @js.native
  trait Token extends StObject {
    
    var string: String = js.native
    
    var `type`: OPERATOR | LICENSE | DOCUMENTREF | LICENSEREF | EXCEPTION = js.native
  }
  object Token {
    
    @scala.inline
    def apply(string: String, `type`: OPERATOR | LICENSE | DOCUMENTREF | LICENSEREF | EXCEPTION): Token = {
      val __obj = js.Dynamic.literal(string = string.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    @scala.inline
    implicit class TokenMutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: OPERATOR | LICENSE | DOCUMENTREF | LICENSEREF | EXCEPTION): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
