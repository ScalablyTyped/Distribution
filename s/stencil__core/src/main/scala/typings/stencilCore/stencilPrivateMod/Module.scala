package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Module extends StObject {
  
  var cmps: js.Array[ComponentCompilerMeta]
  
  var collectionName: String
  
  var coreRuntimeApis: js.Array[String]
  
  var dtsFilePath: String
  
  var excludeFromCollection: Boolean
  
  var externalImports: js.Array[String]
  
  var hasVdomAttribute: Boolean
  
  var hasVdomClass: Boolean
  
  var hasVdomFunctional: Boolean
  
  var hasVdomKey: Boolean
  
  var hasVdomListener: Boolean
  
  var hasVdomPropOrAttr: Boolean
  
  var hasVdomRef: Boolean
  
  var hasVdomRender: Boolean
  
  var hasVdomStyle: Boolean
  
  var hasVdomText: Boolean
  
  var hasVdomXlink: Boolean
  
  var htmlAttrNames: js.Array[String]
  
  var htmlParts: js.Array[String]
  
  var htmlTagNames: js.Array[String]
  
  var isCollectionDependency: Boolean
  
  var isLegacy: Boolean
  
  var jsFilePath: String
  
  var localImports: js.Array[String]
  
  var originalCollectionComponentPath: String
  
  var originalImports: js.Array[String]
  
  var potentialCmpRefs: js.Array[String]
  
  var sourceFilePath: String
  
  var sourceMapFileText: String
  
  var sourceMapPath: String
  
  var staticSourceFile: Any
  
  var staticSourceFileText: String
}
object Module {
  
  inline def apply(
    cmps: js.Array[ComponentCompilerMeta],
    collectionName: String,
    coreRuntimeApis: js.Array[String],
    dtsFilePath: String,
    excludeFromCollection: Boolean,
    externalImports: js.Array[String],
    hasVdomAttribute: Boolean,
    hasVdomClass: Boolean,
    hasVdomFunctional: Boolean,
    hasVdomKey: Boolean,
    hasVdomListener: Boolean,
    hasVdomPropOrAttr: Boolean,
    hasVdomRef: Boolean,
    hasVdomRender: Boolean,
    hasVdomStyle: Boolean,
    hasVdomText: Boolean,
    hasVdomXlink: Boolean,
    htmlAttrNames: js.Array[String],
    htmlParts: js.Array[String],
    htmlTagNames: js.Array[String],
    isCollectionDependency: Boolean,
    isLegacy: Boolean,
    jsFilePath: String,
    localImports: js.Array[String],
    originalCollectionComponentPath: String,
    originalImports: js.Array[String],
    potentialCmpRefs: js.Array[String],
    sourceFilePath: String,
    sourceMapFileText: String,
    sourceMapPath: String,
    staticSourceFile: Any,
    staticSourceFileText: String
  ): Module = {
    val __obj = js.Dynamic.literal(cmps = cmps.asInstanceOf[js.Any], collectionName = collectionName.asInstanceOf[js.Any], coreRuntimeApis = coreRuntimeApis.asInstanceOf[js.Any], dtsFilePath = dtsFilePath.asInstanceOf[js.Any], excludeFromCollection = excludeFromCollection.asInstanceOf[js.Any], externalImports = externalImports.asInstanceOf[js.Any], hasVdomAttribute = hasVdomAttribute.asInstanceOf[js.Any], hasVdomClass = hasVdomClass.asInstanceOf[js.Any], hasVdomFunctional = hasVdomFunctional.asInstanceOf[js.Any], hasVdomKey = hasVdomKey.asInstanceOf[js.Any], hasVdomListener = hasVdomListener.asInstanceOf[js.Any], hasVdomPropOrAttr = hasVdomPropOrAttr.asInstanceOf[js.Any], hasVdomRef = hasVdomRef.asInstanceOf[js.Any], hasVdomRender = hasVdomRender.asInstanceOf[js.Any], hasVdomStyle = hasVdomStyle.asInstanceOf[js.Any], hasVdomText = hasVdomText.asInstanceOf[js.Any], hasVdomXlink = hasVdomXlink.asInstanceOf[js.Any], htmlAttrNames = htmlAttrNames.asInstanceOf[js.Any], htmlParts = htmlParts.asInstanceOf[js.Any], htmlTagNames = htmlTagNames.asInstanceOf[js.Any], isCollectionDependency = isCollectionDependency.asInstanceOf[js.Any], isLegacy = isLegacy.asInstanceOf[js.Any], jsFilePath = jsFilePath.asInstanceOf[js.Any], localImports = localImports.asInstanceOf[js.Any], originalCollectionComponentPath = originalCollectionComponentPath.asInstanceOf[js.Any], originalImports = originalImports.asInstanceOf[js.Any], potentialCmpRefs = potentialCmpRefs.asInstanceOf[js.Any], sourceFilePath = sourceFilePath.asInstanceOf[js.Any], sourceMapFileText = sourceMapFileText.asInstanceOf[js.Any], sourceMapPath = sourceMapPath.asInstanceOf[js.Any], staticSourceFile = staticSourceFile.asInstanceOf[js.Any], staticSourceFileText = staticSourceFileText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Module]
  }
  
  extension [Self <: Module](x: Self) {
    
    inline def setCmps(value: js.Array[ComponentCompilerMeta]): Self = StObject.set(x, "cmps", value.asInstanceOf[js.Any])
    
    inline def setCmpsVarargs(value: ComponentCompilerMeta*): Self = StObject.set(x, "cmps", js.Array(value*))
    
    inline def setCollectionName(value: String): Self = StObject.set(x, "collectionName", value.asInstanceOf[js.Any])
    
    inline def setCoreRuntimeApis(value: js.Array[String]): Self = StObject.set(x, "coreRuntimeApis", value.asInstanceOf[js.Any])
    
    inline def setCoreRuntimeApisVarargs(value: String*): Self = StObject.set(x, "coreRuntimeApis", js.Array(value*))
    
    inline def setDtsFilePath(value: String): Self = StObject.set(x, "dtsFilePath", value.asInstanceOf[js.Any])
    
    inline def setExcludeFromCollection(value: Boolean): Self = StObject.set(x, "excludeFromCollection", value.asInstanceOf[js.Any])
    
    inline def setExternalImports(value: js.Array[String]): Self = StObject.set(x, "externalImports", value.asInstanceOf[js.Any])
    
    inline def setExternalImportsVarargs(value: String*): Self = StObject.set(x, "externalImports", js.Array(value*))
    
    inline def setHasVdomAttribute(value: Boolean): Self = StObject.set(x, "hasVdomAttribute", value.asInstanceOf[js.Any])
    
    inline def setHasVdomClass(value: Boolean): Self = StObject.set(x, "hasVdomClass", value.asInstanceOf[js.Any])
    
    inline def setHasVdomFunctional(value: Boolean): Self = StObject.set(x, "hasVdomFunctional", value.asInstanceOf[js.Any])
    
    inline def setHasVdomKey(value: Boolean): Self = StObject.set(x, "hasVdomKey", value.asInstanceOf[js.Any])
    
    inline def setHasVdomListener(value: Boolean): Self = StObject.set(x, "hasVdomListener", value.asInstanceOf[js.Any])
    
    inline def setHasVdomPropOrAttr(value: Boolean): Self = StObject.set(x, "hasVdomPropOrAttr", value.asInstanceOf[js.Any])
    
    inline def setHasVdomRef(value: Boolean): Self = StObject.set(x, "hasVdomRef", value.asInstanceOf[js.Any])
    
    inline def setHasVdomRender(value: Boolean): Self = StObject.set(x, "hasVdomRender", value.asInstanceOf[js.Any])
    
    inline def setHasVdomStyle(value: Boolean): Self = StObject.set(x, "hasVdomStyle", value.asInstanceOf[js.Any])
    
    inline def setHasVdomText(value: Boolean): Self = StObject.set(x, "hasVdomText", value.asInstanceOf[js.Any])
    
    inline def setHasVdomXlink(value: Boolean): Self = StObject.set(x, "hasVdomXlink", value.asInstanceOf[js.Any])
    
    inline def setHtmlAttrNames(value: js.Array[String]): Self = StObject.set(x, "htmlAttrNames", value.asInstanceOf[js.Any])
    
    inline def setHtmlAttrNamesVarargs(value: String*): Self = StObject.set(x, "htmlAttrNames", js.Array(value*))
    
    inline def setHtmlParts(value: js.Array[String]): Self = StObject.set(x, "htmlParts", value.asInstanceOf[js.Any])
    
    inline def setHtmlPartsVarargs(value: String*): Self = StObject.set(x, "htmlParts", js.Array(value*))
    
    inline def setHtmlTagNames(value: js.Array[String]): Self = StObject.set(x, "htmlTagNames", value.asInstanceOf[js.Any])
    
    inline def setHtmlTagNamesVarargs(value: String*): Self = StObject.set(x, "htmlTagNames", js.Array(value*))
    
    inline def setIsCollectionDependency(value: Boolean): Self = StObject.set(x, "isCollectionDependency", value.asInstanceOf[js.Any])
    
    inline def setIsLegacy(value: Boolean): Self = StObject.set(x, "isLegacy", value.asInstanceOf[js.Any])
    
    inline def setJsFilePath(value: String): Self = StObject.set(x, "jsFilePath", value.asInstanceOf[js.Any])
    
    inline def setLocalImports(value: js.Array[String]): Self = StObject.set(x, "localImports", value.asInstanceOf[js.Any])
    
    inline def setLocalImportsVarargs(value: String*): Self = StObject.set(x, "localImports", js.Array(value*))
    
    inline def setOriginalCollectionComponentPath(value: String): Self = StObject.set(x, "originalCollectionComponentPath", value.asInstanceOf[js.Any])
    
    inline def setOriginalImports(value: js.Array[String]): Self = StObject.set(x, "originalImports", value.asInstanceOf[js.Any])
    
    inline def setOriginalImportsVarargs(value: String*): Self = StObject.set(x, "originalImports", js.Array(value*))
    
    inline def setPotentialCmpRefs(value: js.Array[String]): Self = StObject.set(x, "potentialCmpRefs", value.asInstanceOf[js.Any])
    
    inline def setPotentialCmpRefsVarargs(value: String*): Self = StObject.set(x, "potentialCmpRefs", js.Array(value*))
    
    inline def setSourceFilePath(value: String): Self = StObject.set(x, "sourceFilePath", value.asInstanceOf[js.Any])
    
    inline def setSourceMapFileText(value: String): Self = StObject.set(x, "sourceMapFileText", value.asInstanceOf[js.Any])
    
    inline def setSourceMapPath(value: String): Self = StObject.set(x, "sourceMapPath", value.asInstanceOf[js.Any])
    
    inline def setStaticSourceFile(value: Any): Self = StObject.set(x, "staticSourceFile", value.asInstanceOf[js.Any])
    
    inline def setStaticSourceFileText(value: String): Self = StObject.set(x, "staticSourceFileText", value.asInstanceOf[js.Any])
  }
}
