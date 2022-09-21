package typings.raml1Parser

import typings.raml1Parser.anon.KeyValue
import typings.raml1Parser.highLevelASTMod.IAttribute
import typings.raml1Parser.highLevelASTMod.IHighLevelNode
import typings.raml1Parser.highLevelASTMod.IProperty
import typings.raml1Parser.highLevelASTMod.ITypeDefinition
import typings.raml1Parser.highLevelImplMod.StructuredValue
import typings.raml1Parser.lowLevelASTMod.ICompilationUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stubsMod {
  
  @JSImport("raml-1-parser/dist/parser/stubs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAttr(_property: IProperty, `val`: Any): IAttribute = (^.asInstanceOf[js.Dynamic].applyDynamic("createAttr")(_property.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[IAttribute]
  
  inline def createBodyStub(parent: IHighLevelNode): IHighLevelNode = ^.asInstanceOf[js.Dynamic].applyDynamic("createBodyStub")(parent.asInstanceOf[js.Any]).asInstanceOf[IHighLevelNode]
  inline def createBodyStub(parent: IHighLevelNode, key: String): IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createBodyStub")(parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[IHighLevelNode]
  
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
  
  inline def createStub0(parent: IHighLevelNode, property: String): IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createStub0")(parent.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[IHighLevelNode]
  inline def createStub0(parent: IHighLevelNode, property: String, key: String): IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createStub0")(parent.asInstanceOf[js.Any], property.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[IHighLevelNode]
  
  inline def createStubNode(t: ITypeDefinition, p: IProperty): IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createStubNode")(t.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[IHighLevelNode]
  inline def createStubNode(t: ITypeDefinition, p: IProperty, key: String): IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createStubNode")(t.asInstanceOf[js.Any], p.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[IHighLevelNode]
  inline def createStubNode(t: ITypeDefinition, p: IProperty, key: String, unit: ICompilationUnit): IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createStubNode")(t.asInstanceOf[js.Any], p.asInstanceOf[js.Any], key.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[IHighLevelNode]
  inline def createStubNode(t: ITypeDefinition, p: IProperty, key: Unit, unit: ICompilationUnit): IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createStubNode")(t.asInstanceOf[js.Any], p.asInstanceOf[js.Any], key.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[IHighLevelNode]
  
  inline def createUriParameterStub(parent: IHighLevelNode): IHighLevelNode = ^.asInstanceOf[js.Dynamic].applyDynamic("createUriParameterStub")(parent.asInstanceOf[js.Any]).asInstanceOf[IHighLevelNode]
  inline def createUriParameterStub(parent: IHighLevelNode, key: String): IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createUriParameterStub")(parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[IHighLevelNode]
  
  inline def genStructuredValue(`type`: String, name: String, mappings: js.Array[KeyValue], parent: IHighLevelNode): StructuredValue = (^.asInstanceOf[js.Dynamic].applyDynamic("genStructuredValue")(`type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], mappings.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[StructuredValue]
}
