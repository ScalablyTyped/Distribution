package typings.rollupPluginutils

import org.scalablytyped.runtime.StringDictionary
import typings.estree.mod.BaseNode
import typings.rollupPluginutils.anon.Resolve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rollup/pluginutils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("@rollup/pluginutils", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@rollup/pluginutils", "default.addExtension")
    @js.native
    def addExtension: AddExtension_ = js.native
    inline def addExtension(filename: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("addExtension")(filename.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def addExtension(filename: String, ext: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addExtension")(filename.asInstanceOf[js.Any], ext.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def addExtension_=(x: AddExtension_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addExtension")(x.asInstanceOf[js.Any])
    
    @JSImport("@rollup/pluginutils", "default.attachScopes")
    @js.native
    def attachScopes: AttachScopes_ = js.native
    inline def attachScopes(ast: BaseNode): AttachedScope = ^.asInstanceOf[js.Dynamic].applyDynamic("attachScopes")(ast.asInstanceOf[js.Any]).asInstanceOf[AttachedScope]
    inline def attachScopes(ast: BaseNode, propertyName: String): AttachedScope = (^.asInstanceOf[js.Dynamic].applyDynamic("attachScopes")(ast.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any])).asInstanceOf[AttachedScope]
    inline def attachScopes_=(x: AttachScopes_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("attachScopes")(x.asInstanceOf[js.Any])
    
    inline def createFilter(): js.Function1[/* id */ String | Any, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")().asInstanceOf[js.Function1[/* id */ String | Any, Boolean]]
    inline def createFilter(include: Unit, exclude: Unit, options: Resolve): js.Function1[/* id */ String | Any, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")(include.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* id */ String | Any, Boolean]]
    inline def createFilter(include: Unit, exclude: FilterPattern): js.Function1[/* id */ String | Any, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")(include.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* id */ String | Any, Boolean]]
    inline def createFilter(include: Unit, exclude: FilterPattern, options: Resolve): js.Function1[/* id */ String | Any, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")(include.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* id */ String | Any, Boolean]]
    inline def createFilter(include: FilterPattern): js.Function1[/* id */ String | Any, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")(include.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* id */ String | Any, Boolean]]
    inline def createFilter(include: FilterPattern, exclude: Unit, options: Resolve): js.Function1[/* id */ String | Any, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")(include.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* id */ String | Any, Boolean]]
    inline def createFilter(include: FilterPattern, exclude: FilterPattern): js.Function1[/* id */ String | Any, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")(include.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* id */ String | Any, Boolean]]
    inline def createFilter(include: FilterPattern, exclude: FilterPattern, options: Resolve): js.Function1[/* id */ String | Any, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")(include.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* id */ String | Any, Boolean]]
    @JSImport("@rollup/pluginutils", "default.createFilter")
    @js.native
    def createFilter_Fdefault: CreateFilter_ = js.native
    
    inline def createFilter_Fdefault_=(x: CreateFilter_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createFilter")(x.asInstanceOf[js.Any])
    
    @JSImport("@rollup/pluginutils", "default.dataToEsm")
    @js.native
    def dataToEsm: DataToEsm_ = js.native
    inline def dataToEsm(data: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dataToEsm")(data.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def dataToEsm(data: Any, options: DataToEsmOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dataToEsm")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def dataToEsm_=(x: DataToEsm_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataToEsm")(x.asInstanceOf[js.Any])
    
    @JSImport("@rollup/pluginutils", "default.extractAssignedNames")
    @js.native
    def extractAssignedNames: ExtractAssignedNames_ = js.native
    inline def extractAssignedNames(param: BaseNode): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractAssignedNames")(param.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def extractAssignedNames_=(x: ExtractAssignedNames_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extractAssignedNames")(x.asInstanceOf[js.Any])
    
    @JSImport("@rollup/pluginutils", "default.makeLegalIdentifier")
    @js.native
    def makeLegalIdentifier: MakeLegalIdentifier_ = js.native
    inline def makeLegalIdentifier(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("makeLegalIdentifier")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def makeLegalIdentifier_=(x: MakeLegalIdentifier_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("makeLegalIdentifier")(x.asInstanceOf[js.Any])
    
    @JSImport("@rollup/pluginutils", "default.normalizePath")
    @js.native
    def normalizePath: NormalizePath_ = js.native
    inline def normalizePath(filename: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePath")(filename.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def normalizePath_=(x: NormalizePath_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("normalizePath")(x.asInstanceOf[js.Any])
  }
  
  inline def addExtension(filename: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("addExtension")(filename.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def addExtension(filename: String, ext: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addExtension")(filename.asInstanceOf[js.Any], ext.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def attachScopes(ast: BaseNode): AttachedScope = ^.asInstanceOf[js.Dynamic].applyDynamic("attachScopes")(ast.asInstanceOf[js.Any]).asInstanceOf[AttachedScope]
  inline def attachScopes(ast: BaseNode, propertyName: String): AttachedScope = (^.asInstanceOf[js.Dynamic].applyDynamic("attachScopes")(ast.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any])).asInstanceOf[AttachedScope]
  
  inline def createFilter(): js.Function1[/* id */ String | Any, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")().asInstanceOf[js.Function1[/* id */ String | Any, Boolean]]
  inline def createFilter(include: Unit, exclude: Unit, options: Resolve): js.Function1[/* id */ String | Any, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")(include.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* id */ String | Any, Boolean]]
  inline def createFilter(include: Unit, exclude: FilterPattern): js.Function1[/* id */ String | Any, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")(include.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* id */ String | Any, Boolean]]
  inline def createFilter(include: Unit, exclude: FilterPattern, options: Resolve): js.Function1[/* id */ String | Any, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")(include.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* id */ String | Any, Boolean]]
  inline def createFilter(include: FilterPattern): js.Function1[/* id */ String | Any, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")(include.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* id */ String | Any, Boolean]]
  inline def createFilter(include: FilterPattern, exclude: Unit, options: Resolve): js.Function1[/* id */ String | Any, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")(include.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* id */ String | Any, Boolean]]
  inline def createFilter(include: FilterPattern, exclude: FilterPattern): js.Function1[/* id */ String | Any, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")(include.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* id */ String | Any, Boolean]]
  inline def createFilter(include: FilterPattern, exclude: FilterPattern, options: Resolve): js.Function1[/* id */ String | Any, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")(include.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* id */ String | Any, Boolean]]
  
  inline def dataToEsm(data: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dataToEsm")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def dataToEsm(data: Any, options: DataToEsmOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dataToEsm")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def extractAssignedNames(param: BaseNode): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractAssignedNames")(param.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def makeLegalIdentifier(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("makeLegalIdentifier")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def normalizePath(filename: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePath")(filename.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type AddExtension_ = js.Function2[/* filename */ String, /* ext */ js.UndefOr[String], String]
  
  type AttachScopes_ = js.Function2[/* ast */ BaseNode, /* propertyName */ js.UndefOr[String], AttachedScope]
  
  trait AttachedScope extends StObject {
    
    def addDeclaration(node: BaseNode, isBlockDeclaration: Boolean, isVar: Boolean): Unit
    
    def contains(name: String): Boolean
    
    var declarations: StringDictionary[Boolean]
    
    var isBlockScope: Boolean
    
    var parent: js.UndefOr[AttachedScope] = js.undefined
  }
  object AttachedScope {
    
    inline def apply(
      addDeclaration: (BaseNode, Boolean, Boolean) => Unit,
      contains: String => Boolean,
      declarations: StringDictionary[Boolean],
      isBlockScope: Boolean
    ): AttachedScope = {
      val __obj = js.Dynamic.literal(addDeclaration = js.Any.fromFunction3(addDeclaration), contains = js.Any.fromFunction1(contains), declarations = declarations.asInstanceOf[js.Any], isBlockScope = isBlockScope.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttachedScope]
    }
    
    extension [Self <: AttachedScope](x: Self) {
      
      inline def setAddDeclaration(value: (BaseNode, Boolean, Boolean) => Unit): Self = StObject.set(x, "addDeclaration", js.Any.fromFunction3(value))
      
      inline def setContains(value: String => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      
      inline def setDeclarations(value: StringDictionary[Boolean]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
      
      inline def setIsBlockScope(value: Boolean): Self = StObject.set(x, "isBlockScope", value.asInstanceOf[js.Any])
      
      inline def setParent(value: AttachedScope): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    }
  }
  
  type CreateFilter_ = js.Function3[
    /* include */ js.UndefOr[FilterPattern], 
    /* exclude */ js.UndefOr[FilterPattern], 
    /* options */ js.UndefOr[Resolve], 
    js.Function1[/* id */ String | Any, Boolean]
  ]
  
  trait DataToEsmOptions extends StObject {
    
    var compact: js.UndefOr[Boolean] = js.undefined
    
    var indent: js.UndefOr[String] = js.undefined
    
    var namedExports: js.UndefOr[Boolean] = js.undefined
    
    var objectShorthand: js.UndefOr[Boolean] = js.undefined
    
    var preferConst: js.UndefOr[Boolean] = js.undefined
  }
  object DataToEsmOptions {
    
    inline def apply(): DataToEsmOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataToEsmOptions]
    }
    
    extension [Self <: DataToEsmOptions](x: Self) {
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setNamedExports(value: Boolean): Self = StObject.set(x, "namedExports", value.asInstanceOf[js.Any])
      
      inline def setNamedExportsUndefined: Self = StObject.set(x, "namedExports", js.undefined)
      
      inline def setObjectShorthand(value: Boolean): Self = StObject.set(x, "objectShorthand", value.asInstanceOf[js.Any])
      
      inline def setObjectShorthandUndefined: Self = StObject.set(x, "objectShorthand", js.undefined)
      
      inline def setPreferConst(value: Boolean): Self = StObject.set(x, "preferConst", value.asInstanceOf[js.Any])
      
      inline def setPreferConstUndefined: Self = StObject.set(x, "preferConst", js.undefined)
    }
  }
  
  type DataToEsm_ = js.Function2[/* data */ Any, /* options */ js.UndefOr[DataToEsmOptions], String]
  
  type ExtractAssignedNames_ = js.Function1[/* param */ BaseNode, js.Array[String]]
  
  type FilterPattern = (js.Array[String | js.RegExp]) | String | js.RegExp | Null
  
  type MakeLegalIdentifier_ = js.Function1[/* str */ String, String]
  
  type NormalizePath_ = js.Function1[/* filename */ String, String]
}
