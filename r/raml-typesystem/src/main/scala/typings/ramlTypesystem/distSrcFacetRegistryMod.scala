package typings.ramlTypesystem

import org.scalablytyped.runtime.StringDictionary
import typings.ramlTypesystem.distSrcTypesystemMod.AbstractType
import typings.ramlTypesystem.distSrcTypesystemMod.TypeInformation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFacetRegistryMod {
  
  @JSImport("raml-typesystem/dist/src/facetRegistry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-typesystem/dist/src/facetRegistry", "FacetPrototype")
  @js.native
  open class FacetPrototype protected () extends StObject {
    def this(
      _construct: js.Function0[TypeInformation],
      _constructWithValue: js.Function1[/* x */ Any, TypeInformation]
    ) = this()
    
    /* private */ var _construct: Any = js.native
    
    /* private */ var _constructWithValue: Any = js.native
    
    def createWithValue(v: Any): TypeInformation = js.native
    
    def isApplicable(t: AbstractType): Boolean = js.native
    
    def isConstraint(): Boolean = js.native
    
    def isInheritable(): Boolean = js.native
    
    def isMeta(): Boolean = js.native
    
    def isSimple(): Boolean = js.native
    
    def name(): String = js.native
    
    def newInstance(): TypeInformation = js.native
  }
  
  @JSImport("raml-typesystem/dist/src/facetRegistry", "Registry")
  @js.native
  open class Registry () extends StObject {
    
    def allMeta(): js.Array[FacetPrototype] = js.native
    
    def allPrototypes(): js.Array[FacetPrototype] = js.native
    
    def applyableTo(t: AbstractType): js.Array[FacetPrototype] = js.native
    
    def buildFacet(n: String, value: Any): TypeInformation = js.native
    
    var constraints: js.Array[FacetPrototype] = js.native
    
    def facetPrototypeWithName(n: String): FacetPrototype = js.native
    
    var known: StringDictionary[FacetPrototype] = js.native
    
    var meta: js.Array[FacetPrototype] = js.native
  }
  
  inline def getInstance(): Registry = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[Registry]
}
