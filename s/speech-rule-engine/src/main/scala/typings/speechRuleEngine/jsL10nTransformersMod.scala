package typings.speechRuleEngine

import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsL10nTransformersMod {
  
  @JSImport("speech-rule-engine/js/l10n/transformers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("speech-rule-engine/js/l10n/transformers", "Combiners")
  @js.native
  val Combiners: Record[String, Combiner] = js.native
  
  inline def convertVulgarFraction(node: Element): Convertible = ^.asInstanceOf[js.Dynamic].applyDynamic("convertVulgarFraction")(node.asInstanceOf[js.Any]).asInstanceOf[Convertible]
  inline def convertVulgarFraction(node: Element, over: String): Convertible = (^.asInstanceOf[js.Dynamic].applyDynamic("convertVulgarFraction")(node.asInstanceOf[js.Any], over.asInstanceOf[js.Any])).asInstanceOf[Convertible]
  
  inline def identityTransformer(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("identityTransformer")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def identityTransformer(input: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("identityTransformer")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def pluralCase(num: Double, _plural: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pluralCase")(num.asInstanceOf[js.Any], _plural.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def siCombiner(prefix: String, unit: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("siCombiner")(prefix.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def vulgarFractionSmall(node: Element, enumer: Double, denom: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("vulgarFractionSmall")(node.asInstanceOf[js.Any], enumer.asInstanceOf[js.Any], denom.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type Combiner = js.Function3[/* p1 */ String, /* p2 */ String, /* p3 */ String, String]
  
  trait Convertible extends StObject {
    
    var content: js.UndefOr[String] = js.undefined
    
    var convertible: Boolean
    
    var denominator: js.UndefOr[Double] = js.undefined
    
    var enumerator: js.UndefOr[Double] = js.undefined
  }
  object Convertible {
    
    inline def apply(convertible: Boolean): Convertible = {
      val __obj = js.Dynamic.literal(convertible = convertible.asInstanceOf[js.Any])
      __obj.asInstanceOf[Convertible]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Convertible] (val x: Self) extends AnyVal {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setConvertible(value: Boolean): Self = StObject.set(x, "convertible", value.asInstanceOf[js.Any])
      
      inline def setDenominator(value: Double): Self = StObject.set(x, "denominator", value.asInstanceOf[js.Any])
      
      inline def setDenominatorUndefined: Self = StObject.set(x, "denominator", js.undefined)
      
      inline def setEnumerator(value: Double): Self = StObject.set(x, "enumerator", value.asInstanceOf[js.Any])
      
      inline def setEnumeratorUndefined: Self = StObject.set(x, "enumerator", js.undefined)
    }
  }
  
  type GrammarCase = js.Function2[/* p1 */ Double, /* p2 */ Boolean, String]
  
  type SiCombiner_ = js.Function2[/* p1 */ String, /* p2 */ String, String]
  
  type Transformer = js.Function1[/* p1 */ String | Double, String]
}
