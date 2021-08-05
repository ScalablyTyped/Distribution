package typings.qlik

import org.scalablytyped.runtime.StringDictionary
import typings.qlik.mod.CustomProperty
import typings.qlik.mod.Variable
import typings.qlik.qlikStrings.data
import typings.qlik.qlikStrings.dimensions
import typings.qlik.qlikStrings.measures
import typings.qlik.qlikStrings.settings
import typings.qlik.qlikStrings.sorting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var items: js.UndefOr[StringDictionary[CustomProperty]] = js.undefined
    
    var uses: settings
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal(uses = "settings")
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setItems(value: StringDictionary[CustomProperty]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setUses(value: settings): Self = StObject.set(x, "uses", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var data: js.UndefOr[Uses] = js.undefined
    
    var dimensions: js.UndefOr[Items] = js.undefined
    
    var measures: js.UndefOr[Max] = js.undefined
    
    var settings: js.UndefOr[`0`] = js.undefined
    
    var sorting: js.UndefOr[ItemsUses] = js.undefined
  }
  object Data {
    
    inline def apply(): Data = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: Uses): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDimensions(value: Items): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
      
      inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
      
      inline def setMeasures(value: Max): Self = StObject.set(x, "measures", value.asInstanceOf[js.Any])
      
      inline def setMeasuresUndefined: Self = StObject.set(x, "measures", js.undefined)
      
      inline def setSettings(value: `0`): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
      
      inline def setSorting(value: ItemsUses): Self = StObject.set(x, "sorting", value.asInstanceOf[js.Any])
      
      inline def setSortingUndefined: Self = StObject.set(x, "sorting", js.undefined)
    }
  }
  
  trait GetContent extends StObject {
    
    def getContent(variable: String, callback: js.Function2[/* value */ Variable, /* app */ this.type, Unit]): js.Promise[js.Any]
    
    def setContent(variable: String, value: String): Unit
  }
  object GetContent {
    
    inline def apply(
      getContent: (String, js.Function2[/* value */ Variable, GetContent, Unit]) => js.Promise[js.Any],
      setContent: (String, String) => Unit
    ): GetContent = {
      val __obj = js.Dynamic.literal(getContent = js.Any.fromFunction2(getContent), setContent = js.Any.fromFunction2(setContent))
      __obj.asInstanceOf[GetContent]
    }
    
    extension [Self <: GetContent](x: Self) {
      
      inline def setGetContent(value: (String, js.Function2[/* value */ Variable, GetContent, Unit]) => js.Promise[js.Any]): Self = StObject.set(x, "getContent", js.Any.fromFunction2(value))
      
      inline def setSetContent(value: (String, String) => Unit): Self = StObject.set(x, "setContent", js.Any.fromFunction2(value))
    }
  }
  
  trait Items extends StObject {
    
    var items: js.UndefOr[StringDictionary[CustomProperty]] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var ref: js.UndefOr[String] = js.undefined
    
    var uses: dimensions
  }
  object Items {
    
    inline def apply(): Items = {
      val __obj = js.Dynamic.literal(uses = "dimensions")
      __obj.asInstanceOf[Items]
    }
    
    extension [Self <: Items](x: Self) {
      
      inline def setItems(value: StringDictionary[CustomProperty]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setUses(value: dimensions): Self = StObject.set(x, "uses", value.asInstanceOf[js.Any])
    }
  }
  
  trait ItemsUses extends StObject {
    
    var items: js.UndefOr[StringDictionary[CustomProperty]] = js.undefined
    
    var uses: sorting
  }
  object ItemsUses {
    
    inline def apply(): ItemsUses = {
      val __obj = js.Dynamic.literal(uses = "sorting")
      __obj.asInstanceOf[ItemsUses]
    }
    
    extension [Self <: ItemsUses](x: Self) {
      
      inline def setItems(value: StringDictionary[CustomProperty]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setUses(value: sorting): Self = StObject.set(x, "uses", value.asInstanceOf[js.Any])
    }
  }
  
  trait Max extends StObject {
    
    var items: js.UndefOr[StringDictionary[CustomProperty]] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var ref: js.UndefOr[String] = js.undefined
    
    var uses: measures
  }
  object Max {
    
    inline def apply(): Max = {
      val __obj = js.Dynamic.literal(uses = "measures")
      __obj.asInstanceOf[Max]
    }
    
    extension [Self <: Max](x: Self) {
      
      inline def setItems(value: StringDictionary[CustomProperty]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setUses(value: measures): Self = StObject.set(x, "uses", value.asInstanceOf[js.Any])
    }
  }
  
  trait NoInteraction extends StObject {
    
    var noInteraction: js.UndefOr[Boolean] = js.undefined
    
    var noSelections: js.UndefOr[Boolean] = js.undefined
  }
  object NoInteraction {
    
    inline def apply(): NoInteraction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NoInteraction]
    }
    
    extension [Self <: NoInteraction](x: Self) {
      
      inline def setNoInteraction(value: Boolean): Self = StObject.set(x, "noInteraction", value.asInstanceOf[js.Any])
      
      inline def setNoInteractionUndefined: Self = StObject.set(x, "noInteraction", js.undefined)
      
      inline def setNoSelections(value: Boolean): Self = StObject.set(x, "noSelections", value.asInstanceOf[js.Any])
      
      inline def setNoSelectionsUndefined: Self = StObject.set(x, "noSelections", js.undefined)
    }
  }
  
  trait QIsNum extends StObject {
    
    var qIsNum: Boolean
    
    var qString: String
  }
  object QIsNum {
    
    inline def apply(qIsNum: Boolean, qString: String): QIsNum = {
      val __obj = js.Dynamic.literal(qIsNum = qIsNum.asInstanceOf[js.Any], qString = qString.asInstanceOf[js.Any])
      __obj.asInstanceOf[QIsNum]
    }
    
    extension [Self <: QIsNum](x: Self) {
      
      inline def setQIsNum(value: Boolean): Self = StObject.set(x, "qIsNum", value.asInstanceOf[js.Any])
      
      inline def setQString(value: String): Self = StObject.set(x, "qString", value.asInstanceOf[js.Any])
    }
  }
  
  trait Uses extends StObject {
    
    var uses: data
  }
  object Uses {
    
    inline def apply(): Uses = {
      val __obj = js.Dynamic.literal(uses = "data")
      __obj.asInstanceOf[Uses]
    }
    
    extension [Self <: Uses](x: Self) {
      
      inline def setUses(value: data): Self = StObject.set(x, "uses", value.asInstanceOf[js.Any])
    }
  }
}
