package typings.sourceMapJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("source-map-js", "SourceMapConsumer")
  @js.native
  open class SourceMapConsumer protected () extends StObject {
    def this(rawSourceMap: RawSourceMap) = this()
    
    def allGeneratedPositionsFor(originalPosition: MappedPosition): js.Array[Position] = js.native
    
    def computeColumnSpans(): Unit = js.native
    
    def eachMapping(callback: js.Function1[/* mapping */ MappingItem, Unit]): Unit = js.native
    def eachMapping(callback: js.Function1[/* mapping */ MappingItem, Unit], context: Any): Unit = js.native
    def eachMapping(callback: js.Function1[/* mapping */ MappingItem, Unit], context: Any, order: Double): Unit = js.native
    def eachMapping(callback: js.Function1[/* mapping */ MappingItem, Unit], context: Unit, order: Double): Unit = js.native
    
    def generatedPositionFor(originalPosition: SourceFindPosition): LineRange = js.native
    
    def hasContentsOfAllSources(): Boolean = js.native
    
    def originalPositionFor(generatedPosition: FindPosition): MappedPosition = js.native
    
    def sourceContentFor(source: String): String = js.native
    def sourceContentFor(source: String, returnNullOnMissing: Boolean): String = js.native
  }
  /* static members */
  object SourceMapConsumer {
    
    @JSImport("source-map-js", "SourceMapConsumer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("source-map-js", "SourceMapConsumer.GENERATED_ORDER")
    @js.native
    def GENERATED_ORDER: Double = js.native
    inline def GENERATED_ORDER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GENERATED_ORDER")(x.asInstanceOf[js.Any])
    
    @JSImport("source-map-js", "SourceMapConsumer.GREATEST_LOWER_BOUND")
    @js.native
    def GREATEST_LOWER_BOUND: Double = js.native
    inline def GREATEST_LOWER_BOUND_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GREATEST_LOWER_BOUND")(x.asInstanceOf[js.Any])
    
    @JSImport("source-map-js", "SourceMapConsumer.LEAST_UPPER_BOUND")
    @js.native
    def LEAST_UPPER_BOUND: Double = js.native
    inline def LEAST_UPPER_BOUND_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEAST_UPPER_BOUND")(x.asInstanceOf[js.Any])
    
    @JSImport("source-map-js", "SourceMapConsumer.ORIGINAL_ORDER")
    @js.native
    def ORIGINAL_ORDER: Double = js.native
    inline def ORIGINAL_ORDER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ORIGINAL_ORDER")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("source-map-js", "SourceMapGenerator")
  @js.native
  open class SourceMapGenerator () extends StObject {
    def this(startOfSourceMap: StartOfSourceMap) = this()
    
    def addMapping(mapping: Mapping): Unit = js.native
    
    def applySourceMap(sourceMapConsumer: SourceMapConsumer): Unit = js.native
    def applySourceMap(sourceMapConsumer: SourceMapConsumer, sourceFile: String): Unit = js.native
    def applySourceMap(sourceMapConsumer: SourceMapConsumer, sourceFile: String, sourceMapPath: String): Unit = js.native
    def applySourceMap(sourceMapConsumer: SourceMapConsumer, sourceFile: Unit, sourceMapPath: String): Unit = js.native
    
    def setSourceContent(sourceFile: String, sourceContent: String): Unit = js.native
  }
  /* static members */
  object SourceMapGenerator {
    
    @JSImport("source-map-js", "SourceMapGenerator")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromSourceMap(sourceMapConsumer: SourceMapConsumer): SourceMapGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSourceMap")(sourceMapConsumer.asInstanceOf[js.Any]).asInstanceOf[SourceMapGenerator]
  }
  
  @JSImport("source-map-js", "SourceNode")
  @js.native
  open class SourceNode () extends StObject {
    def this(line: Double, column: Double, source: String) = this()
    def this(line: Double, column: Double, source: String, chunk: String) = this()
    def this(line: Double, column: Double, source: String, chunk: String, name: String) = this()
    def this(line: Double, column: Double, source: String, chunk: Unit, name: String) = this()
    
    def add(chunk: String): Unit = js.native
    
    def join(sep: String): SourceNode = js.native
    
    def prepend(chunk: String): Unit = js.native
    
    def replaceRight(pattern: String, replacement: String): SourceNode = js.native
    
    def setSourceContent(sourceFile: String, sourceContent: String): Unit = js.native
    
    def toStringWithSourceMap(): CodeWithSourceMap = js.native
    def toStringWithSourceMap(startOfSourceMap: StartOfSourceMap): CodeWithSourceMap = js.native
    
    def walk(fn: js.Function2[/* chunk */ String, /* mapping */ MappedPosition, Unit]): Unit = js.native
    
    def walkSourceContents(fn: js.Function2[/* file */ String, /* content */ String, Unit]): Unit = js.native
  }
  /* static members */
  object SourceNode {
    
    @JSImport("source-map-js", "SourceNode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromStringWithSourceMap(code: String, sourceMapConsumer: SourceMapConsumer): SourceNode = (^.asInstanceOf[js.Dynamic].applyDynamic("fromStringWithSourceMap")(code.asInstanceOf[js.Any], sourceMapConsumer.asInstanceOf[js.Any])).asInstanceOf[SourceNode]
    inline def fromStringWithSourceMap(code: String, sourceMapConsumer: SourceMapConsumer, relativePath: String): SourceNode = (^.asInstanceOf[js.Dynamic].applyDynamic("fromStringWithSourceMap")(code.asInstanceOf[js.Any], sourceMapConsumer.asInstanceOf[js.Any], relativePath.asInstanceOf[js.Any])).asInstanceOf[SourceNode]
  }
  
  trait CodeWithSourceMap extends StObject {
    
    var code: String
    
    var map: SourceMapGenerator
  }
  object CodeWithSourceMap {
    
    inline def apply(code: String, map: SourceMapGenerator): CodeWithSourceMap = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodeWithSourceMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CodeWithSourceMap] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMap(value: SourceMapGenerator): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    }
  }
  
  trait FindPosition
    extends StObject
       with Position {
    
    // SourceMapConsumer.GREATEST_LOWER_BOUND or SourceMapConsumer.LEAST_UPPER_BOUND
    var bias: js.UndefOr[Double] = js.undefined
  }
  object FindPosition {
    
    inline def apply(column: Double, line: Double): FindPosition = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[FindPosition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FindPosition] (val x: Self) extends AnyVal {
      
      inline def setBias(value: Double): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
      
      inline def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
    }
  }
  
  trait LineRange
    extends StObject
       with Position {
    
    var lastColumn: Double
  }
  object LineRange {
    
    inline def apply(column: Double, lastColumn: Double, line: Double): LineRange = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], lastColumn = lastColumn.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineRange]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LineRange] (val x: Self) extends AnyVal {
      
      inline def setLastColumn(value: Double): Self = StObject.set(x, "lastColumn", value.asInstanceOf[js.Any])
    }
  }
  
  trait MappedPosition
    extends StObject
       with Position {
    
    var name: js.UndefOr[String] = js.undefined
    
    var source: String
  }
  object MappedPosition {
    
    inline def apply(column: Double, line: Double, source: String): MappedPosition = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[MappedPosition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MappedPosition] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait Mapping extends StObject {
    
    var generated: Position
    
    var name: js.UndefOr[String] = js.undefined
    
    var original: Position
    
    var source: String
  }
  object Mapping {
    
    inline def apply(generated: Position, original: Position, source: String): Mapping = {
      val __obj = js.Dynamic.literal(generated = generated.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mapping]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Mapping] (val x: Self) extends AnyVal {
      
      inline def setGenerated(value: Position): Self = StObject.set(x, "generated", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOriginal(value: Position): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait MappingItem extends StObject {
    
    var generatedColumn: Double
    
    var generatedLine: Double
    
    var name: String
    
    var originalColumn: Double
    
    var originalLine: Double
    
    var source: String
  }
  object MappingItem {
    
    inline def apply(
      generatedColumn: Double,
      generatedLine: Double,
      name: String,
      originalColumn: Double,
      originalLine: Double,
      source: String
    ): MappingItem = {
      val __obj = js.Dynamic.literal(generatedColumn = generatedColumn.asInstanceOf[js.Any], generatedLine = generatedLine.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], originalColumn = originalColumn.asInstanceOf[js.Any], originalLine = originalLine.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[MappingItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MappingItem] (val x: Self) extends AnyVal {
      
      inline def setGeneratedColumn(value: Double): Self = StObject.set(x, "generatedColumn", value.asInstanceOf[js.Any])
      
      inline def setGeneratedLine(value: Double): Self = StObject.set(x, "generatedLine", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOriginalColumn(value: Double): Self = StObject.set(x, "originalColumn", value.asInstanceOf[js.Any])
      
      inline def setOriginalLine(value: Double): Self = StObject.set(x, "originalLine", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait Position extends StObject {
    
    var column: Double
    
    var line: Double
  }
  object Position {
    
    inline def apply(column: Double, line: Double): Position = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  trait RawSourceMap
    extends StObject
       with StartOfSourceMap {
    
    var mappings: String
    
    var names: js.Array[String]
    
    var sources: js.Array[String]
    
    var sourcesContent: js.UndefOr[js.Array[String]] = js.undefined
    
    var version: String
  }
  object RawSourceMap {
    
    inline def apply(mappings: String, names: js.Array[String], sources: js.Array[String], version: String): RawSourceMap = {
      val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawSourceMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RawSourceMap] (val x: Self) extends AnyVal {
      
      inline def setMappings(value: String): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
      
      inline def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesContent(value: js.Array[String]): Self = StObject.set(x, "sourcesContent", value.asInstanceOf[js.Any])
      
      inline def setSourcesContentUndefined: Self = StObject.set(x, "sourcesContent", js.undefined)
      
      inline def setSourcesContentVarargs(value: String*): Self = StObject.set(x, "sourcesContent", js.Array(value*))
      
      inline def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value*))
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait SourceFindPosition
    extends StObject
       with FindPosition {
    
    var source: String
  }
  object SourceFindPosition {
    
    inline def apply(column: Double, line: Double, source: String): SourceFindPosition = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceFindPosition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SourceFindPosition] (val x: Self) extends AnyVal {
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait StartOfSourceMap extends StObject {
    
    var file: js.UndefOr[String] = js.undefined
    
    var sourceRoot: js.UndefOr[String] = js.undefined
  }
  object StartOfSourceMap {
    
    inline def apply(): StartOfSourceMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartOfSourceMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StartOfSourceMap] (val x: Self) extends AnyVal {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      inline def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
    }
  }
}
