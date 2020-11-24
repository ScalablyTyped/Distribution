package typings.reactDateRange.mod

import typings.reactDateRange.anon.PartialClassNames
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommonCalendarProps extends js.Object {
  
  /** Custom class names for elements */
  var classNames: js.UndefOr[PartialClassNames] = js.native
  
  var firstDayOfWeek: js.UndefOr[Double] = js.native
  
  /** default: DD/MM/YYY */
  var format: js.UndefOr[String] = js.native
  
  /**
    * Calendar languages.
    * ('cn' - Chinese, 'jp' - Japanese,
    * 'fr' - French, 'it' - Italian,
    * 'de' - German, 'ko' - Korean,
    * 'es' - Spanish, 'ru' - Russian,
    * 'tr' - Turkish) default: none
    */
  var lang: js.UndefOr[LanguageType] = js.native
  
  /** default: none */
  var maxDate: js.UndefOr[DateInputType] = js.native
  
  /** default: none */
  var minDate: js.UndefOr[DateInputType] = js.native
  
  /** default: none */
  var onChange: js.UndefOr[js.Function1[/* range */ OnChangeProps, Unit]] = js.native
  
  /** default: none */
  var onInit: js.UndefOr[js.Function1[/* range */ Range, Unit]] = js.native
  
  var theme: js.UndefOr[CalendarTheme] = js.native
}
object CommonCalendarProps {
  
  @scala.inline
  def apply(): CommonCalendarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonCalendarProps]
  }
  
  @scala.inline
  implicit class CommonCalendarPropsOps[Self <: CommonCalendarProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClassNames(value: PartialClassNames): Self = this.set("classNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassNames: Self = this.set("classNames", js.undefined)
    
    @scala.inline
    def setFirstDayOfWeek(value: Double): Self = this.set("firstDayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstDayOfWeek: Self = this.set("firstDayOfWeek", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setLang(value: LanguageType): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    
    @scala.inline
    def setMaxDateFunction1(value: /* now */ Date => AnyDate): Self = this.set("maxDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMaxDate(value: DateInputType): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    
    @scala.inline
    def setMinDateFunction1(value: /* now */ Date => AnyDate): Self = this.set("minDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMinDate(value: DateInputType): Self = this.set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* range */ OnChangeProps => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnInit(value: /* range */ Range => Unit): Self = this.set("onInit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnInit: Self = this.set("onInit", js.undefined)
    
    @scala.inline
    def setTheme(value: CalendarTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
