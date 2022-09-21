package typings.reactAddToCalendar

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-add-to-calendar", JSImport.Default)
  @js.native
  open class default protected () extends Component[AddToCalendarProps, ComponentState, Any] {
    def this(props: AddToCalendarProps) = this()
    def this(props: AddToCalendarProps, context: Any) = this()
  }
  @JSImport("react-add-to-calendar", JSImport.Default)
  @js.native
  val default: ComponentClass[AddToCalendarProps, ComponentState] = js.native
  
  trait AddToCalendarEvent extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    var endTime: js.UndefOr[String | js.Date] = js.undefined
    
    var location: js.UndefOr[String] = js.undefined
    
    var startTime: js.UndefOr[String | js.Date] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object AddToCalendarEvent {
    
    inline def apply(): AddToCalendarEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddToCalendarEvent]
    }
    
    extension [Self <: AddToCalendarEvent](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEndTime(value: String | js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setStartTime(value: String | js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait AddToCalendarProps extends StObject {
    
    var buttonClassClosed: js.UndefOr[String] = js.undefined
    
    var buttonClassOpen: js.UndefOr[String] = js.undefined
    
    var buttonIconClass: js.UndefOr[String] = js.undefined
    
    var buttonLabel: js.UndefOr[String] = js.undefined
    
    var buttonTemplate: js.UndefOr[Any] = js.undefined
    
    var buttonWrapperClass: js.UndefOr[String] = js.undefined
    
    var displayItemIcons: js.UndefOr[Boolean] = js.undefined
    
    var dropdownClass: js.UndefOr[String] = js.undefined
    
    var event: AddToCalendarEvent
    
    var listItems: js.UndefOr[js.Array[Any]] = js.undefined
    
    var optionsOpen: js.UndefOr[Boolean] = js.undefined
    
    var rootClass: js.UndefOr[String] = js.undefined
    
    var useFontAwesomeIcons: js.UndefOr[Boolean] = js.undefined
  }
  object AddToCalendarProps {
    
    inline def apply(event: AddToCalendarEvent): AddToCalendarProps = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddToCalendarProps]
    }
    
    extension [Self <: AddToCalendarProps](x: Self) {
      
      inline def setButtonClassClosed(value: String): Self = StObject.set(x, "buttonClassClosed", value.asInstanceOf[js.Any])
      
      inline def setButtonClassClosedUndefined: Self = StObject.set(x, "buttonClassClosed", js.undefined)
      
      inline def setButtonClassOpen(value: String): Self = StObject.set(x, "buttonClassOpen", value.asInstanceOf[js.Any])
      
      inline def setButtonClassOpenUndefined: Self = StObject.set(x, "buttonClassOpen", js.undefined)
      
      inline def setButtonIconClass(value: String): Self = StObject.set(x, "buttonIconClass", value.asInstanceOf[js.Any])
      
      inline def setButtonIconClassUndefined: Self = StObject.set(x, "buttonIconClass", js.undefined)
      
      inline def setButtonLabel(value: String): Self = StObject.set(x, "buttonLabel", value.asInstanceOf[js.Any])
      
      inline def setButtonLabelUndefined: Self = StObject.set(x, "buttonLabel", js.undefined)
      
      inline def setButtonTemplate(value: Any): Self = StObject.set(x, "buttonTemplate", value.asInstanceOf[js.Any])
      
      inline def setButtonTemplateUndefined: Self = StObject.set(x, "buttonTemplate", js.undefined)
      
      inline def setButtonWrapperClass(value: String): Self = StObject.set(x, "buttonWrapperClass", value.asInstanceOf[js.Any])
      
      inline def setButtonWrapperClassUndefined: Self = StObject.set(x, "buttonWrapperClass", js.undefined)
      
      inline def setDisplayItemIcons(value: Boolean): Self = StObject.set(x, "displayItemIcons", value.asInstanceOf[js.Any])
      
      inline def setDisplayItemIconsUndefined: Self = StObject.set(x, "displayItemIcons", js.undefined)
      
      inline def setDropdownClass(value: String): Self = StObject.set(x, "dropdownClass", value.asInstanceOf[js.Any])
      
      inline def setDropdownClassUndefined: Self = StObject.set(x, "dropdownClass", js.undefined)
      
      inline def setEvent(value: AddToCalendarEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setListItems(value: js.Array[Any]): Self = StObject.set(x, "listItems", value.asInstanceOf[js.Any])
      
      inline def setListItemsUndefined: Self = StObject.set(x, "listItems", js.undefined)
      
      inline def setListItemsVarargs(value: Any*): Self = StObject.set(x, "listItems", js.Array(value*))
      
      inline def setOptionsOpen(value: Boolean): Self = StObject.set(x, "optionsOpen", value.asInstanceOf[js.Any])
      
      inline def setOptionsOpenUndefined: Self = StObject.set(x, "optionsOpen", js.undefined)
      
      inline def setRootClass(value: String): Self = StObject.set(x, "rootClass", value.asInstanceOf[js.Any])
      
      inline def setRootClassUndefined: Self = StObject.set(x, "rootClass", js.undefined)
      
      inline def setUseFontAwesomeIcons(value: Boolean): Self = StObject.set(x, "useFontAwesomeIcons", value.asInstanceOf[js.Any])
      
      inline def setUseFontAwesomeIconsUndefined: Self = StObject.set(x, "useFontAwesomeIcons", js.undefined)
    }
  }
  
  type _To = ComponentClass[AddToCalendarProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ComponentClass[AddToCalendarProps, ComponentState] = default
}
