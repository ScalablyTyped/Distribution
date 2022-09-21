package typings.raml1Parser

import typings.raml1Parser.highLevelASTMod.IAttribute
import typings.raml1Parser.highLevelASTMod.IHighLevelNode
import typings.raml1Parser.highLevelASTMod.INodeDefinition
import typings.raml1Parser.highLevelASTMod.IProperty
import typings.raml1Parser.highLevelASTMod.ITypeDefinition
import typings.raml1Parser.lowLevelASTMod.ICompilationUnit
import typings.raml1Parser.lowLevelASTMod.ILowLevelASTNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stubProxyMod {
  
  @JSImport("raml-1-parser/dist/stubProxy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createASTNodeImpl(node: ILowLevelASTNode, parent: IHighLevelNode, _def: INodeDefinition, _prop: IProperty): IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createASTNodeImpl")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], _def.asInstanceOf[js.Any], _prop.asInstanceOf[js.Any])).asInstanceOf[IHighLevelNode]
  
  inline def createASTPropImpl(node: ILowLevelASTNode, parent: IHighLevelNode, _def: INodeDefinition, _prop: IProperty): IAttribute = (^.asInstanceOf[js.Dynamic].applyDynamic("createASTPropImpl")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], _def.asInstanceOf[js.Any], _prop.asInstanceOf[js.Any])).asInstanceOf[IAttribute]
  inline def createASTPropImpl(
    node: ILowLevelASTNode,
    parent: IHighLevelNode,
    _def: INodeDefinition,
    _prop: IProperty,
    fk: Boolean
  ): IAttribute = (^.asInstanceOf[js.Dynamic].applyDynamic("createASTPropImpl")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], _def.asInstanceOf[js.Any], _prop.asInstanceOf[js.Any], fk.asInstanceOf[js.Any])).asInstanceOf[IAttribute]
  
  inline def createAttr(_property: IProperty, `val`: Any): IAttribute = (^.asInstanceOf[js.Dynamic].applyDynamic("createAttr")(_property.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[IAttribute]
  
  inline def createBodyStub(parent: IHighLevelNode): IHighLevelNode = ^.asInstanceOf[js.Dynamic].applyDynamic("createBodyStub")(parent.asInstanceOf[js.Any]).asInstanceOf[IHighLevelNode]
  inline def createBodyStub(parent: IHighLevelNode, key: String): IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createBodyStub")(parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[IHighLevelNode]
  
  inline def createMap(): ILowLevelASTNode = ^.asInstanceOf[js.Dynamic].applyDynamic("createMap")().asInstanceOf[ILowLevelASTNode]
  
  inline def createMapping(name: String, value: String): ILowLevelASTNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createMapping")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ILowLevelASTNode]
  
  inline def createMethodStub(parent: IHighLevelNode): IHighLevelNode = ^.asInstanceOf[js.Dynamic].applyDynamic("createMethodStub")(parent.asInstanceOf[js.Any]).asInstanceOf[IHighLevelNode]
  inline def createMethodStub(parent: IHighLevelNode, key: String): IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createMethodStub")(parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[IHighLevelNode]
  
  inline def createQueryParameterStub(parent: IHighLevelNode): IHighLevelNode = ^.asInstanceOf[js.Dynamic].applyDynamic("createQueryParameterStub")(parent.asInstanceOf[js.Any]).asInstanceOf[IHighLevelNode]
  inline def createQueryParameterStub(parent: IHighLevelNode, key: String): IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createQueryParameterStub")(parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[IHighLevelNode]
  
  inline def createResourceStub(parent: IHighLevelNode): IHighLevelNode = ^.asInstanceOf[js.Dynamic].applyDynamic("createResourceStub")(parent.asInstanceOf[js.Any]).asInstanceOf[IHighLevelNode]
  inline def createResourceStub(parent: IHighLevelNode, key: String): IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createResourceStub")(parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[IHighLevelNode]
  
  inline def createResponseStub(parent: IHighLevelNode): IHighLevelNode = ^.asInstanceOf[js.Dynamic].applyDynamic("createResponseStub")(parent.asInstanceOf[js.Any]).asInstanceOf[IHighLevelNode]
  inline def createResponseStub(parent: IHighLevelNode, key: String): IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createResponseStub")(parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[IHighLevelNode]
  
  inline def createStub(parent: IHighLevelNode, property: String): IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createStub")(parent.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[IHighLevelNode]
  inline def createStub(parent: IHighLevelNode, property: String, key: String): IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createStub")(parent.asInstanceOf[js.Any], property.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[IHighLevelNode]
  
  inline def createStubNoParentPatch(parent: IHighLevelNode, property: String): IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createStubNoParentPatch")(parent.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[IHighLevelNode]
  inline def createStubNoParentPatch(parent: IHighLevelNode, property: String, key: String): IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createStubNoParentPatch")(parent.asInstanceOf[js.Any], property.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[IHighLevelNode]
  
  inline def createStubNode(t: ITypeDefinition, p: IProperty): IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createStubNode")(t.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[IHighLevelNode]
  inline def createStubNode(t: ITypeDefinition, p: IProperty, key: String): IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createStubNode")(t.asInstanceOf[js.Any], p.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[IHighLevelNode]
  inline def createStubNode(t: ITypeDefinition, p: IProperty, key: String, unit: ICompilationUnit): IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createStubNode")(t.asInstanceOf[js.Any], p.asInstanceOf[js.Any], key.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[IHighLevelNode]
  inline def createStubNode(t: ITypeDefinition, p: IProperty, key: Unit, unit: ICompilationUnit): IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createStubNode")(t.asInstanceOf[js.Any], p.asInstanceOf[js.Any], key.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[IHighLevelNode]
  
  inline def createUriParameterStub(parent: IHighLevelNode): IHighLevelNode = ^.asInstanceOf[js.Dynamic].applyDynamic("createUriParameterStub")(parent.asInstanceOf[js.Any]).asInstanceOf[IHighLevelNode]
  inline def createUriParameterStub(parent: IHighLevelNode, key: String): IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createUriParameterStub")(parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[IHighLevelNode]
  
  inline def createVirtualASTPropImpl(node: ILowLevelASTNode, parent: IHighLevelNode, _def: INodeDefinition, _prop: IProperty): IAttribute = (^.asInstanceOf[js.Dynamic].applyDynamic("createVirtualASTPropImpl")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], _def.asInstanceOf[js.Any], _prop.asInstanceOf[js.Any])).asInstanceOf[IAttribute]
  
  inline def createVirtualNodeImpl(node: ILowLevelASTNode, parent: IHighLevelNode, _def: INodeDefinition, _prop: IProperty): IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createVirtualNodeImpl")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], _def.asInstanceOf[js.Any], _prop.asInstanceOf[js.Any])).asInstanceOf[IHighLevelNode]
}
