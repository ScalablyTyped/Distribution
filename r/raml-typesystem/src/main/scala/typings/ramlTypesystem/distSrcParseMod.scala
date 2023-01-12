package typings.ramlTypesystem

import org.scalablytyped.runtime.StringDictionary
import typings.ramlTypesystem.anon.Key
import typings.ramlTypesystem.distSrcMetainfoMod.Annotation
import typings.ramlTypesystem.distSrcMetainfoMod.CustomFacet
import typings.ramlTypesystem.distSrcMetainfoMod.FacetDeclaration
import typings.ramlTypesystem.distSrcSchemaUtilMod.IContentProvider
import typings.ramlTypesystem.distSrcTypesystemMod.AbstractType
import typings.ramlTypesystem.distSrcTypesystemMod.TypeInformation
import typings.ramlTypesystem.distSrcTypesystemMod.TypeRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcParseMod {
  
  @JSImport("raml-typesystem/dist/src/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-typesystem/dist/src/parse", "AccumulatingRegistry")
  @js.native
  open class AccumulatingRegistry protected () extends TypeRegistry {
    def this(toParse: ParseNode, schemas: ParseNode, ts: TypeRegistry, _c: TypeCollection) = this()
    
    def get(name: String, isPropertyType: Boolean): AbstractType = js.native
    
    var parsing: StringDictionary[Boolean] = js.native
    
    /* private */ var schemas: Any = js.native
    
    /* private */ var toParse: Any = js.native
  }
  /* static members */
  object AccumulatingRegistry {
    
    @JSImport("raml-typesystem/dist/src/parse", "AccumulatingRegistry")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-typesystem/dist/src/parse", "AccumulatingRegistry.CLASS_IDENTIFIER_AccumulatingRegistry")
    @js.native
    def CLASS_IDENTIFIER_AccumulatingRegistry: Any = js.native
    inline def CLASS_IDENTIFIER_AccumulatingRegistry_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_AccumulatingRegistry")(x.asInstanceOf[js.Any])
    
    inline def isInstance(instance: Any): /* is raml-typesystem.raml-typesystem/dist/src/parse.AccumulatingRegistry */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-typesystem.raml-typesystem/dist/src/parse.AccumulatingRegistry */ Boolean]
  }
  
  @js.native
  sealed trait NodeKind extends StObject
  @JSImport("raml-typesystem/dist/src/parse", "NodeKind")
  @js.native
  object NodeKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NodeKind & Double] = js.native
    
    @js.native
    sealed trait ARRAY
      extends StObject
         with NodeKind
    /* 1 */ val ARRAY: typings.ramlTypesystem.distSrcParseMod.NodeKind.ARRAY & Double = js.native
    
    @js.native
    sealed trait MAP
      extends StObject
         with NodeKind
    /* 2 */ val MAP: typings.ramlTypesystem.distSrcParseMod.NodeKind.MAP & Double = js.native
    
    @js.native
    sealed trait SCALAR
      extends StObject
         with NodeKind
    /* 0 */ val SCALAR: typings.ramlTypesystem.distSrcParseMod.NodeKind.SCALAR & Double = js.native
  }
  
  @JSImport("raml-typesystem/dist/src/parse", "PropertyBean")
  @js.native
  open class PropertyBean () extends StObject {
    
    def add(t: AbstractType, typePath: js.Array[String]): Unit = js.native
    
    var additonal: Boolean = js.native
    
    var annotations: js.Array[Key] = js.native
    
    var id: String = js.native
    
    var optional: Boolean = js.native
    
    var regExp: Boolean = js.native
    
    var `type`: AbstractType = js.native
  }
  
  @JSImport("raml-typesystem/dist/src/parse", "TypeCollection")
  @js.native
  open class TypeCollection protected () extends StObject {
    def this(_id: String) = this()
    
    /* private */ var _annotationTypeMap: Any = js.native
    
    /* private */ var _annotationTypes: Any = js.native
    
    /* private */ var _id: Any = js.native
    
    /* private */ var _typeMap: Any = js.native
    
    /* private */ var _types: Any = js.native
    
    def add(t: AbstractType): Unit = js.native
    
    def addAnnotationType(t: AbstractType): Unit = js.native
    
    def addLibrary(n: String, t: TypeCollection): Unit = js.native
    
    def annotationTypes(): js.Array[AbstractType] = js.native
    
    def getAnnotationType(name: String): AbstractType = js.native
    
    def getAnnotationTypeRegistry(): TypeRegistry = js.native
    
    def getType(name: String): AbstractType = js.native
    
    def getTypeRegistry(): TypeRegistry = js.native
    
    def id(): String = js.native
    
    def libraries(): StringDictionary[TypeCollection] = js.native
    
    def library(n: String): TypeCollection = js.native
    
    def types(): js.Array[AbstractType] = js.native
    
    /* private */ var uses: Any = js.native
  }
  
  @JSImport("raml-typesystem/dist/src/parse", "TypeProto")
  @js.native
  open class TypeProto () extends StObject {
    
    var additionalProperties: Boolean = js.native
    
    var annotations: js.Array[Annotation] = js.native
    
    var basicFacets: js.Array[TypeInformation] = js.native
    
    var customFacets: js.Array[CustomFacet] = js.native
    
    var facetDeclarations: js.Array[FacetDeclaration] = js.native
    
    var name: String = js.native
    
    var notAScalar: Boolean = js.native
    
    var properties: js.Array[PropertyBean] = js.native
    
    var superTypes: js.Array[String] = js.native
    
    def toJSON(): Any = js.native
  }
  
  inline def parse(
    name: String,
    n: ParseNode,
    r: TypeRegistry,
    defaultsToAny: Boolean,
    annotation: Boolean,
    global: Boolean,
    ignoreTypeAttr: Boolean,
    isPropertyType: Boolean,
    typePath: js.Array[String]
  ): AbstractType = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(name.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], defaultsToAny.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any], global.asInstanceOf[js.Any], ignoreTypeAttr.asInstanceOf[js.Any], isPropertyType.asInstanceOf[js.Any], typePath.asInstanceOf[js.Any])).asInstanceOf[AbstractType]
  
  inline def parseJSON(name: String, n: Any): AbstractType = (^.asInstanceOf[js.Dynamic].applyDynamic("parseJSON")(name.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[AbstractType]
  inline def parseJSON(name: String, n: Any, r: Unit, provider: IContentProvider): AbstractType = (^.asInstanceOf[js.Dynamic].applyDynamic("parseJSON")(name.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[AbstractType]
  inline def parseJSON(name: String, n: Any, r: TypeRegistry): AbstractType = (^.asInstanceOf[js.Dynamic].applyDynamic("parseJSON")(name.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any])).asInstanceOf[AbstractType]
  inline def parseJSON(name: String, n: Any, r: TypeRegistry, provider: IContentProvider): AbstractType = (^.asInstanceOf[js.Dynamic].applyDynamic("parseJSON")(name.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[AbstractType]
  
  inline def parseJSONTypeCollection(n: Any): TypeCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("parseJSONTypeCollection")(n.asInstanceOf[js.Any]).asInstanceOf[TypeCollection]
  inline def parseJSONTypeCollection(n: Any, r: Unit, provider: IContentProvider): TypeCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("parseJSONTypeCollection")(n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[TypeCollection]
  inline def parseJSONTypeCollection(n: Any, r: TypeRegistry): TypeCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("parseJSONTypeCollection")(n.asInstanceOf[js.Any], r.asInstanceOf[js.Any])).asInstanceOf[TypeCollection]
  inline def parseJSONTypeCollection(n: Any, r: TypeRegistry, provider: IContentProvider): TypeCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("parseJSONTypeCollection")(n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[TypeCollection]
  
  inline def parsePropertyBean(n: ParseNode, tr: TypeRegistry, typePath: js.Array[String]): PropertyBean = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePropertyBean")(n.asInstanceOf[js.Any], tr.asInstanceOf[js.Any], typePath.asInstanceOf[js.Any])).asInstanceOf[PropertyBean]
  
  inline def parseTypeCollection(n: ParseNode, tr: TypeRegistry): TypeCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTypeCollection")(n.asInstanceOf[js.Any], tr.asInstanceOf[js.Any])).asInstanceOf[TypeCollection]
  inline def parseTypeCollection(n: ParseNode, tr: TypeRegistry, ignoreUses: Boolean): TypeCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTypeCollection")(n.asInstanceOf[js.Any], tr.asInstanceOf[js.Any], ignoreUses.asInstanceOf[js.Any])).asInstanceOf[TypeCollection]
  
  inline def parseTypes(n: Any): TypeCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTypes")(n.asInstanceOf[js.Any]).asInstanceOf[TypeCollection]
  inline def parseTypes(n: Any, tr: TypeRegistry): TypeCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTypes")(n.asInstanceOf[js.Any], tr.asInstanceOf[js.Any])).asInstanceOf[TypeCollection]
  
  inline def storeAsJSON(ts: TypeCollection): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("storeAsJSON")(ts.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def storeAsJSON(ts: AbstractType): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("storeAsJSON")(ts.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def toProto(`type`: AbstractType): TypeProto = ^.asInstanceOf[js.Dynamic].applyDynamic("toProto")(`type`.asInstanceOf[js.Any]).asInstanceOf[TypeProto]
  
  trait ParseNode extends StObject {
    
    var anchor: js.UndefOr[js.Function0[Any]] = js.undefined
    
    def childWithKey(k: String): ParseNode
    
    def children(): js.Array[ParseNode]
    
    def getMeta(key: String): Any
    
    def key(): String
    
    def kind(): NodeKind
    
    def path(): String
    
    def value(): Any
  }
  object ParseNode {
    
    inline def apply(
      childWithKey: String => ParseNode,
      children: () => js.Array[ParseNode],
      getMeta: String => Any,
      key: () => String,
      kind: () => NodeKind,
      path: () => String,
      value: () => Any
    ): ParseNode = {
      val __obj = js.Dynamic.literal(childWithKey = js.Any.fromFunction1(childWithKey), children = js.Any.fromFunction0(children), getMeta = js.Any.fromFunction1(getMeta), key = js.Any.fromFunction0(key), kind = js.Any.fromFunction0(kind), path = js.Any.fromFunction0(path), value = js.Any.fromFunction0(value))
      __obj.asInstanceOf[ParseNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParseNode] (val x: Self) extends AnyVal {
      
      inline def setAnchor(value: () => Any): Self = StObject.set(x, "anchor", js.Any.fromFunction0(value))
      
      inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      inline def setChildWithKey(value: String => ParseNode): Self = StObject.set(x, "childWithKey", js.Any.fromFunction1(value))
      
      inline def setChildren(value: () => js.Array[ParseNode]): Self = StObject.set(x, "children", js.Any.fromFunction0(value))
      
      inline def setGetMeta(value: String => Any): Self = StObject.set(x, "getMeta", js.Any.fromFunction1(value))
      
      inline def setKey(value: () => String): Self = StObject.set(x, "key", js.Any.fromFunction0(value))
      
      inline def setKind(value: () => NodeKind): Self = StObject.set(x, "kind", js.Any.fromFunction0(value))
      
      inline def setPath(value: () => String): Self = StObject.set(x, "path", js.Any.fromFunction0(value))
      
      inline def setValue(value: () => Any): Self = StObject.set(x, "value", js.Any.fromFunction0(value))
    }
  }
}
