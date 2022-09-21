package typings.raml1Parser.spec10DatamodelMod

import org.scalablytyped.runtime.StringDictionary
import typings.raml1Parser.spec1Dot0CommonMod.AnnotationInstance
import typings.raml1Parser.spec1Dot0CommonMod.UsesDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.raml1Parser.spec1Dot0CommonMod.Annotable because Already inherited
- typings.raml1Parser.spec1Dot0CommonMod.FragmentDeclaration because var conflicts: __METADATA__, annotations, scalarsAnnotations. Inlined uses */ trait ExampleFragment
  extends StObject
     with ExampleSpec10 {
  
  var uses: js.UndefOr[js.Array[UsesDeclaration]] = js.undefined
}
object ExampleFragment {
  
  inline def apply(
    __METADATA__ : Any,
    annotations: StringDictionary[AnnotationInstance | js.Array[AnnotationInstance]],
    scalarsAnnotations: StringDictionary[js.Array[AnnotationInstance | js.Array[AnnotationInstance]]],
    structuredValue: Any,
    value: String
  ): ExampleFragment = {
    val __obj = js.Dynamic.literal(__METADATA__ = __METADATA__.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], scalarsAnnotations = scalarsAnnotations.asInstanceOf[js.Any], structuredValue = structuredValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExampleFragment]
  }
  
  extension [Self <: ExampleFragment](x: Self) {
    
    inline def setUses(value: js.Array[UsesDeclaration]): Self = StObject.set(x, "uses", value.asInstanceOf[js.Any])
    
    inline def setUsesUndefined: Self = StObject.set(x, "uses", js.undefined)
    
    inline def setUsesVarargs(value: UsesDeclaration*): Self = StObject.set(x, "uses", js.Array(value*))
  }
}
