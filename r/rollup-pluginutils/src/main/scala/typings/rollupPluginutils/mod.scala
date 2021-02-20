package typings.rollupPluginutils

import org.scalablytyped.runtime.StringDictionary
import typings.rollupPluginutils.anon.Resolve
import typings.std.Node
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait AttachedScope extends StObject {
    
    def addDeclaration(node: Node, isBlockDeclaration: Boolean, isVar: Boolean): Unit = js.native
    
    def contains(name: String): Boolean = js.native
    
    var declarations: StringDictionary[Boolean] = js.native
    
    var isBlockScope: Boolean = js.native
    
    var parent: js.UndefOr[AttachedScope] = js.native
  }
  object AttachedScope {
    
    @scala.inline
    def apply(
      addDeclaration: (Node, Boolean, Boolean) => Unit,
      contains: String => Boolean,
      declarations: StringDictionary[Boolean],
      isBlockScope: Boolean
    ): AttachedScope = {
      val __obj = js.Dynamic.literal(addDeclaration = js.Any.fromFunction3(addDeclaration), contains = js.Any.fromFunction1(contains), declarations = declarations.asInstanceOf[js.Any], isBlockScope = isBlockScope.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttachedScope]
    }
    
    @scala.inline
    implicit class AttachedScopeMutableBuilder[Self <: AttachedScope] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddDeclaration(value: (Node, Boolean, Boolean) => Unit): Self = StObject.set(x, "addDeclaration", js.Any.fromFunction3(value))
      
      @scala.inline
      def setContains(value: String => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeclarations(value: StringDictionary[Boolean]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBlockScope(value: Boolean): Self = StObject.set(x, "isBlockScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: AttachedScope): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    }
  }
  
  type CreateFilter_ = js.Function3[
    /* include */ js.UndefOr[(js.Array[String | RegExp]) | String | RegExp | Null], 
    /* exclude */ js.UndefOr[(js.Array[String | RegExp]) | String | RegExp | Null], 
    /* options */ js.UndefOr[Resolve], 
    js.Function1[/* id */ String | js.Any, Boolean]
  ]
  
  @js.native
  trait DataToEsmOptions extends StObject {
    
    var compact: js.UndefOr[Boolean] = js.native
    
    var indent: js.UndefOr[String] = js.native
    
    var namedExports: js.UndefOr[Boolean] = js.native
    
    var objectShorthand: js.UndefOr[Boolean] = js.native
    
    var preferConst: js.UndefOr[Boolean] = js.native
  }
  object DataToEsmOptions {
    
    @scala.inline
    def apply(): DataToEsmOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataToEsmOptions]
    }
    
    @scala.inline
    implicit class DataToEsmOptionsMutableBuilder[Self <: DataToEsmOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      @scala.inline
      def setNamedExports(value: Boolean): Self = StObject.set(x, "namedExports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamedExportsUndefined: Self = StObject.set(x, "namedExports", js.undefined)
      
      @scala.inline
      def setObjectShorthand(value: Boolean): Self = StObject.set(x, "objectShorthand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectShorthandUndefined: Self = StObject.set(x, "objectShorthand", js.undefined)
      
      @scala.inline
      def setPreferConst(value: Boolean): Self = StObject.set(x, "preferConst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferConstUndefined: Self = StObject.set(x, "preferConst", js.undefined)
    }
  }
  
  type DataToEsm_ = js.Function2[/* data */ js.Any, /* options */ js.UndefOr[DataToEsmOptions], String]
  
  type ExtractAssignedNames_ = js.Function1[/* param */ Node, js.Array[String]]
  
  type MakeLegalIdentifier_ = js.Function1[/* str */ String, String]
}
