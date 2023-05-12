package typings.reactCalendar.anon

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.reactCalendar.reactCalendarStrings.Arabic
import typings.reactCalendar.reactCalendarStrings.Hebrew
import typings.reactCalendar.reactCalendarStrings.US
import typings.reactCalendar.reactCalendarStrings.`ISO 8601`
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Locale extends StObject {
  
  var activeStartDate: Validator[js.Date]
  
  var calendarType: Requireable[Arabic | Hebrew | (`ISO 8601`) | US]
  
  var hover: Requireable[js.Date]
  
  var locale: Requireable[String]
  
  var onClick: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var onMouseOver: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var showFixedNumberOfWeeks: Requireable[Boolean]
  
  var showNeighboringMonth: Requireable[Boolean]
  
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
object Locale {
  
  inline def apply(
    activeStartDate: Validator[js.Date],
    calendarType: Requireable[Arabic | Hebrew | (`ISO 8601`) | US],
    hover: Requireable[js.Date],
    locale: Requireable[String],
    onClick: Requireable[js.Function1[/* repeated */ Any, Any]],
    onMouseOver: Requireable[js.Function1[/* repeated */ Any, Any]],
    showFixedNumberOfWeeks: Requireable[Boolean],
    showNeighboringMonth: Requireable[Boolean],
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
  ): Locale = {
    val __obj = js.Dynamic.literal(activeStartDate = activeStartDate.asInstanceOf[js.Any], calendarType = calendarType.asInstanceOf[js.Any], hover = hover.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], onMouseOver = onMouseOver.asInstanceOf[js.Any], showFixedNumberOfWeeks = showFixedNumberOfWeeks.asInstanceOf[js.Any], showNeighboringMonth = showNeighboringMonth.asInstanceOf[js.Any], tileClassName = tileClassName.asInstanceOf[js.Any], tileContent = tileContent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
    
    inline def setActiveStartDate(value: Validator[js.Date]): Self = StObject.set(x, "activeStartDate", value.asInstanceOf[js.Any])
    
    inline def setCalendarType(value: Requireable[Arabic | Hebrew | (`ISO 8601`) | US]): Self = StObject.set(x, "calendarType", value.asInstanceOf[js.Any])
    
    inline def setHover(value: Requireable[js.Date]): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Requireable[String]): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnMouseOver(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onMouseOver", value.asInstanceOf[js.Any])
    
    inline def setShowFixedNumberOfWeeks(value: Requireable[Boolean]): Self = StObject.set(x, "showFixedNumberOfWeeks", value.asInstanceOf[js.Any])
    
    inline def setShowNeighboringMonth(value: Requireable[Boolean]): Self = StObject.set(x, "showNeighboringMonth", value.asInstanceOf[js.Any])
    
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
