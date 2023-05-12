package typings.reactCalendar

import org.scalablytyped.runtime.StringDictionary
import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.reactCalendar.anon.Current
import typings.reactCalendar.anon.Views
import typings.reactCalendar.reactCalendarStrings.Arabic
import typings.reactCalendar.reactCalendarStrings.Hebrew
import typings.reactCalendar.reactCalendarStrings.US
import typings.reactCalendar.reactCalendarStrings.`ISO 8601`
import typings.std.NonNullable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSharedPropTypesMod {
  
  @JSImport("react-calendar/dist/cjs/shared/propTypes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-calendar/dist/cjs/shared/propTypes", "isCalendarType")
  @js.native
  val isCalendarType: Requireable[Arabic | Hebrew | (`ISO 8601`) | US] = js.native
  
  @JSImport("react-calendar/dist/cjs/shared/propTypes", "isClassName")
  @js.native
  val isClassName: Requireable[NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]] = js.native
  
  inline def isMaxDate(props: Record[String, Any], propName: String, componentName: String): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("isMaxDate")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
  
  inline def isMinDate(props: Record[String, Any], propName: String, componentName: String): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("isMinDate")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
  
  @JSImport("react-calendar/dist/cjs/shared/propTypes", "isRef")
  @js.native
  val isRef: Requireable[
    NonNullable[js.UndefOr[(js.Function1[/* repeated */ Any, Any]) | InferProps[Current] | Null]]
  ] = js.native
  
  @JSImport("react-calendar/dist/cjs/shared/propTypes", "isValue")
  @js.native
  val isValue: Requireable[NonNullable[js.UndefOr[js.Date | (js.Array[js.UndefOr[js.Date | Null]]) | Null]]] = js.native
  
  object isView {
    
    inline def apply(props: (Record[String, Any]) & Views, propName: String, componentName: String): js.Error | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
    
    @JSImport("react-calendar/dist/cjs/shared/propTypes", "isView")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-calendar/dist/cjs/shared/propTypes", "isView.isRequired")
    @js.native
    def isRequired: js.Function3[
        /* props */ Record[String, Any], 
        /* propName */ String, 
        /* componentName */ String, 
        js.Error | Null
      ] = js.native
    inline def isRequired_=(
      x: js.Function3[
          /* props */ Record[String, Any], 
          /* propName */ String, 
          /* componentName */ String, 
          js.Error | Null
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isRequired")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-calendar/dist/cjs/shared/propTypes", "isViews")
  @js.native
  val isViews: Requireable[js.Array[js.UndefOr[String | Null]]] = js.native
  
  object tileGroupProps {
    
    @JSImport("react-calendar/dist/cjs/shared/propTypes", "tileGroupProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-calendar/dist/cjs/shared/propTypes", "tileGroupProps.activeStartDate")
    @js.native
    def activeStartDate: Validator[js.Date] = js.native
    inline def activeStartDate_=(x: Validator[js.Date]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeStartDate")(x.asInstanceOf[js.Any])
    
    @JSImport("react-calendar/dist/cjs/shared/propTypes", "tileGroupProps.hover")
    @js.native
    def hover: Requireable[js.Date] = js.native
    inline def hover_=(x: Requireable[js.Date]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hover")(x.asInstanceOf[js.Any])
    
    @JSImport("react-calendar/dist/cjs/shared/propTypes", "tileGroupProps.locale")
    @js.native
    def locale: Requireable[String] = js.native
    inline def locale_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locale")(x.asInstanceOf[js.Any])
    
    @JSImport("react-calendar/dist/cjs/shared/propTypes", "tileGroupProps.maxDate")
    @js.native
    def maxDate: js.Function3[
        /* props */ Record[String, Any], 
        /* propName */ String, 
        /* componentName */ String, 
        js.Error | Null
      ] = js.native
    inline def maxDate_=(
      x: js.Function3[
          /* props */ Record[String, Any], 
          /* propName */ String, 
          /* componentName */ String, 
          js.Error | Null
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(x.asInstanceOf[js.Any])
    
    @JSImport("react-calendar/dist/cjs/shared/propTypes", "tileGroupProps.minDate")
    @js.native
    def minDate: js.Function3[
        /* props */ Record[String, Any], 
        /* propName */ String, 
        /* componentName */ String, 
        js.Error | Null
      ] = js.native
    inline def minDate_=(
      x: js.Function3[
          /* props */ Record[String, Any], 
          /* propName */ String, 
          /* componentName */ String, 
          js.Error | Null
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minDate")(x.asInstanceOf[js.Any])
    
    @JSImport("react-calendar/dist/cjs/shared/propTypes", "tileGroupProps.onClick")
    @js.native
    def onClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    inline def onClick_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClick")(x.asInstanceOf[js.Any])
    
    @JSImport("react-calendar/dist/cjs/shared/propTypes", "tileGroupProps.onMouseOver")
    @js.native
    def onMouseOver: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    inline def onMouseOver_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseOver")(x.asInstanceOf[js.Any])
    
    @JSImport("react-calendar/dist/cjs/shared/propTypes", "tileGroupProps.tileClassName")
    @js.native
    def tileClassName: Requireable[
        NonNullable[
          js.UndefOr[
            (js.Function1[/* repeated */ Any, Any]) | (NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]) | Null
          ]
        ]
      ] = js.native
    inline def tileClassName_=(
      x: Requireable[
          NonNullable[
            js.UndefOr[
              (js.Function1[/* repeated */ Any, Any]) | (NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]) | Null
            ]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tileClassName")(x.asInstanceOf[js.Any])
    
    @JSImport("react-calendar/dist/cjs/shared/propTypes", "tileGroupProps.tileContent")
    @js.native
    def tileContent: Requireable[NonNullable[ReactNodeLike | (js.Function1[/* repeated */ Any, Any])]] = js.native
    inline def tileContent_=(x: Requireable[NonNullable[ReactNodeLike | (js.Function1[/* repeated */ Any, Any])]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tileContent")(x.asInstanceOf[js.Any])
    
    @JSImport("react-calendar/dist/cjs/shared/propTypes", "tileGroupProps.value")
    @js.native
    def value: Requireable[NonNullable[js.UndefOr[js.Date | (js.Array[js.UndefOr[js.Date | Null]]) | Null]]] = js.native
    
    @JSImport("react-calendar/dist/cjs/shared/propTypes", "tileGroupProps.valueType")
    @js.native
    def valueType: Requireable[String] = js.native
    inline def valueType_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("valueType")(x.asInstanceOf[js.Any])
    
    inline def value_=(x: Requireable[NonNullable[js.UndefOr[js.Date | (js.Array[js.UndefOr[js.Date | Null]]) | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
  }
  
  object tileProps {
    
    @JSImport("react-calendar/dist/cjs/shared/propTypes", "tileProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-calendar/dist/cjs/shared/propTypes", "tileProps.activeStartDate")
    @js.native
    def activeStartDate: Validator[js.Date] = js.native
    inline def activeStartDate_=(x: Validator[js.Date]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeStartDate")(x.asInstanceOf[js.Any])
    
    @JSImport("react-calendar/dist/cjs/shared/propTypes", "tileProps.classes")
    @js.native
    def classes: Validator[js.Array[js.UndefOr[String | Null]]] = js.native
    inline def classes_=(x: Validator[js.Array[js.UndefOr[String | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("classes")(x.asInstanceOf[js.Any])
    
    @JSImport("react-calendar/dist/cjs/shared/propTypes", "tileProps.date")
    @js.native
    def date: Validator[js.Date] = js.native
    inline def date_=(x: Validator[js.Date]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("date")(x.asInstanceOf[js.Any])
    
    @JSImport("react-calendar/dist/cjs/shared/propTypes", "tileProps.locale")
    @js.native
    def locale: Requireable[String] = js.native
    inline def locale_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locale")(x.asInstanceOf[js.Any])
    
    @JSImport("react-calendar/dist/cjs/shared/propTypes", "tileProps.maxDate")
    @js.native
    def maxDate: js.Function3[
        /* props */ Record[String, Any], 
        /* propName */ String, 
        /* componentName */ String, 
        js.Error | Null
      ] = js.native
    inline def maxDate_=(
      x: js.Function3[
          /* props */ Record[String, Any], 
          /* propName */ String, 
          /* componentName */ String, 
          js.Error | Null
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(x.asInstanceOf[js.Any])
    
    @JSImport("react-calendar/dist/cjs/shared/propTypes", "tileProps.minDate")
    @js.native
    def minDate: js.Function3[
        /* props */ Record[String, Any], 
        /* propName */ String, 
        /* componentName */ String, 
        js.Error | Null
      ] = js.native
    inline def minDate_=(
      x: js.Function3[
          /* props */ Record[String, Any], 
          /* propName */ String, 
          /* componentName */ String, 
          js.Error | Null
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minDate")(x.asInstanceOf[js.Any])
    
    @JSImport("react-calendar/dist/cjs/shared/propTypes", "tileProps.onClick")
    @js.native
    def onClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    inline def onClick_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClick")(x.asInstanceOf[js.Any])
    
    @JSImport("react-calendar/dist/cjs/shared/propTypes", "tileProps.onMouseOver")
    @js.native
    def onMouseOver: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    inline def onMouseOver_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseOver")(x.asInstanceOf[js.Any])
    
    @JSImport("react-calendar/dist/cjs/shared/propTypes", "tileProps.style")
    @js.native
    def style: Requireable[
        StringDictionary[js.UndefOr[(NonNullable[js.UndefOr[String | Double | Null]]) | Null]]
      ] = js.native
    inline def style_=(
      x: Requireable[
          StringDictionary[js.UndefOr[(NonNullable[js.UndefOr[String | Double | Null]]) | Null]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("style")(x.asInstanceOf[js.Any])
    
    @JSImport("react-calendar/dist/cjs/shared/propTypes", "tileProps.tileClassName")
    @js.native
    def tileClassName: Requireable[
        NonNullable[
          js.UndefOr[
            (js.Function1[/* repeated */ Any, Any]) | (NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]) | Null
          ]
        ]
      ] = js.native
    inline def tileClassName_=(
      x: Requireable[
          NonNullable[
            js.UndefOr[
              (js.Function1[/* repeated */ Any, Any]) | (NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]) | Null
            ]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tileClassName")(x.asInstanceOf[js.Any])
    
    @JSImport("react-calendar/dist/cjs/shared/propTypes", "tileProps.tileContent")
    @js.native
    def tileContent: Requireable[NonNullable[ReactNodeLike | (js.Function1[/* repeated */ Any, Any])]] = js.native
    inline def tileContent_=(x: Requireable[NonNullable[ReactNodeLike | (js.Function1[/* repeated */ Any, Any])]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tileContent")(x.asInstanceOf[js.Any])
    
    @JSImport("react-calendar/dist/cjs/shared/propTypes", "tileProps.tileDisabled")
    @js.native
    def tileDisabled: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    inline def tileDisabled_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tileDisabled")(x.asInstanceOf[js.Any])
  }
}
