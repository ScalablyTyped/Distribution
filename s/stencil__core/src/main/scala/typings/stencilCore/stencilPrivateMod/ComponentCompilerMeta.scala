package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentCompilerMeta
  extends StObject
     with ComponentCompilerFeatures {
  
  var assetsDirs: js.Array[CompilerAssetDir]
  
  var componentClassName: String
  
  var dependencies: js.UndefOr[js.Array[String]] = js.undefined
  
  var dependents: js.UndefOr[js.Array[String]] = js.undefined
  
  var directDependencies: js.UndefOr[js.Array[String]] = js.undefined
  
  var directDependents: js.UndefOr[js.Array[String]] = js.undefined
  
  var docs: CompilerJsDoc
  
  var elementRef: String
  
  var encapsulation: Encapsulation
  
  var events: js.Array[ComponentCompilerEvent]
  
  var excludeFromCollection: Boolean
  
  var internal: Boolean
  
  var isCollectionDependency: Boolean
  
  var jsFilePath: String
  
  var legacyConnect: js.Array[ComponentCompilerLegacyConnect]
  
  var legacyContext: js.Array[ComponentCompilerLegacyContext]
  
  var listeners: js.Array[ComponentCompilerListener]
  
  var methods: js.Array[ComponentCompilerMethod]
  
  var properties: js.Array[ComponentCompilerProperty]
  
  var shadowDelegatesFocus: Boolean
  
  var sourceFilePath: String
  
  var sourceMapPath: String
  
  var states: js.Array[ComponentCompilerState]
  
  var styleDocs: js.Array[CompilerStyleDoc]
  
  var styles: js.Array[StyleCompiler]
  
  var tagName: String
  
  var virtualProperties: js.Array[ComponentCompilerVirtualProperty]
  
  var watchers: js.Array[ComponentCompilerWatch]
}
object ComponentCompilerMeta {
  
  inline def apply(
    assetsDirs: js.Array[CompilerAssetDir],
    componentClassName: String,
    docs: CompilerJsDoc,
    elementRef: String,
    encapsulation: Encapsulation,
    events: js.Array[ComponentCompilerEvent],
    excludeFromCollection: Boolean,
    hasAttribute: Boolean,
    hasAttributeChangedCallbackFn: Boolean,
    hasComponentDidLoadFn: Boolean,
    hasComponentDidRenderFn: Boolean,
    hasComponentDidUnloadFn: Boolean,
    hasComponentDidUpdateFn: Boolean,
    hasComponentShouldUpdateFn: Boolean,
    hasComponentWillLoadFn: Boolean,
    hasComponentWillRenderFn: Boolean,
    hasComponentWillUpdateFn: Boolean,
    hasConnectedCallbackFn: Boolean,
    hasDisconnectedCallbackFn: Boolean,
    hasElement: Boolean,
    hasEvent: Boolean,
    hasLifecycle: Boolean,
    hasListener: Boolean,
    hasListenerTarget: Boolean,
    hasListenerTargetBody: Boolean,
    hasListenerTargetDocument: Boolean,
    hasListenerTargetParent: Boolean,
    hasListenerTargetWindow: Boolean,
    hasMember: Boolean,
    hasMethod: Boolean,
    hasMode: Boolean,
    hasProp: Boolean,
    hasPropBoolean: Boolean,
    hasPropMutable: Boolean,
    hasPropNumber: Boolean,
    hasPropString: Boolean,
    hasReflect: Boolean,
    hasRenderFn: Boolean,
    hasState: Boolean,
    hasStyle: Boolean,
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
    hasWatchCallback: Boolean,
    htmlAttrNames: js.Array[String],
    htmlParts: js.Array[String],
    htmlTagNames: js.Array[String],
    internal: Boolean,
    isCollectionDependency: Boolean,
    isPlain: Boolean,
    isUpdateable: Boolean,
    jsFilePath: String,
    legacyConnect: js.Array[ComponentCompilerLegacyConnect],
    legacyContext: js.Array[ComponentCompilerLegacyContext],
    listeners: js.Array[ComponentCompilerListener],
    methods: js.Array[ComponentCompilerMethod],
    potentialCmpRefs: js.Array[String],
    properties: js.Array[ComponentCompilerProperty],
    shadowDelegatesFocus: Boolean,
    sourceFilePath: String,
    sourceMapPath: String,
    states: js.Array[ComponentCompilerState],
    styleDocs: js.Array[CompilerStyleDoc],
    styles: js.Array[StyleCompiler],
    tagName: String,
    virtualProperties: js.Array[ComponentCompilerVirtualProperty],
    watchers: js.Array[ComponentCompilerWatch]
  ): ComponentCompilerMeta = {
    val __obj = js.Dynamic.literal(assetsDirs = assetsDirs.asInstanceOf[js.Any], componentClassName = componentClassName.asInstanceOf[js.Any], docs = docs.asInstanceOf[js.Any], elementRef = elementRef.asInstanceOf[js.Any], encapsulation = encapsulation.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], excludeFromCollection = excludeFromCollection.asInstanceOf[js.Any], hasAttribute = hasAttribute.asInstanceOf[js.Any], hasAttributeChangedCallbackFn = hasAttributeChangedCallbackFn.asInstanceOf[js.Any], hasComponentDidLoadFn = hasComponentDidLoadFn.asInstanceOf[js.Any], hasComponentDidRenderFn = hasComponentDidRenderFn.asInstanceOf[js.Any], hasComponentDidUnloadFn = hasComponentDidUnloadFn.asInstanceOf[js.Any], hasComponentDidUpdateFn = hasComponentDidUpdateFn.asInstanceOf[js.Any], hasComponentShouldUpdateFn = hasComponentShouldUpdateFn.asInstanceOf[js.Any], hasComponentWillLoadFn = hasComponentWillLoadFn.asInstanceOf[js.Any], hasComponentWillRenderFn = hasComponentWillRenderFn.asInstanceOf[js.Any], hasComponentWillUpdateFn = hasComponentWillUpdateFn.asInstanceOf[js.Any], hasConnectedCallbackFn = hasConnectedCallbackFn.asInstanceOf[js.Any], hasDisconnectedCallbackFn = hasDisconnectedCallbackFn.asInstanceOf[js.Any], hasElement = hasElement.asInstanceOf[js.Any], hasEvent = hasEvent.asInstanceOf[js.Any], hasLifecycle = hasLifecycle.asInstanceOf[js.Any], hasListener = hasListener.asInstanceOf[js.Any], hasListenerTarget = hasListenerTarget.asInstanceOf[js.Any], hasListenerTargetBody = hasListenerTargetBody.asInstanceOf[js.Any], hasListenerTargetDocument = hasListenerTargetDocument.asInstanceOf[js.Any], hasListenerTargetParent = hasListenerTargetParent.asInstanceOf[js.Any], hasListenerTargetWindow = hasListenerTargetWindow.asInstanceOf[js.Any], hasMember = hasMember.asInstanceOf[js.Any], hasMethod = hasMethod.asInstanceOf[js.Any], hasMode = hasMode.asInstanceOf[js.Any], hasProp = hasProp.asInstanceOf[js.Any], hasPropBoolean = hasPropBoolean.asInstanceOf[js.Any], hasPropMutable = hasPropMutable.asInstanceOf[js.Any], hasPropNumber = hasPropNumber.asInstanceOf[js.Any], hasPropString = hasPropString.asInstanceOf[js.Any], hasReflect = hasReflect.asInstanceOf[js.Any], hasRenderFn = hasRenderFn.asInstanceOf[js.Any], hasState = hasState.asInstanceOf[js.Any], hasStyle = hasStyle.asInstanceOf[js.Any], hasVdomAttribute = hasVdomAttribute.asInstanceOf[js.Any], hasVdomClass = hasVdomClass.asInstanceOf[js.Any], hasVdomFunctional = hasVdomFunctional.asInstanceOf[js.Any], hasVdomKey = hasVdomKey.asInstanceOf[js.Any], hasVdomListener = hasVdomListener.asInstanceOf[js.Any], hasVdomPropOrAttr = hasVdomPropOrAttr.asInstanceOf[js.Any], hasVdomRef = hasVdomRef.asInstanceOf[js.Any], hasVdomRender = hasVdomRender.asInstanceOf[js.Any], hasVdomStyle = hasVdomStyle.asInstanceOf[js.Any], hasVdomText = hasVdomText.asInstanceOf[js.Any], hasVdomXlink = hasVdomXlink.asInstanceOf[js.Any], hasWatchCallback = hasWatchCallback.asInstanceOf[js.Any], htmlAttrNames = htmlAttrNames.asInstanceOf[js.Any], htmlParts = htmlParts.asInstanceOf[js.Any], htmlTagNames = htmlTagNames.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], isCollectionDependency = isCollectionDependency.asInstanceOf[js.Any], isPlain = isPlain.asInstanceOf[js.Any], isUpdateable = isUpdateable.asInstanceOf[js.Any], jsFilePath = jsFilePath.asInstanceOf[js.Any], legacyConnect = legacyConnect.asInstanceOf[js.Any], legacyContext = legacyContext.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any], potentialCmpRefs = potentialCmpRefs.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], shadowDelegatesFocus = shadowDelegatesFocus.asInstanceOf[js.Any], sourceFilePath = sourceFilePath.asInstanceOf[js.Any], sourceMapPath = sourceMapPath.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any], styleDocs = styleDocs.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], virtualProperties = virtualProperties.asInstanceOf[js.Any], watchers = watchers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentCompilerMeta]
  }
  
  extension [Self <: ComponentCompilerMeta](x: Self) {
    
    inline def setAssetsDirs(value: js.Array[CompilerAssetDir]): Self = StObject.set(x, "assetsDirs", value.asInstanceOf[js.Any])
    
    inline def setAssetsDirsVarargs(value: CompilerAssetDir*): Self = StObject.set(x, "assetsDirs", js.Array(value*))
    
    inline def setComponentClassName(value: String): Self = StObject.set(x, "componentClassName", value.asInstanceOf[js.Any])
    
    inline def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setDependents(value: js.Array[String]): Self = StObject.set(x, "dependents", value.asInstanceOf[js.Any])
    
    inline def setDependentsUndefined: Self = StObject.set(x, "dependents", js.undefined)
    
    inline def setDependentsVarargs(value: String*): Self = StObject.set(x, "dependents", js.Array(value*))
    
    inline def setDirectDependencies(value: js.Array[String]): Self = StObject.set(x, "directDependencies", value.asInstanceOf[js.Any])
    
    inline def setDirectDependenciesUndefined: Self = StObject.set(x, "directDependencies", js.undefined)
    
    inline def setDirectDependenciesVarargs(value: String*): Self = StObject.set(x, "directDependencies", js.Array(value*))
    
    inline def setDirectDependents(value: js.Array[String]): Self = StObject.set(x, "directDependents", value.asInstanceOf[js.Any])
    
    inline def setDirectDependentsUndefined: Self = StObject.set(x, "directDependents", js.undefined)
    
    inline def setDirectDependentsVarargs(value: String*): Self = StObject.set(x, "directDependents", js.Array(value*))
    
    inline def setDocs(value: CompilerJsDoc): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setElementRef(value: String): Self = StObject.set(x, "elementRef", value.asInstanceOf[js.Any])
    
    inline def setEncapsulation(value: Encapsulation): Self = StObject.set(x, "encapsulation", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: js.Array[ComponentCompilerEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: ComponentCompilerEvent*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setExcludeFromCollection(value: Boolean): Self = StObject.set(x, "excludeFromCollection", value.asInstanceOf[js.Any])
    
    inline def setInternal(value: Boolean): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
    
    inline def setIsCollectionDependency(value: Boolean): Self = StObject.set(x, "isCollectionDependency", value.asInstanceOf[js.Any])
    
    inline def setJsFilePath(value: String): Self = StObject.set(x, "jsFilePath", value.asInstanceOf[js.Any])
    
    inline def setLegacyConnect(value: js.Array[ComponentCompilerLegacyConnect]): Self = StObject.set(x, "legacyConnect", value.asInstanceOf[js.Any])
    
    inline def setLegacyConnectVarargs(value: ComponentCompilerLegacyConnect*): Self = StObject.set(x, "legacyConnect", js.Array(value*))
    
    inline def setLegacyContext(value: js.Array[ComponentCompilerLegacyContext]): Self = StObject.set(x, "legacyContext", value.asInstanceOf[js.Any])
    
    inline def setLegacyContextVarargs(value: ComponentCompilerLegacyContext*): Self = StObject.set(x, "legacyContext", js.Array(value*))
    
    inline def setListeners(value: js.Array[ComponentCompilerListener]): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
    
    inline def setListenersVarargs(value: ComponentCompilerListener*): Self = StObject.set(x, "listeners", js.Array(value*))
    
    inline def setMethods(value: js.Array[ComponentCompilerMethod]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    inline def setMethodsVarargs(value: ComponentCompilerMethod*): Self = StObject.set(x, "methods", js.Array(value*))
    
    inline def setProperties(value: js.Array[ComponentCompilerProperty]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesVarargs(value: ComponentCompilerProperty*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setShadowDelegatesFocus(value: Boolean): Self = StObject.set(x, "shadowDelegatesFocus", value.asInstanceOf[js.Any])
    
    inline def setSourceFilePath(value: String): Self = StObject.set(x, "sourceFilePath", value.asInstanceOf[js.Any])
    
    inline def setSourceMapPath(value: String): Self = StObject.set(x, "sourceMapPath", value.asInstanceOf[js.Any])
    
    inline def setStates(value: js.Array[ComponentCompilerState]): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    inline def setStatesVarargs(value: ComponentCompilerState*): Self = StObject.set(x, "states", js.Array(value*))
    
    inline def setStyleDocs(value: js.Array[CompilerStyleDoc]): Self = StObject.set(x, "styleDocs", value.asInstanceOf[js.Any])
    
    inline def setStyleDocsVarargs(value: CompilerStyleDoc*): Self = StObject.set(x, "styleDocs", js.Array(value*))
    
    inline def setStyles(value: js.Array[StyleCompiler]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesVarargs(value: StyleCompiler*): Self = StObject.set(x, "styles", js.Array(value*))
    
    inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    inline def setVirtualProperties(value: js.Array[ComponentCompilerVirtualProperty]): Self = StObject.set(x, "virtualProperties", value.asInstanceOf[js.Any])
    
    inline def setVirtualPropertiesVarargs(value: ComponentCompilerVirtualProperty*): Self = StObject.set(x, "virtualProperties", js.Array(value*))
    
    inline def setWatchers(value: js.Array[ComponentCompilerWatch]): Self = StObject.set(x, "watchers", value.asInstanceOf[js.Any])
    
    inline def setWatchersVarargs(value: ComponentCompilerWatch*): Self = StObject.set(x, "watchers", js.Array(value*))
  }
}
