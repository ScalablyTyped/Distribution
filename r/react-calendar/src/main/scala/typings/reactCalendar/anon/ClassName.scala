package typings.reactCalendar.anon

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassName extends StObject {
  
  var activeStartDate: Validator[js.Date]
  
  var className: Requireable[String]
  
  var count: Requireable[Double]
  
  var dateTransform: Validator[js.Function1[/* repeated */ Any, Any]]
  
  var dateType: Requireable[String]
  
  var end: Validator[Double]
  
  var hover: Requireable[js.Date]
  
  var locale: Requireable[String]
  
  var offset: Requireable[Double]
  
  var onClick: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var onMouseOver: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var start: Validator[Double]
  
  var step: Requireable[Double]
  
  var tile: Validator[js.Function1[/* repeated */ Any, Any]]
  
  var tileClassName: Requireable[
    NonNullable[
      js.UndefOr[
        (js.Function1[/* repeated */ Any, Any]) | (NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]) | Null
      ]
    ]
  ]
  
  var tileContent: Requireable[NonNullable[ReactNodeLike | (js.Function1[/* repeated */ Any, Any])]]
  
  var value: Requireable[NonNullable[js.UndefOr[js.Date | (js.Array[js.UndefOr[js.Date | Null]]) | Null]]]
  
  var valueType: Requireable[String]
}
object ClassName {
  
  inline def apply(
    activeStartDate: Validator[js.Date],
    className: Requireable[String],
    count: Requireable[Double],
    dateTransform: Validator[js.Function1[/* repeated */ Any, Any]],
    dateType: Requireable[String],
    end: Validator[Double],
    hover: Requireable[js.Date],
    locale: Requireable[String],
    offset: Requireable[Double],
    onClick: Requireable[js.Function1[/* repeated */ Any, Any]],
    onMouseOver: Requireable[js.Function1[/* repeated */ Any, Any]],
    start: Validator[Double],
    step: Requireable[Double],
    tile: Validator[js.Function1[/* repeated */ Any, Any]],
    tileClassName: Requireable[
      NonNullable[
        js.UndefOr[
          (js.Function1[/* repeated */ Any, Any]) | (NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]) | Null
        ]
      ]
    ],
    tileContent: Requireable[NonNullable[ReactNodeLike | (js.Function1[/* repeated */ Any, Any])]],
    value: Requireable[NonNullable[js.UndefOr[js.Date | (js.Array[js.UndefOr[js.Date | Null]]) | Null]]],
    valueType: Requireable[String]
  ): ClassName = {
    val __obj = js.Dynamic.literal(activeStartDate = activeStartDate.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], dateTransform = dateTransform.asInstanceOf[js.Any], dateType = dateType.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], hover = hover.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], onMouseOver = onMouseOver.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], tile = tile.asInstanceOf[js.Any], tileClassName = tileClassName.asInstanceOf[js.Any], tileContent = tileContent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClassName] (val x: Self) extends AnyVal {
    
    inline def setActiveStartDate(value: Validator[js.Date]): Self = StObject.set(x, "activeStartDate", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: Requireable[String]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Requireable[Double]): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setDateTransform(value: Validator[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "dateTransform", value.asInstanceOf[js.Any])
    
    inline def setDateType(value: Requireable[String]): Self = StObject.set(x, "dateType", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: Validator[Double]): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setHover(value: Requireable[js.Date]): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Requireable[String]): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Requireable[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnMouseOver(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onMouseOver", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Validator[Double]): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStep(value: Requireable[Double]): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setTile(value: Validator[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
    
    inline def setTileClassName(
      value: Requireable[
          NonNullable[
            js.UndefOr[
              (js.Function1[/* repeated */ Any, Any]) | (NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]) | Null
            ]
          ]
        ]
    ): Self = StObject.set(x, "tileClassName", value.asInstanceOf[js.Any])
    
    inline def setTileContent(value: Requireable[NonNullable[ReactNodeLike | (js.Function1[/* repeated */ Any, Any])]]): Self = StObject.set(x, "tileContent", value.asInstanceOf[js.Any])
    
    inline def setValue(
      value: Requireable[NonNullable[js.UndefOr[js.Date | (js.Array[js.UndefOr[js.Date | Null]]) | Null]]]
    ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueType(value: Requireable[String]): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
  }
}
