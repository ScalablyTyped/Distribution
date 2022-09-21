package typings.raml1Parser.spec1Dot0SecurityMod

import org.scalablytyped.runtime.StringDictionary
import typings.raml1Parser.spec1Dot0CommonMod.AnnotationInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.raml1Parser.spec1Dot0SecurityMod.OAuth10SecuritySchemeFragment
  - typings.raml1Parser.spec1Dot0SecurityMod.OAuth20SecuritySchemeFragment
  - typings.raml1Parser.spec1Dot0SecurityMod.PassThroughSchemeFragment
  - typings.raml1Parser.spec1Dot0SecurityMod.BasicSecuritySchemeFragment
  - typings.raml1Parser.spec1Dot0SecurityMod.DigestSecuritySchemeFragment
  - typings.raml1Parser.spec1Dot0SecurityMod.CustomSecuritySchemeFragment
*/
trait SecuritySchemeFragment extends StObject
object SecuritySchemeFragment {
  
  inline def BasicSecuritySchemeFragment(
    __METADATA__ : Any,
    annotations: StringDictionary[AnnotationInstance | js.Array[AnnotationInstance]],
    describedBy: SecuritySchemePart10,
    description: String,
    name: String,
    scalarsAnnotations: StringDictionary[js.Array[AnnotationInstance | js.Array[AnnotationInstance]]],
    settings: BasicSecuritySettings10,
    `type`: String
  ): typings.raml1Parser.spec1Dot0SecurityMod.BasicSecuritySchemeFragment = {
    val __obj = js.Dynamic.literal(__METADATA__ = __METADATA__.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], describedBy = describedBy.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scalarsAnnotations = scalarsAnnotations.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.raml1Parser.spec1Dot0SecurityMod.BasicSecuritySchemeFragment]
  }
  
  inline def CustomSecuritySchemeFragment(
    __METADATA__ : Any,
    annotations: StringDictionary[AnnotationInstance | js.Array[AnnotationInstance]],
    describedBy: SecuritySchemePart10,
    description: String,
    name: String,
    scalarsAnnotations: StringDictionary[js.Array[AnnotationInstance | js.Array[AnnotationInstance]]],
    settings: CustomSecuritySettings10,
    `type`: String
  ): typings.raml1Parser.spec1Dot0SecurityMod.CustomSecuritySchemeFragment = {
    val __obj = js.Dynamic.literal(__METADATA__ = __METADATA__.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], describedBy = describedBy.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scalarsAnnotations = scalarsAnnotations.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.raml1Parser.spec1Dot0SecurityMod.CustomSecuritySchemeFragment]
  }
  
  inline def DigestSecuritySchemeFragment(
    __METADATA__ : Any,
    annotations: StringDictionary[AnnotationInstance | js.Array[AnnotationInstance]],
    describedBy: SecuritySchemePart10,
    description: String,
    name: String,
    scalarsAnnotations: StringDictionary[js.Array[AnnotationInstance | js.Array[AnnotationInstance]]],
    settings: DigestSecuritySettings10,
    `type`: String
  ): typings.raml1Parser.spec1Dot0SecurityMod.DigestSecuritySchemeFragment = {
    val __obj = js.Dynamic.literal(__METADATA__ = __METADATA__.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], describedBy = describedBy.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scalarsAnnotations = scalarsAnnotations.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.raml1Parser.spec1Dot0SecurityMod.DigestSecuritySchemeFragment]
  }
  
  inline def OAuth10SecuritySchemeFragment(
    __METADATA__ : Any,
    annotations: StringDictionary[AnnotationInstance | js.Array[AnnotationInstance]],
    describedBy: SecuritySchemePart10,
    description: String,
    name: String,
    scalarsAnnotations: StringDictionary[js.Array[AnnotationInstance | js.Array[AnnotationInstance]]],
    settings: OAuth10SecuritySettings10,
    `type`: String
  ): typings.raml1Parser.spec1Dot0SecurityMod.OAuth10SecuritySchemeFragment = {
    val __obj = js.Dynamic.literal(__METADATA__ = __METADATA__.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], describedBy = describedBy.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scalarsAnnotations = scalarsAnnotations.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.raml1Parser.spec1Dot0SecurityMod.OAuth10SecuritySchemeFragment]
  }
  
  inline def OAuth20SecuritySchemeFragment(
    __METADATA__ : Any,
    annotations: StringDictionary[AnnotationInstance | js.Array[AnnotationInstance]],
    describedBy: SecuritySchemePart10,
    description: String,
    name: String,
    scalarsAnnotations: StringDictionary[js.Array[AnnotationInstance | js.Array[AnnotationInstance]]],
    settings: OAuth20SecuritySettings10,
    `type`: String
  ): typings.raml1Parser.spec1Dot0SecurityMod.OAuth20SecuritySchemeFragment = {
    val __obj = js.Dynamic.literal(__METADATA__ = __METADATA__.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], describedBy = describedBy.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scalarsAnnotations = scalarsAnnotations.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.raml1Parser.spec1Dot0SecurityMod.OAuth20SecuritySchemeFragment]
  }
  
  inline def PassThroughSchemeFragment(
    __METADATA__ : Any,
    annotations: StringDictionary[AnnotationInstance | js.Array[AnnotationInstance]],
    describedBy: SecuritySchemePart10,
    description: String,
    name: String,
    scalarsAnnotations: StringDictionary[js.Array[AnnotationInstance | js.Array[AnnotationInstance]]],
    settings: PassThroughSecuritySettings10,
    `type`: String
  ): typings.raml1Parser.spec1Dot0SecurityMod.PassThroughSchemeFragment = {
    val __obj = js.Dynamic.literal(__METADATA__ = __METADATA__.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], describedBy = describedBy.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scalarsAnnotations = scalarsAnnotations.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.raml1Parser.spec1Dot0SecurityMod.PassThroughSchemeFragment]
  }
}
