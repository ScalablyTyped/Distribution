package typings.russianNounsJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCaseMod {
  
  @js.native
  sealed trait Case extends StObject
  @JSImport("russian-nouns-js/src/Case", "Case")
  @js.native
  object Case extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Case & String] = js.native
    
    @js.native
    sealed trait ACCUSATIVE
      extends StObject
         with Case
    /* "\\u0432\\u0438\\u043D\\u0438\\u0442\\u0435\\u043B\\u044C\\u043D\\u044B\\u0439" */ val ACCUSATIVE: typings.russianNounsJs.srcCaseMod.Case.ACCUSATIVE & String = js.native
    
    @js.native
    sealed trait DATIVE
      extends StObject
         with Case
    /* "\\u0434\\u0430\\u0442\\u0435\\u043B\\u044C\\u043D\\u044B\\u0439" */ val DATIVE: typings.russianNounsJs.srcCaseMod.Case.DATIVE & String = js.native
    
    @js.native
    sealed trait GENITIVE
      extends StObject
         with Case
    /* "\\u0440\\u043E\\u0434\\u0438\\u0442\\u0435\\u043B\\u044C\\u043D\\u044B\\u0439" */ val GENITIVE: typings.russianNounsJs.srcCaseMod.Case.GENITIVE & String = js.native
    
    @js.native
    sealed trait INSTRUMENTAL
      extends StObject
         with Case
    /* "\\u0442\\u0432\\u043E\\u0440\\u0438\\u0442\\u0435\\u043B\\u044C\\u043D\\u044B\\u0439" */ val INSTRUMENTAL: typings.russianNounsJs.srcCaseMod.Case.INSTRUMENTAL & String = js.native
    
    @js.native
    sealed trait LOCATIVE
      extends StObject
         with Case
    /* "\\u043C\\u0435\\u0441\\u0442\\u043D\\u044B\\u0439" */ val LOCATIVE: typings.russianNounsJs.srcCaseMod.Case.LOCATIVE & String = js.native
    
    @js.native
    sealed trait NOMINATIVE
      extends StObject
         with Case
    /* "\\u0438\\u043C\\u0435\\u043D\\u0438\\u0442\\u0435\\u043B\\u044C\\u043D\\u044B\\u0439" */ val NOMINATIVE: typings.russianNounsJs.srcCaseMod.Case.NOMINATIVE & String = js.native
    
    @js.native
    sealed trait PREPOSITIONAL
      extends StObject
         with Case
    /* "\\u043F\\u0440\\u0435\\u0434\\u043B\\u043E\\u0436\\u043D\\u044B\\u0439" */ val PREPOSITIONAL: typings.russianNounsJs.srcCaseMod.Case.PREPOSITIONAL & String = js.native
  }
}
