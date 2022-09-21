package typings.ramlTypesystem

import typings.ramlTypesystem.nominalTypesMod.IExpandableExample
import typings.ramlTypesystem.nominalTypesMod.ITypeDefinition
import typings.ramlTypesystem.typesystemInterfacesMod.IExample
import typings.ramlTypesystem.typesystemMod.AbstractType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exampleBuilderMod {
  
  @JSImport("raml-typesystem/dist/src/exampleBuilder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def example(t: AbstractType): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("example")(t.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def exampleFromInheritedType2(inheritedType: AbstractType): js.Array[IExample] = ^.asInstanceOf[js.Dynamic].applyDynamic("exampleFromInheritedType2")(inheritedType.asInstanceOf[js.Any]).asInstanceOf[js.Array[IExample]]
  
  inline def exampleFromNominal(nominalType: ITypeDefinition): js.Array[IExpandableExample] = ^.asInstanceOf[js.Dynamic].applyDynamic("exampleFromNominal")(nominalType.asInstanceOf[js.Any]).asInstanceOf[js.Array[IExpandableExample]]
  inline def exampleFromNominal(nominalType: ITypeDefinition, collectFromSupertype: Boolean): js.Array[IExpandableExample] = (^.asInstanceOf[js.Dynamic].applyDynamic("exampleFromNominal")(nominalType.asInstanceOf[js.Any], collectFromSupertype.asInstanceOf[js.Any])).asInstanceOf[js.Array[IExpandableExample]]
}
