package typings.raml1Parser.mod

import typings.raml1Parser.distParserHighLevelASTMod.IAttribute
import typings.raml1Parser.distParserHighLevelASTMod.INodeDefinition
import typings.raml1Parser.distParserHighLevelASTMod.ITypeDefinition
import typings.raml1Parser.distParserLowLevelASTMod.ICompilationUnit
import typings.raml1Parser.distParserLowLevelASTMod.ILowLevelASTNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stubs {
  
  @JSImport("raml-1-parser", "stubs")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createASTNodeImpl(
    node: ILowLevelASTNode,
    parent: typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode,
    _def: INodeDefinition,
    _prop: typings.raml1Parser.distParserHighLevelASTMod.IProperty
  ): typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createASTNodeImpl")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], _def.asInstanceOf[js.Any], _prop.asInstanceOf[js.Any])).asInstanceOf[typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode]
  
  inline def createASTPropImpl(
    node: ILowLevelASTNode,
    parent: typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode,
    _def: INodeDefinition,
    _prop: typings.raml1Parser.distParserHighLevelASTMod.IProperty
  ): IAttribute = (^.asInstanceOf[js.Dynamic].applyDynamic("createASTPropImpl")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], _def.asInstanceOf[js.Any], _prop.asInstanceOf[js.Any])).asInstanceOf[IAttribute]
  inline def createASTPropImpl(
    node: ILowLevelASTNode,
    parent: typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode,
    _def: INodeDefinition,
    _prop: typings.raml1Parser.distParserHighLevelASTMod.IProperty,
    fk: Boolean
  ): IAttribute = (^.asInstanceOf[js.Dynamic].applyDynamic("createASTPropImpl")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], _def.asInstanceOf[js.Any], _prop.asInstanceOf[js.Any], fk.asInstanceOf[js.Any])).asInstanceOf[IAttribute]
  
  inline def createAttr(_property: typings.raml1Parser.distParserHighLevelASTMod.IProperty, `val`: Any): IAttribute = (^.asInstanceOf[js.Dynamic].applyDynamic("createAttr")(_property.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[IAttribute]
  
  inline def createBodyStub(parent: typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode): typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode = ^.asInstanceOf[js.Dynamic].applyDynamic("createBodyStub")(parent.asInstanceOf[js.Any]).asInstanceOf[typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode]
  inline def createBodyStub(parent: typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode, key: String): typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createBodyStub")(parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode]
  
  inline def createMap(): ILowLevelASTNode = ^.asInstanceOf[js.Dynamic].applyDynamic("createMap")().asInstanceOf[ILowLevelASTNode]
  
  inline def createMapping(name: String, value: String): ILowLevelASTNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createMapping")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ILowLevelASTNode]
  
  inline def createMethodStub(parent: typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode): typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode = ^.asInstanceOf[js.Dynamic].applyDynamic("createMethodStub")(parent.asInstanceOf[js.Any]).asInstanceOf[typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode]
  inline def createMethodStub(parent: typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode, key: String): typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createMethodStub")(parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode]
  
  inline def createQueryParameterStub(parent: typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode): typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode = ^.asInstanceOf[js.Dynamic].applyDynamic("createQueryParameterStub")(parent.asInstanceOf[js.Any]).asInstanceOf[typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode]
  inline def createQueryParameterStub(parent: typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode, key: String): typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createQueryParameterStub")(parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode]
  
  inline def createResourceStub(parent: typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode): typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode = ^.asInstanceOf[js.Dynamic].applyDynamic("createResourceStub")(parent.asInstanceOf[js.Any]).asInstanceOf[typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode]
  inline def createResourceStub(parent: typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode, key: String): typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createResourceStub")(parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode]
  
  inline def createResponseStub(parent: typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode): typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode = ^.asInstanceOf[js.Dynamic].applyDynamic("createResponseStub")(parent.asInstanceOf[js.Any]).asInstanceOf[typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode]
  inline def createResponseStub(parent: typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode, key: String): typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createResponseStub")(parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode]
  
  inline def createStub(parent: typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode, property: String): typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createStub")(parent.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode]
  inline def createStub(
    parent: typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode,
    property: String,
    key: String
  ): typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createStub")(parent.asInstanceOf[js.Any], property.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode]
  
  inline def createStubNoParentPatch(parent: typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode, property: String): typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createStubNoParentPatch")(parent.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode]
  inline def createStubNoParentPatch(
    parent: typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode,
    property: String,
    key: String
  ): typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createStubNoParentPatch")(parent.asInstanceOf[js.Any], property.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode]
  
  inline def createStubNode(t: ITypeDefinition, p: typings.raml1Parser.distParserHighLevelASTMod.IProperty): typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createStubNode")(t.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode]
  inline def createStubNode(t: ITypeDefinition, p: typings.raml1Parser.distParserHighLevelASTMod.IProperty, key: String): typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createStubNode")(t.asInstanceOf[js.Any], p.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode]
  inline def createStubNode(
    t: ITypeDefinition,
    p: typings.raml1Parser.distParserHighLevelASTMod.IProperty,
    key: String,
    unit: ICompilationUnit
  ): typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createStubNode")(t.asInstanceOf[js.Any], p.asInstanceOf[js.Any], key.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode]
  inline def createStubNode(
    t: ITypeDefinition,
    p: typings.raml1Parser.distParserHighLevelASTMod.IProperty,
    key: Unit,
    unit: ICompilationUnit
  ): typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createStubNode")(t.asInstanceOf[js.Any], p.asInstanceOf[js.Any], key.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode]
  
  inline def createUriParameterStub(parent: typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode): typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode = ^.asInstanceOf[js.Dynamic].applyDynamic("createUriParameterStub")(parent.asInstanceOf[js.Any]).asInstanceOf[typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode]
  inline def createUriParameterStub(parent: typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode, key: String): typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createUriParameterStub")(parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode]
  
  inline def createVirtualASTPropImpl(
    node: ILowLevelASTNode,
    parent: typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode,
    _def: INodeDefinition,
    _prop: typings.raml1Parser.distParserHighLevelASTMod.IProperty
  ): IAttribute = (^.asInstanceOf[js.Dynamic].applyDynamic("createVirtualASTPropImpl")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], _def.asInstanceOf[js.Any], _prop.asInstanceOf[js.Any])).asInstanceOf[IAttribute]
  
  inline def createVirtualNodeImpl(
    node: ILowLevelASTNode,
    parent: typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode,
    _def: INodeDefinition,
    _prop: typings.raml1Parser.distParserHighLevelASTMod.IProperty
  ): typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createVirtualNodeImpl")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], _def.asInstanceOf[js.Any], _prop.asInstanceOf[js.Any])).asInstanceOf[typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode]
}
