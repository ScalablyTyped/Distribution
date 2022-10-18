package typings.raml1Parser.distTypingsSpec1Dot0SecurityMod

import org.scalablytyped.runtime.StringDictionary
import typings.raml1Parser.distTypingsSpec1Dot0CommonMod.AnnotationInstance
import typings.raml1Parser.distTypingsSpec1Dot0CommonMod.FragmentDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomSecuritySchemeFragment
  extends StObject
     with FragmentDeclaration
     with CustomSecurityScheme10
     with SecuritySchemeFragment
object CustomSecuritySchemeFragment {
  
  inline def apply(
    __METADATA__ : Any,
    annotations: StringDictionary[AnnotationInstance | js.Array[AnnotationInstance]],
    describedBy: SecuritySchemePart10,
    description: String,
    name: String,
    scalarsAnnotations: StringDictionary[js.Array[AnnotationInstance | js.Array[AnnotationInstance]]],
    settings: CustomSecuritySettings10,
    `type`: String
  ): CustomSecuritySchemeFragment = {
    val __obj = js.Dynamic.literal(__METADATA__ = __METADATA__.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], describedBy = describedBy.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scalarsAnnotations = scalarsAnnotations.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomSecuritySchemeFragment]
  }
}
