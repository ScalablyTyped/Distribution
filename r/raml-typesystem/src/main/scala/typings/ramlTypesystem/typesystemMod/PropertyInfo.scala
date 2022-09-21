package typings.ramlTypesystem.typesystemMod

import typings.ramlTypesystem.metainfoMod.FacetDeclaration
import typings.ramlTypesystem.restrictionsMod.MatchesProperty
import typings.ramlTypesystem.typesystemInterfacesMod.IAnnotation
import typings.ramlTypesystem.typesystemInterfacesMod.IParsedType
import typings.ramlTypesystem.typesystemInterfacesMod.IPropertyInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-typesystem/dist/src/typesystem", "PropertyInfo")
@js.native
open class PropertyInfo protected ()
  extends StObject
     with IPropertyInfo {
  def this(obj: FacetDeclaration) = this()
  def this(obj: MatchesProperty) = this()
  
  /* protected */ var _facetDecl: FacetDeclaration = js.native
  
  /* protected */ var _matches: MatchesProperty = js.native
  
  /* private */ var _required: Any = js.native
  
  /* private */ var additionalProperty: Any = js.native
  
  /* CompleteClass */
  override def annotations(): js.Array[IAnnotation] = js.native
  
  /* CompleteClass */
  override def declaredAt(): IParsedType = js.native
  
  /* CompleteClass */
  override def isAdditional(): Boolean = js.native
  
  /* private */ var isAdditionalProp: Any = js.native
  
  /* private */ var isFacet: Any = js.native
  
  /* private */ var isMap: Any = js.native
  
  /* CompleteClass */
  override def isPattern(): Boolean = js.native
  
  /* private */ var isProp: Any = js.native
  
  /* private */ var mapProperty: Any = js.native
  
  /* CompleteClass */
  override def name(): String = js.native
  
  /* private */ var property: Any = js.native
  
  /* CompleteClass */
  override def range(): IParsedType = js.native
  
  /* CompleteClass */
  override def required(): Boolean = js.native
  
  def setRequired(`val`: Boolean): Unit = js.native
}
