package typings.ramlTypesystem

import typings.ramlTypesystem.distSrcNominalTypesMod.ITypeDefinition
import typings.ramlTypesystem.distSrcNominalTypesMod.Property
import typings.ramlTypesystem.distSrcTypesystemMod.AbstractType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcNominalsMod {
  
  @JSImport("raml-typesystem/dist/src/nominals", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setPropertyConstructor(p: PropertyConstructor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPropertyConstructor")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def toNominal(t: AbstractType, callback: StringToBuiltIn): ITypeDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("toNominal")(t.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ITypeDefinition]
  inline def toNominal(t: AbstractType, callback: StringToBuiltIn, customizer: TypeCustomizer): ITypeDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("toNominal")(t.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], customizer.asInstanceOf[js.Any])).asInstanceOf[ITypeDefinition]
  
  type PropertyConstructor = js.Function1[/* name */ String, Property]
  
  type StringToBuiltIn = js.Function1[/* name */ String, ITypeDefinition]
  
  trait TypeCustomizer extends StObject {
    
    def constructProperty(n: String): Property
    
    def findCustomizer(t: AbstractType): TypeCustomizer
  }
  object TypeCustomizer {
    
    inline def apply(constructProperty: String => Property, findCustomizer: AbstractType => TypeCustomizer): TypeCustomizer = {
      val __obj = js.Dynamic.literal(constructProperty = js.Any.fromFunction1(constructProperty), findCustomizer = js.Any.fromFunction1(findCustomizer))
      __obj.asInstanceOf[TypeCustomizer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeCustomizer] (val x: Self) extends AnyVal {
      
      inline def setConstructProperty(value: String => Property): Self = StObject.set(x, "constructProperty", js.Any.fromFunction1(value))
      
      inline def setFindCustomizer(value: AbstractType => TypeCustomizer): Self = StObject.set(x, "findCustomizer", js.Any.fromFunction1(value))
    }
  }
}
