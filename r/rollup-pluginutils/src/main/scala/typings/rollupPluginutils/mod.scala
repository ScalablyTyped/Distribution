package typings.rollupPluginutils

import org.scalablytyped.runtime.StringDictionary
import typings.rollupPluginutils.anon.Resolve
import typings.std.Node
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rollup-pluginutils", "addExtension")
  @js.native
  val addExtension: AddExtension_ = js.native
  
  @JSImport("rollup-pluginutils", "attachScopes")
  @js.native
  val attachScopes: AttachScopes_ = js.native
  
  @JSImport("rollup-pluginutils", "createFilter")
  @js.native
  val createFilter: CreateFilter_ = js.native
  
  @JSImport("rollup-pluginutils", "dataToEsm")
  @js.native
  val dataToEsm: DataToEsm_ = js.native
  
  @JSImport("rollup-pluginutils", "extractAssignedNames")
  @js.native
  val extractAssignedNames: ExtractAssignedNames_ = js.native
  
  @JSImport("rollup-pluginutils", "makeLegalIdentifier")
  @js.native
  val makeLegalIdentifier: MakeLegalIdentifier_ = js.native
  
  type AddExtension_ = js.Function2[/* filename */ String, /* ext */ js.UndefOr[String], String]
  
  type AttachScopes_ = js.Function2[/* ast */ Node, /* propertyName */ js.UndefOr[String], AttachedScope]
  
  trait AttachedScope extends StObject {
    
    def addDeclaration(node: Node, isBlockDeclaration: Boolean, isVar: Boolean): Unit
    
    def contains(name: String): Boolean
    
    var declarations: StringDictionary[Boolean]
    
    var isBlockScope: Boolean
    
    var parent: js.UndefOr[AttachedScope] = js.undefined
  }
  object AttachedScope {
    
    inline def apply(
      addDeclaration: (Node, Boolean, Boolean) => Unit,
      contains: String => Boolean,
      declarations: StringDictionary[Boolean],
      isBlockScope: Boolean
    ): AttachedScope = {
      val __obj = js.Dynamic.literal(addDeclaration = js.Any.fromFunction3(addDeclaration), contains = js.Any.fromFunction1(contains), declarations = declarations.asInstanceOf[js.Any], isBlockScope = isBlockScope.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttachedScope]
    }
    
    extension [Self <: AttachedScope](x: Self) {
      
      inline def setAddDeclaration(value: (Node, Boolean, Boolean) => Unit): Self = StObject.set(x, "addDeclaration", js.Any.fromFunction3(value))
      
      inline def setContains(value: String => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      
      inline def setDeclarations(value: StringDictionary[Boolean]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
      
      inline def setIsBlockScope(value: Boolean): Self = StObject.set(x, "isBlockScope", value.asInstanceOf[js.Any])
      
      inline def setParent(value: AttachedScope): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    }
  }
  
  type CreateFilter_ = js.Function3[
    /* include */ js.UndefOr[(js.Array[String | RegExp]) | String | RegExp | Null], 
    /* exclude */ js.UndefOr[(js.Array[String | RegExp]) | String | RegExp | Null], 
    /* options */ js.UndefOr[Resolve], 
    js.Function1[/* id */ String | js.Any, Boolean]
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
  
  type DataToEsm_ = js.Function2[/* data */ js.Any, /* options */ js.UndefOr[DataToEsmOptions], String]
  
  type ExtractAssignedNames_ = js.Function1[/* param */ Node, js.Array[String]]
  
  type MakeLegalIdentifier_ = js.Function1[/* str */ String, String]
}
