package typings.quadstore

import typings.quadstore.typesMod.Prefixes
import typings.quadstore.typesMod.TermName
import typings.rdfjsTypes.dataModelMod.DataFactory
import typings.rdfjsTypes.dataModelMod.Quad
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object quadsMod {
  
  object quadReader {
    
    @JSImport("quadstore/dist/cjs/serialization/quads", "quadReader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("quadstore/dist/cjs/serialization/quads", "quadReader.graph")
    @js.native
    def graph: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    inline def graph_=(x: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("graph")(x.asInstanceOf[js.Any])
    
    @JSImport("quadstore/dist/cjs/serialization/quads", "quadReader.object")
    @js.native
    val `object`: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    
    @JSImport("quadstore/dist/cjs/serialization/quads", "quadReader.predicate")
    @js.native
    def predicate: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    inline def predicate_=(x: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("predicate")(x.asInstanceOf[js.Any])
    
    inline def read(
      key: String,
      keyOffset: Double,
      value: js.typedarray.Uint16Array,
      valueOffset: Double,
      termNames: js.Array[TermName],
      factory: DataFactory[Quad, Quad],
      prefixes: Prefixes
    ): Quad = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(key.asInstanceOf[js.Any], keyOffset.asInstanceOf[js.Any], value.asInstanceOf[js.Any], valueOffset.asInstanceOf[js.Any], termNames.asInstanceOf[js.Any], factory.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any])).asInstanceOf[Quad]
    
    @JSImport("quadstore/dist/cjs/serialization/quads", "quadReader.subject")
    @js.native
    def subject: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    inline def subject_=(x: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("subject")(x.asInstanceOf[js.Any])
  }
  
  object quadWriter {
    
    @JSImport("quadstore/dist/cjs/serialization/quads", "quadWriter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def write(
      prefix: String,
      value: js.typedarray.Uint16Array,
      baseValueOffset: Double,
      quad: Quad,
      termNames: js.Array[TermName],
      prefixes: Prefixes
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(prefix.asInstanceOf[js.Any], value.asInstanceOf[js.Any], baseValueOffset.asInstanceOf[js.Any], quad.asInstanceOf[js.Any], termNames.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def write(
      prefix: String,
      value: Unit,
      baseValueOffset: Double,
      quad: Quad,
      termNames: js.Array[TermName],
      prefixes: Prefixes
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(prefix.asInstanceOf[js.Any], value.asInstanceOf[js.Any], baseValueOffset.asInstanceOf[js.Any], quad.asInstanceOf[js.Any], termNames.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("quadstore/dist/cjs/serialization/quads", "quadWriter.writtenValueLength")
    @js.native
    def writtenValueLength: Double = js.native
    inline def writtenValueLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("writtenValueLength")(x.asInstanceOf[js.Any])
  }
}
