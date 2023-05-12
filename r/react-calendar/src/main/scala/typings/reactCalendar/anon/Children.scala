package typings.reactCalendar.anon

import org.scalablytyped.runtime.StringDictionary
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children extends StObject {
  
  var activeStartDate: Validator[js.Date]
  
  var children: Validator[NonNullable[ReactNodeLike]]
  
  var classes: Validator[js.Array[js.UndefOr[String | Null]]]
  
  var date: Validator[js.Date]
  
  var formatAbbr: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var locale: Requireable[String]
  
  var maxDateTransform: Validator[js.Function1[/* repeated */ Any, Any]]
  
  var minDateTransform: Validator[js.Function1[/* repeated */ Any, Any]]
  
  var onClick: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var onMouseOver: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var style: Requireable[
    StringDictionary[js.UndefOr[(NonNullable[js.UndefOr[String | Double | Null]]) | Null]]
  ]
  
  var tileClassName: Requireable[
    NonNullable[
      js.UndefOr[
        (js.Function1[/* repeated */ Any, Any]) | (NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]) | Null
      ]
    ]
  ]
  
  var tileContent: Requireable[NonNullable[ReactNodeLike | (js.Function1[/* repeated */ Any, Any])]]
  
  var tileDisabled: Requireable[js.Function1[/* repeated */ Any, Any]]
}
object Children {
  
  inline def apply(
    activeStartDate: Validator[js.Date],
    children: Validator[NonNullable[ReactNodeLike]],
    classes: Validator[js.Array[js.UndefOr[String | Null]]],
    date: Validator[js.Date],
    formatAbbr: Requireable[js.Function1[/* repeated */ Any, Any]],
    locale: Requireable[String],
    maxDateTransform: Validator[js.Function1[/* repeated */ Any, Any]],
    minDateTransform: Validator[js.Function1[/* repeated */ Any, Any]],
    onClick: Requireable[js.Function1[/* repeated */ Any, Any]],
    onMouseOver: Requireable[js.Function1[/* repeated */ Any, Any]],
    style: Requireable[
      StringDictionary[js.UndefOr[(NonNullable[js.UndefOr[String | Double | Null]]) | Null]]
    ],
    tileClassName: Requireable[
      NonNullable[
        js.UndefOr[
          (js.Function1[/* repeated */ Any, Any]) | (NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]) | Null
        ]
      ]
    ],
    tileContent: Requireable[NonNullable[ReactNodeLike | (js.Function1[/* repeated */ Any, Any])]],
    tileDisabled: Requireable[js.Function1[/* repeated */ Any, Any]]
  ): Children = {
    val __obj = js.Dynamic.literal(activeStartDate = activeStartDate.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], formatAbbr = formatAbbr.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], maxDateTransform = maxDateTransform.asInstanceOf[js.Any], minDateTransform = minDateTransform.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], onMouseOver = onMouseOver.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tileClassName = tileClassName.asInstanceOf[js.Any], tileContent = tileContent.asInstanceOf[js.Any], tileDisabled = tileDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
    
    inline def setActiveStartDate(value: Validator[js.Date]): Self = StObject.set(x, "activeStartDate", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: Validator[NonNullable[ReactNodeLike]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setClasses(value: Validator[js.Array[js.UndefOr[String | Null]]]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setDate(value: Validator[js.Date]): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setFormatAbbr(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "formatAbbr", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Requireable[String]): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setMaxDateTransform(value: Validator[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "maxDateTransform", value.asInstanceOf[js.Any])
    
    inline def setMinDateTransform(value: Validator[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "minDateTransform", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnMouseOver(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onMouseOver", value.asInstanceOf[js.Any])
    
    inline def setStyle(
      value: Requireable[
          StringDictionary[js.UndefOr[(NonNullable[js.UndefOr[String | Double | Null]]) | Null]]
        ]
    ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
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
    
    inline def setTileDisabled(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "tileDisabled", value.asInstanceOf[js.Any])
  }
}
