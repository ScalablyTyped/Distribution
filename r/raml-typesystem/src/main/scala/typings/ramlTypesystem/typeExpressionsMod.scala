package typings.ramlTypesystem

import typings.ramlTypesystem.parseMod.ParseNode
import typings.ramlTypesystem.schemaUtilMod.IContentProvider
import typings.ramlTypesystem.typesystemMod.AbstractType
import typings.ramlTypesystem.typesystemMod.TypeRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeExpressionsMod {
  
  @JSImport("raml-typesystem/dist/src/typeExpressions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(str: String): BaseNode = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[BaseNode]
  
  inline def parseToType(`val`: String, t: TypeRegistry): AbstractType = (^.asInstanceOf[js.Dynamic].applyDynamic("parseToType")(`val`.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[AbstractType]
  inline def parseToType(
    `val`: String,
    t: TypeRegistry,
    contentProvidingNode: Unit,
    typeAttributeContentProvider: Unit,
    isPropertyType: Boolean
  ): AbstractType = (^.asInstanceOf[js.Dynamic].applyDynamic("parseToType")(`val`.asInstanceOf[js.Any], t.asInstanceOf[js.Any], contentProvidingNode.asInstanceOf[js.Any], typeAttributeContentProvider.asInstanceOf[js.Any], isPropertyType.asInstanceOf[js.Any])).asInstanceOf[AbstractType]
  inline def parseToType(
    `val`: String,
    t: TypeRegistry,
    contentProvidingNode: Unit,
    typeAttributeContentProvider: IContentProvider
  ): AbstractType = (^.asInstanceOf[js.Dynamic].applyDynamic("parseToType")(`val`.asInstanceOf[js.Any], t.asInstanceOf[js.Any], contentProvidingNode.asInstanceOf[js.Any], typeAttributeContentProvider.asInstanceOf[js.Any])).asInstanceOf[AbstractType]
  inline def parseToType(
    `val`: String,
    t: TypeRegistry,
    contentProvidingNode: Unit,
    typeAttributeContentProvider: IContentProvider,
    isPropertyType: Boolean
  ): AbstractType = (^.asInstanceOf[js.Dynamic].applyDynamic("parseToType")(`val`.asInstanceOf[js.Any], t.asInstanceOf[js.Any], contentProvidingNode.asInstanceOf[js.Any], typeAttributeContentProvider.asInstanceOf[js.Any], isPropertyType.asInstanceOf[js.Any])).asInstanceOf[AbstractType]
  inline def parseToType(`val`: String, t: TypeRegistry, contentProvidingNode: ParseNode): AbstractType = (^.asInstanceOf[js.Dynamic].applyDynamic("parseToType")(`val`.asInstanceOf[js.Any], t.asInstanceOf[js.Any], contentProvidingNode.asInstanceOf[js.Any])).asInstanceOf[AbstractType]
  inline def parseToType(
    `val`: String,
    t: TypeRegistry,
    contentProvidingNode: ParseNode,
    typeAttributeContentProvider: Unit,
    isPropertyType: Boolean
  ): AbstractType = (^.asInstanceOf[js.Dynamic].applyDynamic("parseToType")(`val`.asInstanceOf[js.Any], t.asInstanceOf[js.Any], contentProvidingNode.asInstanceOf[js.Any], typeAttributeContentProvider.asInstanceOf[js.Any], isPropertyType.asInstanceOf[js.Any])).asInstanceOf[AbstractType]
  inline def parseToType(
    `val`: String,
    t: TypeRegistry,
    contentProvidingNode: ParseNode,
    typeAttributeContentProvider: IContentProvider
  ): AbstractType = (^.asInstanceOf[js.Dynamic].applyDynamic("parseToType")(`val`.asInstanceOf[js.Any], t.asInstanceOf[js.Any], contentProvidingNode.asInstanceOf[js.Any], typeAttributeContentProvider.asInstanceOf[js.Any])).asInstanceOf[AbstractType]
  inline def parseToType(
    `val`: String,
    t: TypeRegistry,
    contentProvidingNode: ParseNode,
    typeAttributeContentProvider: IContentProvider,
    isPropertyType: Boolean
  ): AbstractType = (^.asInstanceOf[js.Dynamic].applyDynamic("parseToType")(`val`.asInstanceOf[js.Any], t.asInstanceOf[js.Any], contentProvidingNode.asInstanceOf[js.Any], typeAttributeContentProvider.asInstanceOf[js.Any], isPropertyType.asInstanceOf[js.Any])).asInstanceOf[AbstractType]
  
  inline def serializeToString(node: BaseNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeToString")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def storeToString(t: AbstractType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("storeToString")(t.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def visit(node: BaseNode, action: js.Function1[/* n */ BaseNode, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("visit")(node.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type BaseNode = typings.ramlTypesystem.typeExpressionUtilMod.BaseNode
  
  type Literal = typings.ramlTypesystem.typeExpressionUtilMod.Literal
  
  type Parens = typings.ramlTypesystem.typeExpressionUtilMod.Parens
  
  type Union = typings.ramlTypesystem.typeExpressionUtilMod.Union
}
