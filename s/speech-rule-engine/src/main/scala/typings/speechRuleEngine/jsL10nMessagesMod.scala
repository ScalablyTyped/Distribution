package typings.speechRuleEngine

import org.scalablytyped.runtime.StringDictionary
import typings.speechRuleEngine.jsL10nTransformersMod.Combiner
import typings.speechRuleEngine.jsL10nTransformersMod.GrammarCase
import typings.speechRuleEngine.jsL10nTransformersMod.SiCombiner_
import typings.speechRuleEngine.jsL10nTransformersMod.Transformer
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsL10nMessagesMod {
  
  @JSImport("speech-rule-engine/js/l10n/messages", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ALPHABETS_(): Alphabets = ^.asInstanceOf[js.Dynamic].applyDynamic("ALPHABETS")().asInstanceOf[Alphabets]
  
  inline def FUNCTIONS_(): Functions = ^.asInstanceOf[js.Dynamic].applyDynamic("FUNCTIONS")().asInstanceOf[Functions]
  
  inline def MESSAGES_(): Messages = ^.asInstanceOf[js.Dynamic].applyDynamic("MESSAGES")().asInstanceOf[Messages]
  
  inline def NUMBERS_(): Numbers = ^.asInstanceOf[js.Dynamic].applyDynamic("NUMBERS")().asInstanceOf[Numbers]
  
  inline def SUBISO_(): SubIso = ^.asInstanceOf[js.Dynamic].applyDynamic("SUBISO")().asInstanceOf[SubIso]
  
  trait Alphabets extends StObject {
    
    var capPrefix: StringDictionary[String]
    
    def combiner(p1: String, p2: String, p3: String): String
    @JSName("combiner")
    var combiner_Original: Combiner
    
    var digitPrefix: StringDictionary[String]
    
    var digitTrans: StringDictionary[Transformer]
    
    var greekCap: js.Array[String]
    
    var greekSmall: js.Array[String]
    
    var languagePrefix: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var latinCap: js.Array[String]
    
    var latinSmall: js.Array[String]
    
    var letterTrans: StringDictionary[Transformer]
    
    var smallPrefix: StringDictionary[String]
  }
  object Alphabets {
    
    inline def apply(
      capPrefix: StringDictionary[String],
      combiner: (/* p1 */ String, /* p2 */ String, /* p3 */ String) => String,
      digitPrefix: StringDictionary[String],
      digitTrans: StringDictionary[Transformer],
      greekCap: js.Array[String],
      greekSmall: js.Array[String],
      latinCap: js.Array[String],
      latinSmall: js.Array[String],
      letterTrans: StringDictionary[Transformer],
      smallPrefix: StringDictionary[String]
    ): Alphabets = {
      val __obj = js.Dynamic.literal(capPrefix = capPrefix.asInstanceOf[js.Any], combiner = js.Any.fromFunction3(combiner), digitPrefix = digitPrefix.asInstanceOf[js.Any], digitTrans = digitTrans.asInstanceOf[js.Any], greekCap = greekCap.asInstanceOf[js.Any], greekSmall = greekSmall.asInstanceOf[js.Any], latinCap = latinCap.asInstanceOf[js.Any], latinSmall = latinSmall.asInstanceOf[js.Any], letterTrans = letterTrans.asInstanceOf[js.Any], smallPrefix = smallPrefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alphabets]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Alphabets] (val x: Self) extends AnyVal {
      
      inline def setCapPrefix(value: StringDictionary[String]): Self = StObject.set(x, "capPrefix", value.asInstanceOf[js.Any])
      
      inline def setCombiner(value: (/* p1 */ String, /* p2 */ String, /* p3 */ String) => String): Self = StObject.set(x, "combiner", js.Any.fromFunction3(value))
      
      inline def setDigitPrefix(value: StringDictionary[String]): Self = StObject.set(x, "digitPrefix", value.asInstanceOf[js.Any])
      
      inline def setDigitTrans(value: StringDictionary[Transformer]): Self = StObject.set(x, "digitTrans", value.asInstanceOf[js.Any])
      
      inline def setGreekCap(value: js.Array[String]): Self = StObject.set(x, "greekCap", value.asInstanceOf[js.Any])
      
      inline def setGreekCapVarargs(value: String*): Self = StObject.set(x, "greekCap", js.Array(value*))
      
      inline def setGreekSmall(value: js.Array[String]): Self = StObject.set(x, "greekSmall", value.asInstanceOf[js.Any])
      
      inline def setGreekSmallVarargs(value: String*): Self = StObject.set(x, "greekSmall", js.Array(value*))
      
      inline def setLanguagePrefix(value: StringDictionary[String]): Self = StObject.set(x, "languagePrefix", value.asInstanceOf[js.Any])
      
      inline def setLanguagePrefixUndefined: Self = StObject.set(x, "languagePrefix", js.undefined)
      
      inline def setLatinCap(value: js.Array[String]): Self = StObject.set(x, "latinCap", value.asInstanceOf[js.Any])
      
      inline def setLatinCapVarargs(value: String*): Self = StObject.set(x, "latinCap", js.Array(value*))
      
      inline def setLatinSmall(value: js.Array[String]): Self = StObject.set(x, "latinSmall", value.asInstanceOf[js.Any])
      
      inline def setLatinSmallVarargs(value: String*): Self = StObject.set(x, "latinSmall", js.Array(value*))
      
      inline def setLetterTrans(value: StringDictionary[Transformer]): Self = StObject.set(x, "letterTrans", value.asInstanceOf[js.Any])
      
      inline def setSmallPrefix(value: StringDictionary[String]): Self = StObject.set(x, "smallPrefix", value.asInstanceOf[js.Any])
    }
  }
  
  trait Functions extends StObject {
    
    def combineNestedFraction(p1: String, p2: String, p3: String): String
    @JSName("combineNestedFraction")
    var combineNestedFraction_Original: Combiner
    
    def combineNestedRadical(p1: String, p2: String, p3: String): String
    @JSName("combineNestedRadical")
    var combineNestedRadical_Original: Combiner
    
    def combineRootIndex(name: String, index: String): String
    
    def fontRegexp(font: String): js.RegExp
    
    def fracNestDepth(node: Element): Boolean
    
    def plural(p1: String): String
    def plural(p1: Double): String
    @JSName("plural")
    var plural_Original: Transformer
    
    def radicalNestDepth(count: Double): String
    
    def si(p1: String, p2: String): String
    @JSName("si")
    var si_Original: SiCombiner_
  }
  object Functions {
    
    inline def apply(
      combineNestedFraction: (/* p1 */ String, /* p2 */ String, /* p3 */ String) => String,
      combineNestedRadical: (/* p1 */ String, /* p2 */ String, /* p3 */ String) => String,
      combineRootIndex: (String, String) => String,
      fontRegexp: String => js.RegExp,
      fracNestDepth: Element => Boolean,
      plural: /* p1 */ String | Double => String,
      radicalNestDepth: Double => String,
      si: (/* p1 */ String, /* p2 */ String) => String
    ): Functions = {
      val __obj = js.Dynamic.literal(combineNestedFraction = js.Any.fromFunction3(combineNestedFraction), combineNestedRadical = js.Any.fromFunction3(combineNestedRadical), combineRootIndex = js.Any.fromFunction2(combineRootIndex), fontRegexp = js.Any.fromFunction1(fontRegexp), fracNestDepth = js.Any.fromFunction1(fracNestDepth), plural = js.Any.fromFunction1(plural), radicalNestDepth = js.Any.fromFunction1(radicalNestDepth), si = js.Any.fromFunction2(si))
      __obj.asInstanceOf[Functions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Functions] (val x: Self) extends AnyVal {
      
      inline def setCombineNestedFraction(value: (/* p1 */ String, /* p2 */ String, /* p3 */ String) => String): Self = StObject.set(x, "combineNestedFraction", js.Any.fromFunction3(value))
      
      inline def setCombineNestedRadical(value: (/* p1 */ String, /* p2 */ String, /* p3 */ String) => String): Self = StObject.set(x, "combineNestedRadical", js.Any.fromFunction3(value))
      
      inline def setCombineRootIndex(value: (String, String) => String): Self = StObject.set(x, "combineRootIndex", js.Any.fromFunction2(value))
      
      inline def setFontRegexp(value: String => js.RegExp): Self = StObject.set(x, "fontRegexp", js.Any.fromFunction1(value))
      
      inline def setFracNestDepth(value: Element => Boolean): Self = StObject.set(x, "fracNestDepth", js.Any.fromFunction1(value))
      
      inline def setPlural(value: /* p1 */ String | Double => String): Self = StObject.set(x, "plural", js.Any.fromFunction1(value))
      
      inline def setRadicalNestDepth(value: Double => String): Self = StObject.set(x, "radicalNestDepth", js.Any.fromFunction1(value))
      
      inline def setSi(value: (/* p1 */ String, /* p2 */ String) => String): Self = StObject.set(x, "si", js.Any.fromFunction2(value))
    }
  }
  
  trait Messages extends StObject {
    
    var MS: StringDictionary[String]
    
    var MSroots: StringDictionary[String]
    
    var embellish: StringDictionary[String | (js.Tuple2[String, String])]
    
    var enclose: StringDictionary[String | (js.Tuple2[String, String])]
    
    var font: StringDictionary[String | (js.Tuple2[String, String])]
    
    var navigate: StringDictionary[String]
    
    var regexp: StringDictionary[String]
    
    var role: StringDictionary[String | (js.Tuple2[String, String])]
    
    var unitTimes: String
  }
  object Messages {
    
    inline def apply(
      MS: StringDictionary[String],
      MSroots: StringDictionary[String],
      embellish: StringDictionary[String | (js.Tuple2[String, String])],
      enclose: StringDictionary[String | (js.Tuple2[String, String])],
      font: StringDictionary[String | (js.Tuple2[String, String])],
      navigate: StringDictionary[String],
      regexp: StringDictionary[String],
      role: StringDictionary[String | (js.Tuple2[String, String])],
      unitTimes: String
    ): Messages = {
      val __obj = js.Dynamic.literal(MS = MS.asInstanceOf[js.Any], MSroots = MSroots.asInstanceOf[js.Any], embellish = embellish.asInstanceOf[js.Any], enclose = enclose.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], navigate = navigate.asInstanceOf[js.Any], regexp = regexp.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], unitTimes = unitTimes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Messages]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Messages] (val x: Self) extends AnyVal {
      
      inline def setEmbellish(value: StringDictionary[String | (js.Tuple2[String, String])]): Self = StObject.set(x, "embellish", value.asInstanceOf[js.Any])
      
      inline def setEnclose(value: StringDictionary[String | (js.Tuple2[String, String])]): Self = StObject.set(x, "enclose", value.asInstanceOf[js.Any])
      
      inline def setFont(value: StringDictionary[String | (js.Tuple2[String, String])]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setMS(value: StringDictionary[String]): Self = StObject.set(x, "MS", value.asInstanceOf[js.Any])
      
      inline def setMSroots(value: StringDictionary[String]): Self = StObject.set(x, "MSroots", value.asInstanceOf[js.Any])
      
      inline def setNavigate(value: StringDictionary[String]): Self = StObject.set(x, "navigate", value.asInstanceOf[js.Any])
      
      inline def setRegexp(value: StringDictionary[String]): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
      
      inline def setRole(value: StringDictionary[String | (js.Tuple2[String, String])]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setUnitTimes(value: String): Self = StObject.set(x, "unitTimes", value.asInstanceOf[js.Any])
    }
  }
  
  trait Numbers extends StObject {
    
    var large: js.UndefOr[js.Array[String]] = js.undefined
    
    var numSep: String
    
    def numberToOrdinal(p1: Double, p2: Boolean): String
    @JSName("numberToOrdinal")
    var numberToOrdinal_Original: GrammarCase
    
    def numberToWords(p1: String): String
    def numberToWords(p1: Double): String
    @JSName("numberToWords")
    var numberToWords_Original: Transformer
    
    def numericOrdinal(p1: String): String
    def numericOrdinal(p1: Double): String
    @JSName("numericOrdinal")
    var numericOrdinal_Original: Transformer
    
    var ones: js.UndefOr[js.Array[String]] = js.undefined
    
    var special: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.undefined
    
    var tens: js.UndefOr[js.Array[String]] = js.undefined
    
    var vulgarSep: String
    
    def wordOrdinal(p1: String): String
    def wordOrdinal(p1: Double): String
    @JSName("wordOrdinal")
    var wordOrdinal_Original: Transformer
    
    var zero: js.UndefOr[String] = js.undefined
  }
  object Numbers {
    
    inline def apply(
      numSep: String,
      numberToOrdinal: (/* p1 */ Double, /* p2 */ Boolean) => String,
      numberToWords: /* p1 */ String | Double => String,
      numericOrdinal: /* p1 */ String | Double => String,
      vulgarSep: String,
      wordOrdinal: /* p1 */ String | Double => String
    ): Numbers = {
      val __obj = js.Dynamic.literal(numSep = numSep.asInstanceOf[js.Any], numberToOrdinal = js.Any.fromFunction2(numberToOrdinal), numberToWords = js.Any.fromFunction1(numberToWords), numericOrdinal = js.Any.fromFunction1(numericOrdinal), vulgarSep = vulgarSep.asInstanceOf[js.Any], wordOrdinal = js.Any.fromFunction1(wordOrdinal))
      __obj.asInstanceOf[Numbers]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Numbers] (val x: Self) extends AnyVal {
      
      inline def setLarge(value: js.Array[String]): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      inline def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
      
      inline def setLargeVarargs(value: String*): Self = StObject.set(x, "large", js.Array(value*))
      
      inline def setNumSep(value: String): Self = StObject.set(x, "numSep", value.asInstanceOf[js.Any])
      
      inline def setNumberToOrdinal(value: (/* p1 */ Double, /* p2 */ Boolean) => String): Self = StObject.set(x, "numberToOrdinal", js.Any.fromFunction2(value))
      
      inline def setNumberToWords(value: /* p1 */ String | Double => String): Self = StObject.set(x, "numberToWords", js.Any.fromFunction1(value))
      
      inline def setNumericOrdinal(value: /* p1 */ String | Double => String): Self = StObject.set(x, "numericOrdinal", js.Any.fromFunction1(value))
      
      inline def setOnes(value: js.Array[String]): Self = StObject.set(x, "ones", value.asInstanceOf[js.Any])
      
      inline def setOnesUndefined: Self = StObject.set(x, "ones", js.undefined)
      
      inline def setOnesVarargs(value: String*): Self = StObject.set(x, "ones", js.Array(value*))
      
      inline def setSpecial(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "special", value.asInstanceOf[js.Any])
      
      inline def setSpecialUndefined: Self = StObject.set(x, "special", js.undefined)
      
      inline def setTens(value: js.Array[String]): Self = StObject.set(x, "tens", value.asInstanceOf[js.Any])
      
      inline def setTensUndefined: Self = StObject.set(x, "tens", js.undefined)
      
      inline def setTensVarargs(value: String*): Self = StObject.set(x, "tens", js.Array(value*))
      
      inline def setVulgarSep(value: String): Self = StObject.set(x, "vulgarSep", value.asInstanceOf[js.Any])
      
      inline def setWordOrdinal(value: /* p1 */ String | Double => String): Self = StObject.set(x, "wordOrdinal", js.Any.fromFunction1(value))
      
      inline def setZero(value: String): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
      
      inline def setZeroUndefined: Self = StObject.set(x, "zero", js.undefined)
    }
  }
  
  trait SubIso extends StObject {
    
    var default: String
    
    var all: js.Array[String]
    
    var current: String
  }
  object SubIso {
    
    inline def apply(all: js.Array[String], current: String, default: String): SubIso = {
      val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubIso]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SubIso] (val x: Self) extends AnyVal {
      
      inline def setAll(value: js.Array[String]): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllVarargs(value: String*): Self = StObject.set(x, "all", js.Array(value*))
      
      inline def setCurrent(value: String): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    }
  }
}
