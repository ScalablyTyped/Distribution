package typings.stencilCore.stencilPublicDocsMod

import typings.stencilCore.stencilCoreStrings.none
import typings.stencilCore.stencilCoreStrings.scoped
import typings.stencilCore.stencilCoreStrings.shadow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonDocsComponent extends StObject {
  
  var dependencies: js.Array[String]
  
  var dependencyGraph: JsonDocsDependencyGraph
  
  var dependents: js.Array[String]
  
  var deprecation: js.UndefOr[String] = js.undefined
  
  var dirPath: js.UndefOr[String] = js.undefined
  
  var docs: String
  
  var docsTags: js.Array[JsonDocsTag]
  
  var encapsulation: shadow | scoped | none
  
  var events: js.Array[JsonDocsEvent]
  
  var fileName: js.UndefOr[String] = js.undefined
  
  var filePath: js.UndefOr[String] = js.undefined
  
  var listeners: js.Array[JsonDocsListener]
  
  var methods: js.Array[JsonDocsMethod]
  
  var parts: js.Array[JsonDocsPart]
  
  var props: js.Array[JsonDocsProp]
  
  var readme: String
  
  var readmePath: js.UndefOr[String] = js.undefined
  
  var slots: js.Array[JsonDocsSlot]
  
  var styles: js.Array[JsonDocsStyle]
  
  var tag: String
  
  var usage: JsonDocsUsage
  
  var usagesDir: js.UndefOr[String] = js.undefined
}
object JsonDocsComponent {
  
  inline def apply(
    dependencies: js.Array[String],
    dependencyGraph: JsonDocsDependencyGraph,
    dependents: js.Array[String],
    docs: String,
    docsTags: js.Array[JsonDocsTag],
    encapsulation: shadow | scoped | none,
    events: js.Array[JsonDocsEvent],
    listeners: js.Array[JsonDocsListener],
    methods: js.Array[JsonDocsMethod],
    parts: js.Array[JsonDocsPart],
    props: js.Array[JsonDocsProp],
    readme: String,
    slots: js.Array[JsonDocsSlot],
    styles: js.Array[JsonDocsStyle],
    tag: String,
    usage: JsonDocsUsage
  ): JsonDocsComponent = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], dependencyGraph = dependencyGraph.asInstanceOf[js.Any], dependents = dependents.asInstanceOf[js.Any], docs = docs.asInstanceOf[js.Any], docsTags = docsTags.asInstanceOf[js.Any], encapsulation = encapsulation.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], readme = readme.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonDocsComponent]
  }
  
  extension [Self <: JsonDocsComponent](x: Self) {
    
    inline def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setDependencyGraph(value: JsonDocsDependencyGraph): Self = StObject.set(x, "dependencyGraph", value.asInstanceOf[js.Any])
    
    inline def setDependents(value: js.Array[String]): Self = StObject.set(x, "dependents", value.asInstanceOf[js.Any])
    
    inline def setDependentsVarargs(value: String*): Self = StObject.set(x, "dependents", js.Array(value*))
    
    inline def setDeprecation(value: String): Self = StObject.set(x, "deprecation", value.asInstanceOf[js.Any])
    
    inline def setDeprecationUndefined: Self = StObject.set(x, "deprecation", js.undefined)
    
    inline def setDirPath(value: String): Self = StObject.set(x, "dirPath", value.asInstanceOf[js.Any])
    
    inline def setDirPathUndefined: Self = StObject.set(x, "dirPath", js.undefined)
    
    inline def setDocs(value: String): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setDocsTags(value: js.Array[JsonDocsTag]): Self = StObject.set(x, "docsTags", value.asInstanceOf[js.Any])
    
    inline def setDocsTagsVarargs(value: JsonDocsTag*): Self = StObject.set(x, "docsTags", js.Array(value*))
    
    inline def setEncapsulation(value: shadow | scoped | none): Self = StObject.set(x, "encapsulation", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: js.Array[JsonDocsEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: JsonDocsEvent*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    
    inline def setListeners(value: js.Array[JsonDocsListener]): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
    
    inline def setListenersVarargs(value: JsonDocsListener*): Self = StObject.set(x, "listeners", js.Array(value*))
    
    inline def setMethods(value: js.Array[JsonDocsMethod]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    inline def setMethodsVarargs(value: JsonDocsMethod*): Self = StObject.set(x, "methods", js.Array(value*))
    
    inline def setParts(value: js.Array[JsonDocsPart]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    
    inline def setPartsVarargs(value: JsonDocsPart*): Self = StObject.set(x, "parts", js.Array(value*))
    
    inline def setProps(value: js.Array[JsonDocsProp]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setPropsVarargs(value: JsonDocsProp*): Self = StObject.set(x, "props", js.Array(value*))
    
    inline def setReadme(value: String): Self = StObject.set(x, "readme", value.asInstanceOf[js.Any])
    
    inline def setReadmePath(value: String): Self = StObject.set(x, "readmePath", value.asInstanceOf[js.Any])
    
    inline def setReadmePathUndefined: Self = StObject.set(x, "readmePath", js.undefined)
    
    inline def setSlots(value: js.Array[JsonDocsSlot]): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    inline def setSlotsVarargs(value: JsonDocsSlot*): Self = StObject.set(x, "slots", js.Array(value*))
    
    inline def setStyles(value: js.Array[JsonDocsStyle]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesVarargs(value: JsonDocsStyle*): Self = StObject.set(x, "styles", js.Array(value*))
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setUsage(value: JsonDocsUsage): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    inline def setUsagesDir(value: String): Self = StObject.set(x, "usagesDir", value.asInstanceOf[js.Any])
    
    inline def setUsagesDirUndefined: Self = StObject.set(x, "usagesDir", js.undefined)
  }
}
