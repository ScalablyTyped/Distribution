package typings.reactJsonTree

import typings.react.mod.ReactNode
import typings.reactBase16Styling.typesMod.StylingFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait CircularPropsPassedThroughItemRange
    extends StObject
       with SharedCircularPropsProvidedByJSONTree
       with JSONValueNodeCircularPropsPassedThroughJSONTree
       with JSONNestedNodeCircularPropsPassedThroughJSONNestedNode
  object CircularPropsPassedThroughItemRange {
    
    inline def apply(
      circularCache: js.Array[Any],
      collectionLimit: Double,
      getItemString: (String, Any, ReactNode, String, js.Array[String | Double]) => ReactNode,
      hideRoot: Boolean,
      isCustomNode: Any => Boolean,
      keyPath: js.Array[String | Double],
      labelRenderer: (js.Array[String | Double], String, Boolean, Boolean) => ReactNode,
      level: Double,
      postprocessValue: Any => Any,
      shouldExpandNode: (js.Array[String | Double], Any, Double) => Boolean,
      styling: StylingFunction,
      valueRenderer: (Any, Any, /* repeated */ String | Double) => ReactNode
    ): CircularPropsPassedThroughItemRange = {
      val __obj = js.Dynamic.literal(circularCache = circularCache.asInstanceOf[js.Any], collectionLimit = collectionLimit.asInstanceOf[js.Any], getItemString = js.Any.fromFunction5(getItemString), hideRoot = hideRoot.asInstanceOf[js.Any], isCustomNode = js.Any.fromFunction1(isCustomNode), keyPath = keyPath.asInstanceOf[js.Any], labelRenderer = js.Any.fromFunction4(labelRenderer), level = level.asInstanceOf[js.Any], postprocessValue = js.Any.fromFunction1(postprocessValue), shouldExpandNode = js.Any.fromFunction3(shouldExpandNode), styling = styling.asInstanceOf[js.Any], valueRenderer = js.Any.fromFunction3(valueRenderer))
      __obj.asInstanceOf[CircularPropsPassedThroughItemRange]
    }
  }
  
  trait CircularPropsPassedThroughJSONNestedNode
    extends StObject
       with SharedCircularPropsProvidedByJSONTree
       with JSONValueNodeCircularPropsPassedThroughJSONTree
       with JSONNestedNodeCircularPropsPassedThroughJSONNestedNode
  object CircularPropsPassedThroughJSONNestedNode {
    
    inline def apply(
      circularCache: js.Array[Any],
      collectionLimit: Double,
      getItemString: (String, Any, ReactNode, String, js.Array[String | Double]) => ReactNode,
      hideRoot: Boolean,
      isCustomNode: Any => Boolean,
      keyPath: js.Array[String | Double],
      labelRenderer: (js.Array[String | Double], String, Boolean, Boolean) => ReactNode,
      level: Double,
      postprocessValue: Any => Any,
      shouldExpandNode: (js.Array[String | Double], Any, Double) => Boolean,
      styling: StylingFunction,
      valueRenderer: (Any, Any, /* repeated */ String | Double) => ReactNode
    ): CircularPropsPassedThroughJSONNestedNode = {
      val __obj = js.Dynamic.literal(circularCache = circularCache.asInstanceOf[js.Any], collectionLimit = collectionLimit.asInstanceOf[js.Any], getItemString = js.Any.fromFunction5(getItemString), hideRoot = hideRoot.asInstanceOf[js.Any], isCustomNode = js.Any.fromFunction1(isCustomNode), keyPath = keyPath.asInstanceOf[js.Any], labelRenderer = js.Any.fromFunction4(labelRenderer), level = level.asInstanceOf[js.Any], postprocessValue = js.Any.fromFunction1(postprocessValue), shouldExpandNode = js.Any.fromFunction3(shouldExpandNode), styling = styling.asInstanceOf[js.Any], valueRenderer = js.Any.fromFunction3(valueRenderer))
      __obj.asInstanceOf[CircularPropsPassedThroughJSONNestedNode]
    }
  }
  
  trait CircularPropsPassedThroughJSONNode
    extends StObject
       with SharedCircularPropsProvidedByJSONTree
       with JSONValueNodeCircularPropsPassedThroughJSONTree
       with JSONNestedNodeCircularPropsPassedThroughJSONNode
  object CircularPropsPassedThroughJSONNode {
    
    inline def apply(
      collectionLimit: Double,
      getItemString: (String, Any, ReactNode, String, js.Array[String | Double]) => ReactNode,
      hideRoot: Boolean,
      isCustomNode: Any => Boolean,
      keyPath: js.Array[String | Double],
      labelRenderer: (js.Array[String | Double], String, Boolean, Boolean) => ReactNode,
      postprocessValue: Any => Any,
      shouldExpandNode: (js.Array[String | Double], Any, Double) => Boolean,
      styling: StylingFunction,
      valueRenderer: (Any, Any, /* repeated */ String | Double) => ReactNode
    ): CircularPropsPassedThroughJSONNode = {
      val __obj = js.Dynamic.literal(collectionLimit = collectionLimit.asInstanceOf[js.Any], getItemString = js.Any.fromFunction5(getItemString), hideRoot = hideRoot.asInstanceOf[js.Any], isCustomNode = js.Any.fromFunction1(isCustomNode), keyPath = keyPath.asInstanceOf[js.Any], labelRenderer = js.Any.fromFunction4(labelRenderer), postprocessValue = js.Any.fromFunction1(postprocessValue), shouldExpandNode = js.Any.fromFunction3(shouldExpandNode), styling = styling.asInstanceOf[js.Any], valueRenderer = js.Any.fromFunction3(valueRenderer))
      __obj.asInstanceOf[CircularPropsPassedThroughJSONNode]
    }
  }
  
  trait CircularPropsPassedThroughJSONTree
    extends StObject
       with SharedCircularPropsPassedThroughJSONTree
       with JSONValueNodeCircularPropsPassedThroughJSONTree
       with JSONNestedNodeCircularPropsPassedThroughJSONTree
  object CircularPropsPassedThroughJSONTree {
    
    inline def apply(
      collectionLimit: Double,
      getItemString: (String, Any, ReactNode, String, js.Array[String | Double]) => ReactNode,
      hideRoot: Boolean,
      isCustomNode: Any => Boolean,
      keyPath: js.Array[String | Double],
      labelRenderer: (js.Array[String | Double], String, Boolean, Boolean) => ReactNode,
      postprocessValue: Any => Any,
      shouldExpandNode: (js.Array[String | Double], Any, Double) => Boolean,
      valueRenderer: (Any, Any, /* repeated */ String | Double) => ReactNode
    ): CircularPropsPassedThroughJSONTree = {
      val __obj = js.Dynamic.literal(collectionLimit = collectionLimit.asInstanceOf[js.Any], getItemString = js.Any.fromFunction5(getItemString), hideRoot = hideRoot.asInstanceOf[js.Any], isCustomNode = js.Any.fromFunction1(isCustomNode), keyPath = keyPath.asInstanceOf[js.Any], labelRenderer = js.Any.fromFunction4(labelRenderer), postprocessValue = js.Any.fromFunction1(postprocessValue), shouldExpandNode = js.Any.fromFunction3(shouldExpandNode), valueRenderer = js.Any.fromFunction3(valueRenderer))
      __obj.asInstanceOf[CircularPropsPassedThroughJSONTree]
    }
  }
  
  trait CircularPropsPassedThroughRenderChildNodes
    extends StObject
       with SharedCircularPropsProvidedByJSONTree
       with JSONValueNodeCircularPropsPassedThroughJSONTree
       with JSONNestedNodeCircularPropsPassedThroughJSONNestedNode
  object CircularPropsPassedThroughRenderChildNodes {
    
    inline def apply(
      circularCache: js.Array[Any],
      collectionLimit: Double,
      getItemString: (String, Any, ReactNode, String, js.Array[String | Double]) => ReactNode,
      hideRoot: Boolean,
      isCustomNode: Any => Boolean,
      keyPath: js.Array[String | Double],
      labelRenderer: (js.Array[String | Double], String, Boolean, Boolean) => ReactNode,
      level: Double,
      postprocessValue: Any => Any,
      shouldExpandNode: (js.Array[String | Double], Any, Double) => Boolean,
      styling: StylingFunction,
      valueRenderer: (Any, Any, /* repeated */ String | Double) => ReactNode
    ): CircularPropsPassedThroughRenderChildNodes = {
      val __obj = js.Dynamic.literal(circularCache = circularCache.asInstanceOf[js.Any], collectionLimit = collectionLimit.asInstanceOf[js.Any], getItemString = js.Any.fromFunction5(getItemString), hideRoot = hideRoot.asInstanceOf[js.Any], isCustomNode = js.Any.fromFunction1(isCustomNode), keyPath = keyPath.asInstanceOf[js.Any], labelRenderer = js.Any.fromFunction4(labelRenderer), level = level.asInstanceOf[js.Any], postprocessValue = js.Any.fromFunction1(postprocessValue), shouldExpandNode = js.Any.fromFunction3(shouldExpandNode), styling = styling.asInstanceOf[js.Any], valueRenderer = js.Any.fromFunction3(valueRenderer))
      __obj.asInstanceOf[CircularPropsPassedThroughRenderChildNodes]
    }
  }
  
  trait JSONNestedNodeCircularPropsPassedThroughJSONNestedNode
    extends StObject
       with JSONNestedNodeCircularPropsPassedThroughJSONNode {
    
    @JSName("circularCache")
    var circularCache_JSONNestedNodeCircularPropsPassedThroughJSONNestedNode: js.Array[Any]
    
    @JSName("level")
    var level_JSONNestedNodeCircularPropsPassedThroughJSONNestedNode: Double
  }
  object JSONNestedNodeCircularPropsPassedThroughJSONNestedNode {
    
    inline def apply(
      circularCache: js.Array[Any],
      collectionLimit: Double,
      getItemString: (String, Any, ReactNode, String, js.Array[String | Double]) => ReactNode,
      hideRoot: Boolean,
      isCustomNode: Any => Boolean,
      level: Double,
      postprocessValue: Any => Any,
      shouldExpandNode: (js.Array[String | Double], Any, Double) => Boolean
    ): JSONNestedNodeCircularPropsPassedThroughJSONNestedNode = {
      val __obj = js.Dynamic.literal(circularCache = circularCache.asInstanceOf[js.Any], collectionLimit = collectionLimit.asInstanceOf[js.Any], getItemString = js.Any.fromFunction5(getItemString), hideRoot = hideRoot.asInstanceOf[js.Any], isCustomNode = js.Any.fromFunction1(isCustomNode), level = level.asInstanceOf[js.Any], postprocessValue = js.Any.fromFunction1(postprocessValue), shouldExpandNode = js.Any.fromFunction3(shouldExpandNode))
      __obj.asInstanceOf[JSONNestedNodeCircularPropsPassedThroughJSONNestedNode]
    }
    
    extension [Self <: JSONNestedNodeCircularPropsPassedThroughJSONNestedNode](x: Self) {
      
      inline def setCircularCache(value: js.Array[Any]): Self = StObject.set(x, "circularCache", value.asInstanceOf[js.Any])
      
      inline def setCircularCacheVarargs(value: Any*): Self = StObject.set(x, "circularCache", js.Array(value*))
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    }
  }
  
  trait JSONNestedNodeCircularPropsPassedThroughJSONNode
    extends StObject
       with JSONNestedNodeCircularPropsPassedThroughJSONTree {
    
    var circularCache: js.UndefOr[js.Array[Any]] = js.undefined
    
    var isCircular: js.UndefOr[Boolean] = js.undefined
    
    var level: js.UndefOr[Double] = js.undefined
  }
  object JSONNestedNodeCircularPropsPassedThroughJSONNode {
    
    inline def apply(
      collectionLimit: Double,
      getItemString: (String, Any, ReactNode, String, js.Array[String | Double]) => ReactNode,
      hideRoot: Boolean,
      isCustomNode: Any => Boolean,
      postprocessValue: Any => Any,
      shouldExpandNode: (js.Array[String | Double], Any, Double) => Boolean
    ): JSONNestedNodeCircularPropsPassedThroughJSONNode = {
      val __obj = js.Dynamic.literal(collectionLimit = collectionLimit.asInstanceOf[js.Any], getItemString = js.Any.fromFunction5(getItemString), hideRoot = hideRoot.asInstanceOf[js.Any], isCustomNode = js.Any.fromFunction1(isCustomNode), postprocessValue = js.Any.fromFunction1(postprocessValue), shouldExpandNode = js.Any.fromFunction3(shouldExpandNode))
      __obj.asInstanceOf[JSONNestedNodeCircularPropsPassedThroughJSONNode]
    }
    
    extension [Self <: JSONNestedNodeCircularPropsPassedThroughJSONNode](x: Self) {
      
      inline def setCircularCache(value: js.Array[Any]): Self = StObject.set(x, "circularCache", value.asInstanceOf[js.Any])
      
      inline def setCircularCacheUndefined: Self = StObject.set(x, "circularCache", js.undefined)
      
      inline def setCircularCacheVarargs(value: Any*): Self = StObject.set(x, "circularCache", js.Array(value*))
      
      inline def setIsCircular(value: Boolean): Self = StObject.set(x, "isCircular", value.asInstanceOf[js.Any])
      
      inline def setIsCircularUndefined: Self = StObject.set(x, "isCircular", js.undefined)
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    }
  }
  
  trait JSONNestedNodeCircularPropsPassedThroughJSONTree extends StObject {
    
    var collectionLimit: Double
    
    def getItemString(
      nodeType: String,
      data: Any,
      itemType: ReactNode,
      itemString: String,
      keyPath: js.Array[String | Double]
    ): ReactNode
    
    var hideRoot: Boolean
    
    def isCustomNode(value: Any): Boolean
    
    def postprocessValue(value: Any): Any
    
    def shouldExpandNode(keyPath: js.Array[String | Double], data: Any, level: Double): Boolean
    
    var sortObjectKeys: js.UndefOr[(js.Function2[/* a */ Any, /* b */ Any, Double]) | Boolean] = js.undefined
  }
  object JSONNestedNodeCircularPropsPassedThroughJSONTree {
    
    inline def apply(
      collectionLimit: Double,
      getItemString: (String, Any, ReactNode, String, js.Array[String | Double]) => ReactNode,
      hideRoot: Boolean,
      isCustomNode: Any => Boolean,
      postprocessValue: Any => Any,
      shouldExpandNode: (js.Array[String | Double], Any, Double) => Boolean
    ): JSONNestedNodeCircularPropsPassedThroughJSONTree = {
      val __obj = js.Dynamic.literal(collectionLimit = collectionLimit.asInstanceOf[js.Any], getItemString = js.Any.fromFunction5(getItemString), hideRoot = hideRoot.asInstanceOf[js.Any], isCustomNode = js.Any.fromFunction1(isCustomNode), postprocessValue = js.Any.fromFunction1(postprocessValue), shouldExpandNode = js.Any.fromFunction3(shouldExpandNode))
      __obj.asInstanceOf[JSONNestedNodeCircularPropsPassedThroughJSONTree]
    }
    
    extension [Self <: JSONNestedNodeCircularPropsPassedThroughJSONTree](x: Self) {
      
      inline def setCollectionLimit(value: Double): Self = StObject.set(x, "collectionLimit", value.asInstanceOf[js.Any])
      
      inline def setGetItemString(value: (String, Any, ReactNode, String, js.Array[String | Double]) => ReactNode): Self = StObject.set(x, "getItemString", js.Any.fromFunction5(value))
      
      inline def setHideRoot(value: Boolean): Self = StObject.set(x, "hideRoot", value.asInstanceOf[js.Any])
      
      inline def setIsCustomNode(value: Any => Boolean): Self = StObject.set(x, "isCustomNode", js.Any.fromFunction1(value))
      
      inline def setPostprocessValue(value: Any => Any): Self = StObject.set(x, "postprocessValue", js.Any.fromFunction1(value))
      
      inline def setShouldExpandNode(value: (js.Array[String | Double], Any, Double) => Boolean): Self = StObject.set(x, "shouldExpandNode", js.Any.fromFunction3(value))
      
      inline def setSortObjectKeys(value: (js.Function2[/* a */ Any, /* b */ Any, Double]) | Boolean): Self = StObject.set(x, "sortObjectKeys", value.asInstanceOf[js.Any])
      
      inline def setSortObjectKeysFunction2(value: (/* a */ Any, /* b */ Any) => Double): Self = StObject.set(x, "sortObjectKeys", js.Any.fromFunction2(value))
      
      inline def setSortObjectKeysUndefined: Self = StObject.set(x, "sortObjectKeys", js.undefined)
    }
  }
  
  trait JSONValueNodeCircularPropsPassedThroughJSONTree extends StObject {
    
    def valueRenderer(valueAsString: Any, value: Any, keyPath: (String | Double)*): ReactNode
  }
  object JSONValueNodeCircularPropsPassedThroughJSONTree {
    
    inline def apply(valueRenderer: (Any, Any, /* repeated */ String | Double) => ReactNode): JSONValueNodeCircularPropsPassedThroughJSONTree = {
      val __obj = js.Dynamic.literal(valueRenderer = js.Any.fromFunction3(valueRenderer))
      __obj.asInstanceOf[JSONValueNodeCircularPropsPassedThroughJSONTree]
    }
    
    extension [Self <: JSONValueNodeCircularPropsPassedThroughJSONTree](x: Self) {
      
      inline def setValueRenderer(value: (Any, Any, /* repeated */ String | Double) => ReactNode): Self = StObject.set(x, "valueRenderer", js.Any.fromFunction3(value))
    }
  }
  
  trait JSONValueNodeCircularPropsProvidedByJSONNode
    extends StObject
       with SharedCircularPropsProvidedByJSONTree
       with JSONValueNodeCircularPropsPassedThroughJSONTree
  object JSONValueNodeCircularPropsProvidedByJSONNode {
    
    inline def apply(
      keyPath: js.Array[String | Double],
      labelRenderer: (js.Array[String | Double], String, Boolean, Boolean) => ReactNode,
      styling: StylingFunction,
      valueRenderer: (Any, Any, /* repeated */ String | Double) => ReactNode
    ): JSONValueNodeCircularPropsProvidedByJSONNode = {
      val __obj = js.Dynamic.literal(keyPath = keyPath.asInstanceOf[js.Any], labelRenderer = js.Any.fromFunction4(labelRenderer), styling = styling.asInstanceOf[js.Any], valueRenderer = js.Any.fromFunction3(valueRenderer))
      __obj.asInstanceOf[JSONValueNodeCircularPropsProvidedByJSONNode]
    }
  }
  
  trait SharedCircularPropsPassedThroughJSONTree extends StObject {
    
    var keyPath: js.Array[String | Double]
    
    def labelRenderer(keyPath: js.Array[String | Double], nodeType: String, expanded: Boolean, expandable: Boolean): ReactNode
  }
  object SharedCircularPropsPassedThroughJSONTree {
    
    inline def apply(
      keyPath: js.Array[String | Double],
      labelRenderer: (js.Array[String | Double], String, Boolean, Boolean) => ReactNode
    ): SharedCircularPropsPassedThroughJSONTree = {
      val __obj = js.Dynamic.literal(keyPath = keyPath.asInstanceOf[js.Any], labelRenderer = js.Any.fromFunction4(labelRenderer))
      __obj.asInstanceOf[SharedCircularPropsPassedThroughJSONTree]
    }
    
    extension [Self <: SharedCircularPropsPassedThroughJSONTree](x: Self) {
      
      inline def setKeyPath(value: js.Array[String | Double]): Self = StObject.set(x, "keyPath", value.asInstanceOf[js.Any])
      
      inline def setKeyPathVarargs(value: (String | Double)*): Self = StObject.set(x, "keyPath", js.Array(value*))
      
      inline def setLabelRenderer(value: (js.Array[String | Double], String, Boolean, Boolean) => ReactNode): Self = StObject.set(x, "labelRenderer", js.Any.fromFunction4(value))
    }
  }
  
  trait SharedCircularPropsProvidedByJSONTree
    extends StObject
       with SharedCircularPropsPassedThroughJSONTree {
    
    var styling: StylingFunction
  }
  object SharedCircularPropsProvidedByJSONTree {
    
    inline def apply(
      keyPath: js.Array[String | Double],
      labelRenderer: (js.Array[String | Double], String, Boolean, Boolean) => ReactNode,
      styling: StylingFunction
    ): SharedCircularPropsProvidedByJSONTree = {
      val __obj = js.Dynamic.literal(keyPath = keyPath.asInstanceOf[js.Any], labelRenderer = js.Any.fromFunction4(labelRenderer), styling = styling.asInstanceOf[js.Any])
      __obj.asInstanceOf[SharedCircularPropsProvidedByJSONTree]
    }
    
    extension [Self <: SharedCircularPropsProvidedByJSONTree](x: Self) {
      
      inline def setStyling(value: StylingFunction): Self = StObject.set(x, "styling", value.asInstanceOf[js.Any])
    }
  }
}
