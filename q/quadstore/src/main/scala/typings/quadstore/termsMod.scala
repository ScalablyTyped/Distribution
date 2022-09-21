package typings.quadstore

import typings.quadstore.typesMod.Prefixes
import typings.rdfjsTypes.dataModelMod.BlankNode
import typings.rdfjsTypes.dataModelMod.DataFactory
import typings.rdfjsTypes.dataModelMod.DefaultGraph
import typings.rdfjsTypes.dataModelMod.Literal
import typings.rdfjsTypes.dataModelMod.NamedNode
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.dataModelMod.Term
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object termsMod {
  
  object blankNodeReader {
    
    @JSImport("quadstore/dist/cjs/serialization/terms", "blankNodeReader")
    @js.native
    val ^ : js.Any = js.native
    
    inline def read(
      key: String,
      keyOffset: Double,
      value: js.typedarray.Uint16Array,
      valueOffset: Double,
      factory: DataFactory[Quad, Quad]
    ): BlankNode = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(key.asInstanceOf[js.Any], keyOffset.asInstanceOf[js.Any], value.asInstanceOf[js.Any], valueOffset.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[BlankNode]
    
    @JSImport("quadstore/dist/cjs/serialization/terms", "blankNodeReader.readKeyChars")
    @js.native
    def readKeyChars: Double = js.native
    inline def readKeyChars_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readKeyChars")(x.asInstanceOf[js.Any])
    
    @JSImport("quadstore/dist/cjs/serialization/terms", "blankNodeReader.readValueLength")
    @js.native
    def readValueLength: Double = js.native
    inline def readValueLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readValueLength")(x.asInstanceOf[js.Any])
  }
  
  object blankNodeWriter {
    
    @JSImport("quadstore/dist/cjs/serialization/terms", "blankNodeWriter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def write(value: js.typedarray.Uint16Array, valueOffset: Double, node: BlankNode): String = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(value.asInstanceOf[js.Any], valueOffset.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def write(value: Unit, valueOffset: Double, node: BlankNode): String = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(value.asInstanceOf[js.Any], valueOffset.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("quadstore/dist/cjs/serialization/terms", "blankNodeWriter.writtenValueLength")
    @js.native
    def writtenValueLength: Double = js.native
    inline def writtenValueLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("writtenValueLength")(x.asInstanceOf[js.Any])
  }
  
  object defaultGraphReader {
    
    @JSImport("quadstore/dist/cjs/serialization/terms", "defaultGraphReader")
    @js.native
    val ^ : js.Any = js.native
    
    inline def read(
      key: String,
      keyOffset: Double,
      value: js.typedarray.Uint16Array,
      valueOffset: Double,
      factory: DataFactory[Quad, Quad]
    ): DefaultGraph = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(key.asInstanceOf[js.Any], keyOffset.asInstanceOf[js.Any], value.asInstanceOf[js.Any], valueOffset.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[DefaultGraph]
    
    @JSImport("quadstore/dist/cjs/serialization/terms", "defaultGraphReader.readKeyChars")
    @js.native
    def readKeyChars: Double = js.native
    inline def readKeyChars_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readKeyChars")(x.asInstanceOf[js.Any])
    
    @JSImport("quadstore/dist/cjs/serialization/terms", "defaultGraphReader.readValueLength")
    @js.native
    def readValueLength: Double = js.native
    inline def readValueLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readValueLength")(x.asInstanceOf[js.Any])
  }
  
  object defaultGraphWriter {
    
    @JSImport("quadstore/dist/cjs/serialization/terms", "defaultGraphWriter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def write(value: js.typedarray.Uint16Array, valueOffset: Double, node: DefaultGraph): String = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(value.asInstanceOf[js.Any], valueOffset.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def write(value: Unit, valueOffset: Double, node: DefaultGraph): String = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(value.asInstanceOf[js.Any], valueOffset.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("quadstore/dist/cjs/serialization/terms", "defaultGraphWriter.writtenValueLength")
    @js.native
    def writtenValueLength: Double = js.native
    inline def writtenValueLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("writtenValueLength")(x.asInstanceOf[js.Any])
  }
  
  object genericLiteralReader {
    
    @JSImport("quadstore/dist/cjs/serialization/terms", "genericLiteralReader")
    @js.native
    val ^ : js.Any = js.native
    
    inline def read(
      key: String,
      keyOffset: Double,
      value: js.typedarray.Uint16Array,
      valueOffset: Double,
      factory: DataFactory[Quad, Quad],
      separator: String
    ): Literal = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(key.asInstanceOf[js.Any], keyOffset.asInstanceOf[js.Any], value.asInstanceOf[js.Any], valueOffset.asInstanceOf[js.Any], factory.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[Literal]
    
    @JSImport("quadstore/dist/cjs/serialization/terms", "genericLiteralReader.readKeyChars")
    @js.native
    def readKeyChars: Double = js.native
    inline def readKeyChars_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readKeyChars")(x.asInstanceOf[js.Any])
    
    @JSImport("quadstore/dist/cjs/serialization/terms", "genericLiteralReader.readValueLength")
    @js.native
    def readValueLength: Double = js.native
    inline def readValueLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readValueLength")(x.asInstanceOf[js.Any])
  }
  
  object genericLiteralWriter {
    
    @JSImport("quadstore/dist/cjs/serialization/terms", "genericLiteralWriter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def write(value: js.typedarray.Uint16Array, valueOffset: Double, node: Literal, separator: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(value.asInstanceOf[js.Any], valueOffset.asInstanceOf[js.Any], node.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def write(value: Unit, valueOffset: Double, node: Literal, separator: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(value.asInstanceOf[js.Any], valueOffset.asInstanceOf[js.Any], node.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("quadstore/dist/cjs/serialization/terms", "genericLiteralWriter.writtenValueLength")
    @js.native
    def writtenValueLength: Double = js.native
    inline def writtenValueLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("writtenValueLength")(x.asInstanceOf[js.Any])
  }
  
  object langStringLiteralReader {
    
    @JSImport("quadstore/dist/cjs/serialization/terms", "langStringLiteralReader")
    @js.native
    val ^ : js.Any = js.native
    
    inline def read(
      key: String,
      keyOffset: Double,
      value: js.typedarray.Uint16Array,
      valueOffset: Double,
      factory: DataFactory[Quad, Quad],
      separator: String
    ): Literal = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(key.asInstanceOf[js.Any], keyOffset.asInstanceOf[js.Any], value.asInstanceOf[js.Any], valueOffset.asInstanceOf[js.Any], factory.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[Literal]
    
    @JSImport("quadstore/dist/cjs/serialization/terms", "langStringLiteralReader.readKeyChars")
    @js.native
    def readKeyChars: Double = js.native
    inline def readKeyChars_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readKeyChars")(x.asInstanceOf[js.Any])
    
    @JSImport("quadstore/dist/cjs/serialization/terms", "langStringLiteralReader.readValueLength")
    @js.native
    def readValueLength: Double = js.native
    inline def readValueLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readValueLength")(x.asInstanceOf[js.Any])
  }
  
  object langStringLiteralWriter {
    
    @JSImport("quadstore/dist/cjs/serialization/terms", "langStringLiteralWriter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def write(value: js.typedarray.Uint16Array, valueOffset: Double, node: Literal, separator: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(value.asInstanceOf[js.Any], valueOffset.asInstanceOf[js.Any], node.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def write(value: Unit, valueOffset: Double, node: Literal, separator: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(value.asInstanceOf[js.Any], valueOffset.asInstanceOf[js.Any], node.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("quadstore/dist/cjs/serialization/terms", "langStringLiteralWriter.writtenValueLength")
    @js.native
    def writtenValueLength: Double = js.native
    inline def writtenValueLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("writtenValueLength")(x.asInstanceOf[js.Any])
  }
  
  object namedNodeReader {
    
    @JSImport("quadstore/dist/cjs/serialization/terms", "namedNodeReader")
    @js.native
    val ^ : js.Any = js.native
    
    inline def read(
      key: String,
      keyOffset: Double,
      value: js.typedarray.Uint16Array,
      valueOffset: Double,
      factory: DataFactory[Quad, Quad],
      prefixes: Prefixes
    ): NamedNode[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(key.asInstanceOf[js.Any], keyOffset.asInstanceOf[js.Any], value.asInstanceOf[js.Any], valueOffset.asInstanceOf[js.Any], factory.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any])).asInstanceOf[NamedNode[String]]
    
    @JSImport("quadstore/dist/cjs/serialization/terms", "namedNodeReader.readKeyChars")
    @js.native
    def readKeyChars: Double = js.native
    inline def readKeyChars_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readKeyChars")(x.asInstanceOf[js.Any])
    
    @JSImport("quadstore/dist/cjs/serialization/terms", "namedNodeReader.readValueLength")
    @js.native
    def readValueLength: Double = js.native
    inline def readValueLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readValueLength")(x.asInstanceOf[js.Any])
  }
  
  object namedNodeWriter {
    
    @JSImport("quadstore/dist/cjs/serialization/terms", "namedNodeWriter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def write(value: js.typedarray.Uint16Array, valueOffset: Double, node: NamedNode[String], prefixes: Prefixes): String = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(value.asInstanceOf[js.Any], valueOffset.asInstanceOf[js.Any], node.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def write(value: Unit, valueOffset: Double, node: NamedNode[String], prefixes: Prefixes): String = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(value.asInstanceOf[js.Any], valueOffset.asInstanceOf[js.Any], node.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("quadstore/dist/cjs/serialization/terms", "namedNodeWriter.writtenValueLength")
    @js.native
    def writtenValueLength: Double = js.native
    inline def writtenValueLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("writtenValueLength")(x.asInstanceOf[js.Any])
  }
  
  object numericLiteralReader {
    
    @JSImport("quadstore/dist/cjs/serialization/terms", "numericLiteralReader")
    @js.native
    val ^ : js.Any = js.native
    
    inline def read(
      key: String,
      keyOffset: Double,
      value: js.typedarray.Uint16Array,
      valueOffset: Double,
      factory: DataFactory[Quad, Quad],
      separator: String
    ): Literal = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(key.asInstanceOf[js.Any], keyOffset.asInstanceOf[js.Any], value.asInstanceOf[js.Any], valueOffset.asInstanceOf[js.Any], factory.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[Literal]
    
    @JSImport("quadstore/dist/cjs/serialization/terms", "numericLiteralReader.readKeyChars")
    @js.native
    def readKeyChars: Double = js.native
    inline def readKeyChars_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readKeyChars")(x.asInstanceOf[js.Any])
    
    @JSImport("quadstore/dist/cjs/serialization/terms", "numericLiteralReader.readValueLength")
    @js.native
    def readValueLength: Double = js.native
    inline def readValueLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readValueLength")(x.asInstanceOf[js.Any])
  }
  
  object numericLiteralWriter {
    
    @JSImport("quadstore/dist/cjs/serialization/terms", "numericLiteralWriter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def write(
      value: js.typedarray.Uint16Array,
      valueOffset: Double,
      node: Literal,
      separator: String,
      encodedNumericValue: String,
      rangeMode: Boolean
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(value.asInstanceOf[js.Any], valueOffset.asInstanceOf[js.Any], node.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], encodedNumericValue.asInstanceOf[js.Any], rangeMode.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def write(
      value: Unit,
      valueOffset: Double,
      node: Literal,
      separator: String,
      encodedNumericValue: String,
      rangeMode: Boolean
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(value.asInstanceOf[js.Any], valueOffset.asInstanceOf[js.Any], node.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], encodedNumericValue.asInstanceOf[js.Any], rangeMode.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("quadstore/dist/cjs/serialization/terms", "numericLiteralWriter.writtenValueLength")
    @js.native
    def writtenValueLength: Double = js.native
    inline def writtenValueLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("writtenValueLength")(x.asInstanceOf[js.Any])
  }
  
  object stringLiteralReader {
    
    @JSImport("quadstore/dist/cjs/serialization/terms", "stringLiteralReader")
    @js.native
    val ^ : js.Any = js.native
    
    inline def read(
      key: String,
      keyOffset: Double,
      value: js.typedarray.Uint16Array,
      valueOffset: Double,
      factory: DataFactory[Quad, Quad]
    ): Literal = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(key.asInstanceOf[js.Any], keyOffset.asInstanceOf[js.Any], value.asInstanceOf[js.Any], valueOffset.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[Literal]
    
    @JSImport("quadstore/dist/cjs/serialization/terms", "stringLiteralReader.readKeyChars")
    @js.native
    def readKeyChars: Double = js.native
    inline def readKeyChars_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readKeyChars")(x.asInstanceOf[js.Any])
    
    @JSImport("quadstore/dist/cjs/serialization/terms", "stringLiteralReader.readValueLength")
    @js.native
    def readValueLength: Double = js.native
    inline def readValueLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readValueLength")(x.asInstanceOf[js.Any])
  }
  
  object stringLiteralWriter {
    
    @JSImport("quadstore/dist/cjs/serialization/terms", "stringLiteralWriter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def write(value: js.typedarray.Uint16Array, valueOffset: Double, node: Literal): String = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(value.asInstanceOf[js.Any], valueOffset.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def write(value: Unit, valueOffset: Double, node: Literal): String = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(value.asInstanceOf[js.Any], valueOffset.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("quadstore/dist/cjs/serialization/terms", "stringLiteralWriter.writtenValueLength")
    @js.native
    def writtenValueLength: Double = js.native
    inline def writtenValueLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("writtenValueLength")(x.asInstanceOf[js.Any])
  }
  
  object termReader {
    
    @JSImport("quadstore/dist/cjs/serialization/terms", "termReader")
    @js.native
    val ^ : js.Any = js.native
    
    inline def read(
      key: String,
      baseKeyOffset: Double,
      value: js.typedarray.Uint16Array,
      baseValueOffset: Double,
      factory: DataFactory[Quad, Quad],
      prefixes: Prefixes
    ): NamedNode[String] | BlankNode | Literal | DefaultGraph = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(key.asInstanceOf[js.Any], baseKeyOffset.asInstanceOf[js.Any], value.asInstanceOf[js.Any], baseValueOffset.asInstanceOf[js.Any], factory.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any])).asInstanceOf[NamedNode[String] | BlankNode | Literal | DefaultGraph]
    
    @JSImport("quadstore/dist/cjs/serialization/terms", "termReader.readKeyChars")
    @js.native
    def readKeyChars: Double = js.native
    inline def readKeyChars_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readKeyChars")(x.asInstanceOf[js.Any])
    
    @JSImport("quadstore/dist/cjs/serialization/terms", "termReader.readValueLength")
    @js.native
    def readValueLength: Double = js.native
    inline def readValueLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readValueLength")(x.asInstanceOf[js.Any])
  }
  
  object termWriter {
    
    @JSImport("quadstore/dist/cjs/serialization/terms", "termWriter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def write(value: js.typedarray.Uint16Array, baseValueOffset: Double, term: Term, prefixes: Prefixes): String = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(value.asInstanceOf[js.Any], baseValueOffset.asInstanceOf[js.Any], term.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def write(value: Unit, baseValueOffset: Double, term: Term, prefixes: Prefixes): String = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(value.asInstanceOf[js.Any], baseValueOffset.asInstanceOf[js.Any], term.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("quadstore/dist/cjs/serialization/terms", "termWriter.writtenValueLength")
    @js.native
    def writtenValueLength: Double = js.native
    inline def writtenValueLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("writtenValueLength")(x.asInstanceOf[js.Any])
  }
}
