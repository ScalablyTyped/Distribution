package typings.raml1Parser.datamodelMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.raml1Parser.datamodelMod.StringTypeFragment
  - typings.raml1Parser.datamodelMod.NumberTypeFragment
  - typings.raml1Parser.datamodelMod.DateTypeFragment
  - typings.raml1Parser.datamodelMod.FileTypeFragment
  - typings.raml1Parser.datamodelMod.ArrayTypeFragment
  - typings.raml1Parser.datamodelMod.ObjectTypeFragment
*/
trait TypeDeclarationFragment extends StObject
object TypeDeclarationFragment {
  
  inline def ArrayTypeFragment(
    displayName: String,
    items: js.Array[TypeReference10],
    name: String,
    `type`: js.Array[TypeReference10]
  ): typings.raml1Parser.datamodelMod.ArrayTypeFragment = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.raml1Parser.datamodelMod.ArrayTypeFragment]
  }
  
  inline def DateTypeFragment(displayName: String, name: String, `type`: js.Array[TypeReference10]): typings.raml1Parser.datamodelMod.DateTypeFragment = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.raml1Parser.datamodelMod.DateTypeFragment]
  }
  
  inline def FileTypeFragment(displayName: String, name: String, `type`: js.Array[TypeReference10]): typings.raml1Parser.datamodelMod.FileTypeFragment = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.raml1Parser.datamodelMod.FileTypeFragment]
  }
  
  inline def NumberTypeFragment(displayName: String, name: String, `type`: js.Array[TypeReference10]): typings.raml1Parser.datamodelMod.NumberTypeFragment = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.raml1Parser.datamodelMod.NumberTypeFragment]
  }
  
  inline def ObjectTypeFragment(displayName: String, name: String, `type`: js.Array[TypeReference10]): typings.raml1Parser.datamodelMod.ObjectTypeFragment = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.raml1Parser.datamodelMod.ObjectTypeFragment]
  }
  
  inline def StringTypeFragment(displayName: String, name: String, `type`: js.Array[TypeReference10]): typings.raml1Parser.datamodelMod.StringTypeFragment = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.raml1Parser.datamodelMod.StringTypeFragment]
  }
}
