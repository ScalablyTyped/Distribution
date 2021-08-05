package typings.sourceListMap

import typings.sourceListMap.mod.CodeNode
import typings.sourceListMap.mod.SourceNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait File extends StObject {
    
    var file: js.Any
  }
  object File {
    
    inline def apply(file: js.Any): File = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    extension [Self <: File](x: Self) {
      
      inline def setFile(value: js.Any): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
  
  trait Map extends StObject {
    
    var map: Mappings
    
    var source: String
  }
  object Map {
    
    inline def apply(map: Mappings, source: String): Map = {
      val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Map]
    }
    
    extension [Self <: Map](x: Self) {
      
      inline def setMap(value: Mappings): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait Mappings extends StObject {
    
    var file: js.Any
    
    var mappings: String
    
    var sources: js.Array[String]
    
    var sourcesContent: js.Array[String]
    
    var version: Double
  }
  object Mappings {
    
    inline def apply(
      file: js.Any,
      mappings: String,
      sources: js.Array[String],
      sourcesContent: js.Array[String],
      version: Double
    ): Mappings = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], mappings = mappings.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], sourcesContent = sourcesContent.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mappings]
    }
    
    extension [Self <: Mappings](x: Self) {
      
      inline def setFile(value: js.Any): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setMappings(value: String): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
      
      inline def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesContent(value: js.Array[String]): Self = StObject.set(x, "sourcesContent", value.asInstanceOf[js.Any])
      
      inline def setSourcesContentVarargs(value: String*): Self = StObject.set(x, "sourcesContent", js.Array(value :_*))
      
      inline def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value :_*))
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait Sources extends StObject {
    
    var mappings: String
    
    var sources: js.Array[String | SourceNode | CodeNode]
    
    var sourcesContent: js.Array[String]
  }
  object Sources {
    
    inline def apply(
      mappings: String,
      sources: js.Array[String | SourceNode | CodeNode],
      sourcesContent: js.Array[String]
    ): Sources = {
      val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], sourcesContent = sourcesContent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sources]
    }
    
    extension [Self <: Sources](x: Self) {
      
      inline def setMappings(value: String): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
      
      inline def setSources(value: js.Array[String | SourceNode | CodeNode]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesContent(value: js.Array[String]): Self = StObject.set(x, "sourcesContent", value.asInstanceOf[js.Any])
      
      inline def setSourcesContentVarargs(value: String*): Self = StObject.set(x, "sourcesContent", js.Array(value :_*))
      
      inline def setSourcesVarargs(value: (String | SourceNode | CodeNode)*): Self = StObject.set(x, "sources", js.Array(value :_*))
    }
  }
}
