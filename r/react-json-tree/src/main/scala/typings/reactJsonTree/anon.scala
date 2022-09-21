package typings.reactJsonTree

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CircularCache extends StObject {
    
    var circularCache: js.Array[scala.Nothing]
    
    var data: js.Array[scala.Nothing]
    
    var expandable: Boolean
    
    var level: Double
  }
  object CircularCache {
    
    inline def apply(
      circularCache: js.Array[scala.Nothing],
      data: js.Array[scala.Nothing],
      expandable: Boolean,
      level: Double
    ): CircularCache = {
      val __obj = js.Dynamic.literal(circularCache = circularCache.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], expandable = expandable.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
      __obj.asInstanceOf[CircularCache]
    }
    
    extension [Self <: CircularCache](x: Self) {
      
      inline def setCircularCache(value: js.Array[scala.Nothing]): Self = StObject.set(x, "circularCache", value.asInstanceOf[js.Any])
      
      inline def setCircularCacheVarargs(value: scala.Nothing*): Self = StObject.set(x, "circularCache", js.Array(value*))
      
      inline def setData(value: js.Array[scala.Nothing]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: scala.Nothing*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    }
  }
  
  trait CollectionLimit extends StObject {
    
    var collectionLimit: Requireable[Double]
    
    var createItemString: Validator[js.Function1[/* repeated */ Any, Any]]
    
    var data: Requireable[Any]
    
    var expandable: Requireable[Boolean]
    
    var getItemString: Validator[js.Function1[/* repeated */ Any, Any]]
    
    var hideRoot: Validator[Boolean]
    
    var isCircular: Requireable[Boolean]
    
    var keyPath: Validator[js.Array[js.UndefOr[String | Double | Null]]]
    
    var labelRenderer: Validator[js.Function1[/* repeated */ Any, Any]]
    
    var level: Validator[Double]
    
    var nodeType: Validator[String]
    
    var nodeTypeIndicator: Requireable[Any]
    
    var shouldExpandNode: Requireable[js.Function1[/* repeated */ Any, Any]]
    
    var sortObjectKeys: Requireable[Boolean | (js.Function1[/* repeated */ Any, Any])]
    
    var styling: Validator[js.Function1[/* repeated */ Any, Any]]
  }
  object CollectionLimit {
    
    inline def apply(
      collectionLimit: Requireable[Double],
      createItemString: Validator[js.Function1[/* repeated */ Any, Any]],
      data: Requireable[Any],
      expandable: Requireable[Boolean],
      getItemString: Validator[js.Function1[/* repeated */ Any, Any]],
      hideRoot: Validator[Boolean],
      isCircular: Requireable[Boolean],
      keyPath: Validator[js.Array[js.UndefOr[String | Double | Null]]],
      labelRenderer: Validator[js.Function1[/* repeated */ Any, Any]],
      level: Validator[Double],
      nodeType: Validator[String],
      nodeTypeIndicator: Requireable[Any],
      shouldExpandNode: Requireable[js.Function1[/* repeated */ Any, Any]],
      sortObjectKeys: Requireable[Boolean | (js.Function1[/* repeated */ Any, Any])],
      styling: Validator[js.Function1[/* repeated */ Any, Any]]
    ): CollectionLimit = {
      val __obj = js.Dynamic.literal(collectionLimit = collectionLimit.asInstanceOf[js.Any], createItemString = createItemString.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], expandable = expandable.asInstanceOf[js.Any], getItemString = getItemString.asInstanceOf[js.Any], hideRoot = hideRoot.asInstanceOf[js.Any], isCircular = isCircular.asInstanceOf[js.Any], keyPath = keyPath.asInstanceOf[js.Any], labelRenderer = labelRenderer.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], nodeTypeIndicator = nodeTypeIndicator.asInstanceOf[js.Any], shouldExpandNode = shouldExpandNode.asInstanceOf[js.Any], sortObjectKeys = sortObjectKeys.asInstanceOf[js.Any], styling = styling.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollectionLimit]
    }
    
    extension [Self <: CollectionLimit](x: Self) {
      
      inline def setCollectionLimit(value: Requireable[Double]): Self = StObject.set(x, "collectionLimit", value.asInstanceOf[js.Any])
      
      inline def setCreateItemString(value: Validator[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "createItemString", value.asInstanceOf[js.Any])
      
      inline def setData(value: Requireable[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setExpandable(value: Requireable[Boolean]): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
      
      inline def setGetItemString(value: Validator[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "getItemString", value.asInstanceOf[js.Any])
      
      inline def setHideRoot(value: Validator[Boolean]): Self = StObject.set(x, "hideRoot", value.asInstanceOf[js.Any])
      
      inline def setIsCircular(value: Requireable[Boolean]): Self = StObject.set(x, "isCircular", value.asInstanceOf[js.Any])
      
      inline def setKeyPath(value: Validator[js.Array[js.UndefOr[String | Double | Null]]]): Self = StObject.set(x, "keyPath", value.asInstanceOf[js.Any])
      
      inline def setLabelRenderer(value: Validator[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "labelRenderer", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: Validator[Double]): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setNodeType(value: Validator[String]): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
      
      inline def setNodeTypeIndicator(value: Requireable[Any]): Self = StObject.set(x, "nodeTypeIndicator", value.asInstanceOf[js.Any])
      
      inline def setShouldExpandNode(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "shouldExpandNode", value.asInstanceOf[js.Any])
      
      inline def setSortObjectKeys(value: Requireable[Boolean | (js.Function1[/* repeated */ Any, Any])]): Self = StObject.set(x, "sortObjectKeys", value.asInstanceOf[js.Any])
      
      inline def setStyling(value: Validator[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "styling", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var data: Requireable[Any]
    
    var hideRoot: Requireable[Boolean]
    
    var invertTheme: Requireable[Boolean]
    
    var keyPath: Requireable[js.Array[js.UndefOr[String | Double | Null]]]
    
    var postprocessValue: Requireable[js.Function1[/* repeated */ Any, Any]]
    
    var sortObjectKeys: Requireable[Boolean | (js.Function1[/* repeated */ Any, Any])]
    
    var theme: Requireable[String | js.Object]
  }
  object Data {
    
    inline def apply(
      data: Requireable[Any],
      hideRoot: Requireable[Boolean],
      invertTheme: Requireable[Boolean],
      keyPath: Requireable[js.Array[js.UndefOr[String | Double | Null]]],
      postprocessValue: Requireable[js.Function1[/* repeated */ Any, Any]],
      sortObjectKeys: Requireable[Boolean | (js.Function1[/* repeated */ Any, Any])],
      theme: Requireable[String | js.Object]
    ): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], hideRoot = hideRoot.asInstanceOf[js.Any], invertTheme = invertTheme.asInstanceOf[js.Any], keyPath = keyPath.asInstanceOf[js.Any], postprocessValue = postprocessValue.asInstanceOf[js.Any], sortObjectKeys = sortObjectKeys.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: Requireable[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHideRoot(value: Requireable[Boolean]): Self = StObject.set(x, "hideRoot", value.asInstanceOf[js.Any])
      
      inline def setInvertTheme(value: Requireable[Boolean]): Self = StObject.set(x, "invertTheme", value.asInstanceOf[js.Any])
      
      inline def setKeyPath(value: Requireable[js.Array[js.UndefOr[String | Double | Null]]]): Self = StObject.set(x, "keyPath", value.asInstanceOf[js.Any])
      
      inline def setPostprocessValue(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "postprocessValue", value.asInstanceOf[js.Any])
      
      inline def setSortObjectKeys(value: Requireable[Boolean | (js.Function1[/* repeated */ Any, Any])]): Self = StObject.set(x, "sortObjectKeys", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: Requireable[String | js.Object]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait From extends StObject {
    
    var from: Validator[Double]
    
    var nodeType: Validator[String]
    
    var renderChildNodes: Validator[js.Function1[/* repeated */ Any, Any]]
    
    var styling: Validator[js.Function1[/* repeated */ Any, Any]]
    
    var to: Validator[Double]
  }
  object From {
    
    inline def apply(
      from: Validator[Double],
      nodeType: Validator[String],
      renderChildNodes: Validator[js.Function1[/* repeated */ Any, Any]],
      styling: Validator[js.Function1[/* repeated */ Any, Any]],
      to: Validator[Double]
    ): From = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], renderChildNodes = renderChildNodes.asInstanceOf[js.Any], styling = styling.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    extension [Self <: From](x: Self) {
      
      inline def setFrom(value: Validator[Double]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setNodeType(value: Validator[String]): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
      
      inline def setRenderChildNodes(value: Validator[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "renderChildNodes", value.asInstanceOf[js.Any])
      
      inline def setStyling(value: Validator[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "styling", value.asInstanceOf[js.Any])
      
      inline def setTo(value: Validator[Double]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetItemString extends StObject {
    
    var collectionLimit: Double
    
    def getItemString(`type`: String, data: Any, itemType: ReactNode, itemString: String): Element
    
    var hideRoot: Boolean
    
    var invertTheme: Boolean
    
    def isCustomNode(): Boolean
    
    var keyPath: js.Array[String]
    
    def labelRenderer(hasLabel: js.Array[String | Double]): Element
    
    def postprocessValue(value: Any): Any
    
    def shouldExpandNode(keyPath: js.Array[String | Double], data: Any, level: Double): Boolean
    
    def valueRenderer(value: Any): Any
  }
  object GetItemString {
    
    inline def apply(
      collectionLimit: Double,
      getItemString: (String, Any, ReactNode, String) => Element,
      hideRoot: Boolean,
      invertTheme: Boolean,
      isCustomNode: () => Boolean,
      keyPath: js.Array[String],
      labelRenderer: js.Array[String | Double] => Element,
      postprocessValue: Any => Any,
      shouldExpandNode: (js.Array[String | Double], Any, Double) => Boolean,
      valueRenderer: Any => Any
    ): GetItemString = {
      val __obj = js.Dynamic.literal(collectionLimit = collectionLimit.asInstanceOf[js.Any], getItemString = js.Any.fromFunction4(getItemString), hideRoot = hideRoot.asInstanceOf[js.Any], invertTheme = invertTheme.asInstanceOf[js.Any], isCustomNode = js.Any.fromFunction0(isCustomNode), keyPath = keyPath.asInstanceOf[js.Any], labelRenderer = js.Any.fromFunction1(labelRenderer), postprocessValue = js.Any.fromFunction1(postprocessValue), shouldExpandNode = js.Any.fromFunction3(shouldExpandNode), valueRenderer = js.Any.fromFunction1(valueRenderer))
      __obj.asInstanceOf[GetItemString]
    }
    
    extension [Self <: GetItemString](x: Self) {
      
      inline def setCollectionLimit(value: Double): Self = StObject.set(x, "collectionLimit", value.asInstanceOf[js.Any])
      
      inline def setGetItemString(value: (String, Any, ReactNode, String) => Element): Self = StObject.set(x, "getItemString", js.Any.fromFunction4(value))
      
      inline def setHideRoot(value: Boolean): Self = StObject.set(x, "hideRoot", value.asInstanceOf[js.Any])
      
      inline def setInvertTheme(value: Boolean): Self = StObject.set(x, "invertTheme", value.asInstanceOf[js.Any])
      
      inline def setIsCustomNode(value: () => Boolean): Self = StObject.set(x, "isCustomNode", js.Any.fromFunction0(value))
      
      inline def setKeyPath(value: js.Array[String]): Self = StObject.set(x, "keyPath", value.asInstanceOf[js.Any])
      
      inline def setKeyPathVarargs(value: String*): Self = StObject.set(x, "keyPath", js.Array(value*))
      
      inline def setLabelRenderer(value: js.Array[String | Double] => Element): Self = StObject.set(x, "labelRenderer", js.Any.fromFunction1(value))
      
      inline def setPostprocessValue(value: Any => Any): Self = StObject.set(x, "postprocessValue", js.Any.fromFunction1(value))
      
      inline def setShouldExpandNode(value: (js.Array[String | Double], Any, Double) => Boolean): Self = StObject.set(x, "shouldExpandNode", js.Any.fromFunction3(value))
      
      inline def setValueRenderer(value: Any => Any): Self = StObject.set(x, "valueRenderer", js.Any.fromFunction1(value))
    }
  }
  
  trait Key extends StObject {
    
    var key: String | Double
    
    var value: Any
  }
  object Key {
    
    inline def apply(key: String | Double, value: Any): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait To extends StObject {
    
    var from: Double
    
    var to: Double
  }
  object To {
    
    inline def apply(from: Double, to: Double): To = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[To]
    }
    
    extension [Self <: To](x: Self) {
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
}
