package typings.ramlTypesystem.mod

import org.scalablytyped.runtime.StringDictionary
import typings.ramlTypesystem.distSrcNominalTypesMod.IAnnotationType
import typings.ramlTypesystem.distSrcNominalTypesMod.IUniverse
import typings.ramlTypesystem.distSrcNominalTypesMod.Injector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nominalTypes {
  
  @JSImport("raml-typesystem", "nominalTypes")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-typesystem", "nominalTypes.AbstractType")
  @js.native
  open class AbstractType protected ()
    extends typings.ramlTypesystem.distSrcNominalTypesMod.AbstractType {
    def this(_name: String) = this()
    def this(_name: String, _universe: IUniverse) = this()
    def this(_name: String, _universe: Unit, _path: String) = this()
    def this(_name: String, _universe: IUniverse, _path: String) = this()
  }
  
  @JSImport("raml-typesystem", "nominalTypes.Adaptable")
  @js.native
  open class Adaptable ()
    extends typings.ramlTypesystem.distSrcNominalTypesMod.Adaptable
  /* static members */
  object Adaptable {
    
    @JSImport("raml-typesystem", "nominalTypes.Adaptable")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-typesystem", "nominalTypes.Adaptable.CLASS_IDENTIFIER_Adaptable")
    @js.native
    def CLASS_IDENTIFIER_Adaptable: Any = js.native
    inline def CLASS_IDENTIFIER_Adaptable_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_Adaptable")(x.asInstanceOf[js.Any])
    
    inline def isInstance(instance: Any): /* is raml-typesystem.raml-typesystem/dist/src/nominal-types.Adaptable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-typesystem.raml-typesystem/dist/src/nominal-types.Adaptable */ Boolean]
  }
  
  @JSImport("raml-typesystem", "nominalTypes.Annotation")
  @js.native
  open class Annotation protected ()
    extends typings.ramlTypesystem.distSrcNominalTypesMod.Annotation {
    def this(`type`: IAnnotationType, parameters: StringDictionary[Any]) = this()
  }
  
  @JSImport("raml-typesystem", "nominalTypes.Array")
  @js.native
  open class Array protected ()
    extends typings.ramlTypesystem.distSrcNominalTypesMod.Array {
    def this(_name: String) = this()
    def this(_name: String, _universe: IUniverse) = this()
    def this(_name: String, _universe: Unit, _path: String) = this()
    def this(_name: String, _universe: IUniverse, _path: String) = this()
  }
  
  @JSImport("raml-typesystem", "nominalTypes.Described")
  @js.native
  open class Described protected ()
    extends typings.ramlTypesystem.distSrcNominalTypesMod.Described {
    def this(_name: String) = this()
    def this(_name: String, _description: String) = this()
  }
  /* static members */
  object Described {
    
    @JSImport("raml-typesystem", "nominalTypes.Described")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-typesystem", "nominalTypes.Described.CLASS_IDENTIFIER_Described")
    @js.native
    def CLASS_IDENTIFIER_Described: Any = js.native
    inline def CLASS_IDENTIFIER_Described_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_Described")(x.asInstanceOf[js.Any])
    
    inline def isInstance(instance: Any): /* is raml-typesystem.raml-typesystem/dist/src/nominal-types.Described */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-typesystem.raml-typesystem/dist/src/nominal-types.Described */ Boolean]
  }
  
  @JSImport("raml-typesystem", "nominalTypes.Empty")
  @js.native
  open class Empty ()
    extends typings.ramlTypesystem.distSrcNominalTypesMod.Empty
  
  @JSImport("raml-typesystem", "nominalTypes.ExternalType")
  @js.native
  open class ExternalType protected ()
    extends typings.ramlTypesystem.distSrcNominalTypesMod.ExternalType {
    def this(_name: String) = this()
    def this(_name: String, _universe: IUniverse) = this()
    def this(_name: String, _universe: Unit, _path: String) = this()
    def this(_name: String, _universe: IUniverse, _path: String) = this()
  }
  
  @JSImport("raml-typesystem", "nominalTypes.Property")
  @js.native
  open class Property protected ()
    extends typings.ramlTypesystem.distSrcNominalTypesMod.Property {
    def this(_name: String) = this()
    def this(_name: String, _description: String) = this()
  }
  /* static members */
  object Property {
    
    @JSImport("raml-typesystem", "nominalTypes.Property")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-typesystem", "nominalTypes.Property.CLASS_IDENTIFIER_Property")
    @js.native
    def CLASS_IDENTIFIER_Property: Any = js.native
    inline def CLASS_IDENTIFIER_Property_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_Property")(x.asInstanceOf[js.Any])
    
    inline def isInstance(instance: Any): /* is raml-typesystem.raml-typesystem/dist/src/nominal-types.Property */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-typesystem.raml-typesystem/dist/src/nominal-types.Property */ Boolean]
  }
  
  @JSImport("raml-typesystem", "nominalTypes.StructuredType")
  @js.native
  open class StructuredType protected ()
    extends typings.ramlTypesystem.distSrcNominalTypesMod.StructuredType {
    def this(_name: String) = this()
    def this(_name: String, _universe: IUniverse) = this()
    def this(_name: String, _universe: Unit, _path: String) = this()
    def this(_name: String, _universe: IUniverse, _path: String) = this()
  }
  
  @JSImport("raml-typesystem", "nominalTypes.Union")
  @js.native
  open class Union protected ()
    extends typings.ramlTypesystem.distSrcNominalTypesMod.Union {
    def this(_name: String) = this()
    def this(_name: String, _universe: IUniverse) = this()
    def this(_name: String, _universe: Unit, _path: String) = this()
    def this(_name: String, _universe: IUniverse, _path: String) = this()
  }
  
  @JSImport("raml-typesystem", "nominalTypes.ValueType")
  @js.native
  open class ValueType protected ()
    extends typings.ramlTypesystem.distSrcNominalTypesMod.ValueType {
    def this(name: String) = this()
    def this(name: String, _universe: IUniverse) = this()
    def this(name: String, _universe: Unit, path: String) = this()
    def this(name: String, _universe: IUniverse, path: String) = this()
    def this(name: String, _universe: Unit, path: String, description: String) = this()
    def this(name: String, _universe: Unit, path: Unit, description: String) = this()
    def this(name: String, _universe: IUniverse, path: String, description: String) = this()
    def this(name: String, _universe: IUniverse, path: Unit, description: String) = this()
  }
  
  inline def registerInjector(i: Injector): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerInjector")(i.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
