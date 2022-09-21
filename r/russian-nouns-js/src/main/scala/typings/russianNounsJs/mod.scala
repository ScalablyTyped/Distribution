package typings.russianNounsJs

import typings.russianNounsJs.engineMod.default
import typings.russianNounsJs.lemmaMod.Lemma
import typings.russianNounsJs.lemmaMod.LemmaOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("russian-nouns-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("russian-nouns-js", "CASES")
  @js.native
  val CASES: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CaseEnum * / any[keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CaseEnum * / any] */ js.Any
  ] = js.native
  
  @JSImport("russian-nouns-js", "Engine")
  @js.native
  open class Engine () extends default
  
  inline def createLemma(o: LemmaOptions): Lemma = ^.asInstanceOf[js.Dynamic].applyDynamic("createLemma")(o.asInstanceOf[js.Any]).asInstanceOf[Lemma]
  
  inline def getDeclension(lemma: js.Object): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeclension")(lemma.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def getDeclension(lemma: Lemma): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeclension")(lemma.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def getSchoolDeclension(lemma: Lemma): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSchoolDeclension")(lemma.asInstanceOf[js.Any]).asInstanceOf[Double]
}
