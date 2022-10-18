package typings.raml1Parser.distTypingsNewFormatSpec1Dot0DatamodelMod

import typings.raml1Parser.distTypingsNewFormatSpec1Dot0CommonMod.UsesDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.raml1Parser.distTypingsNewFormatSpec1Dot0CommonMod.HasSource because Already inherited
- typings.raml1Parser.distTypingsNewFormatSpec1Dot0CommonMod.Annotable because Already inherited
- typings.raml1Parser.distTypingsNewFormatSpec1Dot0CommonMod.FragmentDeclaration because var conflicts: __METADATA__, annotations, scalarsAnnotations, sourceMap. Inlined uses */ trait ExampleFragment
  extends StObject
     with ExampleSpec10 {
  
  var uses: js.UndefOr[js.Array[UsesDeclaration]] = js.undefined
}
object ExampleFragment {
  
  inline def apply(value: Any): ExampleFragment = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExampleFragment]
  }
  
  extension [Self <: ExampleFragment](x: Self) {
    
    inline def setUses(value: js.Array[UsesDeclaration]): Self = StObject.set(x, "uses", value.asInstanceOf[js.Any])
    
    inline def setUsesUndefined: Self = StObject.set(x, "uses", js.undefined)
    
    inline def setUsesVarargs(value: UsesDeclaration*): Self = StObject.set(x, "uses", js.Array(value*))
  }
}
