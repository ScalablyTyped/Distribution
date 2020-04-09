package typings.reactCalendar.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailViewProps extends js.Object {
  var activeStartDate: Date
  var calendarType: js.UndefOr[CalendarType] = js.undefined
  var hover: js.UndefOr[Date] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var maxDate: js.UndefOr[Date] = js.undefined
  var minDate: js.UndefOr[Date] = js.undefined
  var onClick: js.UndefOr[DateCallback] = js.undefined
  var onMouseOver: js.UndefOr[DateCallback] = js.undefined
  var renderChildren: js.UndefOr[
    js.Function1[
      /* props */ CalendarTileProperties, 
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ _) | Null
    ]
  ] = js.undefined
   // For backwards compatibility
  var tileClassName: js.UndefOr[
    String | js.Array[String] | (js.Function1[/* props */ CalendarTileProperties, String | js.Array[String] | Null])
  ] = js.undefined
  var tileContent: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any) | (js.Function1[
      /* props */ CalendarTileProperties, 
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ _) | Null
    ])
  ] = js.undefined
  var tileDisabled: js.UndefOr[js.Function1[/* props */ CalendarTileProperties, Boolean]] = js.undefined
  var value: js.UndefOr[Date | js.Array[Date]] = js.undefined
}

object DetailViewProps {
  @scala.inline
  def apply(
    activeStartDate: Date,
    calendarType: CalendarType = null,
    hover: Date = null,
    locale: String = null,
    maxDate: Date = null,
    minDate: Date = null,
    onClick: /* date */ Date => Unit = null,
    onMouseOver: /* date */ Date => Unit = null,
    renderChildren: /* props */ CalendarTileProperties => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ _) | Null = null,
    tileClassName: String | js.Array[String] | (js.Function1[/* props */ CalendarTileProperties, String | js.Array[String] | Null]) = null,
    tileContent: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any) | (js.Function1[
      /* props */ CalendarTileProperties, 
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ _) | Null
    ]) = null,
    tileDisabled: /* props */ CalendarTileProperties => Boolean = null,
    value: Date | js.Array[Date] = null
  ): DetailViewProps = {
    val __obj = js.Dynamic.literal(activeStartDate = activeStartDate.asInstanceOf[js.Any])
    if (calendarType != null) __obj.updateDynamic("calendarType")(calendarType.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (renderChildren != null) __obj.updateDynamic("renderChildren")(js.Any.fromFunction1(renderChildren))
    if (tileClassName != null) __obj.updateDynamic("tileClassName")(tileClassName.asInstanceOf[js.Any])
    if (tileContent != null) __obj.updateDynamic("tileContent")(tileContent.asInstanceOf[js.Any])
    if (tileDisabled != null) __obj.updateDynamic("tileDisabled")(js.Any.fromFunction1(tileDisabled))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailViewProps]
  }
}

