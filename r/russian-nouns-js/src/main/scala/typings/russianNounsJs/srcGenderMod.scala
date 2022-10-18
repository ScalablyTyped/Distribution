package typings.russianNounsJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGenderMod {
  
  @js.native
  sealed trait Gender extends StObject
  @JSImport("russian-nouns-js/src/Gender", "Gender")
  @js.native
  object Gender extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Gender & String] = js.native
    
    @js.native
    sealed trait COMMON
      extends StObject
         with Gender
    /* "\\u043E\\u0431\\u0449\\u0438\\u0439" */ val COMMON: typings.russianNounsJs.srcGenderMod.Gender.COMMON & String = js.native
    
    @js.native
    sealed trait FEMININE
      extends StObject
         with Gender
    /* "\\u0436\\u0435\\u043D\\u0441\\u043A\\u0438\\u0439" */ val FEMININE: typings.russianNounsJs.srcGenderMod.Gender.FEMININE & String = js.native
    
    @js.native
    sealed trait MASCULINE
      extends StObject
         with Gender
    /* "\\u043C\\u0443\\u0436\\u0441\\u043A\\u043E\\u0439" */ val MASCULINE: typings.russianNounsJs.srcGenderMod.Gender.MASCULINE & String = js.native
    
    @js.native
    sealed trait NEUTER
      extends StObject
         with Gender
    /* "\\u0441\\u0440\\u0435\\u0434\\u043D\\u0438\\u0439" */ val NEUTER: typings.russianNounsJs.srcGenderMod.Gender.NEUTER & String = js.native
  }
}
