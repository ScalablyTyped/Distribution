package typings.russianNounsJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lemmaMod {
  
  @JSImport("russian-nouns-js/src/Lemma", "Lemma")
  @js.native
  open class Lemma protected () extends StObject {
    def this(o: Lemma) = this()
    def this(o: LemmaOptions) = this()
    
    def equals(o: Lemma): Boolean = js.native
    
    def fuzzyEquals(o: Lemma): Boolean = js.native
    
    def getGender(): String = js.native
    
    def isASurname(): Boolean = js.native
    
    def isATransport(): Boolean = js.native
    
    def isAnimate(): Boolean = js.native
    
    def isIndeclinable(): Boolean = js.native
    
    def isPluraleTantum(): Boolean = js.native
    
    /**
      * @deprecated Используйте isPluraleTantum(), т.к. речь об одной лемме, а pluralia — во мн.ч. на латыни.
      * @returns {boolean}
      */
    def isPluraliaTantum(): Boolean = js.native
    
    def lower(): String = js.native
    
    def newGender(f: js.Function1[/* o */ String, String]): Lemma = js.native
    
    def newText(f: js.Function1[/* o */ String, String]): Lemma = js.native
    
    def text(): String = js.native
  }
  
  trait LemmaOptions extends StObject {
    
    var animate: js.UndefOr[Boolean] = js.undefined
    
    var gender: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: russian-nouns-js.russian-nouns-js/src/Gender.Gender[keyof russian-nouns-js.russian-nouns-js/src/Gender.Gender] */ js.Any
      ] = js.undefined
    
    var indeclinable: js.UndefOr[Boolean] = js.undefined
    
    var pluraleTantum: js.UndefOr[Boolean] = js.undefined
    
    var text: String
  }
  object LemmaOptions {
    
    inline def apply(text: String): LemmaOptions = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[LemmaOptions]
    }
    
    extension [Self <: LemmaOptions](x: Self) {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setGender(
        value: /* import warning: importer.ImportType#apply Failed type conversion: russian-nouns-js.russian-nouns-js/src/Gender.Gender[keyof russian-nouns-js.russian-nouns-js/src/Gender.Gender] */ js.Any
      ): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
      
      inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
      
      inline def setIndeclinable(value: Boolean): Self = StObject.set(x, "indeclinable", value.asInstanceOf[js.Any])
      
      inline def setIndeclinableUndefined: Self = StObject.set(x, "indeclinable", js.undefined)
      
      inline def setPluraleTantum(value: Boolean): Self = StObject.set(x, "pluraleTantum", value.asInstanceOf[js.Any])
      
      inline def setPluraleTantumUndefined: Self = StObject.set(x, "pluraleTantum", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
