package typings.quadstore

import typings.quadstore.distCjsTypesMod.TermReader
import typings.quadstore.distCjsTypesMod.TermWriter
import typings.quadstore.quadstoreStrings.F
import typings.quadstore.quadstoreStrings.T
import typings.rdfjsTypes.dataModelMod.BlankNode
import typings.rdfjsTypes.dataModelMod.DefaultGraph
import typings.rdfjsTypes.dataModelMod.Literal
import typings.rdfjsTypes.dataModelMod.NamedNode
import typings.rdfjsTypes.dataModelMod.Term
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSerializationTermsMod {
  
  @JSImport("quadstore/dist/cjs/serialization/terms", "blankNodeReader")
  @js.native
  val blankNodeReader: TermReader[BlankNode] = js.native
  
  @JSImport("quadstore/dist/cjs/serialization/terms", "blankNodeWriter")
  @js.native
  val blankNodeWriter: TermWriter[BlankNode, F] = js.native
  
  @JSImport("quadstore/dist/cjs/serialization/terms", "defaultGraphReader")
  @js.native
  val defaultGraphReader: TermReader[DefaultGraph] = js.native
  
  @JSImport("quadstore/dist/cjs/serialization/terms", "defaultGraphWriter")
  @js.native
  val defaultGraphWriter: TermWriter[DefaultGraph, F] = js.native
  
  @JSImport("quadstore/dist/cjs/serialization/terms", "genericLiteralReader")
  @js.native
  val genericLiteralReader: TermReader[Literal] = js.native
  
  @JSImport("quadstore/dist/cjs/serialization/terms", "genericLiteralWriter")
  @js.native
  val genericLiteralWriter: TermWriter[Literal, F] = js.native
  
  @JSImport("quadstore/dist/cjs/serialization/terms", "langStringLiteralReader")
  @js.native
  val langStringLiteralReader: TermReader[Literal] = js.native
  
  @JSImport("quadstore/dist/cjs/serialization/terms", "langStringLiteralWriter")
  @js.native
  val langStringLiteralWriter: TermWriter[Literal, F] = js.native
  
  @JSImport("quadstore/dist/cjs/serialization/terms", "namedNodeReader")
  @js.native
  val namedNodeReader: TermReader[NamedNode[String]] = js.native
  
  @JSImport("quadstore/dist/cjs/serialization/terms", "namedNodeWriter")
  @js.native
  val namedNodeWriter: TermWriter[NamedNode[String], F] = js.native
  
  @JSImport("quadstore/dist/cjs/serialization/terms", "numericLiteralReader")
  @js.native
  val numericLiteralReader: TermReader[Literal] = js.native
  
  @JSImport("quadstore/dist/cjs/serialization/terms", "numericLiteralWriter")
  @js.native
  val numericLiteralWriter: TermWriter[Literal, T] = js.native
  
  @JSImport("quadstore/dist/cjs/serialization/terms", "stringLiteralReader")
  @js.native
  val stringLiteralReader: TermReader[Literal] = js.native
  
  @JSImport("quadstore/dist/cjs/serialization/terms", "stringLiteralWriter")
  @js.native
  val stringLiteralWriter: TermWriter[Literal, F] = js.native
  
  @JSImport("quadstore/dist/cjs/serialization/terms", "termReader")
  @js.native
  val termReader: TermReader[Term] = js.native
  
  @JSImport("quadstore/dist/cjs/serialization/terms", "termWriter")
  @js.native
  val termWriter: TermWriter[Term, F] = js.native
}
