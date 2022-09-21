package typings.schematicsAngular.typescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScriptElementKind extends StObject
@JSImport("@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript", "ScriptElementKind")
@js.native
object ScriptElementKind extends StObject {
  
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ScriptElementKind & java.lang.String] = js.native
  
  @js.native
  sealed trait alias
    extends StObject
       with ScriptElementKind
  /* "alias" */ val alias: typings.schematicsAngular.typescriptMod.ScriptElementKind.alias & java.lang.String = js.native
  
  /** interface Y { ():number; } */
  @js.native
  sealed trait callSignatureElement
    extends StObject
       with ScriptElementKind
  /* "call" */ val callSignatureElement: typings.schematicsAngular.typescriptMod.ScriptElementKind.callSignatureElement & java.lang.String = js.native
  
  /** class X {} */
  @js.native
  sealed trait classElement
    extends StObject
       with ScriptElementKind
  /* "class" */ val classElement: typings.schematicsAngular.typescriptMod.ScriptElementKind.classElement & java.lang.String = js.native
  
  @js.native
  sealed trait constElement
    extends StObject
       with ScriptElementKind
  /* "const" */ val constElement: typings.schematicsAngular.typescriptMod.ScriptElementKind.constElement & java.lang.String = js.native
  
  /** interface Y { new():Y; } */
  @js.native
  sealed trait constructSignatureElement
    extends StObject
       with ScriptElementKind
  /* "construct" */ val constructSignatureElement: typings.schematicsAngular.typescriptMod.ScriptElementKind.constructSignatureElement & java.lang.String = js.native
  
  /**
    * class X { constructor() { } }
    * class X { static { } }
    */
  @js.native
  sealed trait constructorImplementationElement
    extends StObject
       with ScriptElementKind
  /* "constructor" */ val constructorImplementationElement: typings.schematicsAngular.typescriptMod.ScriptElementKind.constructorImplementationElement & java.lang.String = js.native
  
  @js.native
  sealed trait directory
    extends StObject
       with ScriptElementKind
  /* "directory" */ val directory: typings.schematicsAngular.typescriptMod.ScriptElementKind.directory & java.lang.String = js.native
  
  /** enum E */
  @js.native
  sealed trait enumElement
    extends StObject
       with ScriptElementKind
  /* "enum" */ val enumElement: typings.schematicsAngular.typescriptMod.ScriptElementKind.enumElement & java.lang.String = js.native
  
  @js.native
  sealed trait enumMemberElement
    extends StObject
       with ScriptElementKind
  /* "enum member" */ val enumMemberElement: typings.schematicsAngular.typescriptMod.ScriptElementKind.enumMemberElement & java.lang.String = js.native
  
  @js.native
  sealed trait externalModuleName
    extends StObject
       with ScriptElementKind
  /* "external module name" */ val externalModuleName: typings.schematicsAngular.typescriptMod.ScriptElementKind.externalModuleName & java.lang.String = js.native
  
  /**
    * Inside module and script only
    * function f() { }
    */
  @js.native
  sealed trait functionElement
    extends StObject
       with ScriptElementKind
  /* "function" */ val functionElement: typings.schematicsAngular.typescriptMod.ScriptElementKind.functionElement & java.lang.String = js.native
  
  /** interface Y { []:number; } */
  @js.native
  sealed trait indexSignatureElement
    extends StObject
       with ScriptElementKind
  /* "index" */ val indexSignatureElement: typings.schematicsAngular.typescriptMod.ScriptElementKind.indexSignatureElement & java.lang.String = js.native
  
  /** interface Y {} */
  @js.native
  sealed trait interfaceElement
    extends StObject
       with ScriptElementKind
  /* "interface" */ val interfaceElement: typings.schematicsAngular.typescriptMod.ScriptElementKind.interfaceElement & java.lang.String = js.native
  
  /**
    * <JsxTagName attribute1 attribute2={0} />
    * @deprecated
    */
  @js.native
  sealed trait jsxAttribute
    extends StObject
       with ScriptElementKind
  /* "JSX attribute" */ val jsxAttribute: typings.schematicsAngular.typescriptMod.ScriptElementKind.jsxAttribute & java.lang.String = js.native
  
  /** predefined type (void) or keyword (class) */
  @js.native
  sealed trait keyword
    extends StObject
       with ScriptElementKind
  /* "keyword" */ val keyword: typings.schematicsAngular.typescriptMod.ScriptElementKind.keyword & java.lang.String = js.native
  
  @js.native
  sealed trait label
    extends StObject
       with ScriptElementKind
  /* "label" */ val label: typings.schematicsAngular.typescriptMod.ScriptElementKind.label & java.lang.String = js.native
  
  @js.native
  sealed trait letElement
    extends StObject
       with ScriptElementKind
  /* "let" */ val letElement: typings.schematicsAngular.typescriptMod.ScriptElementKind.letElement & java.lang.String = js.native
  
  /** Jsdoc @link: in `{@link C link text}`, the before and after text "{@link " and "}" */
  @js.native
  sealed trait link
    extends StObject
       with ScriptElementKind
  /* "link" */ val link: typings.schematicsAngular.typescriptMod.ScriptElementKind.link & java.lang.String = js.native
  
  /** Jsdoc @link: in `{@link C link text}`, the entity name "C" */
  @js.native
  sealed trait linkName
    extends StObject
       with ScriptElementKind
  /* "link name" */ val linkName: typings.schematicsAngular.typescriptMod.ScriptElementKind.linkName & java.lang.String = js.native
  
  /** Jsdoc @link: in `{@link C link text}`, the link text "link text" */
  @js.native
  sealed trait linkText
    extends StObject
       with ScriptElementKind
  /* "link text" */ val linkText: typings.schematicsAngular.typescriptMod.ScriptElementKind.linkText & java.lang.String = js.native
  
  /** var x = class X {} */
  @js.native
  sealed trait localClassElement
    extends StObject
       with ScriptElementKind
  /* "local class" */ val localClassElement: typings.schematicsAngular.typescriptMod.ScriptElementKind.localClassElement & java.lang.String = js.native
  
  /** Inside function */
  @js.native
  sealed trait localFunctionElement
    extends StObject
       with ScriptElementKind
  /* "local function" */ val localFunctionElement: typings.schematicsAngular.typescriptMod.ScriptElementKind.localFunctionElement & java.lang.String = js.native
  
  /** Inside function */
  @js.native
  sealed trait localVariableElement
    extends StObject
       with ScriptElementKind
  /* "local var" */ val localVariableElement: typings.schematicsAngular.typescriptMod.ScriptElementKind.localVariableElement & java.lang.String = js.native
  
  /** class X { [public|private]* foo() {} } */
  @js.native
  sealed trait memberFunctionElement
    extends StObject
       with ScriptElementKind
  /* "method" */ val memberFunctionElement: typings.schematicsAngular.typescriptMod.ScriptElementKind.memberFunctionElement & java.lang.String = js.native
  
  /** class X { [public|private]* [get|set] foo:number; } */
  @js.native
  sealed trait memberGetAccessorElement
    extends StObject
       with ScriptElementKind
  /* "getter" */ val memberGetAccessorElement: typings.schematicsAngular.typescriptMod.ScriptElementKind.memberGetAccessorElement & java.lang.String = js.native
  
  @js.native
  sealed trait memberSetAccessorElement
    extends StObject
       with ScriptElementKind
  /* "setter" */ val memberSetAccessorElement: typings.schematicsAngular.typescriptMod.ScriptElementKind.memberSetAccessorElement & java.lang.String = js.native
  
  /**
    * class X { [public|private]* foo:number; }
    * interface Y { foo:number; }
    */
  @js.native
  sealed trait memberVariableElement
    extends StObject
       with ScriptElementKind
  /* "property" */ val memberVariableElement: typings.schematicsAngular.typescriptMod.ScriptElementKind.memberVariableElement & java.lang.String = js.native
  
  /** module foo {} */
  @js.native
  sealed trait moduleElement
    extends StObject
       with ScriptElementKind
  /* "module" */ val moduleElement: typings.schematicsAngular.typescriptMod.ScriptElementKind.moduleElement & java.lang.String = js.native
  
  /** function foo(*Y*: string) */
  @js.native
  sealed trait parameterElement
    extends StObject
       with ScriptElementKind
  /* "parameter" */ val parameterElement: typings.schematicsAngular.typescriptMod.ScriptElementKind.parameterElement & java.lang.String = js.native
  
  @js.native
  sealed trait primitiveType
    extends StObject
       with ScriptElementKind
  /* "primitive type" */ val primitiveType: typings.schematicsAngular.typescriptMod.ScriptElementKind.primitiveType & java.lang.String = js.native
  
  /** top level script node */
  @js.native
  sealed trait scriptElement
    extends StObject
       with ScriptElementKind
  /* "script" */ val scriptElement: typings.schematicsAngular.typescriptMod.ScriptElementKind.scriptElement & java.lang.String = js.native
  
  /** String literal */
  @js.native
  sealed trait string
    extends StObject
       with ScriptElementKind
  /* "string" */ val string: typings.schematicsAngular.typescriptMod.ScriptElementKind.string & java.lang.String = js.native
  
  /** type T = ... */
  @js.native
  sealed trait typeElement
    extends StObject
       with ScriptElementKind
  /* "type" */ val typeElement: typings.schematicsAngular.typescriptMod.ScriptElementKind.typeElement & java.lang.String = js.native
  
  @js.native
  sealed trait typeParameterElement
    extends StObject
       with ScriptElementKind
  /* "type parameter" */ val typeParameterElement: typings.schematicsAngular.typescriptMod.ScriptElementKind.typeParameterElement & java.lang.String = js.native
  
  @js.native
  sealed trait unknown
    extends StObject
       with ScriptElementKind
  /* "" */ val unknown: typings.schematicsAngular.typescriptMod.ScriptElementKind.unknown & java.lang.String = js.native
  
  /**
    * Inside module and script only
    * const v = ..
    */
  @js.native
  sealed trait variableElement
    extends StObject
       with ScriptElementKind
  /* "var" */ val variableElement: typings.schematicsAngular.typescriptMod.ScriptElementKind.variableElement & java.lang.String = js.native
  
  @js.native
  sealed trait warning
    extends StObject
       with ScriptElementKind
  /* "warning" */ val warning: typings.schematicsAngular.typescriptMod.ScriptElementKind.warning & java.lang.String = js.native
}
